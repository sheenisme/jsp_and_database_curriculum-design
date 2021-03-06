<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<title>显示所有的评价记录</title>
</head>
<body>
	<%@ page import="java.sql.*,java.util.*,weiyi.dao.*,weiyi.dao.vo.*,weiyi.dao.factory.*" %>
	<div class="container">
	<table id="table" class="table table-condensed" align="center">
	<thead>
	<tr class="active">
		<td>反馈编号  </td>
		<td>反馈者姓名   </td>
		<td>反馈者邮箱  </td>
		<td>反馈主题  </td>
		<td>详细内容  </td>
	</tr>
	</thead>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
IDAO<Feedback,Integer> dao=DAOFactory.getFeedback();
List<Feedback> list = dao.findAll();
for(int i=0;i<list.size();i++){
	Feedback vo=list.get(i);
%>
	<tbody>
	<tr class="active">
		<td><%=vo.getId() %></td>
		<td><%=vo.getLinkName().toString() %></td>
		<td><%=vo.getLinkEmail().toString()%></td>
		<td><%=vo.getTheme().toString() %></td>
		<td><%=vo.getDescription().toString() %></td>
	</tr>
	</tbody>
<% 
}
%>
	</table>
	</div>
</body>
</html>