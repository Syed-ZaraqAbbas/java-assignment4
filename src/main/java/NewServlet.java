/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class NewServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Assignment 4 Syed Zarc Abbas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          PrintWriter out = response.getWriter();
          String id = request.getParameter("loginId");
          String password = request.getParameter("password");
          String finalMessage = "";
          
          if(id.equals("punjabhealth") && password.equals("health")) {
              finalMessage = "Login Successful";
          }else {
              finalMessage = "Wrong Password Please try Again";
          }
          
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Assignment 4 Syed Zarc Abbas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.print("<h2>"+finalMessage+"</h2>");
            out.println("</body>");
            out.println("</html>");
          
    }

   

}
