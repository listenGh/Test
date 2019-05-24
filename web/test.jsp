<%-- 
    Document   : test
    Created on : 2019-5-23, 15:14:51
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>考试</title>
    </head>
    <body>
        <%
            if(session.getAttribute("cantest").equals("true")){
                request.getRequestDispatcher("dati.jsp").forward(request, response);
            }
        %>
        <h1>抱歉，目前没有考试！</h1>
    </body>
</html>
