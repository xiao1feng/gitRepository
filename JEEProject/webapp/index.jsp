<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xxf.model.Recruit" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.xxf.service.RecruitService" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/22
  Time: 15:34
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
</head>
<body>
<a href="register1">yyyyy</a>
<a href="login1">nnnnnn</a>
<h2>招聘信息</h2>
<table>
    <tr>
        <td>ID</td>
        <td>职位</td>
        <td>主题</td>
        <td>职位描述</td>
        <td>发布时间</td>
        <td>地址</td>
        <td>薪资</td>
        <td>联系人</td>
    </tr>
    <%
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        RecruitService recruitService = (RecruitService) context.getBean("recruitServiceImpl");
//        List<Recruit> allRecs = recruitService.getAllRecs();
        List<Recruit> recs = (List<Recruit>) request.getAttribute("recs");
        if (recs!=null){
            for (Recruit re : recs){
    %>
    <tr>
        <td><%=re.getRct_id()%></td>
        <td><%=re.getPos_id()%></td>
        <td><%=re.getRct_title()%></td>
        <td><%=re.getRct_introduaction()%></td>
        <td><%=re.getRct_publish_time()%></td>
        <td><%=re.getRct_address()%></td>
        <td><%=re.getRct_salary()%></td>
        <td><%=re.getE_id()%></td>

    </tr>
    <%
            }
        }else {
    %>
    <tr><td colspan="8">暂无招聘信息</td></tr>
    <%
        }
    %>
</table>
</body>
</html>

