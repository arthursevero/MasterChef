<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="by.pvt.pankova.dao.OrderDAO" %>
<%@page import="by.pvt.pankova.dao.objects.Dish" %>
<%@ page import="by.pvt.pankova.dao.objects.Order" %>
<%!java.util.List<Order> orders = null;%>
<%
    orders = OrderDAO.getAll();
%>
<html>
<head>
    <title>Manager page</title>
</head>
<body>
<h1>Manager page</h1>

<table border="1">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Dishes</th>
        <th scope="col">Bill</th>
        <th scope="col">Table</th>
        <th scope="col">Actions</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Order order : orders) {
    %>
    <tr>
        <td><%=order.getId()%>
        </td>
        <td>
            <%
                for (Dish dish : order.getDishes()) {
            %> <%=dish.getName()%> ($<%=dish.getPrice()%>)<br/> <%
            }
        %>
        </td>
        <td>$<%=order.getTotalPrice()%>
        </td>
        <td><%=order.getTable()%>
        </td>
        <td>
            <form method="post" action="controller">
                <p>
                    <input type="submit" value="Delete"/>
                </p>
                <input type="hidden" name="order" value="<%=order.getId()%>"/> <input
                    type="hidden" name="command" value="delete"/>
            </form>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>

<form method="post" action="controller">
    <p>
        <input type="submit" value="Log out"/>
    </p>
    <input type="hidden" name="command" value="logout"/>
</form>
</body>
</html>