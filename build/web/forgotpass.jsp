<%-- 
    Document   : forgotpass
    Created on : Oct 15, 2012, 12:46:16 AM
    Author     : A-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
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
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <style type="text/css">


<!--


.hdvider {
background-color: #7A7A7A;
height: 1px;
}

#whyrecharge .defaulttext2 {
font-size: 8pt;
padding: 6px 0px;
padding-top: 6px;
padding-right: 0px;
padding-bottom: 6px;
padding-left: 0px;
}

.defaulttext2 {
color: white;
font-family: Arial, Helvetica, sans-serif;
font-size: 10pt;
}
.whyregisterpanel {
background-image:url(why_register_bg.jpg);
background-position: 0% 0%;
background-position-x: 0%;
background-position-y: 0%;
background-repeat: no-repeat;
background-repeat-x: no-repeat;
background-repeat-y: no-repeat;
height: 302px;
width: 204px;
}
.defaulttext21 {color: white;
font-family: Arial, Helvetica, sans-serif;
font-size: 10pt;
}
body {
	background: url(f.jpg) center;
	background-repeat:repeat;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	color: #000;
}
a.hylink1:Link, a.hylink1:Visited {
	font-family:"Trebuchet MS", Arial, Helvetica, sans-seriff;
	font-size: 16px;
	font-weight:bold;
	color: #000;
	text-decoration: none;
	outline: none;
	font-style:italic;
}

a.hylink1:Hover{
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 18px;
	font-weight:bold;
	color: #fff;
	text-decoration: none;
}

#header
{
	background-color:#666;
}
.style15
{
	color:#000;
	font-size: 20px;
	font-family: "Times New Roman", Times, serif;
}
a {color:#000000;}




.style14 {
	color:#000;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	font-style: italic;
}
.border5 {
	border: solid #000;
	border-bottom-width: 0px;
	border-right-width: 0px;
	font-style: italic;
}
.style17
{
	color:#000;
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
}


-->
</style>
    </head>
    <body>
        <table>
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>
</tr>
</table>

        <form name="f2" method="post">
            <div id="header" >
<center>
  <table width="968" border="0" >
  <tr>
		<td width="89" height="56" align="center">
		<span class="style14"><a href="login12.jsp" class="hylink1">HOME</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="213" align="center"><span class="style14"><a href="howtorecharge1.jsp" class="hylink1">HOW TO RECHARGE</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

	  </tr>
</table>
</center> </div>
            <br>
            <br>
            <br>
            <table align="center">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                    
                </tr>
                <tr>
                    <td>Email id:</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Select Question</td>
                    <td><select name=s1>
		<option value=q0>-Select any question-</option>
		<option value=q1>Which is your favourite place?</option>
		<option value=q2>Who is your best friend?</option>
		<option value=q3>Which is your favourite pet?</option>
		<option value=q4>Who is your favourite actor?</option>
                    </select>
                </tr>
                <tr>
                    <td>Answer:</td>
                    <td><input type="text" name="ans"</td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" name="b1" value="submit">
                    </td>
                </tr>
                <tr><td colspan="2" align="center">
            <%
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
            
        %></td>
                </tr>
                    </table>

        </body>
</html>
