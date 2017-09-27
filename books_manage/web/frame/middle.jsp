<%-- 
    Document   : middle
    Created on : 2017-7-27, 16:04:46
    Author     : huangzhen
--%>

<%@page import="domain.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%
            String loginName = null;
            ArrayList login = (ArrayList) session.getAttribute("username");
            if (login == null || login.size() == 0) {
                loginName = "游客";
            } else {
                for (int i = login.size() - 1; i >= 0; i--) {
                    User user = (User) login.get(i);
                    loginName = user.getUsername();
                }
            }
        %>
        
        <table  width="100%" align="left" bgcolor="pink" >
            <tr height="10">
                <td><a href="${pageContext.request.contextPath }/ListAllBookServlet" target="buttom">查看所有图书</a></td>
                <td><a href="${pageContext.request.contextPath }/bfunc/addbook.jsp" target="buttom">添加图书</a></td>
                <td><a href="${pageContext.request.contextPath }/bfunc/delete.jsp" target="buttom">删除图书</a></td>
                <td><a href="${pageContext.request.contextPath }/bfunc/update.jsp" target="buttom">修改图书</a></td>
                <td><a href="${pageContext.request.contextPath }/ufunc/usermanage.jsp" target="buttom">信息管理</a></td>
                <td>欢迎您使用本系统！</td>
            </tr>
        </table>
    </body>
</html>
