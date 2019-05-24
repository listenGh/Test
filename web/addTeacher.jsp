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
        <title>添加教师信息</title>
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/addTeacher" method="post">
            <table border="1" style="margin:auto auto;">
                <tr>
                    <td>教师ID</td>
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
                    <td>所带班级ID</td>
                    <td><input type="text" value="" name="cId"/></td>
                </tr>
                <tr>
                    <td>所带课程ID</td>
                    <td><input type="text" value="" name="courseId"/></td>
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
            <input type="submit" value="信息添加"/>
        </form>
    </body>
</html>
