<%--
  Created by IntelliJ IDEA.
  User: asahi
  Date: 8/6/2025
  Time: 9:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<c:forEach  items="${productList}" var="product">
    <div>
        <ul>
            <li>Tên sản phẩm: ${product.productName}</li>
            <li>Số lượng: ${product.quantity}</li>
            <li>Giá: ${product.price}</li>
        </ul>
    </div>
</c:forEach>
</body>
</html>
