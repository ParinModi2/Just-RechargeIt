<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.hibernate.validator.constraints.Length"%>
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

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>


<style type="text/css">
<!--
.changepassword{display:none}
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

<head>
<script type="text/javascript">
<!--
    function visibility(id,id1) 
	{   
	   var e = document.getElementById(id);
	   var e1 = document.getElementById(id1);
          e.style.display = 'block';
		  e1.style.display='none';
	}
	function visibility1(id)
	{
		var e= document.getElementById(id);
		if(e.style.display=='none')
					e.style.display='block';

			//e.style.display='none';
		else
			e.style.display='block';
	}
	function validate(id)
	{
				var e=document.getElementById(id);
				e.style.display='block';
				var amt1= document.f1.amt.value;
			//	var flag=true;
				if(amt1.length==0)
				{
					
					alert("Please enter amount");
				//	flag false;
				}
				if(isNaN(amt1))
				{
					alert("Please enter digits");
				}
			//	return flag;
	}
-->
</script>

</head>

<body onLoad="history.go(+1)">
    <form name="f1" method="post">
<table >
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>
<td class="style15" align="right">        Welcome <%!ResultSet rs1;%> <%


    try {
           // out.println("im ");
              HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
              out.println(ses1);
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement st=cn.createStatement();

        }
    catch(Exception ex)
    {
        out.println(ex);
    }
    %></td>
<td><input type="submit" name="logout" value="LOGOUT">
    </td>

</tr>
</table>


<center>
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


<%
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
%>
<center>
<table cellpadding="10" align="center">
	<table id="profile" cellpadding="10" align="center" style="display:none">
	<tr>
	<th colspan="2" class="style16" >MY PROFILE</th>
	</tr>
	<tr>
		<td > NAME:</td>
                <td> <input type="text" name="name" value="<%=rs.getString(1)%>" ></td>
	</tr>
            <tr>
		<td > ADDRESS:</td>
		<td> <textarea ><%=rs.getString(2)%> </textarea></td><br/>
	</tr>
	<tr>
		<td > COUNTRY:</td>
		<td> <input type="text" name="country" value="<%=rs.getString(3)%>"/></td>
	</tr>
	<tr>
		<td > STATE:</td>
		<td> <input type="text" name="state" value="<%=rs.getString(4)%>" /></td>
	</tr>
	<tr>
		<td > CITY:</td>
		<td> <input type="text" name="city" value="<%=rs.getString(5)%>" /></td>
	</tr>
	<tr>
		<td > PIN CODE:</td>
		<td> <input type="text" name="pin" value="<%=rs.getString(6)%>" /></td>
	</tr>
	
	<tr>
		<td > E-MAIL:</td>
		<td> <input type="text" name="no" value="<%=rs.getString(7)%>"/></td>
	</tr>
	<tr>
		<td > MOBILE:</td>
		<td> <input type="text" name="mail" value="<%=rs.getString(8)%>"/></td>
	</tr>
        <%
                }
          }
          catch(Exception ex)
          {
              out.println(ex);
          }
        %>
    	<tr>
	<td colspan="2" align="center" class="style16"><a href="changepass.jsp" class="style16" >Change Password </a></td>
	</tr>
	<tr>
			<td colspan="2" align="center" class="style16"><input type="button" name="profile1" value="EDIT PROFILE" onClick="visibility('edit','profile')"></td>

		</tr>
		
		<tr >
		<td  align="center" colspan="2"><input type="submit" name="transaction" value="SHOW TRANSACTIONS" onClick="visibility('transaction','profile')"></td>				    </tr>
        </table>
</center>
        
<!-- transection search table-->

<table id="transaction" border="0" align="center" style="display:block" cellpadding="10">
<tr>
<th colspan="2" align="center" class="style16">TRANSACTION</th>
</tr>	
<tr>
	<td colspan="2" align="center" class="style16">SEARCH BY</td>
</tr>
<tr>
<td >AMOUNT:</td>
<td ><input type="text" name="amt"></td>
</tr>
<tr>
	<td  align="center" colspan="2">
	<input type="submit" value="SUBMIT" name="b1" onclick="validate('transaction')"/>
	</td>
</tr>
<tr>
	<td  align="center" colspan="2"><input type="submit" value="SHOW ALL TRANSACTIONS"  name="b2"  />
	</td>
</tr>
<tr >
		<td class="style16" align="center" colspan="2"><input type="button" name="profile" value="VIEW PROFILE" onClick="visibility('profile','transaction')"></td>
		</tr>

	</table>
	
	
	
<!--edit profile table-->

<%
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
%>
<center>
<table cellpadding="10" align="center">
	<table id="edit" cellpadding="10" align="center" style="display:none" >
	<tr>
		<th class="style16" colspan="2">EDIT PROFILE</th>
	</tr>		
	<tr>
		<td > NAME:</td>
		<td> <input type="text" name="name1" value="<%=rs.getString(1)%>" /></td>
	</tr>
            <tr>
		<td> ADDRESS:</td>
		<td> <textarea name="address1" ><%=rs.getString(2)%></textarea></td>
	</tr>
	<tr>
		<td> COUNTRY:</td>
		<td> <input type="text" name="country1" value="<%=rs.getString(3)%>" /></td>
	</tr>
	<tr>
		<td> STATE:</td>
		<td> <input type="text" name="state1" value="<%=rs.getString(4)%>"/></td>
	</tr>
	<tr>
		<td> CITY:</td>
		<td> <input type="text" name="city1" value="<%=rs.getString(5)%>"/> </td>
	</tr>
	<tr>
		<td> PIN CODE:</td>
		<td> <input type="text" name="pin1" value="<%=rs.getString(6)%>"/></td>
	</tr>
	
	
	<tr>
		<td> MOBILE:</td>
		<td> <input type="text" name="mno1" value="<%=rs.getString(8)%>"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" name=s1 value="SUBMIT" onClick="visibility('edit')" /></td>
        </tr>
    <%
                }
          }
          catch(Exception ex)
          {
              out.println(ex);
          }
        %>
        </table>
        </center>
</form>
<%
try
    {
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
        if(rs.next())
        {
            ses.setAttribute("sesvarname", name);
            PreparedStatement pst=cn.prepareStatement("update registeration set name=?,address=?,country=?,state=?,city=?,pin=?,mno=? where email='"+ses1+"'");
            pst.setString(1,name);
            pst.setString(2,add);
            pst.setString(3,country);
            pst.setString(4,state);
            pst.setString(5,city);
            pst.setInt(6,pin);
            pst.setString(7,mno);
         pst.execute();
         response.sendRedirect("myacc.jsp");
         pst.close();
         }
     }
}
 catch(Exception ex)
 {
     out.println(ex);
 }
%>
 <% if(request.getParameter("logout")!=null)
        {
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            response.sendRedirect("login12.jsp");
}
%>

<%

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
%>
</body>
</html>

