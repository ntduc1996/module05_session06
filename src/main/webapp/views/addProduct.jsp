<%--
  Created by IntelliJ IDEA.
  User: asahi
  Date: 8/6/2025
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm sản phẩm</title>
</head>
<body>
<h2>Form thêm sản phẩm</h2>

<form action="${pageContext.request.contextPath}/products/add" method="post">
    Tên sản phẩm: <input type="text" name="productName" required><br>
    Số lượng: <input type="number" name="quantity" required><br>
    Giá: <input type="number" name="price" step="0.01" required><br>
    <button type="submit">Thêm mới</button>
</form>

</body>
</html>

