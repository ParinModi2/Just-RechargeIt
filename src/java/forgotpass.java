/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name="forgotpass", urlPatterns={"/forgotpass"})
public class forgotpass extends HttpServlet {
   
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
            out.println("<title>Servlet forgotpass</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet forgotpass at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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
            response.sendRedirect("login12");
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

        } catch (SQLException ex) {
            Logger.getLogger(forgotpass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(forgotpass.class.getName()).log(Level.SEVERE, null, ex);
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
