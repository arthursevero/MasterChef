<%@ page import="by.pvt.pankova.resources.ConfigurationManager" %>
<%
    response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", application.getContextPath() + ConfigurationManager.getProperty("page.login"));
%>