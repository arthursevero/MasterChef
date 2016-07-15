package by.pvt.pankova.commands.impl;

import by.pvt.pankova.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmptyCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}