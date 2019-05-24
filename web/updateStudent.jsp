<%-- 
    Document   : addTeacher
    Created on : 2019-5-21, 14:14:31
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改学生信息</title>
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/updateStudent" method="post">
            <table border="1" style="margin:auto auto;">
                <tr>
                    <td>学生ID</td>
                    <td><input type="text" value="" name="id"/></td>
                </tr>
                <tr>
                    <td>名字</td>
                    <td><input type="text" value="" name="name"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="text" value="" name="pwd"/></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td><input type="text" value="" name="sex"/></td>
                </tr>
                <tr>
                    <td>所属班级ID</td>
                    <td><input type="text" value="" name="cId"/></td>
                </tr>
            </table>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;
            <input type="submit" value="信息修改"/>
        </form>
    </body>
</html>
