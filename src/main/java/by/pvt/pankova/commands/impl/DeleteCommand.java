package by.pvt.pankova.commands.impl;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.dao.OrderDAO;
import by.pvt.pankova.enums.Users;
import by.pvt.pankova.resources.ConfigurationManager;
import by.pvt.pankova.resources.MessageManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        Users type = (Users) request.getSession().getAttribute("userType");
        if (type != Users.MANAGER) {
            try {
                response.sendError(403, "Execute access forbidden");
            } catch (IOException e) {
            }
            return null;
        }

        int orderId;
        try {
            orderId = Integer.parseInt(request.getParameter("order"));
            request.getSession().setAttribute("message", MessageManager.getProperty("message.orderdeleted"));
            OrderDAO.delete(orderId);
        } catch (NumberFormatException e) {
            request.getSession().setAttribute("message", MessageManager.getProperty("message.orderdeleteerror"));
        }

        return ConfigurationManager.getProperty("page.manager");
    }
}