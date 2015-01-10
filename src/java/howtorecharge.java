/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

/**
 *
 * @author A-4
 */
@WebServlet(name="howtorecharge", urlPatterns={"/howtorecharge"})
public class howtorecharge extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet howtorecharge</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet howtorecharge at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
            out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    try{
    HttpSession chkses= request.getSession();
     String ses11=(String)  chkses.getAttribute("sesvarname");
   //  String ses12=(String)  chkses.getAttribute("sesvarmno");

     if(ses11==null)
         {
            response.sendRedirect("login12.jsp");
         }


      }
    catch(Exception ex)
     {
        out.println(ex);
     }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".hdvider {\r\n");
      out.write("background-color: #7A7A7A;\r\n");
      out.write("height: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#whyrecharge .defaulttext2 {\r\n");
      out.write("font-size: 8pt;\r\n");
      out.write("padding: 6px 0px;\r\n");
      out.write("padding-top: 6px;\r\n");
      out.write("padding-right: 0px;\r\n");
      out.write("padding-bottom: 6px;\r\n");
      out.write("padding-left: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".defaulttext2 {\r\n");
      out.write("color: white;\r\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("font-size: 10pt;\r\n");
      out.write("}\r\n");
      out.write(".whyregisterpanel {\r\n");
      out.write("background-image:url(why_register_bg.jpg);\r\n");
      out.write("background-position: 0% 0%;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("background-repeat-x: no-repeat;\r\n");
      out.write("background-repeat-y: no-repeat;\r\n");
      out.write("height: 302px;\r\n");
      out.write("width: 204px;\r\n");
      out.write("}\r\n");
      out.write(".defaulttext21 {color: white;\r\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("font-size: 10pt;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(f.jpg) center;\r\n");
      out.write("\tbackground-repeat:repeat;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write("a.hylink1:Link, a.hylink1:Visited {\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tfont-style:italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.hylink1:Hover{\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#666;\r\n");
      out.write("}\r\n");
      out.write(".style15\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("a {color:#000000;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".style14 {\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write(".border5 {\r\n");
      out.write("\tborder: solid #000;\r\n");
      out.write("\tborder-bottom-width: 0px;\r\n");
      out.write("\tborder-right-width: 0px;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write(".style17\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"history.go(+1)\">\r\n");
      out.write("<table>\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("<td class=\"style15\" align=\"right\">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome\r\n");
      out.write("    ");

    try
    {
             HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
            //  out.println(ses1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      p1.beans X = null;
      synchronized (session) {
        X = (p1.beans) _jspx_page_context.getAttribute("X", PageContext.SESSION_SCOPE);
        if (X == null){
          X = new p1.beans();
          _jspx_page_context.setAttribute("X", X, PageContext.SESSION_SCOPE);
          out.write("\r\n");
          out.write("                ");
          org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("X"), "nm",
 ses.getAttribute("sesvarname"));
          out.write("\r\n");
          out.write("                  ");
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      p1.beans Y = null;
      synchronized (session) {
        Y = (p1.beans) _jspx_page_context.getAttribute("Y", PageContext.SESSION_SCOPE);
        if (Y == null){
          Y = new p1.beans();
          _jspx_page_context.setAttribute("Y", Y, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((p1.beans)_jspx_page_context.findAttribute("X")).getNm())));
      out.write("<br/>\r\n");
      out.write("\r\n");

    }
    catch(Exception ex)
    {
        out.println(ex);
    }

      out.write("</td>\r\n");
      out.write("<td><input type=\"submit\" name=\"logout\" value=\"LOGOUT\" align=\"left\">\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<center>\r\n");
      out.write("</center>\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"home.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services.jsp \" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t   \t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.jsp\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc.jsp\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\t\r\n");
      out.write("<table cellpadding=\"10\" class=\"style17\" >\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td colspan=\"3\" align=\"center\" class=\"border5\">HOW TO RECHARGE</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"center\" class=\"border5\">You can recharge in just 3 simple steps\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t\t<td width=\"335\" valign=\"top\" align=\"justify\" class=\"border5\">1.SELECT & REGISTER<br>\r\n");
      out.write("\t\t\t  Sign up as our registered user.\r\n");
      out.write("The registration process basically consists of mobile verification.\r\n");
      out.write("Select the service and the service provider, fill in the basic information and complete the registration process.The Registration process is simple, easy and quick.\t\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t<td width=\"334\" valign=\"top\" align=\"justify\" class=\"border5\">2.MAKE PAYMENT<br>\r\n");
      out.write("\t\t\t  At the time of registration ,all you need is to make payment of Rs 1000.As soon as the payment is done your account will be activated within some period of time.After the activation you can enter the amount for which you want to make recharge.\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t<td width=\"335\" valign=\"top\" align=\"justify\" class=\"border5\" >3.CONFIRMATION<br>\r\n");
      out.write("\t\t\t  The recharge amount gets instantly updated to your account.\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table></center>\r\n");
      out.write("</form>\r\n");
      out.write("    ");
 if(request.getParameter("logout")!=null)
        {
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            response.sendRedirect("login12.jsp");



}
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
