package servlet;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("UserServlet 3");
        List<List<String>> lists = new UserService().getAllUsersList();
        lists.forEach(System.out::println);
        request.setAttribute("lists" , lists);
        request.getRequestDispatcher("WEB-INF/userTable.jsp").forward(request, response);
    }
}
/*
<%@ page import="model.User" %>
<jsp:useBean id="dataList" scope="request" type="java.util.List"/>
<c:forEach var="user" items="${dataList}">
    <tr>
        <td>${user.get(0)}</td>
        <td>${user.get(1)}</td>
        <td>${user.get(2)}</td>
        <td>${user.get(3)}</td>

        <td>
            <form action="/update" method="POST">
                <input type="hidden" value="${user.getId()}" name="id"/>
                <input type="hidden" value="${user.getName()}" name="name"/>
                <input type="hidden" value="${user.getPassword()}" name="password"/>
                <input type="hidden" value="${user.getMoney()}" name="money"/>
                <input type="submit" value="Update">
            </form>
        </td>

        <td>
            <form action="/delete" method="POST">
                <input type="hidden" value="${user.getId()}" name="id"/>
                <input type="submit" value="Delete">
            </form>
        </td>
    </tr>
</c:forEach>


 */