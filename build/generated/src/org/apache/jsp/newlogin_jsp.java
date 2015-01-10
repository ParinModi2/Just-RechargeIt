package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("\tvar flag=true;\n");
      out.write("\tvar eid=document.f1.username.value;\n");
      out.write("\tvar pass=document.f1.password.value;\n");
      out.write("\tif(eid!='admin' )\n");
      out.write("\t{\n");
      out.write("\t\tf1.username.value=\"\";\n");
      out.write("\t\tflag=false;\n");
      out.write("\t\t\t\t\t\t\talert(\"Sorry you  have entered wrong USERNAME\");\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tif(pass!='admin123')\n");
      out.write("\t\t{\n");
      out.write("\n");
      out.write("\t\t\t\tf1.password.value=\"\";\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"Sorry you  have entered wrong PASSWORD\");\n");
      out.write("\n");
      out.write("\t\t\t\t//alert(flag);\n");
      out.write("\t\t}\n");
      out.write("\t\t//alert(flag);\n");
      out.write("\t\treturn flag;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("<tr>\n");
      out.write("    <td width=\"168\"> <img src=\"logo.gif\"></img></td>\n");
      out.write("    <td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\n");
      out.write("<td >Stay Connected ... Wherever you go ...</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        <form name=f1 method=\"post\" enctype=\"multipart/form-data\"   >\n");
      out.write("\n");
      out.write("<div id=\"header\" >\n");
      out.write("<center>\n");
      out.write("  <table width=\"1000\" height=\"10\" border=\"0\" align=\"center\" >\n");
      out.write("  <tr>\n");
      out.write("\t\t<td width=\"89\" height=\"42\" align=\"center\">\n");
      out.write("\t\t<span ><a href=\"login.php\" \">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span ><a href=\"howtorecharge1.html\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\n");
      out.write(" </tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <p align=\"center\">REGISTERED USER</p><br />\n");
      out.write("                                    <span>Simply login and enter the amount to recharge your registered Mobile.\t     </span>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("          <td height=\"30\" align=\"left\"><span >EMAIL ID:</span></td>\n");
      out.write("          <td align=\"left\"><input type=\"text\" name=\"username\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <tr>\n");
      out.write("          <td height=\"30\" align=\"left\"><span> PASSWORD:</span></td>\n");
      out.write("          <td align=\"left\"><input type=\"password\" name=\"password\"  /></td>\n");
      out.write("        </tr>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t  <td  height=\"30\" align=\"center\" colspan=\"2\"><input type=\"checkbox\" name=\"check\" />\n");
      out.write("\t\t    <span > REMEMBER ME</span></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td height=\"47\" colspan=\"2\" align=\"center\"><a href=\"mainregisteration.php\">REGISTER HERE </a></td>\n");
      out.write("        </tr>\n");
      out.write("\t<tr>\n");
      out.write("          <td height=\"47\" colspan=\"2\" align=\"center\"><a href=\"forgotpass1.php\" >FORGOT PASSWORD? </a></td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td height=\"49\" align=\"center\"><input type=\"submit\" name=\"button\" value=\"LOGIN\" /></td>\n");
      out.write("          <td height=\"49\" align=\"center\"><input type=\"submit\" name=\"button1\" value=\"ADMIN\" onclick=\"return validate()\"  /></td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                    <td  width=\"539\" height=\"300\" bgcolor=\"#666666\">\n");
      out.write("\t<center>\n");
      out.write("  \t <p ><b>WHAT IS IT</b></p></center>\n");
      out.write(" \t <p >\n");
      out.write("\t JustRechargeIt provides you the convenience of recharging your prepaid mobile from anywhere in the world and at anytime,without visiting any retail shop or making any calls. All you need is a computer so that you can logon to our website JustRechargeIt.com and select the service and the service provider, you just need to enter the recharge amount.\n");
      out.write("<br /><br /><br />\n");
      out.write("JustRechargeIt offers simple and instant recharge for Aircel, Airtel, Loop Mobile (BPL Mobile), Vodafone, Tata Indicom Mobile, Reliance Mobile, Tata Docomo, BSNL, Idea, MTNL, MTS, Uninor, Tata Walky, Videocon Mobile and Virgin Mobile.     </p>\n");
      out.write(" </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("  \t<td height=\"200\" colspan=\"2\" align=\"center\"><span >SERVICES AVAILABLE</span><br />\n");
      out.write("\t<marquee direction=\"right\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<img src=\"airtel.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"aircel.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"videocon.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"vodafone.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"vergin.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"tataindicom.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"docomo.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"reliance.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"uninor.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"mts.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"mtnl.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"idea.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"bsnl.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"loop.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("<img src=\"walky.gif\" ></img>&nbsp;&nbsp;\n");
      out.write("</marquee>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("<td ><input type=\"submit\" name=\"b1\" ></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");

        out.println("in jsp");
        if(request.getParameter("b1")!=null)
        {
            out.println("button clicked");
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
