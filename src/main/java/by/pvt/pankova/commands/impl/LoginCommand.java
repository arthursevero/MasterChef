package by.pvt.pankova.commands.impl;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.enums.Users;
import by.pvt.pankova.logic.Login;
import by.pvt.pankova.resources.ConfigurationManager;
import by.pvt.pankova.resources.MessageManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page;

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (Login.checkManager(login, password)) {
            request.setAttribute("user", login);
            HttpSession session = request.getSession(true);
            session.setAttribute("userType", Users.MANAGER);
            page = ConfigurationManager.getProperty("page.manager");

        } else if (Login.checkClient(login, password)) {
            request.setAttribute("user", login);
            HttpSession session = request.getSession(true);
            session.setAttribute("userType", Users.CLIENT);
            page = "/client";

        } else {
            request.getSession().setAttribute("error", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("page.login");
        }
        return page;
    }
}