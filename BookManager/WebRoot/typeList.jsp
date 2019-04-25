<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1">
		<tr>
			<td>类别ID</td>
			<td>类别名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="type">
			<tr>
				<td>${type.id }</td>
				<td>${type.t_name }</td>
				<td><a href="typeEdit.action?id=${type.id }">修改</a>&nbsp;&nbsp; <a
					href="deleteTypeById.action?id=${type.id }">删除</a></td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan="3" align="center"><a href="typeAdd.jsp">增加类别</a></td>
		</tr>

</body>
</html>