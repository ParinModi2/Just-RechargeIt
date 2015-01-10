package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


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
      out.write("body {\r\n");
      out.write("\tbackground: url(f.jpg) center;\r\n");
      out.write("\tbackground-repeat:repeat;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {color:#FFFFFF;}\r\n");
      out.write(".style12 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write(".style14 {\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
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
      out.write("\tfont-style: italic;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"history.go(+1)\">\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("<td class=\"style15\" align=\"right\">        Welcome  ");

    try {
           // out.println("im ");
             HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
              out.println(ses1);
                       //   ses.getAttribute("sesvarmno");
        }
    catch(Exception ex)
    {
        out.println(ex);
    }
    
      out.write("</td>\r\n");
      out.write("<td><input type=\"submit\" name=\"logout\" value=\"LOGOUT\">\r\n");
      out.write("    </td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services.jsp \" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td><td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.jsp\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc.jsp\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"271\"><table width=\"204\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"whyrecharge\"  background=\"why_register_bg.jpg\" style=\"background:no-repeat\">\r\n");
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
      out.write("                      <td align=\"left\" valign=\"top\" class=\"defaulttext2\">Register any number (pre-paid or post-paid)and recharge your prepaid numbers. </td>\r\n");
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
      out.write("\t<td width=\"441\">\r\n");
      out.write("\t\t<table width=\"628\" height=\"333\">\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td height=\"67\" colspan=\"2\" align=\"center\"> We are always happy to help and appreciate your feedback.\r\n");
      out.write("<br>Please complete the form below and we will respond to you as quickly as possible.\r\n");
      out.write("</td></tr>\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td height=\"37\">Name:</td><td> <input type=\"text\" name=\"name\"></td> </tr>\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td height=\"39\">Email id:</td><td ><input type=\"text\" name=\"mail\"></td></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td height=\"41\">Mobile no:</td><td><input type=\"text\" name=\"mno\"></td></tr>\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td height=\"40\">Type of Problem:</td><td ><select name=\"s1\">\r\n");
      out.write("\t\t<option value=\"-select any option-\" selected=\"selected\">-select any option-</option>\r\n");
      out.write("\t\t<option value=\"Payment deducted/recharge fail\">Payment deducted/recharge fail</option>\r\n");
      out.write("\t\t<option value=\"Payment Deducted/SessionTimedOut\">Payment Deducted/SessionTimedOut</option>\r\n");
      out.write("\t\t<option value=\"Transaction Success/No Recharge\">Transaction Success/No Recharge</option>\r\n");
      out.write("\t\t<option value=\"Others\">Others</option>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</select> </td></tr>\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td>Comments::</td><td ><textarea name=\"comment\"></textarea></td> </tr>\r\n");
      out.write("\t\t<tr align=\"left\" valign=\"top\"><td ><input type=\"button\" name=\"b1\" value=\"Submit\"></td><td><input type=\"button\" name=\"b1\" value=\"Cancel\"> </td></tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("     ");
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
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
