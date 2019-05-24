/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Controller;

import com.gh.Service.AdminServiceImpl;
import com.gh.Service.LoginCheck;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;
import model.Student;
import model.Teacher;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String identity = (String) request.getSession().getAttribute("identity");
        String zid = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        LoginCheck l = new LoginCheck();
        if (identity.equals("Admin")) {
            Admin a = new Admin(zid, pwd);
            if(l.checkAdmin(a)){
               //跳转到Admin的操作界面
               request.getSession().setAttribute("adminId", zid);
               response.sendRedirect("/Test/OPAdmin.jsp");
            }
        } else if (identity.equals("Student")) {
            Student s = new Student();
            s.setPwd(pwd);
            s.setZid(zid);
            if(l.checkStudent(s)){
                //跳转到Student的操作界面
                request.getSession().setAttribute("sId", zid);
                response.sendRedirect("/Test/OperatingPageOfStudent.jsp");
            }
        } else {
            Teacher t = new Teacher();
            t.setPwd(pwd);
            t.setZid(zid);
            if(l.checkTeacher(t)){
                //跳转到Teacher的操作界面
                request.getSession().setAttribute("TeacherId", zid);
                response.sendRedirect("/Test/OPTeacher.jsp");
            }
        }

//        System.out.println();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
