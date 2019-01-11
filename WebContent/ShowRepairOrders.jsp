<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<title>显示客户所有的维修记录</title>
</head>
<body>
	<%@ page import="java.sql.*,java.util.*,weiyi.dao.*,weiyi.dao.vo.*,weiyi.dao.factory.*" %>
	<div class="container">
	<table class="table table-condensed" align="center">
	<thead>
	<tr class="active">
		<td>  序 号   </td>
		<td>维修单号  </td>
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
IDAO<RepairOrders,String> dao=DAOFactory.getRepairOrders();
List<RepairOrders> list = dao.findAll();
for(int i=0;i<list.size();i++){
	request.setAttribute("number",i);
	RepairOrders vo=list.get(i);
%>
	<tbody>
	<tr class="active">
		<td><%=i+1 %></td>
		<td><%=vo.getOrderId().toString() %></td>
		<td><%=vo.getCustomId() %></td>
		<td><%=vo.getApplyTime().toString() %></td>
		<td><%=vo.getLinkName().toString() %></td>
		<td><%=vo.getLinkPhone().toString() %></td>
		<td><%=vo.getLinkAddress().toString() %></td>
		<td><%=vo.getRepairTime() %></td>
		<td><%=vo.getType().toString() %></td>
		<td><%=vo.getDescription().toString() %></td>
		<td><%=vo.getRemark().toString() %></td>
	</tr>
	</tbody>
<% 
}
%>
	</table>
	</div>
</body>
</html>