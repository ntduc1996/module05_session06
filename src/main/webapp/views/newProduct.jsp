<%--
  Created by IntelliJ IDEA.
  User: asahi
  Date: 8/6/2025
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sản phẩm đã nhập</title>
</head>
<body>

<h2>Thông tin sản phẩm vừa thêm:</h2>
<ul>
    <li>Tên sản phẩm: ${product.productName}</li>
    <li>Số lượng: ${product.quantity}</li>
    <li>Giá: ${product.price}</li>
</ul>

<a href="${pageContext.request.contextPath}/products/add">Thêm sản phẩm khác</a>
<a href="${pageContext.request.contextPath}/products">Xem danh sách sản phẩm</a>


</body>
</html>

