<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#pageTitle{
position: absolute;
top:20%;
left:45%;


}

#regist{
position: absolute;
border: 2px solid transparent;
top:30%;
left:30%;
width: 40%;
height: 35%;
}

.registBox{
position: absolute;
top:30%;
left:20%;
margin:5px;

}
.properties{
margin:5px;

}

.studentName,.studentID,.password,.password2,.phoneNum{
position:absolute;
left:80%;
width: 200px;
box-sizing:border-box;
border:1px solid #ccc;
margin:5px;
}
.registButton{
position: absolute;
top:80%;
left:50%;
}

.resetButton{
position: absolute;
top:80%;
left:70%;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div id="pageTitle"><h1>注册页面</h1></div>

<form id="regist" action="insertStudent"method="post">
<div class=registBox>
	<span class="properties">姓名：</span>
		<input class="studentName" type="text" name="studentName"><br>
	<span class="properties">学号：</span>
		<input class="studentID"type="text" name="studentID"><br>
	<span class="properties">登录密码：</span>
		<input class="password"type="text" name="password"><br>
	<span class="properties">确认密码：</span>
		<input class="password2"type="text" name="password2"><br>
	<span class="properties">手机：</span>
		<input class="phoneNum"type="text" name="phoneNum"><br>
</div>
<input class="registButton" type="submit" value="regist">
<input class="resetButton" type="reset" value="reset">
</form>


</body>
<script>
    //对应后台返回的提示
    if ('${result}' != '') {
        if ('${result}' == 1) {
            alert('注册成功，将跳转到登录页面！')
            location.href = 'index'
        }
        if ('${result}' == 0) {
            alert('未知错误，注册失败！')
            location.href = 'wrong'
        }
        if ('${result}' == 2) {
            alert('该账号已有人注册！')
        }

    }


</script>
</html>