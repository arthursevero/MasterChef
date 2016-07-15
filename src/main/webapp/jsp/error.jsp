<%@ page import="by.pvt.pankova.resources.ConfigurationManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true" %>
<%
    final org.apache.logging.log4j.Logger LOG = org.apache.logging.log4j.LogManager.getLogger();
    LOG.warn(pageContext.getErrorData().getRequestURI() + " - " + pageContext.getErrorData().getServletName() + " - " + pageContext.getErrorData().getStatusCode() + " - " + pageContext.getErrorData().getThrowable());
%>
<html>
<head>
    <title>Error page</title>
</head>
<body>
<p>
    Request from <b>${pageContext.errorData.requestURI}</b> is failed
</p>

<p>
    Servlet name or type:<br/> <b>${pageContext.errorData.servletName}</b>
</p>

<p>
    Status code:<br/> <b>${pageContext.errorData.statusCode}</b>
</p>

<p>
    Exception:<br/> <b>${pageContext.errorData.throwable}</b>
</p>

<p>
    <a
            href="<%=application.getContextPath() + ConfigurationManager.getProperty("page.login")%>">Go
        back</a>
</p>
</body>
</html>