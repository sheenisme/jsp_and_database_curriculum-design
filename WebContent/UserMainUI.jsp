<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<title>主页</title>
<style>
body{
	background:#F5F5F5;
}
#main{
			margin: 30px auto;
			width:1002px;
			height:500px;
			
     }
#left{
			background:#fff;
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

#footer{
		position: center;
		width: 1100px;
		height: 50px;
		padding: 50px;
		clear: left;
		float:center;
	}
</style>
</head>
<body>
<div id="header">
	<div class="container">
<!-- 		<div class="row"> -->
<!-- 			<div class="col-md-3" class=“active”>主页</div> -->
<!-- 			<div class="col-md-3"><a href="http://www.sheensong.top/wordpress">论坛</a></div> -->
<%-- 			<%   --%>
<!-- 				String username=request.getParameter("username"); -->
<%-- 			%> --%>
<%-- 			<div class="col-md-3">欢迎<%=username %>！</div> --%>
<!-- 			<div class="col-md-3">退出登录</div> -->
<!-- 		</div> -->
		
		<ul class="nav nav-tabs nav-justified" role="tablist">
			<li role="presentation" class="active"><a href="">主页</a></li>
			<li role="presentation"><a href="http://www.sheensong.top/wordpress">论坛</a></li>
			<li role="presentation"><a href="">反馈</a></li>
			<%
				String username=request.getParameter("username"); 
			%> 
			<li role="presentation"><a href="" disabled=“disabled”><%=username %>用户</a></li>
			<li role="presentation"><a href="login.jsp">退出登录</a></li>		
		</ul>
		<script src="./js/bootstrap.min.js"></script>
	</div>

</div>

<div id="main">
	<div id="left" class="container">
		<ul id="navigation">
			<li><a href="" >我 要 报 修</a></li>
			<li><a href="" >查看维修记录</a></li>
			<li><a href="">评价此次维修</a></li>
			<li><a href="#">查看所有维修记录</a></li>
			<li><a href="#">导航3</a></Li>
			<li><a href="">导航</a></li>
			<li><a href="">导航4</a></li>
		</ul>
	</div>
	<div id="right" class="container">
		<iframe width="700px"  height="500px"  name="rightFrame"></iframe>
	</div>
</div>


<div id="footer" align="center" class="container">
	<p id="foot" class="foot" align="center"> 
	© WeiyiNetClient v1.0.0
	<br>
	</p>
</div>
</body>
</html>