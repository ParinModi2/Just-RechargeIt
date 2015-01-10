<%-- 
    Document   : excel.jsp
    Created on : Nov 3, 2012, 1:14:26 PM
    Author     : A-4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%@page import="  java.io.*"%>
    <%@page import="org.apache.poi.hssf.usermodel.*"%>

<%
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
%>
    </body>
</html>
