<%--
  Created by IntelliJ IDEA.
  User: 美丽的小白龙
  Date: 2020/6/21
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试SpringMVC</a>

    <h3>测试保存</h3>
    <form action="account/save" method="post">
        name:<input type="text" name="name"><br>
        money:<input type="text" name="money"><br>
        <input type="submit" value="save"><br>
    </form>
</body>
</html>
