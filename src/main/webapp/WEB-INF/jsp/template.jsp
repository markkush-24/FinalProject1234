<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.11.2020
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/webtasks.css">
    <script src="/resources/js/Functions.js" charset="UTF-8" type="text/javascript"></script>
</head>
<body>
<header>
    <table>
        <tr>
            <td>Система управления студентами и их успеваемостью</td>
        </tr>
    </table>
    <div>
        <c:if test="${isLogin ne null }">
            <a href="/logout" style="font-size: small;">Logout</a>
        </c:if>
    </div>
</header>
<section>
    <jsp:include page="${currentPage}" flush="true" />
</section>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</body>
</html>