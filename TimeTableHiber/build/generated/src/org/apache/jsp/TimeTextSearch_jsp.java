package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import TimeTable.Timetrain;

public final class TimeTextSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     <center>\n");
      out.write("    \n");
      out.write("    <h1>TIME TRAIN TABLE</h1>\n");
      out.write("    <div style=\"background-color: #BBCCFF; width:100%;\"> \n");
      out.write("        <br />\n");
      out.write("        <h2>Add TimeTrain Form</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"formAddActor\" action=\"AddTimetableController\">\n");
      out.write("            Time ID:    <input type=\"text\" name=\"TimeID\" value=\"\" /> <br>\n");
      out.write("            Train ID:    <input type=\"text\" name=\"TrainID\" value=\"\" /> <br>\n");
      out.write("            Province: <input type=\"text\" name=\"Province\" value=\"\" /> <br>\n");
      out.write("            Price:     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"Price\" value=\"\" /> <br>\n");
      out.write("            Date :    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"Date\" value=\"\" /> <br>\n");
      out.write("            Time:      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"Time\" value=\"\" /> <br>\n");
      out.write("            \n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("             <input type=\"submit\" value=\"Submit\"name=\"AddSearch\" ><br>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("            \n");
      out.write("            <a href=\"ListController\">View Add</a>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("         <h2>TimeTrain  Search Form</h2>\n");
      out.write("        <form name=\"searchForm\" action=\"SearchController\">\n");
      out.write("            Enter Time-ID:<input type=\"text\" name=\"searchValue\" value=\"\" >\n");
      out.write("            <input type=\"submit\" value=\"Search Time ID\" name=\"searchButton\" />\n");
      out.write("        <br><br>\n");
      out.write("        </form>\n");
      out.write(" \n");
      out.write("        ");

            try {
                // Create a session object if it is already not  created.
               List<Timetrain> timeList = (List<Timetrain>) session.getAttribute("searchResult");
                    if (timeList != null) {
                        
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Time ID</td>\n");
      out.write("                    <td>Train ID</td>\n");
      out.write("                    <td>Time</td> \n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td>Province</td> \n");
      out.write("                    <td>Price</td>            \n");
      out.write("                </tr>\n");
      out.write("                ");
 for (Timetrain acc : timeList){ 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
 out.println(acc.getTimeId()); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(acc.getTrainId()); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(acc.getTimeTrain()); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(acc.getDateTrain()); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(acc.getProvice()); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(acc.getPrice()); 
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Time ID</td>\n");
      out.write("                    <td>Train ID</td>\n");
      out.write("                    <td>Time</td> \n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td>Province</td> \n");
      out.write("                    <td>Price</td>            \n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        ");

                }

            } catch (Exception e) {
                out.println(e.getMessage());
            }

        
      out.write("\n");
      out.write("        \n");
      out.write("        <br><br>    \n");
      out.write("        <h2> Search By Text Form</h2>\n");
      out.write("         <form name=\"searchForm\" action=\"TextController\">\n");
      out.write("            Enter Province: <input type=\"text\" name=\"searchTextValue\" value=\"\" >\n");
      out.write("            <input type=\"submit\" value=\"Search Province\" name=\"searchButton\" />\n");
      out.write("<br><br>\n");
      out.write("        </form>\n");
      out.write("       <br><br><br><br>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
