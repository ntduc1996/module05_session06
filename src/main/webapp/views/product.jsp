<%--
  Created by IntelliJ IDEA.
  User: asahi
  Date: 8/6/2025
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>Mã sản phẩm</td>
        <td>Tên sản phẩm</td>
        <td>Giá</td>
        <td>Mô tả</td>
        <td>Hình ảnh</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.productName}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.image}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
