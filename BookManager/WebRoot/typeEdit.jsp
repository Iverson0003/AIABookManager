<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="typeEditSubmit.action" method="POST">
		<table align="center" border="1">
		
			<tr>
				<td>类别编号</td>
				<td><input type="text" value="${type.id }" name="id" readonly="readonly"></td>
			</tr>
			<tr>
				<td>类别名称</td>
				<td><input type="text" value="${type.t_name }" name="t_name"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit"value="确认修改">
				</td>
			</tr>

		</table>
	</form>

</body>
</html>