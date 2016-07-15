package by.pvt.pankova.filters;

import by.pvt.pankova.enums.Users;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class MainFilter extends MyFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();

        Users type = (Users) session.getAttribute("userType");
        if (type == null) {
            session.setAttribute("userType", Users.GUEST);
        }
        chain.doFilter(request, response);
    }
}