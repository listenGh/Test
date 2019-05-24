/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Controller;

import com.gh.Dao.testPaperDaoImpl;
import com.gh.Service.TeacherServiceImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Report;
import model.testPaper;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Workbook;
import utils.ExcelUtils3;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "addTestPaperExcel", urlPatterns = {"/addTestPaperExcel"})
public class addTestPaperExcel extends HttpServlet {

    private static final long serialVersionUID = -4187075130535308117L;
    private boolean isMultipart;
    private int maxFileSize = 1024 * 1024 * 10;
    private int maxMemSize = 100 * 1024;

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
            out.println("<title>Servlet addTestPaperExcel</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addTestPaperExcel at " + request.getContextPath() + "</h1>");
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
        File excelFile = null;
        isMultipart = ServletFileUpload.isMultipartContent(request);
        String result = "";
        response.setContentType("text/html;charset=utf-8");
        if (!isMultipart) {
            result = "未获取到文件";
            response.getWriter().println(result);
            return;
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 文件大小的最大值将被存储在内存中
        factory.setSizeThreshold(maxMemSize);
        // Location to save data that is larger than maxMemSize.
        String path = request.getSession().getServletContext().getRealPath("/");
        factory.setRepository(new File(path));
        // System.out.println(path);
        // 创建一个新的文件上传处理程序
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 允许上传的文件大小的最大值
        upload.setSizeMax(maxFileSize);
        try {
            ArrayList fileItems = (ArrayList) upload.parseRequest(request);
            // 处理上传的文件项
            Iterator i = fileItems.iterator();
            while (i.hasNext()) {
                FileItem fi = (FileItem) i.next();
                if (!fi.isFormField()) {
                    // 获取上传文件的参数
                    String fieldName = fi.getFieldName();
                    String fileName = "display.xlsx";
                    String contentType = fi.getContentType();
                    boolean isInMemory = fi.isInMemory();
                    long sizeInBytes = fi.getSize();
                    // 写入文件
//                    fileName = ;
//                    File excelFile = new File(path + fileName);
                    excelFile = new File(path + fileName);
                    System.out.println("uploadExcelFile file = " + excelFile.toString());
                    if (excelFile.exists()) {
                        excelFile.delete();
                    }
                    fi.write(excelFile);
                    //解析
                    InputStream in = new FileInputStream(excelFile);
                    Workbook workbook = ExcelUtils3.readExcel(in);
                    ArrayList<Map<String, String>> list = ExcelUtils3.analysisWorkbook(workbook);
                    for (Map<String, String> map : list) {
                        String tc = null, sc = null, answer = null;
                        int score = 0,position=0,flag=0;
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + ":" + entry.getValue());

                            switch (entry.getKey()) {
                                case "tc":
                                    tc = entry.getValue();
                                    break;
                                case "sc":
                                    sc = entry.getValue();
                                    break;
                                case "answer":
                                    answer = entry.getValue();
                                    break;
                                case "score":
                                    score = Integer.parseInt(entry.getValue());
                                    break;
                                case "flag":
                                    flag = Integer.parseInt(entry.getValue());
                                    break;
                                case "position":
                                    position = Integer.parseInt(entry.getValue());
                                    break;
                            }
                        }
                        testPaperDaoImpl t = new testPaperDaoImpl();
                        t.add(new testPaper(null, tc, sc, answer, score, flag, position, null));
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileUploadException ex) {
            Logger.getLogger(addStudentExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(addStudentExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getSession().setAttribute("havetest","true");
        request.getRequestDispatcher("OPTeacher.jsp").forward(request, response);
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
