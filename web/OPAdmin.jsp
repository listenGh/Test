<%-- 
    Document   : OperatingPageOfStudent
    Created on : 2019-5-16, 17:19:22
    Author     : lenovo
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>操作页面</title>
        <!-- Include the FontAwesome CSS if you want to use feedback icons provided by FontAwesome -->
        <link rel="stylesheet" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css" />
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" href="dist/css/formValidation.css"/>
        <link rel="stylesheet" type="text/css" href="css/default.css">
    </head>
    <body>
        <%
//            String sId =(String)request.getAttribute("adminId");
        %>
        <div class="jq22-sidebar">
            <ul>
                <li><span class="fa fa-arrow-right"></span> <a href="ChangeAdmin.jsp">管理员信息修改</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="addTeacher.jsp" >添加教师信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="updateTeacher.jsp">修改教师信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="searchTeacher.jsp">查看教师信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="deleteTeacher.jsp">删除教师信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="addClass.jsp" >添加班级信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="updateClass.jsp">修改班级信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="searchClass.jsp">查看班级信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="addStudent.jsp" >添加学生信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="updateStudent.jsp">修改学生信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="searchStudent.jsp">查看学生信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="deleteStudent.jsp">删除学生信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="addCourse.jsp" >添加课程信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="updateCourse.jsp">修改课程信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="searchCourse.jsp">查看课程信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="deleteCourse.jsp">删除课程信息</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="guanliTest.jsp">管理考试</a></li>
                <li><span class="fa fa-arrow-right"></span> <a href="Choiceofstatus.jsp">退出</a></li>
                <%--<%=sId%>--%>
            </ul>
        </div> 
        <div class="jq22-container">
            <header class="jq22-header bgcolor-1">
                <h1>欢迎来到管理员界面</h1>
                <br><br>
                <h1>请根据左侧操作栏中的操作选项进行操作</h1>
                <br><br>
                <h1>感谢您的配合，谢谢！</h1>
            </header>

        </div>
        
        <script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="dist/js/formValidation.js"></script>
        <script type="text/javascript" src="dist/js/framework/bootstrap.js"></script>
        <script type="text/javascript" src="dist/js/language/zh_CN.js"></script>
    </body>
</html>
