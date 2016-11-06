<%-- 
    Document   : TimeTetSearch
    Created on : Nov 6, 2016, 10:09:34 PM
    Author     : Saen D Computer
--%>


<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="TimeTable.Timetrain"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    
     <center>
    
    <h1>TIME TRAIN TABLE</h1>
    <div style="background-color: #BBCCFF; width:100%;"> 
        <br />
        <h2>Add TimeTrain Form</h2>


        <form name="formAddActor" action="AddTimetableController">
            Time ID:    <input type="text" name="TimeID" value="" /> <br>
            Train ID:    <input type="text" name="TrainID" value="" /> <br>
            Province: <input type="text" name="Province" value="" /> <br>
            Price:     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="Price" value="" /> <br>
            Date :    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Date" value="" /> <br>
            Time:      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="Time" value="" /> <br>
            
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="submit" value="Submit"name="AddSearch" ><br>
            
             
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
            
            <a href="ListController">View Add</a>
            
            
        </form>

        <br><br>

         <h2>TimeTrain  Search Form</h2>
        <form name="searchForm" action="SearchController">
            Enter Time-ID:<input type="text" name="searchValue" value="" >
            <input type="submit" value="Search Time ID" name="searchButton" />
        <br><br>
        </form>
 
        <%
            try {
                // Create a session object if it is already not  created.
               List<Timetrain> timeList = (List<Timetrain>) session.getAttribute("searchResult");
                    if (timeList != null) {
                        
        %>


        <table border="1">

            <tbody>
                <tr>
                    <td>Time ID</td>
                    <td>Train ID</td>
                    <td>Time</td> 
                    <td>Date</td>
                    <td>Province</td> 
                    <td>Price</td>            
                </tr>
                <% for (Timetrain acc : timeList){ %>
                <tr>
                    <td><% out.println(acc.getTimeId()); %></td>
                    <td><% out.println(acc.getTrainId()); %></td>
                    <td><% out.println(acc.getTimeTrain()); %></td>
                    <td><% out.println(acc.getDateTrain()); %></td>
                    <td><% out.println(acc.getProvice()); %></td>
                    <td><% out.println(acc.getPrice()); %></td>
                </tr>
                <% } %>
                 <tr>
                    <td>Time ID</td>
                    <td>Train ID</td>
                    <td>Time</td> 
                    <td>Date</td>
                    <td>Province</td> 
                    <td>Price</td>            
                </tr>
            </tbody>
        </table>

        <%
                }

            } catch (Exception e) {
                out.println(e.getMessage());
            }

        %>
        
        <br><br>    
        <h2> Search By Text Form</h2>
         <form name="searchForm" action="TextController">
            Enter Province: <input type="text" name="searchTextValue" value="" >
            <input type="submit" value="Search Province" name="searchButton" />
<br><br>
        </form>
       <br><br><br><br>
</center>
</body>

</html>
