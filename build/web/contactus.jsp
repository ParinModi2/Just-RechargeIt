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
body {
	background: url(f.jpg) center;
	background-repeat:repeat;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 24px;
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
	font-style: italic;
	font-size: 18px;
}



-->
</style>

<body onLoad="history.go(+1)">
    <form name="f1" method="post">
<table>
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>
<td class="style15" align="right">        Welcome  <%
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
<td><input type="submit" name="logout" value="LOGOUT">
    </td>

</tr>
</table>


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
		<td width="196" align="center"><span class="style14"><a href="services.jsp " class="hylink1">SERVICES</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td><td width="151" align="center"><span class="style14"><a href="contactus.jsp" class="hylink1">CONTACT US</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="172" align="center"><span class="style14"><a href="myacc.jsp" class="hylink1">MY ACCOUNT</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

	  </tr>
</table>	
</center> </div>
<br>
<br>
<br>

<table align="center">
<tr>
	<td width="271"><table width="204" border="0" cellspacing="0" cellpadding="0" id="whyrecharge"  background="why_register_bg.jpg" style="background:no-repeat">
              <tbody><tr>
                <td align="center" valign="top" class="whyregisterpanel"><table width="182" border="0" cellspacing="0" cellpadding="0">
                  <tbody>
                    <tr>
                      <td height="33" colspan="2" align="left" valign="top">&nbsp;</td>
                    </tr>
                    <tr>
                      <td width="16" height="57" align="left" valign="top"><img src="bullet1.png" width="6" alt=" height=" 6"="" hspace="2" vspace="4" /></td>
                      <td width="168" align="left" valign="top" class="defaulttext2 nopadding">Recharge for yourself and your family and friends with a single login account. </td>
                    </tr>
                    <tr>
                      <td colspan="2" align="left" valign="top" class="hdvider"></td>
                    </tr>
                    <tr>
                      <td width="16" align="left" valign="top"><img src="bullet1.png" width="6" alt="  height=" 6"="" hspace="2" vspace="9" /></td>
                      <td align="left" valign="top" class="defaulttext2">Register any number (pre-paid or post-paid)and recharge your prepaid numbers. </td>
                    </tr>
                    <tr>
                      <td colspan="2" align="left" valign="top" class="hdvider"></td>
                    </tr>
                    <tr>
                      <td width="16" align="left" valign="top"><img src="bullet1.png" width="6" alt="  height=" 6"="" hspace="2" vspace="9" /></td>
                      <td align="left" valign="top" class="defaulttext2"> Just need to pay Rs 1000 at the time of registration</td>
                    </tr>
                    <tr>
                      <td colspan="2" align="left" valign="top" class="hdvider"></td>
                    </tr>
                    <tr>
                      <td width="16" align="left" valign="top"><img src="bullet1.png" width="6" alt="  height=" 6"="" hspace="2" vspace="9" /></td>
                      <td align="left" valign="top" class="defaulttext2">Get instant PIN less recharge. </td>
                    </tr>
                    <tr>
                      <td colspan="2" align="left" valign="top" class="hdvider"></td>
                    </tr>
                    <tr>
                      <td width="16" align="left" valign="top"><img src="bullet1.png" width="6" alt="  height=" 6"="" hspace="2" vspace="9" /></td>
                      <td align="left" valign="top" class="defaulttext2">Get complete transaction history of your recharges. </td>
                    </tr>
                    <tr>
                      <td colspan="2" align="left" valign="top" class="hdvider"></td>
                    </tr>
                    <tr>
                      <td width="16" align="left" valign="top"><img src="bullet1.png" width="6" alt="" height="6" hspace="2" vspace="9" /></td>
                      <td align="left" valign="top" class="defaulttext2">24x7 customer support.</td>
                    </tr>
                  </tbody>
                </table></td>
              </tr>
            </tbody></table>

	</td>
	<td width="441">
		<table width="628" height="333">
		<tr align="left" valign="top"><td height="67" colspan="2" align="center"> We are always happy to help and appreciate your feedback.
<br>Please complete the form below and we will respond to you as quickly as possible.
</td></tr>
		<tr align="left" valign="top"><td height="37">Name:</td><td> <input type="text" name="name"></td> </tr>
		<tr align="left" valign="top"><td height="39">Email id:</td><td ><input type="text" name="mail"></td></tr>
		
		
		<tr align="left" valign="top"><td height="41">Mobile no:</td><td><input type="text" name="mno"></td></tr>
		<tr align="left" valign="top"><td height="40">Type of Problem:</td><td ><select name="s1">
		<option value="-select any option-" selected="selected">-select any option-</option>
		<option value="Payment deducted/recharge fail">Payment deducted/recharge fail</option>
		<option value="Payment Deducted/SessionTimedOut">Payment Deducted/SessionTimedOut</option>
		<option value="Transaction Success/No Recharge">Transaction Success/No Recharge</option>
		<option value="Others">Others</option>
		
		</select> </td></tr>
		<tr align="left" valign="top"><td>Comments::</td><td ><textarea name="comment"></textarea></td> </tr>
		<tr align="left" valign="top"><td ><input type="button" name="b1" value="Submit"></td><td><input type="button" name="b1" value="Cancel"> </td></tr>
	  </table>
	</td>
</tr>
</table>
</center>
</form>
     <%  if(request.getParameter("logout")!=null)
        {

            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");

            response.sendRedirect("login12.jsp");




}%>
</body>
</html>