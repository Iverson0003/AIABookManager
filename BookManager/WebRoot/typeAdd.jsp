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

	<form action="addType.action" method="POST">
		<table align="center" border="1">

			<tr>
				<td>类别名称</td>
				<td><input type="text" name="t_name"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="确认增加"></td>
			</tr>

		</table>
	</form>

</body>
</html>