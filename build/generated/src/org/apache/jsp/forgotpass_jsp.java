package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <style type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("\n");
      out.write(".hdvider {\n");
      out.write("background-color: #7A7A7A;\n");
      out.write("height: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#whyrecharge .defaulttext2 {\n");
      out.write("font-size: 8pt;\n");
      out.write("padding: 6px 0px;\n");
      out.write("padding-top: 6px;\n");
      out.write("padding-right: 0px;\n");
      out.write("padding-bottom: 6px;\n");
      out.write("padding-left: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".defaulttext2 {\n");
      out.write("color: white;\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 10pt;\n");
      out.write("}\n");
      out.write(".whyregisterpanel {\n");
      out.write("background-image:url(why_register_bg.jpg);\n");
      out.write("background-position: 0% 0%;\n");
      out.write("background-position-x: 0%;\n");
      out.write("background-position-y: 0%;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-repeat-x: no-repeat;\n");
      out.write("background-repeat-y: no-repeat;\n");
      out.write("height: 302px;\n");
      out.write("width: 204px;\n");
      out.write("}\n");
      out.write(".defaulttext21 {color: white;\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 10pt;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground: url(f.jpg) center;\n");
      out.write("\tbackground-repeat:repeat;\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: #000;\n");
      out.write("}\n");
      out.write("a.hylink1:Link, a.hylink1:Visited {\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tcolor: #000;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tfont-style:italic;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.hylink1:Hover{\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#header\n");
      out.write("{\n");
      out.write("\tbackground-color:#666;\n");
      out.write("}\n");
      out.write(".style15\n");
      out.write("{\n");
      out.write("\tcolor:#000;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("}\n");
      out.write("a {color:#000000;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".style14 {\n");
      out.write("\tcolor:#000;\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write(".border5 {\n");
      out.write("\tborder: solid #000;\n");
      out.write("\tborder-bottom-width: 0px;\n");
      out.write("\tborder-right-width: 0px;\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write(".style17\n");
      out.write("{\n");
      out.write("\tcolor:#000;\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("<tr>\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("        <form name=\"f2\" method=\"post\">\n");
      out.write("            <div id=\"header\" >\n");
      out.write("<center>\n");
      out.write("  <table width=\"968\" border=\"0\" >\n");
      out.write("  <tr>\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\n");
      out.write("\t\t<span class=\"style14\"><a href=\"login12.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge1.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\n");
      out.write("\n");
      out.write("\t  </tr>\n");
      out.write("</table>\n");
      out.write("</center> </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email id:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select Question</td>\n");
      out.write("                    <td><select name=s1>\n");
      out.write("\t\t<option value=q0>-Select any question-</option>\n");
      out.write("\t\t<option value=q1>Which is your favourite place?</option>\n");
      out.write("\t\t<option value=q2>Who is your best friend?</option>\n");
      out.write("\t\t<option value=q3>Which is your favourite pet?</option>\n");
      out.write("\t\t<option value=q4>Who is your favourite actor?</option>\n");
      out.write("                    </select>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Answer:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ans\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"b1\" value=\"submit\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" align=\"center\">\n");
      out.write("            ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

            if(request.getParameter("b1")!=null)
            {
               // out.println("pressed");
                String n1=request.getParameter("name");
                String n2=request.getParameter("email");
                String n3=request.getParameter("s1");
                String n4=request.getParameter("ans");
                Statement st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("select pass from registeration where name='"+n1+"' and email='"+n2+"'and que='"+n3+"' and ans='"+n4+"'");
          //  out.println("select pass from registeration where name='"+n1+"' and email='"+n2+"'and que='"+n3+"' and ans='"+n4+"'");
            if(rs.next())
            {
                out.println("Your Password is:"+rs.getString(1));
            }
                else
                out.println("Sorry:no such user");
                
            }
            
        
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("        </body>\n");
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
