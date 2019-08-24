<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/24
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>$</title>
    <script src="js/jquery-1.7.2.js"></script>
</head>
<body>
<h3>注册</h3>
<form method="post" action="register">
    账号:<input type="text" name="a_name"><br>
    密码:<input type="password" name="a_pass"><br>
    确认密码:<input type="password"><br>
    <input type="submit" value="注册"><br>
</form>
</body>
</html>

