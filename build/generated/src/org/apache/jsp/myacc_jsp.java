package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import org.hibernate.validator.constraints.Length;

public final class myacc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

ResultSet rs1;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".changepassword{display:none}\r\n");
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
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("    function visibility(id,id1) \r\n");
      out.write("\t{   \r\n");
      out.write("\t   var e = document.getElementById(id);\r\n");
      out.write("\t   var e1 = document.getElementById(id1);\r\n");
      out.write("          e.style.display = 'block';\r\n");
      out.write("\t\t  e1.style.display='none';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction visibility1(id)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar e= document.getElementById(id);\r\n");
      out.write("\t\tif(e.style.display=='none')\r\n");
      out.write("\t\t\t\t\te.style.display='block';\r\n");
      out.write("\r\n");
      out.write("\t\t\t//e.style.display='none';\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\te.style.display='block';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction validate(id)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\t\tvar e=document.getElementById(id);\r\n");
      out.write("\t\t\t\te.style.display='block';\r\n");
      out.write("\t\t\t\tvar amt1= document.f1.amt.value;\r\n");
      out.write("\t\t\t//\tvar flag=true;\r\n");
      out.write("\t\t\t\tif(amt1.length==0)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\talert(\"Please enter amount\");\r\n");
      out.write("\t\t\t\t//\tflag false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(isNaN(amt1))\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Please enter digits\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t//\treturn flag;\r\n");
      out.write("\t}\r\n");
      out.write("-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"history.go(+1)\">\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\r\n");
      out.write("<td class=\"style15\" align=\"right\">        Welcome ");
      out.write(' ');



    try {
           // out.println("im ");
              HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
              out.println(ses1);
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement st=cn.createStatement();

        String ses2=(String) ses.getAttribute("sesvaremail");
        rs1=st.executeQuery("select * from transaction where email='"+ses2+"'");



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
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"home.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t    <td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services.jsp \" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.jsp\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc.jsp\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</center> </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");

    try
    {
        HttpSession ses=request.getSession();
                String ses1=(String) ses.getAttribute("sesvaremail");
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                Statement st=cn.createStatement();
                 ResultSet rs=st.executeQuery("select * from registeration where email='"+ses1+"'");
                if(rs.next())
                {

      out.write("\r\n");
      out.write("<table cellpadding=\"10\" align=\"center\">\r\n");
      out.write("\t<table id=\"profile\" cellpadding=\"10\" align=\"center\" style=\"display:none\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th colspan=\"2\" class=\"style16\" >MY PROFILE</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > NAME:</td>\r\n");
      out.write("                <td> <input type=\"text\" name=\"name\" value=\"");
      out.print(rs.getString(1));
      out.write("\" ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t<td > ADDRESS:</td>\r\n");
      out.write("\t\t<td> <textarea >");
      out.print(rs.getString(2));
      out.write(" </textarea></td><br/>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > COUNTRY:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"country\" value=\"");
      out.print(rs.getString(3));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > STATE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"state\" value=\"");
      out.print(rs.getString(4));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > CITY:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"city\" value=\"");
      out.print(rs.getString(5));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > PIN CODE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"pin\" value=\"");
      out.print(rs.getString(6));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > E-MAIL:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"no\" value=\"");
      out.print(rs.getString(7));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > MOBILE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"mail\" value=\"");
      out.print(rs.getString(8));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("        ");

                }
          }
          catch(Exception ex)
          {
              out.println(ex);
          }
        
      out.write("\r\n");
      out.write("    \t<tr>\r\n");
      out.write("\t<td colspan=\"2\" align=\"center\" class=\"style16\"><a href=changepass.php class=\"style16\" >Change Password </a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\" class=\"style16\"><input type=\"button\" name=\"profile1\" value=\"EDIT PROFILE\" onClick=\"visibility('edit','profile')\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr >\r\n");
      out.write("\t\t<td  align=\"center\" colspan=\"2\"><input type=\"submit\" name=\"transaction\" value=\"SHOW TRANSACTIONS\" onClick=\"visibility('transaction','profile')\"></td>\t\t\t\t    </tr>\r\n");
      out.write("\t\r\n");
      out.write("<!-- transection search table-->\r\n");
      out.write("\r\n");
      out.write("<table id=\"transaction\" border=\"0\" align=\"center\" style=\"display:block\" cellpadding=\"10\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th colspan=\"2\" align=\"center\" class=\"style16\">TRANSACTION</th>\r\n");
      out.write("</tr>\t\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td colspan=\"2\" align=\"center\" class=\"style16\">SEARCH BY</td>\r\n");
      out.write("<tr>\r\n");
      out.write("<td >AMOUNT:</td>\r\n");
      out.write("<td ><input type=\"text\" name=\"amt\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td  align=\"center\" colspan=\"2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"SUBMIT\" name=\"b1\" onclick=\"validate('transaction')\"/>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td  align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"SHOW ALL TRANSACTIONS\"  name=\"b2\"  />\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("\t\t<td class=\"style16\" align=\"center\" colspan=\"2\"><input type=\"button\" name=\"profile\" value=\"VIEW PROFILE\" onClick=\"visibility('profile','transaction')\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!--edit profile table-->\r\n");
      out.write("\r\n");
      out.write("<table cellpadding=\"10\" align=\"center\">\r\n");
      out.write("\t<table id=\"edit\" cellpadding=\"10\" align=\"center\" style=\"display:none\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th class=\"style16\" colspan=\"2\">EDIT PROFILE</th>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td > NAME:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"name1\" ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("\t\t<td> ADDRESS:</td>\r\n");
      out.write("\t\t<td> <textarea name=\"address1\" ></textarea></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> COUNTRY:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"country1\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> STATE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"state1\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> CITY:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"city1\"/> ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> PIN CODE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"pin1\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> MOBILE:</td>\r\n");
      out.write("\t\t<td> <input type=\"text\" name=\"mno1\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\" name=s1 value=\"SUBMIT\" onClick=\"visibility('edit')\" /></td>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");

try
    {
//        out.println("in trry");
     HttpSession ses=request.getSession();
     String ses1=(String) ses.getAttribute("sesvaremail");
     Class.forName("com.mysql.jdbc.Driver");
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

    if(request.getParameter("s1")!=null)
    {
         String name=request.getParameter("name1");
             String add=request.getParameter("address1");
             String country=request.getParameter("country1");
             String state=request.getParameter("state1");
             String city=request.getParameter("city1");
             int pin=Integer.parseInt(request.getParameter("pin1"));
             String mno=request.getParameter("mno1");
             Statement st=cn.createStatement();
             ResultSet rs=st.executeQuery("select email from registeration where email='"+ses1+"'");
        //     out.println("select email from registeration where email='"++"'");
        if(rs.next())
        {
            PreparedStatement pst=cn.prepareStatement("update registeration set name=?,address=?,country=?,state=?,city=?,pin=?,mno=? where email='"+ses1+"'");
            pst.setString(1,name);
            pst.setString(2,add);
            pst.setString(3,country);
            pst.setString(4,state);
            pst.setString(5,city);
            pst.setInt(6,pin);
            pst.setString(7,mno);
       //  pst.setS+","+country+","++","++","++","++","+email+","+pass+","+cpass+","+que+","+ans);
         pst.execute();
         ses.setAttribute("sesvarname", name);
         pst.close();
         }
     }
}
 catch(Exception ex)
 {
     out.println(ex);
 }

      out.write("\r\n");
      out.write(" ");
 if(request.getParameter("logout")!=null)
        {
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            response.sendRedirect("login12.jsp");
            


}
      out.write("\r\n");
      out.write("\r\n");


if(request.getParameter("b2")!=null)
{
	response.sendRedirect("transhistory.jsp");
}
if(request.getParameter("b1")!=null)
{
	String amt=request.getParameter("amt");
	if(amt.length()==0)
	{
            	out.println( "Please enter amount");
                response.sendRedirect("myacc.jsp");
        }
        	else
	{
                int amt1=Integer.parseInt(request.getParameter("amt"));

		response.sendRedirect("amttransaction.jsp?nm="+amt1);
	}

}

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
