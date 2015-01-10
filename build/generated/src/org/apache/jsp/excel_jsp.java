package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;
import org.apache.poi.hssf.usermodel.*;

public final class excel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
