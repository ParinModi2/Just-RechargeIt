package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
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
      out.write(".style14 {\r\n");
      out.write("\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\t\r\n");
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
      out.write(".style18 {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("\tvar flag=true;\r\n");
      out.write("\tvar eid=document.f1.username.value;\r\n");
      out.write("\tvar pass=document.f1.password.value;\r\n");
      out.write("\tif(eid!='admin' )\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.username.value=\"\";\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Sorry you  have entered wrong USERNAME\");\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tif(pass!='admin123')\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tf1.password.value=\"\";\r\n");
      out.write("\t\t\tflag=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"Sorry you  have entered wrong PASSWORD\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//alert(flag);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//alert(flag);\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=f1 method=\"post\" enctype=\"multipart/form-data\"   >\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"1000\" height=\"10\" border=\"0\" align=\"center\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"42\" align=\"center\">\t\t\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"login.php\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge1.html\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("<table width=\"1300\" height=\"200\" border=\"1\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"539\" height=\"300\" align=\"center\" >\r\n");
      out.write("\t<table width=\"539\" height=\"300\" border=\"1\" align=\"center\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\">\r\n");
      out.write("\t\t\t<p class=\"style16\" align=\"center\">REGISTERED USER</p><br />\r\n");
      out.write("\t\t       <span class=\"style16\">Simply login and enter the amount to recharge your registered Mobile.\t     </span>\r\n");
      out.write("                         </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"30\" align=\"left\"><span class=\"style16\">EMAIL ID:</span></td>\r\n");
      out.write("          <td align=\"left\"><input type=\"text\" name=\"username\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <br />\r\n");
      out.write("        <br />\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"30\" align=\"left\"><span class=\"style16\"> PASSWORD:</span></td>\r\n");
      out.write("          <td align=\"left\"><input type=\"password\" name=\"password\"  /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <br />\r\n");
      out.write("        <br />\r\n");
      out.write("        <br />\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td  height=\"30\" align=\"center\" colspan=\"2\"><input type=\"checkbox\" name=\"check\" />\r\n");
      out.write("\t\t    <span class=\"style16\"> REMEMBER ME</span></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("      \r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"47\" colspan=\"2\" align=\"center\"><a href=\"mainregisteration.php\" class=\"style16\">REGISTER HERE </a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("          <td height=\"47\" colspan=\"2\" align=\"center\"><a href=\"forgotpass1.php\" class=\"style16\">FORGOT PASSWORD? </a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"49\" align=\"center\"><input type=\"submit\" name=\"button\" value=\"LOGIN\" /></td>\r\n");
      out.write("          <td height=\"49\" align=\"center\"><input type=\"submit\" name=\"button1\" value=\"ADMIN\" onclick=\"return validate()\"  /></td>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("</table>\r\n");
      out.write("    <td  width=\"539\" height=\"300\" bgcolor=\"#666666\">\r\n");
      out.write("\t<center>\r\n");
      out.write("  \t <p class=\"style14\"><b>WHAT IS IT</b></p></center>\r\n");
      out.write(" \t <p class=\"style14\">\r\n");
      out.write("\t JustRechargeIt provides you the convenience of recharging your prepaid mobile from anywhere in the world and at anytime,without visiting any retail shop or making any calls. All you need is a computer so that you can logon to our website JustRechargeIt.com and select the service and the service provider, you just need to enter the recharge amount.\r\n");
      out.write("<br /><br /><br />\r\n");
      out.write("JustRechargeIt offers simple and instant recharge for Aircel, Airtel, Loop Mobile (BPL Mobile), Vodafone, Tata Indicom Mobile, Reliance Mobile, Tata Docomo, BSNL, Idea, MTNL, MTS, Uninor, Tata Walky, Videocon Mobile and Virgin Mobile.     </p>\r\n");
      out.write(" </td>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td height=\"200\" colspan=\"2\" align=\"center\"><span class=\"style18\" >SERVICES AVAILABLE</span><br />\r\n");
      out.write("\t<marquee direction=\"right\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<img src=\"airtel.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"aircel.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"videocon.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"vodafone.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"vergin.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"tataindicom.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"docomo.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"reliance.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"uninor.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"mts.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"mtnl.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"idea.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"bsnl.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"loop.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("<img src=\"walky.gif\" class=\"shadowblur\"></img>&nbsp;&nbsp;\r\n");
      out.write("</marquee>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("    ");


    if(request.getParameter("button")!=null)
    {
        String e1=request.getParameter("username");
        String e2=request.getParameter("password");
        out.println(e1);
        out.println(e2);
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
