package by.pvt.pankova.commands;

import by.pvt.pankova.commands.impl.EmptyCommand;
import by.pvt.pankova.enums.Commands;
import by.pvt.pankova.resources.MessageManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

    private static final Logger LOG = LogManager.getLogger();

    public Command defineCommand(HttpServletRequest request) {
        Command current = new EmptyCommand();
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return current;
        }
        try {
            Commands currentEnum = Commands.valueOf(action.toUpperCase());
            current = currentEnum.getCommand();
        } catch (IllegalArgumentException e) {
            LOG.warn(MessageManager.getProperty("message.wrongaction"));
            request.getSession().setAttribute("error", action + MessageManager.getProperty("message.wrongaction"));
        }
        return current;
    }
}