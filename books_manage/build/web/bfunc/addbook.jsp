<%-- 
    Document   : addbook
    Created on : 2017-7-28, 14:01:24
    Author     : huangzhen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Books Page</title>
    </head>
    <body bgcolor="#ffeeee">
        <form action="${pageContext.request.contextPath }/AddBookServlet" method="post">
            <table align="center" border="1">
                <tr>
                    <td>书名：</td><td><input type="text" name="bookname"/></td>
                </tr>
                <tr>
                    <td>作者：</td><td><input type="text" name="writer"/></td>
                </tr>
                <tr>
                    <td>类型：</td><td><input type="text" name="type"/></td>
                </tr>
                <tr>
                    <td>价格：</td><td><input type="text" name="price"/></td>
                </tr>
                <tr>
                    <td>页码：</td><td><input type="text" name="page"/></td>
                </tr>
                <tr>
                    <td>说明：</td><td><input type="text" name="annotation"/></td>
                </tr>
                <tr><td colspan="2" align="center">
                        <input type="submit" value="提交"/>&nbsp;&nbsp;
                        <input type="reset" value="取消"/>
                    </td></tr>
            </table>
        </form>
    </body>
</html>
