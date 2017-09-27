<%-- 
    Document   : findallbook
    Created on : 2017-7-28, 15:30:02
    Author     : huangzhen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>list all books Page</title>
    </head>
    <body bgcolor="#ffeeee">
        <table align ="center" border="1" width="60%">
            <tr>
                <td align="center">书名</td> 
                <td align="center">作者</td>
                <td align="center">类型</td>
                <td align="center">价格</td>
                <td align="center">页码</td>
                <td align="center">说明</td>                
            </tr>
            <c:forEach var="books" items="${books}">
            <tr>
                <th>${books.bookname}</th>
                <th>${books.writer}</th>
                <th>${books.type}</th>
                <th>${books.price}</th>
                <th>${books.page}</th>
                <th>${books.annotation}</th>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
