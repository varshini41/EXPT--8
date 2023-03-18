/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
 try {

            /* TODO output your page here. You may use following sample code. */
          response.setContentType("text/html");
          String n=request.getParameter("name");
          out.print("Welcome "+n);
          Cookie ck=new Cookie("name",n);
          response.addCookie(ck);
          String p1=request.getParameter("p1");
          Cookie ck1=new Cookie("p1",p1);
          response.addCookie(ck1);
          out.print("you have selected "+p1);
          String p2=request.getParameter("p2");
          Cookie ck2=new Cookie("p2",p2);
          response.addCookie(ck2);
          out.print("-"+p2);

          String p3=request.getParameter("p3");
          Cookie ck3=new Cookie("p3",p3);
          response.addCookie(ck3);
          out.print("-"+p3);

          String p4=request.getParameter("p4");
          Cookie ck4=new Cookie("p4",p4);
          response.addCookie(ck4);
          out.print("-"+p4);
          out.print("<form action='NewServlet2'>");
          out.print("<input type='submit' value='go'>");
          out.print("</form>");
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<title>Servlet servlet1</title>");
          out.println("</head>");
          out.println("<body>");

          out.println("</body>");
          out.println("</html>");
 } finally {
 out.close();

 }
 }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
