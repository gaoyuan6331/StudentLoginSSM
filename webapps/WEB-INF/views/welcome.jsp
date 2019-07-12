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

.queryAllCourse {
	left:10%;
	
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

.businessService {
	position: absolute;
	border: 1px solid #f40;
	width: 40%;
	height: 30%;
	right: 10%;
	top:10%;
}

.catalog {
	position: absolute;
	top: 20%;
	border-right: 3px solid gray;
	border-top: 3px solid gray;
	width: 150px;
	height: 80%;
	text-align:center;
}

.catalogTitle {
	border: 1px solid gray;
	background-color: #f399;
	font-size: 18px;
	font-weight: bold;
	border-left: 0px;
	border-right: 0px;
	border-bottom-width: 3px;
	line-height: 40px;
	padding: 0px 22%;
	font-size: 16px;
}

.option {
	border: 1px solid gray;
	border-top: 1px;
	border-left: 0px;
	border-right: 0px;
	border-width: 1px;
	line-height: 40px;
	margin-bottom: 0px;
}

.option:HOVER {
	background-color: #888;
	color: #999;
	line-height: 40px;
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

.admin {
	border-color: gray;
	border-style: solid; background-color : #f399;
	font-weight: bold;
	border-left: 0px;
	border-right: 0px;
	border-width: 3px;
	line-height: 40px;
	padding: 0px 22%;
	font-size: 16px;
	margin-top: 100px;
	background-color: #f399;
}

.queryAllStudent {
	border: 1px solid gray;
	border-left: 0px;
	border-right: 0px;
	line-height: 40px;
	margin-top: 30px;
}

.queryAllStudent:HOVER {
	background-color: #f40;
	color: #999;
	line-height: 40px;
}

.addStudent {
	border: 1px solid gray;
	border-left: 0px;
	border-right: 0px;
	border-top: 0px;
	line-height: 40px;
	margin-bottom: 0px;
	margin-top: 0px;
}

.addStudent:HOVER {
	background-color: #f40;
	color: #999;
	line-height: 40px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div color="yellow" font-size="28px">假装是个教务系统</div>
	<div class="mydesktop">
		我的桌面<br>
	</div>
	<div class="notice">公告通知</div>
	<div class="businessService">
		<ul>
			<li>
				<a class="queryAllCourse" href="queryAllCourse">选课</a>
			</li>
			<li><select>
					<option>业务办理</option>
					<option>abc</option>
					<option>def</option>
					<option>asd</option>
			</select></li>
		</ul>
	</div>
	<div class="catalog">
		<div class="catalogTitle">信 息 查 询</div>
		<br>
		<div class="option">
			<a href="">学籍卡片</a>
		</div>
		<div class="option">
			<a href="">学习计划</a>
		</div>
		<div class="option">
			<a href="">上课任务</a>
		</div>
		<div class="option">
			<a href="">课表查询</a>
		</div>
		<div class="option">
			<a href="">考试成绩</a>
		</div>

		<div class="admin">管理員操作</div>
		<div class="queryAllStudent">
			<a href="queryAllStudent">查询所有学生</a>
		</div>
		<div class="addStudent">
			<a href="regist">添加学生</a>
		</div>
	</div>
	<div class="calendar">日历</div>
</body>
</html>