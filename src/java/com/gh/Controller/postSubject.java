/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Controller;

import com.gh.Dao.testPaperDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.testPaper;
import net.sf.json.JSONArray;

/**
 *
 * @author lenovo 从数据库获取试卷信息
 */
@WebServlet(name = "postSubject", urlPatterns = {"/postSubject"})
public class postSubject extends HttpServlet {

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
            out.println("<title>Servlet postSubject</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet postSubject at " + request.getContextPath() + "</h1>");
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
        ArrayList<Map> datas = new ArrayList<>();
        int flag = 1;//应该在前台传入
        //从数据库获取试卷信息
        testPaperDaoImpl t = new testPaperDaoImpl();
        ArrayList<testPaper> dataOftestPaper = t.searchTestPapers(flag);
        for (int i = 0; i < dataOftestPaper.size(); i++) {
            HashMap<String, String> m = new HashMap<>();
            testPaper tdata = dataOftestPaper.get(i);
            m.put("questionId", String.valueOf(tdata.getPosition()));
            m.put("questionTitle", tdata.getTc());
            m.put("questionItems", tdata.getSc());
            switch (tdata.getAns()) {
                case "1":
                    m.put("questionAnswer", "A");
                    break;
                case "2":
                    m.put("questionAnswer", "B");
                    break;
                case "3":
                    m.put("questionAnswer", "C");
                    break;
                case "4":
                    m.put("questionAnswer", "D");
                    break;

            }

            datas.add(m);

        }
        JSONArray ja = JSONArray.fromObject(datas);
        System.out.println(ja.toString());
        response.setCharacterEncoding("UTF-8");
        response.getWriter().print(ja);
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
