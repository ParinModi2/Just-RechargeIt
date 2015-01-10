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

/**
 *
 * @author A-4
 */
@WebServlet(name="home", urlPatterns={"/home"})
public class home extends HttpServlet {
   
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
            out.println("<title>Servlet home</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet home at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
              out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(f.jpg) center;\r\n");
      out.write("\tbackground-repeat:repeat;\r\n");
      out.write("}\r\n");
      out.write("a.hylink1:Link, a.hylink1:Visited {\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tfont-style:italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.hylink1:Hover{\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("a {color:#FFFFFF;}\r\n");
      out.write(".style12 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write(".style14 {\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\tbackground-color:#666666;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".style15\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("#header\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#666;\r\n");
      out.write("}\r\n");
      out.write(".style16\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<center>\r\n");
      out.write("<center>\r\n");
      out.write("</center>\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"login12.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge1.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br />\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<table width=\"600\" ><tr>\r\n");
      out.write("\r\n");
      out.write(" <td >\r\n");
      out.write("\t<center>\r\n");
      out.write("  \t <p class=\"style14\"><b>WHAT IS IT</b></p></center>\r\n");
      out.write(" \t <p class=\"style14\">\r\n");
      out.write("\t JustRechargeIt provides you the convenience of recharging your prepaid mobile from anywhere in the world and at anytime,without visiting any retail shop or making any calls. All you need is a computer so that you can logon to our website JustRechargeIt.com and select the service and the service provider, you just need to enter the recharge amount.\r\n");
      out.write("<br /><br /><br />\r\n");
      out.write("JustRechargeIt offers simple and instant recharge for Aircel, Airtel, Loop Mobile (BPL Mobile), Vodafone, Tata Indicom Mobile, Reliance Mobile, Tata Docomo, BSNL, Idea, MTNL, MTS, Uninor, Tata Walky, Videocon Mobile and Virgin Mobile.     </p>\r\n");
      out.write(" </td></tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("  \t<td height=\"200\" colspan=\"2\" align=\"center\"><span class=\"style14\" >SERVICES AVAILABLE</span><br />\r\n");
      out.write("\t<marquee direction=\"right\" onMouseOver=\"this.stop();\" onMouseOut=\"this.start();\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"airtel.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"aircel.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"videocon.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"vodafone.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"vergin.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"tataindicom.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"doco<mo.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"reliance.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"uninor.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"mts.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"mtnl.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"idea.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"bsnl.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"loop.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"walky.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("</marquee>\r\n");
      out.write("</html>\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write(" </table>\r\n");
      out.write(" ");

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
