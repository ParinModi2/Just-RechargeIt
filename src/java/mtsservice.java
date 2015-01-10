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
import javax.servlet.http.HttpSession;

/**
 *
 * @author A-4
 */
@WebServlet(name="mtsservice", urlPatterns={"/mtsservice"})
public class mtsservice extends HttpServlet {
   
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
            out.println("<title>Servlet mtsservice</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet mtsservice at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
             try{
    HttpSession chkses= request.getSession();
     String ses11=(String)  chkses.getAttribute("sesvarname");
   //  String ses12=(String)  chkses.getAttribute("sesvarmno");

     if(ses11==null)
         {
            response.sendRedirect("login12");
         }


      }
    catch(Exception ex)
     {
        out.println(ex);
     }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1\r\n");
      out.write("{\r\n");
      out.write("\tfont-style:italic;\r\n");
      out.write("\tfont-weight:300;\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("\ttext-decoration:underline\r\n");
      out.write("}\r\n");
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
      out.write(".style12 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
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
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("\tvar mno=document.f1.mob.value;\r\n");
      out.write("\tvar amt=document.f1.mnt.value;\r\n");
      out.write("\tvar flag=true;\r\n");
      out.write("\tif(mno.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter Mobile number\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(isNaN(mno))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mob.value=\"\";\r\n");
      out.write("\t\talert(\"Invalid Mobile number\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tif(!isNaN(mno))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(mno.length!=0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(mno.length<10 || mno.length>10)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tf1.mob.value=\"\";\r\n");
      out.write("\t\t\t\talert(\"Please enter correct Mobile number\");\r\n");
      out.write("\t\t\t\tflag=false;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(amt.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter amount\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isNaN(amt))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter correct amount\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\treturn flag\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head><body onLoad=\"history.go(+1)\">\r\n");
      out.write("<table>\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("<td class=\"style15\" align=\"right\">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome  ");

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
      out.write("<td><input type=\"submit\" name=\"logout\" value=\"LOGOUT\" align=\"left\">\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t<span class=\"style14\"><a href=\"home\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services\" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t   \t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\t<table width=\"1019\" border=\"1\" cellpadding=\"10\" align=\"center\" class=\"style16\">\r\n");
      out.write("<tr  >\r\n");
      out.write("\t\t\t<td width=\"334\" height=\"349\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">SERVICE PROVIDER:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"serprov\" value=\"MTS\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">MOBILE NO:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"mob\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">AMOUNT:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"mnt\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"JUST RECHARGE IT\" name=\"b1\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t <td width=\"673\" align=\"justify\"><table border=\"0\">\r\n");
      out.write("\t\t\t <tr class=\"style1\"><td ><center><span class=\"style1\" >MTS Prepaid Mobile Recharge\r\n");
      out.write("             </span></center></td></tr>\r\n");
      out.write("\t\t\t <tr><td height=\"30\"></td></tr>\r\n");
      out.write("\t\t\t <tr><td><img src=\"mts.gif\"></img></td></tr>\r\n");
      out.write("\t\t\t <tr><td><br>\r\n");
      out.write("Is recharging your prepaid MTS mobile a big hassle? Talk time rapidly depleting but have no time to visit the nearest retail outlet to refill your MTS mobile phone? No Worries! Now you can recharge your prepaid MTS mobile anytime and anywhere.\r\n");
      out.write("\r\n");
      out.write("Just Log on to Justrechargeit.com, a 24 x 7 free mobile recharge facility and eTopUp or recharge your prepaid MTS mobile instantly. Recharge your MTS mobile online in just three simple steps: Register, Select Amount and Pay.\r\n");
      out.write(" \t \r\n");
      out.write("Recharge / eTopUp your MTS mobile<br>\r\n");
      out.write("Log into JustRechargeIt.com and register.br>\r\n");
      out.write("Select your service provider \"MTS\" and location\r\n");
      out.write("Enter your Prepaid MTS mobile number\r\n");
      out.write("Enter your recharge/etopup amount.<br>\r\n");
      out.write("Click on the recharge button to recharge your prepaid MTS mobile number\r\n");
      out.write("<br>\r\n");
      out.write("Within seconds, you will receive a message from MTS on your prepaid MTS mobile number, informing you of your new balance status.\r\n");
      out.write("<br>\r\n");
      out.write("Recharge your MTS mobile NOW!!\r\n");
      out.write("\t\t\t </td>\t</tr>\r\n");
      out.write("\t\t  \t\t </td>\r\n");
      out.write("\t\t</tr></table>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write(" ");

        if(request.getParameter("b1")!=null)
        {
        String amt=request.getParameter("mnt");
        String mno=request.getParameter("mob");
        String prov=request.getParameter("serprov");
        response.sendRedirect("intermediate?amnt1="+amt+"&mno="+mno+"&provider="+prov);
        }
         if(request.getParameter("logout")!=null)
        {

            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");

            response.sendRedirect("login12");



}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");

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
