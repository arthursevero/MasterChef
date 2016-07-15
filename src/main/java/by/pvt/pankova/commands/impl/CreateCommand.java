package by.pvt.pankova.commands.impl;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.dao.DishDAO;
import by.pvt.pankova.dao.OrderDAO;
import by.pvt.pankova.dao.objects.Dish;
import by.pvt.pankova.enums.Users;
import by.pvt.pankova.resources.ConfigurationManager;
import by.pvt.pankova.resources.MessageManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class CreateCommand implements Command {

    private static final Logger LOG = LogManager.getLogger();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        Users type = (Users) request.getSession().getAttribute("userType");
        if (type != Users.CLIENT) {
            try {
                response.sendError(403, "Execute access forbidden");
            } catch (IOException e) {
            }
            return null;
        }

        List<Dish> allDishes = DishDAO.getAll();
        List<Dish> dishes = new ArrayList<>();
        int table = 0;
        Enumeration<String> params = request.getParameterNames();
        try {
            table = Integer.parseInt(request.getParameter("table"));
            while (params.hasMoreElements()) {
                int id = Integer.parseInt(params.nextElement());
                if ("on".equals(request.getParameter("" + id))) {
                    for (Dish dish : allDishes) {
                        if (id == dish.getId()) {
                            dishes.add(dish);
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
        }

        if (table != 0 && !dishes.isEmpty()) {
            request.getSession().setAttribute("message", MessageManager.getProperty("message.ordercreated"));
            OrderDAO.create(dishes, table);

        } else {
            request.getSession().setAttribute("message", MessageManager.getProperty("message.ordercreateerror"));
        }

        return ConfigurationManager.getProperty("page.client");
    }
}