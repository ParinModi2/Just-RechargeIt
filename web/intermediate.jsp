<%@page import="java.sql.Statement"%>
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
	color: #FFF;
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
a {color:#FFFFFF;}




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
    <form name="f1" method="post">
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td class="style15" align="right">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome  <%
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
    %></td>
<td><input type="submit" name="logout" value="LOGOUT" align="left">
    </td>
</tr>
    </form>
</table>

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

    
        <form>
<%

	
		
		try {
                         HttpSession ses=request.getSession();
                         String ses1=(String) ses.getAttribute("sesvaremail");
                         String ses2=(String) ses.getAttribute("sesvarmno");

                      //   out.println(ses1);
                         int amnt1=Integer.parseInt(request.getParameter("amnt1"));
                         String mno=request.getParameter("mno");
                         String provider=request.getParameter("provider");
			Class.forName("com.mysql.jdbc.Driver");
                        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ozekisms","root","");
                         Connection cn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

                        String smsReceiver = ses2;
			String message	   = "The recharge of amount"+amnt1+" on"+mno+" is done successfully";
                        Statement st=cn.createStatement();
        		String sqlInsert ="INSERT INTO ozekimessageout (receiver,msg,status) VALUES ('" + smsReceiver + "','"+ message +"','send')";
			Statement st1=cn1.createStatement();

                        String sqlInsert1 ="INSERT INTO transaction VALUES ('" + ses1 + "','"+mno+"','"+provider+"','"+amnt1+"')";
                        st1.execute(sqlInsert1);
			if(st.executeUpdate(sqlInsert) != 0)
			{
				//response.sendRedirect("commtransaction.jsp");
                                out.println("<h1>");
				out.println("Recharge Done successfully!!");
                                out.println("</h1>");
			}
			else
			{
				out.println("ERROR");
			}
			
			st.close();			
			cn.close();
		}
		catch(Exception ex)
		{
			out.println("Exception: " + ex.getMessage());
		}
                 if(request.getParameter("logout")!=null)
                {
                     out.println("in logout");
                     HttpSession ses=request.getSession();
                     ses.removeAttribute("sesvarname");
                     ses.removeAttribute("sesvarmno");
                     response.sendRedirect("login12.jsp");
                }
    %>
        </form>
    </body>
</html>