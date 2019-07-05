<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript">
	function clearUsernameError() {
		var usernameError = document.getElementById("usernameError");
		usernameError.innerHTML = "";
	}

	function clearPasswordError() {
		var passwordError = document.getElementById("passwordError");
		passwordError.innerHTML = "";
	}

	function clearTelephoneError() {
		var telephoneError = document.getElementById("telephoneError");
		telephoneError.innerHTML = "";
	}
</script>
</head>
<body>

	<form:form action="/user/register" modelAttribute="user">
		<table border="0" cellpadding="5">
			<tr align="center">
				<td colspan="2"><h3>用户注册</h3></td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><form:input path="username" onfocus="clearUsernameError()" />
				</td>
				<td><span id="usernameError"><form:errors
							path="username" cssClass="error" cssStyle="color:red" /></span></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><form:input path="password" type="password"
						onfocus="clearPasswordError()" /></td>
				<td><span id="passwordError"><form:errors
							path="password" cssClass="error" cssStyle="color:red" /></span></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><form:input path="telephone"
						onfocus="clearTelephoneError()" /></td>
				<td><span id="telephoneError"><form:errors
							path="telephone" cssClass="error" cssStyle="color:red" /></span></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="注册" /> <input
					type="reset" value="重置" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>