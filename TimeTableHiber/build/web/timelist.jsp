<%-- 
    Document   : timelist
    Created on : Oct 30, 2016, 9:19:12 PM
    Author     : Saen D Computer
--%>

<%@page import="TimeTable.Timetrain"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Time List</h1>

        <%
            try {

                List<Timetrain> timeList = (List<Timetrain>) session.getAttribute("listResult");

                if (timeList != null) {
                    //    out.println("not null");
                    //   out.println(filmList.size());

        %>
        <table border="1">

            <tbody>
                <tr>
                    <td>Time ID</td>
                    <td>Time </td>
                    <td>Date</td>
                    <td>Provice</td>
                    <td>Price</td>

                </tr>
                <%                        for (Timetrain acc : timeList) {
                %>
                <tr>
                    <td><% out.println(acc.getTimeId()); %></td>
                    <td><% out.println(acc.getTimeTrain()); %></td>  
                    <td><% out.println(acc.getDateTrain()); %></td>
                    <td><% out.println(acc.getProvice()); %></td>  
                    <td><% out.println(acc.getPrice()); %></td>  
                    
                </tr>
                <% } %>
            </tbody>
        </table>  


        <%

                } else {
                    out.println("return null");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("error");
            }

        %>

    </body>
</html>
