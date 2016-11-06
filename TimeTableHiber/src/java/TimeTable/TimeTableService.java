/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTable;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Saen D Computer
 */
public class TimeTableService extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public List getTimeTable(int startID, int endID) {
        List timeList = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Timetrain where timeId between  '" + startID + "' and '" + endID + "'");
            timeList = (List<Timetrain>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timeList;
    }
    public List searchText(String search_province) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        List time = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Timetrain where Provice Like '%"+search_province+"%'");
            time = (List<Timetrain>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return time;
    }
    public Timetrain searchTime(short search_time)
    {
          String message=null;
        Session session=null;
       Transaction tx = null;
	 Timetrain time = null;
	 try {
                 session=HibernateUtil.getSessionFactory().openSession();
		 tx = session.getTransaction();
		 tx.begin();
		 Query query = session.createQuery("from Timetrain where TimeId = "+search_time);
		 time = (Timetrain)query.uniqueResult();
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }
	 return time;
    }
        public String addTimeTable(Timetrain TimeId) {
            String message = null;
            Session session = null;
            try {
                session
                        = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.getTransaction();
                tx.begin();
                session.save(TimeId);
                tx.commit();
                message = "Saved Data";
                return message;
            } catch (Exception e) {
                
                return (e.getMessage());
            } finally {
                session.close();
            }
        }
   
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TimeTableService</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TimeTableService at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
