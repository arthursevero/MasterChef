package by.pvt.pankova.commands.impl;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.enums.Users;
import by.pvt.pankova.resources.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = ConfigurationManager.getProperty("page.login");
        request.getSession().invalidate();
        request.getSession().setAttribute("userType", Users.GUEST);
        return page;
    }
}