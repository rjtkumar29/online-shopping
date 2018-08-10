<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}">
</c:set>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Boostrap Theme -->
<link href="${css}/Bootstrap-readable-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<!-- Loading the home content -->
			
			<c:if test="${ userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>
			<c:if test="${ userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>
			
			<c:if test="${ userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userClicksAllProducts == true or userClicksCatagoryProducts == true }">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>

		<!-- Footer comes Here -->
		<c:if test="${ userClickHome == true }">
				<%@include file="./shared/footer.jsp"%>
			</c:if>
		<%-- <%@include file="./shared/footer.jsp"%> --%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- self coded js -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
