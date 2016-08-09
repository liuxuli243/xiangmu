<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body onload="loadlistpage()">
	<center>
		<h1><font color="blue">用户列表</font></h1>
		<table border="1px" align="center">
			<tr>
				<td width="100px" align="center">用户ID</td>
				<td width="200px" align="center">姓名</td>
				<td width="100px" align="center">性别</td>
				<td width="150px" align="center">政治面貌</td>
				<td width="200px" align="center">说明</td>
			</tr>
			<c:forEach items="${userlist }" var="user">
				<tr>
					<td align="center">${user.userid }</td>
					<td align="center">${user.name }</td>
					<td align="center">${user.gender }</td>
					<td align="center">${user.polistatu }</td>
					<td align="center">${user.description }</td>
				</tr>
			</c:forEach>
		</table>
		<input id="first" type="button" onclick="turnToPage(1)" value="首页">&nbsp;&nbsp;
		<input id="pre" type="button" onclick="turnToPage(${index-1})" value="上一页">&nbsp;&nbsp;
		<input id="next" type="button" onclick="turnToPage(${index+1})" value="下一页">&nbsp;&nbsp;
		<input id="end" type="button" onclick="turnToPage(${pagecount})" value="尾页">&nbsp;&nbsp;
		当前第${index }页&nbsp;&nbsp;共${pagecount }页&nbsp;&nbsp;一共${count }条
	</center>
<script type="text/javascript">
//页面加载项
function loadlistpage(){
	var first = document.getElementById("first");
	var pre = document.getElementById("pre");
	var next = document.getElementById("next");
	var end = document.getElementById("end");
	var pagecount = "${pagecount}";
	var index = "${index}";
	if(index == '1'){
		first.disabled=true;
		pre.disabled=true;
	}
	if(pagecount == index){
		next.disabled=true;
		end.disabled=true;
	}
}
//页面跳转
function turnToPage(index){
	window.location.href="${pageContext.request.contextPath}/toUserListPage?1=1&index="+index;
}
</script>
</body>
</html>