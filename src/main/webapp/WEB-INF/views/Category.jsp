<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category</title>
</head>
<body>

	<div align="left">
		<h3>分類</h3>
		<h4>
			<a href="<c:url value='/ProductService/showProduct' />">全部商品</a>
		</h4>
		<table border="1">
			<c:forEach var="category" items="${categoryList}">
				<tr>
					<td><a
						href="<c:url value='/ProductService/showProduct'>
					<c:param name="categoryId" value="${category.id}"/>
					</c:url>">
							${category.name} </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div align="center">
		<table border="1">
			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.name}</td>
					<td>${product.price}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>