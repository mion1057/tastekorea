<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/header.css'/>" />
	<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/welcome_companion.css'/>" />
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

</head>
<body>
	<header id="header">
		<%@ include file="/WEB-INF/views/incl/header.jsp"%>
	</header>
	<section id="container">
    <div id="container">
        <div id="content_wrap">
            <div id="content">
                <h1>taste<span>Korea</span></h1>
                <h2>Welcome</h2>
                <div id="text_box">
                    <h2>${companion.name }님 환영합니다.</h2>
                    <h2>여행객들의 길잡이가 되어주세요</h2>
                    <a href="/guide/companion/login">로그인</a>
                    <a href="/home">홈으로</a>
                </div>
            </div>
        </div>
    </div>
	</section>
	<footer> 
	</footer>
	<script src="<%=request.getContextPath()%> /resources/js/menu.js"></script>
</body>
</html>