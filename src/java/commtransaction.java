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
@WebServlet(name="commtransaction", urlPatterns={"/commtransaction"})
public class commtransaction extends HttpServlet {
   
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
            out.println("<title>Servlet commtransaction</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet commtransaction at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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
