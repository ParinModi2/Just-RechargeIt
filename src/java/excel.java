/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author A-4
 */
@WebServlet(name="excel", urlPatterns={"/excel"})
public class excel extends HttpServlet {
   
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
            out.println("<title>Servlet excel</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet excel at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
             out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");

String name=request.getParameter("name");
String address=request.getParameter("address");
String filename="c:/data.xls" ;
try{

                HttpSession ses=request.getSession();
                String ses1=(String) ses.getAttribute("sesvaremail");



                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery("select * from transaction where email='"+ses1+"'");
                 HSSFWorkbook hwb=new HSSFWorkbook();
                HSSFSheet sheet =  hwb.createSheet("sheet");
                HSSFRow rowhead=   sheet.createRow((short)0);

                rowhead.createCell((short) 0).setCellValue("E-mail");
                rowhead.createCell((short) 1).setCellValue("mobile no");
                rowhead.createCell((short) 2).setCellValue("Provider");
                rowhead.createCell((short) 3).setCellValue("amount");

                int i=1;
      while(rs.next())
      {

                HSSFRow row=   sheet.createRow((short)i);
                row.createCell((short) 0).setCellValue(rs.getString(1));
                row.createCell((short) 1).setCellValue(rs.getString(2));
                row.createCell((short) 2).setCellValue(rs.getString(3));
                row.createCell((short) 3).setCellValue(rs.getString(4));
                FileOutputStream fileOut =  new FileOutputStream(filename);
                hwb.write(fileOut);
                fileOut.close();
                out.println("Your excel file has been generated!");
                i++;
    }
}
catch(Exception ex )
            {
                System.out.println(ex);
             }
File f = new File(filename);
    String fn=f.getName();
    response.setContentType("application/excel");
    response.setHeader("Content-Disposition", "attachment;  filename=\""+fn+"\"");

    String n = f.getName().substring(f.getName().lastIndexOf("/") + 1,f.getName().length());
    InputStream in = new FileInputStream(f);
    ServletOutputStream outs = response.getOutputStream();
    int bit = 256;
    int i = 0;
            try{
                    while ((bit) >= 0)
                    {
                        bit = in.read();
                        outs.write(bit);
                    }
                }
            catch (IOException ioe)
            {
                        ioe.printStackTrace(System.out);
             }
                    outs.flush();
                    outs.close();
                    in.close();

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
   
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
