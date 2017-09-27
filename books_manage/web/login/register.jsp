<%-- 
    Document   : register
    Created on : 2017-7-27, 9:25:49
    Author     : huangzhen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath }/RegisterServlet" method="post">
            <table align="center">
                用户名：<input type="text" name="username"/><br><br>
                密    码：<input type="password" name="userpassword"/><br><br>
                确认密码：<input type="password" name="userpassword1"/><br><br>
                
                <input type="submit" value="确定">&nbsp;&nbsp;
                <input type="reset" value="取消"><br>
                
            </table>
        </form>
    </body>
</html>
