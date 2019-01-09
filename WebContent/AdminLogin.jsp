<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>唯 e 客户服务系统</title>
	<link rel="stylesheet" href="./css/style.css" />
	<script type="text/javascript" src="js/login.js">
	</script>
</head>
<body>
	<div class="container">
		<p class="title">唯 e 客户服务系统</p>
		<div class="box">
				<div id="login_box">
						<h2>管理员登录页面</h2>
						<form action="Login" method="post" name="userform" onsubmit="return checklogin()">
						<div class="ui field">		
						账号：<input id="username" type="text" name="username"><br>
						</div>
						<div class="ui field">	
						密码：<input id="password" type="password" name="password"><br>
						</div>
						<div class="ui check">	
						<input id="checkbox" type="checkbox" name="checkbox" value="save">&nbsp;记&nbsp;住&nbsp;密&nbsp;码&nbsp;<br>
						</div>
						<div class="m">
							<input class="ui button" type="submit" value="登录">
							<a href="register.jsp"><input class="ui button" type="button"  value="注册"></a>
						</div>
						</form>	
				</div>
				<br>
				<div><pre>唯 e 客户服务系统-管理员登录页面!    <a href="foundmm.jsp">找回密码</a></pre></div> 
		</div>
	</div>
	<br><br>
	<p class="foot">
		© WeiyiNetClient v1.1.1
		<br>
	</p>
</body>
</html>