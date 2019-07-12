<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
*{
text-decoration: none;
list-style: none;
}


.studentListTable{
position: absolute;
width:40%;
left:30%;
top:20%;
text-align:center;
}

.pageUp{
position: absolute;
left:40%;
margin-top:30px;
}
.pageDown{
position: absolute;
left:60%;
margin-top:30px;

}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
</head>
<body>
	<div class="studentListTable">
	<h3>学 生 列 表</h3>  
		<table  width="100%" height="100" border="1" cellpadding="10" cellspacing="0" >
			<thead>
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>密码</th>
					<th>电话</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${studentList}" var="student">
					<tr>
						<td>${student.studentID}</td>
						<td>${student.studentName}</td>
						<td>${student.password}</td>
						<td>${student.phoneNum}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<div class="pageTurning">
	第${page.pageNo}页
		<form action="queryAllStudent">
			每页显示学生数： <input type="text" name="pageSize" value="${page.pageSize}"> <input
				type="submit" value="确认" >
		</form>
		<a class="pageUp" href="queryAllStudent?pageNo=${page.prePage}&pageSize=${page.pageSize}">上一页</a>
		pageNo=${page.pageNo} pageSize=${page.pageSize} totalCount=${page.totalCount}
		<a class="pageDown" href="queryAllStudent?pageNo=${page.nextPage}&pageSize=${page.pageSize}">下一页</a>
	</div>
	</div>
</body>
</html>