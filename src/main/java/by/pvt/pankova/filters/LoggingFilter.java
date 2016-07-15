package by.pvt.pankova.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class LoggingFilter extends MyFilter {

    private static final Logger LOG = LogManager.getLogger();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        String address = request.getRemoteAddr();
        String file = ((HttpServletRequest) request).getRequestURI();
        chain.doFilter(request, response);
        LOG.info(address + " - " + file + " - " + (System.currentTimeMillis() - start) + " ms");
    }
}