package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class newreg1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style type=\"text/css\">\n");
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
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t//alert(t7);\n");
      out.write("\tvar firstpos=t8.indexOf(\"@\");\n");
      out.write("\tvar lastpos=t8.lastIndexOf(\"@\");\n");
      out.write("\tvar po2=t8.indexOf(\".\");\n");
      out.write("            var t9=document.f1.pass.value;\n");
      out.write("\t//alert(t9);\n");
      out.write("\n");
      out.write("       //alert(t12);\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validatename()\n");
      out.write("        {\n");
      out.write("            var t1=document.f1.name.value;\n");
      out.write("          //  alert(t1);\n");
      out.write("\t    if(t1.length==0)\n");
      out.write("            {\n");
      out.write("\t\tdocument.getElementById(\"uname\").innerHTML=\"* Please Enter User Name\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                document.getElementById(\"uname\").innerHTML=\"\";\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validateadd()\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            var t2=document.f1.address.value;\n");
      out.write("            if(t2.length==0)\n");
      out.write("            {\n");
      out.write("\t\tdocument.getElementById(\"add\").innerHTML=\"* Please Enter Address\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                document.getElementById(\"add\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validatestate()\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            var t4=document.f1.state.value;\n");
      out.write("            if(t4.length==0)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById(\"state1\").innerHTML=\"* Please Enter State\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("               document.getElementById(\"state1\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validatecity()\n");
      out.write("        {\n");
      out.write("            var t5=document.f1.city.value;\n");
      out.write("            if(t5.length==0)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById(\"city1\").innerHTML=\"* Please Enter City\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                document.getElementById(\"city1\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validatepin()\n");
      out.write("        {\n");
      out.write("             var t6=document.f1.pin.value;\n");
      out.write("\n");
      out.write("            if(t6.length==0 || t6.length!=6 || (isNaN(t6)))\n");
      out.write("            {\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById(\"pin1\").innerHTML=\"* Please Enter Pin Code\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            \tdocument.getElementById(\"pin1\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validatemno()\n");
      out.write("        {\n");
      out.write("            var t7=document.f1.mno.value;\n");
      out.write("\n");
      out.write("            if(t7.length!=10)\n");
      out.write("            {\n");
      out.write("\t\tdocument.getElementById(\"mno1\").innerHTML=\"* Please Enter 10 Digit Phone No\";\n");
      out.write("\t    }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                if(isNaN(t7))\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"mno1\").innerHTML=\"* Please Enter Digits\";\n");
      out.write("                }\n");
      out.write("\t    \telse\n");
      out.write("                    document.getElementById(\"mno1\").innerHTML=\"\";\n");
      out.write("             }\n");
      out.write("        }\n");
      out.write("          function validateemail()\n");
      out.write("          {\n");
      out.write("\n");
      out.write("             var t8=document.f1.email.value;\n");
      out.write("            var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("            if(t8.match(mailformat) || t8.length==0)\n");
      out.write("            {\n");
      out.write("                //alert(\"correct\");\n");
      out.write("               \n");
      out.write("                 document.getElementById(\"mail1\").innerHTML=\"\";\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("           // alert(\"not correct\");\n");
      out.write("            document.getElementById(\"mail1\").innerHTML=\"* Please enter correct Email-id\";\n");
      out.write("           \n");
      out.write("\n");
      out.write("             }\n");
      out.write("          }\n");
      out.write("        function validatepass()\n");
      out.write("             {\n");
      out.write("                var t9=document.f1.pass.value;\n");
      out.write("                if(t9.length!=6)\n");
      out.write("                {\n");
      out.write("            //re        alert(t9);\n");
      out.write("                    document.getElementById(\"pass1\").innerHTML=\"* Please Enter correct Password\";\n");
      out.write("\t\t}\n");
      out.write("                else\n");
      out.write("                   {\n");
      out.write("                        alert(t9);\n");
      out.write("                            document.getElementById(\"pass1\").innerHTML=\"\";\n");
      out.write("\n");
      out.write("                   }\n");
      out.write("\n");
      out.write("             }\n");
      out.write("        function validatecpass()\n");
      out.write("          {\n");
      out.write("              var t9=document.f1.pass.value;\n");
      out.write("              var t10=document.f1.cpass.value;\n");
      out.write("            if(t10!=t9)\n");
      out.write("\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("\t\tdocument.getElementById(\"cpass1\").innerHTML=\"* Please Enter correcct  Confirm Password\";\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"cpass1\").innerHTML=\" \";\n");
      out.write("\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        function validateque()\n");
      out.write("        {\n");
      out.write("        var t11=document.f1.s1.value;\n");
      out.write("        if(t11=='q0')\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"que\").innerHTML=\"* Please enter correct question\";\n");
      out.write("\t}\n");
      out.write("        else\n");
      out.write("       \t\tdocument.getElementById(\"que\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        function validateans()\n");
      out.write("        {\n");
      out.write("            var t12=document.f1.ans.value;\n");
      out.write("            if(t12.length==0)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById(\"ans1\").innerHTML=\"* Please enter Answer\";\n");
      out.write("\t\t}\n");
      out.write("                else\n");
      out.write("                    document.getElementById(\"ans1\").innerHTML=\"\";\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("      <body>\n");
      out.write("          <table>\n");
      out.write("<tr>\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("      <form name=\"f1\" method=\"post\">\n");
      out.write("                      <div id=\"header\" >\n");
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
      out.write("            \n");
      out.write("\n");
      out.write("            <table align=\"center\">\n");
      out.write("          <tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Name:</td>\n");
      out.write("\t\t<td width=\"197\"><input type=text name=name value=\"");
      out.print(request.getParameter("name")!=null?request.getParameter("name"):"");
      out.write("\" onblur=\"validatename()\"></td>\n");
      out.write("\t\t<td><span class=\"style70\">Full name as appearing on your bank statement</span></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"uname\" style=\"color:red\"  class=\"style70\"> </div> </td>\n");
      out.write("\t</tr>\n");
      out.write("\t  <tr>\n");
      out.write("\t    <td  height=\"38\">Current Address:\t\t</td>\n");
      out.write("\t\t<td width=\"197\"><textarea name=address  onblur=\"validateadd()\" cols=30 rows=5>");
      out.print(request.getParameter("address")!=null?request.getParameter("address"):"");
      out.write("</textarea></td>\n");
      out.write("\t\t<td><span class=\"style70\">Address as appearing on your bank statement</span></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"add\" style=\"color:red\"  class=\"style70\"></div>\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Country:\t</td>\n");
      out.write("\t\t<td width=\"197\"><input type=text name=country value=\"India\">\t\t</td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"country1\" style=\"color:red\"  class=\"style70\"></div></td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">State:\t\t</td>\n");
      out.write("\t\t<td width=\"197\"><input type=text name=state value=\"");
      out.print(request.getParameter("state")!=null?request.getParameter("state"):"");
      out.write("\" onblur=\"validatestate()\">\t\t</td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"state1\" style=\"color:red\"  class=\"style70\"></div></td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">City:</td>\n");
      out.write("                <td width=\"197\"><input type=\"text\" name=city value=\"");
      out.print(request.getParameter("city")!=null?request.getParameter("city"):"");
      out.write("\" onblur=\"validatecity()\"></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"city1\" style=\"color:red\"  class=\"style70\"></div>\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Pin Code:</td>\n");
      out.write("                <td width=\"197\"><input type=\"text\" name=pin value=\"");
      out.print(request.getParameter("pin")!=null?request.getParameter("pin"):"");
      out.write("\" onblur=\"validatepin()\"></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"pin1\" style=\"color:red\"  class=\"style70\"></div>\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Mobile No:\t</td>\n");
      out.write("                <td width=\"197\"><input type=text name=mno value=\"");
      out.print(request.getParameter("mno")!=null?request.getParameter("mno"):"");
      out.write("\" onblur=\"validatemno()\"></td>\n");
      out.write("                <td width=\"107\"><div id=\"mno1\" style=\"color:red\"  class=\"style70\"></div>\t</td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Email:\t</td>\n");
      out.write("                <td width=\"197\"><input type=text name=email value=\"");
      out.print(request.getParameter("email")!=null?request.getParameter("email"):"");
      out.write("\" onblur=\"validateemail()\">\t</td>\n");
      out.write("\t\t<td><span class=\"style70\">Enter a valid email ID. We proactively track all bounced emails</span></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"mail1\" style=\"color:red\"  class=\"style70\"></div>\t</td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr>\n");
      out.write("\t\t<td width=\"115\" height=\"38\">Password:\t</td>\n");
      out.write("                <td width=\"197\"><input type=password name=pass  onblur=\"validatepass()\" >\t</td>\n");
      out.write("\t\t<td><span class=\"style70\">Length of the Password should be 6 only</span></td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"pass1\" style=\"color:red\"  class=\"style70\"></div>\t</td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr>\n");
      out.write("\t\t<td  td width=\"115\" height=\"38\">Confirm password:\t</td>\n");
      out.write("                <td width=\"197\"><input type=password  name=cpass onblur=\"validatecpass()\">\t</td>\n");
      out.write("\t\t<td width=\"107\"><div id=\"cpass1\" style=\"color:red\" class=\"style70\"></div></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t<td  width=\"115\" height=\"38\">Select question:</td>\n");
      out.write("        <td><select name=s1  onblur=\"validateque()\">\n");
      out.write("\t\t<option value=q0>-Select any question-</option>\n");
      out.write("\t\t<option value=q1>Which is your favourite place?</option>\n");
      out.write("\t\t<option value=q2>Who is your best friend?</option>\n");
      out.write("\t\t<option value=q3>Which is your favourite pet?</option>\n");
      out.write("\t\t<option value=q4>Who is your favourite actor?</option>\n");
      out.write("\t</select>\t</td>\n");
      out.write("\t\t\t<td width=\"107\"><div id=\"que\" style=\"color:red\"  class=\"style70\" ></div>\t</td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("<tr>\n");
      out.write("\t<td width=\"115\" height=\"38\">Your answer:</td>\n");
      out.write("        <td width=\"115\" height=\"38\"><input type=text name=ans value=\"");
      out.print(request.getParameter("ans")!=null?request.getParameter("ans"):"");
      out.write("\" onblur=\"validateans()\"></td>\n");
      out.write("\t\t\t<td width=\"107\"><div id=\"ans1\" style=\"color:red\"  class=\"style70\"></div>\t</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("    \n");
      out.write("      </table>\n");
      out.write("          <div align=\"right\"><center>\n");
      out.write("\n");
      out.write("    <tr>     <input type=submit name=\"b1\"  value=\"Submit Form\">\n");
      out.write("        </tr>\n");
      out.write("              </center>\n");
      out.write("              </div>\n");
      out.write("\t\n");
      out.write("         </form>\n");
      out.write("       </body>\n");
      out.write("</html>\n");

    try
    {
//        out.println("in trry");
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        
    
if(request.getParameter("b1")!=null)
       {
    //            out.println("in button");
             String name=request.getParameter("name");
             String add=request.getParameter("address");
             String country=request.getParameter("country");
             String state=request.getParameter("state");
             String city=request.getParameter("city");
             String pin=request.getParameter("pin");
             String mno=request.getParameter("mno");
             String email=request.getParameter("email");
             String pass=request.getParameter("pass");
             String cpass=request.getParameter("cpass");
             String que=request.getParameter("s1");
             String ans=request.getParameter("ans");
             Statement st=cn.createStatement();
             ResultSet rs=st.executeQuery("select email from registeration where email='"+email+"'");
             out.println("select email from registeration where email='"+email+"'");
             if(rs.next())
         {
               out.println("This Id already exist");
         }
         else
         {
                 out.println("in else");
         PreparedStatement pst=cn.prepareStatement("insert into registeration values(?,?,?,?,?,?,?,?,?,?,?)");
         pst.setString(1,name);
         pst.setString(2,add);
         pst.setString(3,country);
         pst.setString(4,state);
         pst.setString(5,city);
         pst.setString(6,pin);
         pst.setString(7,email);
         pst.setString(8,mno);
         pst.setString(9,pass);
         pst.setString(10,que);
         pst.setString(11,ans);

       //  pst.setS+","+country+","++","++","++","++","+email+","+pass+","+cpass+","+que+","+ans);
         pst.execute();
         pst.close();
         out.println("\n");
         out.println(email);
              ResultSet rs2=st.executeQuery("select email from registeration where email='"+email+"'");
             // out.println("select email from registeration where email='"+email+"'");
              if(rs2.next())
              {
                 String qemail=rs2.getString(1);
                //out.println(qemail);
                // out.println("select name from registeration where email='"+qemail+"'");
                 ResultSet  rs1=st.executeQuery("select name,mno from registeration where email='"+qemail+"'");
                if(rs1.next())
                {
                  String sesname=rs1.getString(1);
                  String sesmno=rs1.getString(2);
                //   String sesemail=rs1.getString(3);
                  HttpSession ses=request.getSession();
                  ses.setAttribute("sesvarname",sesname );
                  ses.setAttribute("sesvarmno",sesmno );
                  ses.setAttribute("sesvaremail",qemail );
                 // out.println(ses.getAttribute("sesvarname"));
                }
              }


         response.sendRedirect("howtorecharge.jsp");

         }
       }
    }
    catch(Exception ex)
               {
               out.println(ex);
    }

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
