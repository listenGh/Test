<%-- 
    Document   : loginOrRegiste
    Created on : 2019-5-15, 9:35:14
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登录注册</title>
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<style type="text/css">
.login-page {
	width: 360px;
	padding: 8% 0 0;
	margin: auto;
}
.form {
	position: relative;
	z-index: 1;
	background: #FFFFFF;
	max-width: 360px;
	margin: 0 auto 100px;
	padding: 45px;
	text-align: center;
	box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
	font-family: "Roboto", sans-serif;
	outline: 0;
	background: #f2f2f2;
	width: 100%;
	border: 0;
	margin: 0 0 15px;
	padding: 15px;
	box-sizing: border-box;
	font-size: 14px;
}
.form button {
	font-family: "Microsoft YaHei", "Roboto", sans-serif;
	text-transform: uppercase;
	outline: 0;
	background: #4CAF50;
	width: 100%;
	border: 0;
	padding: 15px;
	color: #FFFFFF;
	font-size: 14px;
	-webkit-transition: all 0.3 ease;
	transition: all 0.3 ease;
	cursor: pointer;
}
.form button:hover, .form button:active, .form button:focus {
	background: #43A047;
}
.form .message {
	margin: 15px 0 0;
	color: #b3b3b3;
	font-size: 12px;
}
.form .message a {
	color: #4CAF50;
	text-decoration: none;
}
.form .register-form {
	display: none;
}
.container {
	position: relative;
	z-index: 1;
	max-width: 300px;
	margin: 0 auto;
}
.container:before, .container:after {
	content: "";
	display: block;
	clear: both;
}
.container .info {
	margin: 50px auto;
	text-align: center;
}
.container .info h1 {
	margin: 0 0 15px;
	padding: 0;
	font-size: 36px;
	font-weight: 300;
	color: #1a1a1a;
}
.container .info span {
	color: #4d4d4d;
	font-size: 12px;
}
.container .info span a {
	color: #000000;
	text-decoration: none;
}
.container .info span .fa {
	color: #EF3B3A;
}
body {
	background: #76b852; /* fallback for old browsers */
	background: -webkit-linear-gradient(right, #76b852, #8DC26F);
	background: -moz-linear-gradient(right, #76b852, #8DC26F);
	background: -o-linear-gradient(right, #76b852, #8DC26F);
	background: linear-gradient(to left, #76b852, #8DC26F);
	font-family: "Roboto", sans-serif;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
}
.shake_effect {
	-webkit-animation-name: shake;
	animation-name: shake;
	-webkit-animation-duration: 1s;
	animation-duration: 1s;
}
 @-webkit-keyframes shake {
 from, to {
 -webkit-transform: translate3d(0, 0, 0);
 transform: translate3d(0, 0, 0);
}
 10%, 30%, 50%, 70%, 90% {
 -webkit-transform: translate3d(-10px, 0, 0);
 transform: translate3d(-10px, 0, 0);
}
 20%, 40%, 60%, 80% {
 -webkit-transform: translate3d(10px, 0, 0);
 transform: translate3d(10px, 0, 0);
}
}
 @keyframes shake {
 from, to {
 -webkit-transform: translate3d(0, 0, 0);
 transform: translate3d(0, 0, 0);
}
 10%, 30%, 50%, 70%, 90% {
 -webkit-transform: translate3d(-10px, 0, 0);
 transform: translate3d(-10px, 0, 0);
}
 20%, 40%, 60%, 80% {
 -webkit-transform: translate3d(10px, 0, 0);
 transform: translate3d(10px, 0, 0);
}
}
p.center {
	color: #fff;
	font-family: "Microsoft YaHei";
}
</style>
    </head>
    <body>
        <svg height="0" width="0" style="position: absolute; margin-left: -100%;">

<defs>

<filter id='shadow'>
  <feComponentTransfer in="SourceGraphic">
	<feFuncR type="discrete" tableValues="0"/>
	<feFuncG type="discrete" tableValues="0"/>
	<feFuncB type="discrete" tableValues="0"/>
  </feComponentTransfer>
  <feGaussianBlur stdDeviation="1"/>
   <feComponentTransfer><feFuncA type="linear" slope="0.2"/></feComponentTransfer>
  <feOffset dx="5" dy="1" result="shadow"/>
  <feComposite in="SourceGraphic" />
</filter>

<linearGradient id="tab-1-bg" x1="0%" y1="0%" x2="0%" y2="65%">
  <stop offset="0%" style="stop-color: rgba(136, 195, 229, 1.0);" />
  <stop offset="100%" style="stop-color: rgba(118, 160, 192, 1.0);" />
</linearGradient>

<linearGradient id="tab-2-bg" x1="0%" y1="0%" x2="0%" y2="65%">
  <stop offset="0%" style="stop-color: rgba(149, 190, 233, 1.0);" />
  <stop offset="100%" style="stop-color: rgba(112, 153, 213, 1.0);" />
</linearGradient>

<linearGradient id="tab-3-bg" x1="0%" y1="0%" x2="0%" y2="65%">
  <stop offset="0%" style="stop-color: rgba(61, 149, 218, 1.0);" />
  <stop offset="100%" style="stop-color: rgba(43, 130, 197, 1.0);" />
</linearGradient>

<linearGradient id="tab-4-bg" x1="0%" y1="0%" x2="0%" y2="65%">
  <stop offset="0%" style="stop-color: rgba(72, 204, 243, 1.0);" />
  <stop offset="100%" style="stop-color: rgba(71, 194, 243, 1.0);" />
</linearGradient>

</defs>

<path id="tab-shape" class="tab-shape" d="M116.486,29.036c-23.582-8-14.821-29-42.018-29h-62.4C5.441,0.036,0,5.376,0,12.003v28.033h122v-11H116.486
		z">
</svg>

<div class="main-content">
<div id="wrapper" class="login-page">
		<div id="login_form" class="form">
                    
                    <form class="login-form" method="post" action="/Test/Login">
                        <% 
                        session.setAttribute("identity", "Student");
                        %>
				<input type="text" placeholder="用户名" id="user_name" name="name"/>
				<input type="password" placeholder="密码" id="password" name="pwd"/>
				<input type="submit" value="登录" style="background:green"/>
			</form>
	</div>
	</div>
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script> 
<script type="text/javascript">
	function check_login()
	{
	 var name=$("#user_name").val();
	 var pass=$("#password").val();
	 if(name=="admin" && pass=="admin")
	 {
	  alert("登录成功！");
	  $("#user_name").val("");
	  $("#password").val("");

	 }
	 else
	 {
	  $("#login_form").removeClass('shake_effect');  
	  setTimeout(function()
	  {
	   $("#login_form").addClass('shake_effect')
	  },1);  
	 }
	}
	function check_register(){
		var name = $("#r_user_name").val();
		var pass = $("#r_password").val();
                
		if(name!="" && pass!="")
		 {
		  alert("注册成功！");
		  $("#user_name").val("");
		  $("#password").val("");
		 }
		 else
		 {
		  $("#login_form").removeClass('shake_effect');  
		  setTimeout(function()
		  {
		   $("#login_form").addClass('shake_effect')
		  },1);  
		 }
	}
	$(function(){
		$("#create").click(function(){
			check_register();
			return false;
		})
		$("#login").click(function(){
			check_login();
			return false;
		})
		$('.message a').click(function () {
		    $('form').animate({
		        height: 'toggle',
		        opacity: 'toggle'
		    }, 'slow');
		});
	})
	</script>
</div>
<script src='js/jquery.js'></script>

<script src="js/index.js"></script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
</div>
    </body>
</html>
