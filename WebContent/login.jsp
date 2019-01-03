<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>唯 e 客户服务系统</title>
	<link rel="stylesheet" href="./css/form.css" />
	<script type="text/javascript" src="js/login.js">
	</script>
</head>
<body>
	<div class="container">
		<p class="title">唯 e 客户服务系统</p>
		<div class="box">
				<div id="login_box">
						<h2>登录页面</h2>
						<form action="Login" method="post" name="userform" onsubmit="return checklogin()">
						<div class="ui field">		
						账号：<input id="username" type="text" name="username"><br>
						</div>
						<div class="ui field">	
						密码：<input id="password" type="password" name="password"><br>
						</div>
						<div class="ui field">	
						<input id="checkbox" type="checkbox" name="checkbox" value="save">&nbsp;&nbsp;记&nbsp;住 &nbsp;密&nbsp; 码<br>
						</div>
						<div class="m">
							<input class="ui button" type="submit" value="登录">
							<a href="register.jsp"><input class="ui button" type="button"  value="注册"></a>
							<a href="AdminLogin.jsp" class="ui button">管理员登录</a>
						</div>
						</form>	
				</div>
				<br>
				<div><pre>唯 e 客户服务系统-登录页面!&nbsp;&nbsp;&nbsp;<a href="foundmm.jsp">找回密码</a></pre></div> 
		</div>
	</div>
	<br>
	<p class="foot">
		© WeiyiNetClient v1.0.0
		<br>
		<!--
		Authored by <b><font><a href="https://github.com/zeng-xs/srun3k-client/" target="_blank">sheen</a></font></b> 
		| Beautified by <b><font><a href="https://www.noisky.cn/" target="_blank">Noisky</a></font></b> 
		| Modified by <b><font><a href="http://ehaut.cn" target="_blank">E-HAUT</a> Team</font></b> 
		<br>
		<b><font><a href="http://ehaut.cn/srun/srun3k-new.html" target="_blank">本页地址</a></font></b> 
		| <b><font><a href="http://ehaut.cn/#/docs/faq" target="_blank">FAQ</a></font></b> 
		| <b><font><a href="http://ehaut.cn/#/docs/changelog" target="_blank">更新记录</a></font></b> 
		| <b><font><a href="http://ehaut.cn/#/docs/guide" target="_blank">开发者指南</a></font></b> 
		| <b><font><a href="http://ehaut.cn/#/docs/thanks" target="_blank">贡献者名单</a></font></b> 
		| <b><font><a href="https://github.com/ehaut/ehaut" target="_blank">GitHub</a></font></b>  
		-->
	</p>
</body>
</html>