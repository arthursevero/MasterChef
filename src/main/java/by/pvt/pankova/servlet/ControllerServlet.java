package by.pvt.pankova.servlet;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.commands.CommandFactory;
import by.pvt.pankova.resources.ConfigurationManager;
import by.pvt.pankova.resources.MessageManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {

    private static final long serialVersionUID = -1865521110868371435L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page;
        CommandFactory client = new CommandFactory();
        Command command = client.defineCommand(request);
        page = command.execute(request, response);
        if (page != null) {
            response.sendRedirect(request.getContextPath() + page);
        } else {
            page = ConfigurationManager.getProperty("page.login");
            request.getSession().setAttribute("error", MessageManager.getProperty("message.nullpage"));
            response.sendRedirect(request.getContextPath() + page);
        }
    }
}