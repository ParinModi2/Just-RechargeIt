package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javassist.bytecode.stackmap.BasicBlock.Catch;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class login12_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("<body onLoad=\"history.go(+1)\">\r\n");
      out.write("    <table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("        <div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"login12.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge1.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center> </div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t<table border=1 align=\"center\">\r\n");
      out.write("            \r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\"><p>REGISTERED USER</p>\r\n");
      out.write("\t\t\tSimply login and enter the amount to recharge your registered Mobile.\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tEmail Id:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=text name=\"username\"value='");

   if(request.getParameter("check")!=null)
            {
                String user=request.getParameter("username");
                Cookie c1=new Cookie("cuname", user);
                response.addCookie(c1);
           }
     //  String user1="";
        Cookie ck[]=request.getCookies();
        if(ck!=null)
            {
                for(int i=0;i<ck.length;i++)
                    {
                        if(ck[i].getName().equals("cuname"))
                            {
                              String user1=ck[i].getValue();
                              out.println(user1);
                                break;
                        }
                    }
                }

    
      out.write("'>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tPassword:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=password name=\"password\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><input type=checkbox name=\"check\">REMEMBER ME</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\"><a href=\"newreg1.jsp\">REGISTER HERE</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\"><a href=\"forgotpass.jsp\">FORGOT PASSWORD?</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("                    <td align=\"center\" colspan=\"2\"><input type=submit name=login value=\"LOGIN\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                        <table align=\"center\">\r\n");
      out.write("                    <tr>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("                    \r\n");
      out.write("    </form>\r\n");
      out.write("     ");

   
         Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        try{
           if(request.getParameter("login")!=null)
            {
              String logoutvar= request.getQueryString();
              logoutvar +="no";
              if(logoutvar.equals("yesno"))
                  {
                        response.setHeader("Pragma", "no-cache");
                        response.setHeader("Cache-Control", "no-store");
                        response.setDateHeader("Expirs",0);
                 }
             String e1=request.getParameter("username");
            out.println(e1);
             String e2=request.getParameter("password");
            out.println(e2);
            Statement st=cn.createStatement();
            ResultSet rs1;
            ResultSet rs=st.executeQuery("select email,pass from registeration where email='"+e1+"' and pass='"+e2+"'");
            out.println("select email and pass from registeration where email='"+e1+"' and pass='"+e2+"'");
            if(rs.next())
            {
                
                String qemail=rs.getString(1);
                out.println(qemail);
                out.println("select name from registeration where email='"+qemail+"'");
                rs1=st.executeQuery("select name,mno,email from registeration where email='"+qemail+"'");
                if(rs1.next())
                {
                  String sesname=rs1.getString(1);
                  String sesmno=rs1.getString(2);
                   String sesemail=rs1.getString(3);
                  HttpSession ses=request.getSession();
                  ses.setAttribute("sesvarname",sesname );
                  ses.setAttribute("sesvarmno",sesmno );
                  ses.setAttribute("sesvaremail",sesemail );
                 // out.println(ses.getAttribute("sesvarname"));
                }

                response.sendRedirect("howtorecharge.jsp");

            }
            else
                response.sendRedirect("login12.jsp");
                //out.println("sorry");
        }
        }
catch(SQLException ex)
        {
        out.println(ex);

}

      out.write("\r\n");
      out.write("            </body>\r\n");
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
