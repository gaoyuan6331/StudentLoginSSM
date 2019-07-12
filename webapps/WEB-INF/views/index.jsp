<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>举个栗子</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
	list-style: none;
	text-decoration: none;
}

#login {
	position: absolute;
	top: 15%;
	left: 49%;
	font-family: arial;
	font-weight: bolder;
	font-size: 25px;
}

#loginBox {
	position: absolute;
	border: 1px solid black;
	border-radius: 10px;
	height: 200px;
	width: 50%;
	top: 30%;
	left: 25%;
	background-color: rgb(0, 255, 255);
}

.studentID, .password {
	position: absolute;
	top: 40%;
	left: 37%;
}

.password {
	top: 56%;
}

.usernametbox, .passwordbox {
	position: absolute;
	font-size: 12%;
	line: 12%;
	line-height: = 12%;
	left: 42%;
	top: 39%;
	height: 12%;
	width: 22%;
	margin-left: 20px;
}

.passwordbox {
	top: 55%;
}

.checkbox {
	position: absolute;
	zoom: 180%;
	left: 67%;
	top: 58%;
	margin-left: 10px;
}
/*记住密码  */
.checkbox2 {
	position: absolute;
	left: 70%;
	top: 57%;
	margin-left: 20px;
}

#submit {
	position: absolute;
	background-color: #888;
	width: 7%;
	height: 14%;
	left: 44%;
	top: 80%;
}

.regist {
	position: absolute;
	background-color: #888;
	line-height: 30p;
	line: 30px;
	width: 7%;
	height: 14%;
	left: 55%;
	top: 80%;
	height: 14%;
}

.error{
top:90%;
color:red;
font-weight: bolder;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id=loginBox>
		<div id="login">登陆</div>

		<h2>
			<div class="error" >${error}</div>
		</h2>
		<form action="login" method="get">
			<div id="inputbox">
				<span class="studentID">学号：</span><input class="usernametbox"
					type="text" placeholder="请输入学号..." name="studentID"><br>
				${studentIDError} <span class="password">密码：</span><input
					class="passwordbox" type="password" placeholder="请输入密码..."
					name="password"><br> <input class="checkbox"
					type="checkbox" check="check" name="check"><span
					class="checkbox2">记住密码</span>
			</div>
			<input id="submit" type="submit"
				class="width-35 pull-right btn btn-sm btn-primary" value="Login">
		</form>
		<form action="regist">
			<button class="regist" type="submit">注册</button>
		</form>
	</div>
</body>

</html>