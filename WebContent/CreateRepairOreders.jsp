<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<title>我要报修</title>
</head>
<body>
	<%@ page import="java.sql.*,java.util.*,weiyi.dao.*,weiyi.dao.vo.*,weiyi.dao.factory.*" %>
	<div class="container">
	<table class="table table-condensed" align="center">
	<thead>
	<tr class="info">
		<td>客户ID  </td>
		<td>报修时间  </td>
		<td>联 系 人   </td>
		<td>联系电话  </td>
		<td>维修地址  </td>
		<td>维修时间  </td>
		<td>维修类型  </td>
		<td>问题描述  </td>
		<td>备注信息  </td>
	</tr>
	</thead>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
IDAO dao=DAOFactory.getRepairOrders();
List<RepairOrders> list = dao.findAll();
for(int i=0;i<list.size();i++){
	request.setAttribute("number",i);
	RepairOrders vo=list.get(i);
%>
	<tbody>
	<tr class="active">
		<td></td>
		<td><input class=“” type="text" name="orderId"></td>
	</tr>
	</tbody>
<% 
}
%>
	</table>
	</div>
</body>
</html>