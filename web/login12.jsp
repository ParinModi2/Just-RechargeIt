<%@page import="javassist.bytecode.stackmap.BasicBlock.Catch"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
<head>
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
<body onLoad="history.go(+1)">
    <table>
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>
</tr>
</table>

    <form name="f1" method="post">
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

	<table border=1 align="center">
            
		<tr>
			<td colspan="2" align="center"><p>REGISTERED USER</p>
			Simply login and enter the amount to recharge your registered Mobile.
			</td>
		</tr>
		<tr>
			<td>
				Email Id:
			</td>
			<td>
				<input type=text name="username"value='<%
   if(request.getParameter("check")!=null)
            {
                String user=request.getParameter("username");
                Cookie c1=new Cookie("cuname", user);
                response.addCookie(c1);
           }
     //  String user1="";
        Cookie ck[]=request.getCookies();
        if(ck!=null)
            {
                for(int i=0;i<ck.length;i++)
                    {
                        if(ck[i].getName().equals("cuname"))
                            {
                              String user1=ck[i].getValue();
                              out.println(user1);
                                break;
                        }
                    }
                }

    %>'>
			</td>
		</tr>	
		<tr>
			<td>
				Password:
			</td>
			<td>
				<input type=password name="password">
			</td>
		</tr>
		<tr>
                    <td colspan="2" align="center"><input type=checkbox name="check">REMEMBER ME</td>
		</tr>	
		<tr>
			<td colspan="2" align="center"><a href="newreg1.jsp">REGISTER HERE</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a href="forgotpass.jsp">FORGOT PASSWORD?</td>
		</tr>
		<tr>
                    <td align="center" colspan="2"><input type=submit name=login value="LOGIN"></td>
			</tr>
                </table>
                        <table align="center">
                    <tr>
  	<td height="200" colspan="2" align="center"><span class="style14" >SERVICES AVAILABLE</span><br />
	<marquee direction="right" onMouseOver="this.stop();" onMouseOut="this.start();">


<img src="airtel.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="aircel.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="videocon.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="vodafone.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="vergin.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="tataindicom.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="docomo.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="reliance.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="uninor.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="mts.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="mtnl.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="idea.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="bsnl.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="loop.gif" class="shadowblur"></img>&nbsp;&nbsp;
<img src="walky.gif" class="shadowblur"></img>&nbsp;&nbsp;
</marquee>

</td>
  </tr>


</table>
                    
    </form>
     <%
   
         Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        try{
           if(request.getParameter("login")!=null)
            {
              String logoutvar= request.getQueryString();
              logoutvar +="no";
              if(logoutvar.equals("yesno"))
                  {
                        response.setHeader("Pragma", "no-cache");
                        response.setHeader("Cache-Control", "no-store");
                        response.setDateHeader("Expirs",0);
                 }
             String e1=request.getParameter("username");
            out.println(e1);
             String e2=request.getParameter("password");
            out.println(e2);
            Statement st=cn.createStatement();
            ResultSet rs1;
            ResultSet rs=st.executeQuery("select email,pass from registeration where email='"+e1+"' and pass='"+e2+"'");
            out.println("select email and pass from registeration where email='"+e1+"' and pass='"+e2+"'");
            if(rs.next())
            {
                
                String qemail=rs.getString(1);
                out.println(qemail);
                out.println("select name from registeration where email='"+qemail+"'");
                rs1=st.executeQuery("select name,mno,email from registeration where email='"+qemail+"'");
                if(rs1.next())
                {
                  String sesname=rs1.getString(1);
                  String sesmno=rs1.getString(2);
                   String sesemail=rs1.getString(3);
                  HttpSession ses=request.getSession();
                  ses.setAttribute("sesvarname",sesname );
                  ses.setAttribute("sesvarmno",sesmno );
                  ses.setAttribute("sesvaremail",sesemail );
                 // out.println(ses.getAttribute("sesvarname"));
                }

                response.sendRedirect("howtorecharge.jsp");

            }
            else
                
                response.sendRedirect("login12.jsp");
            
                //out.println("sorry");
        }
        }
catch(SQLException ex)
        {
        out.println(ex);

}
%>
            </body>
</html>