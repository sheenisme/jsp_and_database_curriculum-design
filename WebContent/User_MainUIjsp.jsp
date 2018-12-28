<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<style>
body{
	width: 100%;
	height: 100%;
	cursor: default;
	background: #2980b9;
	text-align: center;
	user-select: none;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	margin: 0 auto

}
#main{
			margin: 0 auto;
			width:1002px;
			height:600px;
			background:#2980b9;
     }
#left{
			background:#fff;;
			width:202px;
			height:400px;
			float:left;
	  }
#right{
			width:800px;
			height:1000px;
			float:right;
       }
#navigation li{
		width: 187px;
		heighe:200px;
		margin-left:0px;
		float: left;
		list-style-type:none;
	}
	
#navigation a{
		color: #2980b9;
		font-size: 18px;
		font-family: '微软雅黑' '宋体' 'sans-serif';
		text-align: left;
		line-height: 50px;
		display: block;
		width: 187px;
		text-decoration:none;
}

</style>
</head>
<body>
<%  
	String username=request.getParameter("username");
	out.println("<h2>"+"<center>"+"欢迎"+username+"登录基于浏览器的身份验证登录系统            "+"</center>"+"</h2>"+"<br><br>");
%>
<div id="main">
	<div id="left">
		<ul id="navigation">
			<li><a href="" >查看维修记录</a></li>
			<li><a href="">评价我的维修</a></li>
			<li><a href="#">开发</a></li>
			<li><a href="#">导航3</a></Li>
			<li><a href="">CSCA贴吧</a></li>
			<li><a href="">导航4</a></li>
		</ul>
	</div>
	<div id="right">
	    <p>ciusfhsieufbcsichbehs</p>
		<iframe width="700px"  height="500px"  name="rightFrame"></iframe>
	</div>
</div>
</body>
</html>