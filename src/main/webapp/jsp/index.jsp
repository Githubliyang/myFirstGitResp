<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>listall</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js"></script>
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>age</th>
            <th>编辑</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${usermapper}" var="user">

            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>
                    <input type="button" value="修改" class="btn btn-info" onclick="window.location='update.do?id=${user.id}'">
                    <input type="button" value="删除" class="btn btn-danger" onclick="window.location='delete.do?id=${user.id}'">
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div align="left">
    <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
    ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath}/page.do?pageNow=1">首页</a>
            <a href="${pageContext.request.contextPath}/page.do?pageNow=${page.pageNow - 1}">上一页</a>
            <a href="${pageContext.request.contextPath}/page.do?pageNow=${page.pageNow + 1}">下一页</a>
            <a href="${pageContext.request.contextPath}/page.do?pageNow=${page.totalPageCount}">尾页</a>
</div>
</body>
</html>

