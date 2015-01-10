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
@WebServlet(name="howtorecharge1", urlPatterns={"/howtorecharge1"})
public class howtorecharge1 extends HttpServlet {
   
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
            out.println("<title>Servlet howtorecharge1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet howtorecharge1 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
              out.write("<style type=\"text/css\">\r\n");
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
      out.write("background-image:url(why_register_bg.jpg); \r\n");
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
      out.write("\tcolor: #FFF;\r\n");
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
      out.write("a {color:#FFFFFF;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".style14 {\r\n");
      out.write("\tcolor:#FFF;\r\n");
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
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form>\r\n");
      out.write("<center>\r\n");
      out.write("<center>\r\n");
      out.write("</center>\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"login12\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge1\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table width=\"1064\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"240\"><table width=\"204\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"whyrecharge\"  background=\"why_register_bg.jpg\" style=\"background:no-repeat\">\r\n");
      out.write("              <tbody><tr>\r\n");
      out.write("                <td align=\"center\" valign=\"top\" class=\"whyregisterpanel\"><table width=\"182\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td height=\"33\" colspan=\"2\" align=\"left\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" height=\"57\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\" height=\" 6\"=\"\" hspace=\"2\" vspace=\"4\" /></td>\r\n");
      out.write("                      <td width=\"168\" align=\"left\" valign=\"top\" class=\"defaulttext2 nopadding\">Recharge for yourself and your family and friends with a single login account. </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"left\" valign=\"top\" class=\"hdvider\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\"  height=\" 6\"=\"\" hspace=\"2\" vspace=\"9\" /></td>\r\n");
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\">Register any number (pre-paid or post-paid) and recharge your prepaid numbers. </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"left\" valign=\"top\" class=\"hdvider\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\"  height=\" 6\"=\"\" hspace=\"2\" vspace=\"9\" /></td>\r\n");
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\"> Just need to pay Rs 1000 at the time of registration</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"left\" valign=\"top\" class=\"hdvider\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\"  height=\" 6\"=\"\" hspace=\"2\" vspace=\"9\" /></td>\r\n");
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\">Get instant PIN less recharge. </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"left\" valign=\"top\" class=\"hdvider\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\"  height=\" 6\"=\"\" hspace=\"2\" vspace=\"9\" /></td>\r\n");
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\">Get complete transaction history of your recharges. </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"left\" valign=\"top\" class=\"hdvider\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"16\" align=\"left\" valign=\"top\"><img src=\"bullet1.png\" width=\"6\" alt=\"\" height=\"6\" hspace=\"2\" vspace=\"9\" /></td>\r\n");
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\">24x7 customer support.</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </tbody>\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody></table>\r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"812\">\r\n");
      out.write("\t\t<table cellpadding=\"10\" class=\"style17\" >\r\n");
      out.write("\r\n");
      out.write("<tr >\r\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"center\" class=\"border5\">You can recharge in just 3 simple steps\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t\t\t<td width=\"335\" align=\"justify\" valign=\"top\" class=\"border5\">1.SELECT & REGISTER<br>\r\n");
      out.write("\t\t\t   Sign up as our registered user.\r\n");
      out.write("The registration process basically consists of mobile verification.\r\n");
      out.write("Select the service and the service provider, fill in the basic information and complete the registration process.The Registration process is simple, easy and quick.\t\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t<td width=\"334\" valign=\"top\" align=\"justify\" class=\"border5\" >2.MAKE PAYMENT<br>\r\n");
      out.write("\t\t\t   At the time of registration ,all you need is to make payment of Rs 1000.As soon as the payment is done your account will be activated within some period of time.After the activation you can enter the amount for which you want to make recharge.\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t<td width=\"335\" valign=\"top\" align=\"justify\" class=\"border5\" >3.CONFIRMATION<br>\r\n");
      out.write("\t\t\t The recharge amount gets instantly updated to your account.\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>");
    
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
