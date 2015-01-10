package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commtransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(f.jpg) center;\r\n");
      out.write("\tbackground-repeat:repeat;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
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
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("\r\n");
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
      out.write("\t\t<span class=\"style14\"><a href=\"home.php\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge.html\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"rechargeplans1.php \" class=\"hylink1\">RECHARGE PLANS</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t    <td width=\"121\" align=\"center\"><span class=\"style14\"><a href=\"services.html\" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.html\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc.php\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<?php\r\n");
      out.write("\t\t\tsession_start();\r\n");
      out.write("\t\t$provider=$_SESSION['serprov'];\r\n");
      out.write("\t\t//echo \"$provider\";\r\n");
      out.write("\t\t$amt1=$_SESSION['mnt'];\r\n");
      out.write("\t\t//echo \"$amt1\";\r\n");
      out.write("\t\t$mno1=$_SESSION['mob'];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$email=$_SESSION['email'];\r\n");
      out.write("\t\t//echo \"$email\";\r\n");
      out.write("\t\t//echo \"$provider\";\r\n");
      out.write("\t\t//echo \"$amt1\";\r\n");
      out.write("\t\t//echo \"$mno1\";\r\n");
      out.write("\t\tmysql_connect('localhost','root','');\r\n");
      out.write("\t\tmysql_select_db('project');\r\n");
      out.write("\t\r\n");
      out.write("\t\t$row=mysql_query(\"select amt from registeration where email='$email'\");\r\n");
      out.write("\t\t$row1=mysql_query(\"select mno from registeration where email='$email'\");\r\n");
      out.write("\r\n");
      out.write("\t\t$amt=mysql_fetch_array($row);\r\n");
      out.write("\t\t$mno=mysql_fetch_array($row1);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$curbal=$amt[0];\r\n");
      out.write("\t\t$mno=$mno[0];\r\n");
      out.write("\t\tif($mno==$mno1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif($amt[0]>=$amt1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t$amt=$amt[0]-$amt1;\r\n");
      out.write("\t\t\t\tmysql_query(\"update registeration set amt='$amt' where email='$email'\");\r\n");
      out.write("\t\t\t\tmysql_query(\"insert into transaction values('$email','$mno','$provider','$amt1')\");\r\n");
      out.write("\t\t\t\techo \"<table align=center border=1 class=style16>\";\r\n");
      out.write("\t\t\t\techo \"<tr>\";\r\n");
      out.write("\t\t\t\techo \"<td  height=45 width=200>Account Balance:\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"<td  height=45 width=200><input type=text name=accbalace value=$curbal />\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"</tr>\";\r\n");
      out.write("\t\t\t\techo \"<tr>\";\r\n");
      out.write("\t\t\t\techo \"<td  height=45 width=200>Recharge Amount:\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"<td  height=45 width=200><input type=text name=rechargeamt value=$amt1 />\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"</tr>\";\r\n");
      out.write("\t\t\t\techo\"<tr>\";\r\n");
      out.write("\t\t\t\techo\"<td  height=45 width=200>Current Balance:\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"<td  height=45 width=200><input type=text name=currentrecharge value=$amt />\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"</tr>\";\r\n");
      out.write("\t\t\t\techo \"</table>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\telse \r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\techo \" You have insufficient balance\";\r\n");
      out.write("\t\t\t\techo \"<br>\";\r\n");
      out.write("\t\t\t\techo \"<br>\";\r\n");
      out.write("\t\t\t\techo \"<br>\";\r\n");
      out.write("\t\t\t\techo\"<table align=center class=style16>\";\r\n");
      out.write("\t\t\t\techo\"<tr>\";\r\n");
      out.write("\t\t\t\techo\"<td>Current Balance:\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"<td><input type=text name=currentrecharge value=$curbal />\t\t</td>\";\r\n");
      out.write("\t\t\t\techo \"</tr>\";\r\n");
      out.write("\t\t\t\techo\"</table>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\techo \"Pease enter correct DATA\";\r\n");
      out.write("\t\t\r\n");
      out.write("?>\r\n");
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
