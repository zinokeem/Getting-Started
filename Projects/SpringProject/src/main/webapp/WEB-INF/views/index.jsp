<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Index/인덱스</title>
    <!-- 메타 태그 -->
    <meta name="title" content="indexPageForSpringTest/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="content-type" content="text/html; charset=euc-kr">
    <!-- 스타일 불러오기 -->
    <link url="<c:url value="/resources/css/style.css"/>" />
    <!-- 자바스크립트 불러오기 -->
    <%@include file="/WEB-INF/views/head.jsp" %>
    <script src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body>
<h1>
    Hello world / 헬로월드
</h1>
<h2>
    Hello world / 헬로월드
</h2>
<h3>
    Hello world / 헬로월드
</h3>
<h4>
    Hello world / 헬로월드
</h4>
<h5>
    Hello world / 헬로월드
</h5>
<h6>
    Hello world / 헬로월드
</h6>
<P>  The time on the server is ${serverTime}. </P>
<P>  서버시각 ${serverTime}. </P>
</body>
</html>
