<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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

<html>
<head>
<style type="text/css">
<!--
body {
	background: url(f.jpg) center;
	background-repeat:repeat;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
a.hylink1:Link, a.hylink1:Visited {
	font-family:"Trebuchet MS", Arial, Helvetica, sans-seriff;
	font-size: 16px;
	font-weight:bold;
	color: #FFF;
	text-decoration: none;
	outline: none;
	font-style:italic;
}

a.hylink1:Hover{
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 18px;
	font-weight:bold;
	color: #000;
	text-decoration: none;
}



a {color:#FFFFFF;}
.style12 {font-family: Verdana, Arial, Helvetica, sans-serif}
.style14 {
	color:#FFF;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	font-style: italic;
	
}
.style15
{
	color:#000;
	font-size: 20px;
	font-family: "Times New Roman", Times, serif;
}
#header
{
	background-color:#666;
}
.style16
{
	color:#000;
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 18px;
	font-style: italic;
}

-->
</style>
</head>



<head>
<script language="javascript">
function validate()
{
	var pass=document.f1.t3.value;
	var cpass=document.f1.t4.value;
	if(pass!=cpass)
	{
		alert("PASSWORD and CONFIRM PASSWORD should be same");
	} 
}
</script>
	
</head>
<body onLoad="history.go(+1)">
<table>
    <form name="f1" method="post">
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td class="style15" align="right">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome  <%
    try {
             HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
              out.println(ses1);
            }
    catch(Exception ex)
    {
        out.println(ex);
    }
    %></td>
<td><input type="submit" name="logout" value="LOGOUT" align="left">
    </td>
</tr>
</table>

<form method=post name="f1">
<center>
<center>
</center>
<div id="header" >
<center>
  <table width="968" border="0" >
  <tr>
		<td width="89" height="56" align="center">
		<span class="style14"><a href="home.jsp" class="hylink1">HOME</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="213" align="center"><span class="style14"><a href="howtorecharge.jsp" class="hylink1">HOW TO RECHARGE</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="196" align="center"><span class="style14"><a href="services.jsp " class="hylink1">SERVICES</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
	   	<td width="151" align="center"><span class="style14"><a href="contactus.jsp" class="hylink1">CONTACT US</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="172" align="center"><span class="style14"><a href="myacc.jsp" class="hylink1">MY ACCOUNT</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

	  </tr>
</table>
</center> </div>
<br>
<br>
	
<table align="center">
<tr ><th height="41" colspan="2" align="center"> CHANGE PASSWORD</th></tr>

<tr>
<td width="141" height="33">Email:</td><td width="187"><input type=text name=t1 ></td></tr>
<tr>
<td height="38">Old Password:</td><td><input type=password name=t2 ></td></tr>
<tr>
<td height="38">New Password:</td><td><input type=password name=t3 ></td></tr>
<tr>
<td height="38">Confirm password:</td><td><input type=password  name=t4></td></tr>

<tr >
<td colspan="2" align="center"> 
<input type=submit name=s1  value=submit onClick="validate()" ></td></tr>
</table>
</form>
</body>
</html>
<%
    if(request.getParameter("s1")!=null)
        {
                HttpSession ses=request.getSession();
                String ses1=(String) ses.getAttribute("sesvaremail");
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                String email=request.getParameter("t1");
		String pass=request.getParameter("t2");
		String npass=request.getParameter("t3");
		Statement st=cn.createStatement();
                if(email.equals(ses1))
                    {
                        int i=st.executeUpdate("update registeration set pass='"+npass+"' where email='"+email+"'");
                        out.println("Your password has been changed successfully");
                     }
                else
                    {
                        out.println("Enter correct E-mail");
                    }
      }
		
%>
  <% if(request.getParameter("logout")!=null)
        {
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            response.sendRedirect("login12.jsp");



}%>

