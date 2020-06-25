<%--
  Created by IntelliJ IDEA.
  User: 美丽的小白龙
  Date: 2020/6/21
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>测试成功</h3>
    ${success}

    <c:forEach items="${success}" var="accountList">
        ${accountList.name}
    </c:forEach>
</body>
</html>
