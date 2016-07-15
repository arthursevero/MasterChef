<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="by.pvt.pankova.dao.DishDAO" %>
<%@page import="by.pvt.pankova.dao.objects.Dish" %>
<%@ page import="by.pvt.pankova.dao.objects.Order" %>
<%!java.util.List<Dish> dishes = null;%>
<%!Order order = new Order();%>
<%
    dishes = DishDAO.getAll();
%>
<html>
<head>
    <title>Client page</title>
</head>
<body>
<h1>Client page</h1>

<h3>${message}</h3>

<form method="post" action="controller">
    <table border="1">
        <thead>
        <tr>
            <th scope="col">Picture</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Order</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Dish dish : dishes) {
        %>
        <tr>
            <td><img
                    src="<%=application.getContextPath() + "/img/" + dish.getPicture()%>"
                    alt="<%=dish.getName()%>"/></td>
            <td><%=dish.getName()%>
            </td>
            <td>$<%=dish.getPrice()%>
            </td>
            <td><input type="checkbox" name="<%=dish.getId()%>"/></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <p>
        Your table number: <select name="table">
            <%
					for (int i = 1; i <= 10; i++) {
				%>

    <p>
        <option value="<%=i%>">№ <%=i%>
        </option>
    </p>
    <%
        }
    %>
    </select>
    </p>
    <p>
        <input type="submit" value="Create order"/>
    </p>
    <input type="hidden" name="command" value="create"/>
</form>

<form method="post" action="controller">
    <p>
        <input type="submit" value="Log out"/>
    </p>
    <input type="hidden" name="command" value="logout"/>
</form>
</body>
</html>