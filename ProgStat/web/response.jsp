<%-- 
    Document   : response
    Created on : Nov 10, 2017, 4:21:34 PM
    Author     : ollas
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programmers Statistics App</title>
    </head>
    <body>
        <!--jsp:setProperty name="mybean" property="name" />
        <h1>Hello, <--jsp:getProperty name="mybean" property="name" />! Thank You.</h1>
        <--jsp:useBean id="mybean" scope="session" class="org.mypackage.programmersstatistics.ProgrammersStatistics" /-->
        <li><p><b>Programmer's Name:</b>
            <%= request.getParameter("name")%>
         </p></li>
         <li><p><b>Username:</b>
            <%= request.getParameter("username")%>
         </p></li>
         <li><p><b>Preferred Language 1:</b>
            <%= request.getParameter("field_one")%>
         </p></li>
         <li><p><b>Preferred Language 2:</b>
            <%= request.getParameter("field_two")%>
         </p></li>
    </body>
</html>
