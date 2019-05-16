/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Controller;

import com.gh.Dao.testPaperDaoImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.testPaper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author lenovo
 *
 * 得到老师出的题
 */
@WebServlet(name = "getSubject", urlPatterns = {"/getSubject"})
public class getSubject extends HttpServlet {

    public static int num = 1;

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
            out.println("<title>Servlet getSubject</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet getSubject at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        System.out.println("das");
//        int num = (int) request.getSession().getAttribute("number");
//        num++;
//        request.getSession().setAttribute("number", num);
//            Cookie[] c = request.getCookies();
//            int num=0;
//            for(int i=0;i<c.length;i++){
//                if(c[i].getName().equals("number")){
//                    num = Integer.parseInt(c[i].getValue());
//                    System.out.println("!!!!!!!!!!!!!!!!+++++++++++++++++++++++============="+num);
//                    num++;
//                    c[i].setValue(String.valueOf(num));
//                    response.addCookie(c[i]);
//                    break;
//                }
//            }
//        String number = request.getServletContext().getInitParameter("number");
//        int num = Integer.parseInt(number);
//        num++;
//        request.getServletContext().setInitParameter("number", String.valueOf(num));
//        request.getServletContext().setAttribute("number", number);
        String json = readJSONString(request);
        System.out.println(json);
        String[] str = json.split("!!!");
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }
        //总题目
        String BigTitle = str[0];
        BigTitle = BigTitle.substring(1);
        //小题目
        String[] smallTitle = str[1].split(",");
        //每个题目的选项 4个一组
        String[] choices = str[2].split(",");
        //每个题目的答案定位
        String[] answer = str[3].split(",");
        testPaperDaoImpl t = new testPaperDaoImpl();
        int jj = 0;
        int jjj = 0;
        //将试卷信息录入数据库
        //每份试卷题目必须都为20个，每个题目4个选项，禁止使用‘！’号在编辑题目时候
        for (int i = 0; i < smallTitle.length; i++) {
            testPaper tt = new testPaper();
            int flag = 0;
            for (int y = 0; y < 4; y++) {
                if (answer[jjj].equals("true") == true) {
                    flag = (jjj % 4 + 1);
                }
                jjj++;
            }
            tt.setAns(String.valueOf(flag));
            tt.setFlag(num);
//            (int)request.getServletContext().getAttribute("number")
            tt.setPosition(i + 1);
            tt.setScore(5);
            tt.setTc(BigTitle);
            String strChoice = "";
            for (int y = jj; y < jj + 4; y++) {
                if (y == jj + 3) {
                    strChoice += (choices[y]);
                } else {
                    strChoice += (choices[y] + ";");
                }

            }
            jj += 4;
            tt.setSc(strChoice);
            t.add(tt);
        }
        num++;
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

    public String readJSONString(HttpServletRequest request) {
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return json.toString();
    }
}
