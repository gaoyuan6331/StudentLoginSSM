<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style type="text/css">
*{
text-decoration: none;
list-style: none;
}

.courseListTable{
position: absolute;
width:40%;
left:30%;
top:20%;
text-align:center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<div class="courseListTable">
		<table width="600" height="100" border="1" cellpadding="7" cellspacing="0">
			<thead>
				<tr>
					<th>课程编号</th>
					<th>课程名称</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${courseList}" var="course">
					<tr>
						<td>${course.courseID}</td>
						<td>${course.courseName}</td>
						<td><a href="addCourse?courseID=${course.courseID}">加入课程</a>
						</td>
					</tr>
					
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>