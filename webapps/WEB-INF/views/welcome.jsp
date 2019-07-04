<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
* {
	padding: 0;
	margin: 0;
	text-decoration: none;
	list-style: none;
}

.infoSelect {
	position: absolute;
	top: 40px;
}

.mydesktop {
	position: absolute;
	left: 15%;
	top: 15%;
}

.notice {
	border: 1px solid gray;
	width: 400px;
	height: 300px;
	position: absolute;
	left: 20%;
	top: 20%;
}

li {
	margin: 0 10px;
	padding: 10px;
	float: right;
	line-height: 20px;
	height: 20px;
	color: #f40;
}

li:HOVER {
	background: #f40;
	color: #fff;
	border: 2px solid trasnsparent;
	border-width: 25px;
	border-radius: 5px;
}

#service {
	position: absolute;
	border: 2px solid #f40;
	width: 40%;
	height: 30%;
	right: 10px;
}

.catalog {
	position: absolute;
	top: 50px;
	border-right: 3px solid gray;
	border-top: 30px solid gray;
	width: 120px;
	height: 500px;
}

.catalog a {
	border: 1px solid transparent;
	width: 40px;
	line-height: 25px;
	height: 25px;
	margin: 15px 15px 5px 20px;
}

.catalog a:HOVER {
	background-color: #f40;
	border: 0 5px;
	border-radius: 5px;
}

.calendar {
	position: absolute;
	border: 1px solid blue;
	height: 200px;
	width: 300px;
	right: 20px;
	bottom: 20px;
	right: 20px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	教务系统

	<div class="mydesktop">我的桌面</div>
	<div class="notice">公告通知</div>
	<ul id="service">
		<li><select name="infoselect">
				<option value="infoselect" />
		</select></li>
		<li><a href="courseOperation">选课报名</a></li>
		<li><a href="businessProcessing">业务办理</a></li>
	</ul>
	<div class="infoSelect">信息查询</div>
	<br>
	<form action="">
		<div class="catalog">
			<a href="">学籍卡片</a><br> <a href="">学习计划</a><br> <a href="">上课任务</a><br>
			<a href="">课表查询</a><br> <a href="">考试成绩</a>
		</div>

	</form>
	<div class="calendar">日历</div>
</body>
</html>