<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 2018/11/14
  Time: 下午9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@page import="java.util.List" %>
    <%@page import="com.example.demo.dao.cityDao.City" %>
    <title>Title</title>
</head>
<body>
test filter<<br>
<c:forEach items="${cityList}" var="city">
    id:${city.id}
    pid:${city.provinceid}
    cn:${city.cityname}
    desc:${city.description}<br>
</c:forEach>
</body>
</html>
