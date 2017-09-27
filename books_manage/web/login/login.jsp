<%-- 
    Document   : login
    Created on : 2017-7-24, 15:43:03
    Author     : huangzhen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>图书管理系统</title>
    </head>
    <body bgcolor="#ffddbc">
        <form action="${pageContext.request.contextPath }/LoginServlet" method="post">
            <table align="center" width="100%">
                <tr>
                    <td align="center" ><h1 align="right" color="#400000">图书管理</h1></td>
                </tr>
                <tr>
                    <td colspan="2"><hr width="100%" color="#7c0000" size="15"/></td>
                </tr>

                <tr>
                    <td width="30%" align="center"><image src="/images/flower.jpg" height="450"/></td>
                    <td width="70%">
                        
                        <table border="1" align="center">
                            <tr>
                                <td>用&nbsp;户&nbsp;名:</td><td><input type="text" name="username" /></td>
                            </tr>
                            <tr>
                                <td>用户密码:</td><td><input type="password"name="userpassword" /></td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="确定">&nbsp;&nbsp;&nbsp;
                                    <input type="reset" value="取消">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <a href="${pageContext.request.contextPath }/login/register.jsp">注册</a>
                                </td>
                            </tr>
                        </table> 
                                
                    </td>
                </tr>
            </table>
        </form>

    </body>
</html>
