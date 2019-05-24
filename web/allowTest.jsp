<%-- 
    Document   : allowTest
    Created on : 2019-5-23, 15:03:47
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>考试批准</title>
    </head>
    <body>
        <%
            if(!session.getAttribute("havetest").equals("true")){
                request.getRequestDispatcher("notest.jsp").forward(request, response);
            }
        %>
        <form action="/Test/allowTest" method="post">
            <input type="submit" value="批准考试"/>
        </form>
    </body>
</html>
