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
			width:100%;
			height:800px;
			
     }
#left{
			margin:6% 0px 4% 1%;
			background:#fff;
			width:220px;
			height:57%;
			float:left;
	  }
#right{
			width:800px;
			height:100%;
			width:80%;
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
#foot {
	position: bottom;
	margin: 15px 15px 0;
	font-size: 15px;
	float:right;
}
.container{
	width:100%;
}
</style>
</head>
<body>
<div id="header">
	<div class="container">	
		<ul class="nav nav-tabs nav-justified" >
			<li class="active"><a href="">主页</a></li>
			<li ><a href="http://www.sheensong.top/wordpress">论坛</a></li>
			<li ><a href="Feedback.jsp">反馈</a></li>
			<%
				String name=(String)request.getSession().getAttribute("CustomSession"); 
			%> 
			<li class="disabled" ><a><%=name %>用户</a></li>
			<li ><a href="UserLogin.jsp">退出登录</a></li>		
		</ul>
		<script src="./js/bootstrap.min.js"></script>
	</div>

</div>

<div id="main">
	<div id="left" class="container">
		<ul id="navigation">
			<li><a href="CreateRepairOreders.jsp" target="rightFrame">&nbsp;&nbsp;我&nbsp;要&nbsp;报&nbsp;修&nbsp;&nbsp;</a></li>
			<li><a href="CreateEvaluationRecord.jsp" target="rightFrame">评价此次维修</a></li>
			<li><a href="ShowRepairOrders.jsp" target="rightFrame">查看我的维修</a></li>
			<li><a href="ShowEvaluationRecord.jsp" target="rightFrame">查看我的评价</a></li>
			<li><a href="ShowAllRepairOrders.jsp" target="rightFrame">查看所有维修</a></li>
			<li><a href="ShowAllEvaluationRecord.jsp" target="rightFrame">查看所有评价</a></Li>
			<li><a href="" target="rightFrame">查看统计信息</a></li>
			<li><a href="ShowAllPcParts.jsp" target="rightFrame">查看配件信息</a></li>
			<li><a href="ReviseUser.jsp" target="rightFrame">修改个人信息</a></li>
		</ul>
	</div>
	<div id="right" class="container">
		<iframe width="100%" height="100%" name="rightFrame"></iframe>
	</div>
</div>


<div id="foot" align="center" class="container">
	<p align="center"> 
		© WeiyiNetClient v1.1.1 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统当前时间为：<%=new java.sql.Timestamp(System.currentTimeMillis()).toString().substring(0,19) %>
	<br>
	</p>
</div>
</body>
</html>