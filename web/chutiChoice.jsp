<%-- 
    Document   : chutiChoice
    Created on : 2019-5-24, 12:30:23
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>选择出题方式</title>
    </head>
    <body>
        <form action="/Test/chuti.jsp" method="post">
            <input type="submit" value="自己出题"/>
        </form>
        <form action="<%=request.getContextPath()%>/addTestPaperExcel" method="post" enctype="multipart/form-data">
            <br><br>
            
            以excel的形式添加出题
            <br>
            <input type="file" name="file"/>
            <br>
            <br>
            <input type="submit" value="信息添加"/>
        </form>
     </body>
</html>
