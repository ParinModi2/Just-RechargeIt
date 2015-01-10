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

#mobilesevicelogo td a {
background-image: url("mobile_recharge_services.gif");
background-repeat: no-repeat;
display: block;
height: 71px;
width: 126px;
}

td a.aircel:hover {
background-position: 0% 0%;
background-position-x: 0%;
background-position-y: 0%;
}
td a.aircel{
background-position: 0% -213px;
background-position-x: 0%;
background-position-y: -213px;
}
td a.tatawalky:hover {
background-position: -127px 0%;
background-position-x: -127px;
background-position-y: 0%;
}
td a.tatawalky {
background-position: -127px -213px;
background-position-x: -127px;
background-position-y: -213px;
}
td a.loop:hover {
background-position: -254px 0%;
background-position-x: -254px;
background-position-y: 0%;
}
td a.loop {
background-position: -254px -213px;
background-position-x: -254px;
background-position-y: -213px;
}
td a.bsnl:hover {
background-position: -381px 0%;
background-position-x: -381px;
background-position-y: 0%;
}
td a.bsnl {
background-position: -381px -213px;
background-position-x: -381px;
background-position-y: -213px;
}

td a.idea:hover {
background-position: -508px 0%;
background-position-x: -508px;
background-position-y: 0%;
}
td a.idea {
background-position: -508px -213px;
background-position-x: -508px;
background-position-y: -213px;
}
td a.mtnl:hover {
background-position: 0% -71px;
background-position-x: 0%;
background-position-y: -71px;
}
td a.mtnl {
background-position: 0% -284px;
background-position-x: 0%;
background-position-y: -284px;
}
td a.mts:hover {
background-position: -127px -71px;
background-position-x: -127px;
background-position-y: -71px;
}
td a.mts {
background-position: -127px -284px;
background-position-x: -127px;
background-position-y: -284px;
}
td a.uninor:hover {
background-position: -254px -71px;
background-position-x: -254px;
background-position-y: -71px;
}
td a.uninor {
background-position: -254px -284px;
background-position-x: -254px;
background-position-y: -284px;
}
td a.reliance:hover {
background-position: -381px -71px;
background-position-x: -381px;
background-position-y: -71px;
}

td a.reliance {
background-position: -381px -284px;
background-position-x: -381px;
background-position-y: -284px;
}
td a.docomo:hover {
background-position: -508px -71px;
background-position-x: -508px;
background-position-y: -71px;
}

td a.docomo {
background-position: -508px -284px;
background-position-x: -508px;
background-position-y: -284px;
}
td a.indicom:hover {
background-position: 0% -141px;
background-position-x: 0%;
background-position-y: -141px;
}
td a.indicom {
background-position: 0% -354px;
background-position-x: 0%;
background-position-y: -354px;
}
td a.virgin:hover {
background-position: -127px -141px;
background-position-x: -127px;
background-position-y: -141px;
}
td a.virgin {
background-position: -127px -354px;
background-position-x: -127px;
background-position-y: -354px;
}
td a.vodafone:hover {
background-position: -254px -141px;
background-position-x: -254px;
background-position-y: -141px;
}
td a.vodafone {
background-position: -254px -354px;
background-position-x: -254px;
background-position-y: -354px;
}
td a.videoconmobile:hover {
background-position: -381px -141px;
background-position-x: -381px;
background-position-y: -141px;
}
td a.videoconmobile {
background-position: -381px -354px;
background-position-x: -381px;
background-position-y: -354px;
}
td a.airtel:hover {
background-position: -508px -141px;
background-position-x: -508px;
background-position-y: -141px;
}
td a.airtel {
background-position: -508px -354px;
background-position-x: -508px;
background-position-y: -354px;
}
#dthsevicelogo td a {
background-image: url("dth_recharge_services.gif");
background-position: 0% 0%;
background-repeat: no-repeat;
display: block;
height: 71px;
width: 126px;
}
#dthsevicelogo td a.dishtv:hover {
background-position: 0% -71px;
background-position-x: 0%;
background-position-y: -71px;
}
#dthsevicelogo td a.dishtv {
background-position: 0% 0%;
background-position-x: 0%;
background-position-y: 0%;
}
#dthsevicelogo td a.sundirect:hover {
background-position: -126px -71px;
background-position-x: -126px;
background-position-y: -71px;
}
#dthsevicelogo td a.sundirect {
background-position: -126px 0%;
background-position-x: -126px;
background-position-y: 0%;
}

#dthsevicelogo td a.tatasky:hover {
background-position: -252px -71px;
background-position-x: -252px;
background-position-y: -71px;
}
#dthsevicelogo td a.tatasky {
background-position: -252px 0%;
background-position-x: -252px;
background-position-y: 0%;
}
#dthsevicelogo td a.airteltv:hover {
background-position: -378px -71px;
background-position-x: -378px;
background-position-y: -71px;
}
#dthsevicelogo td a.airteltv {
background-position: -378px 0%;
background-position-x: -378px;
background-position-y: 0%;
}
#dthsevicelogo td a.bigtv:hover {
background-position: -504px -71px;
background-position-x: -504px;
background-position-y: -71px;
}
#dthsevicelogo td a.bigtv {
background-position: -504px 0%;
background-position-x: -504px;
background-position-y: 0%;
}

#dthsevicelogo td a.videocon:hover {
background-position: 0% -213px;
background-position-x: 0%;
background-position-y: -213px;
}
#dthsevicelogo td a.videocon {
background-position: 0% -142px;
background-position-x: 0%;
background-position-y: -142px;
}

table {
border-spacing: 2px 2px;
border-collapse: separate;
}
.border5 {
border: solid #000;
border-bottom-width: 0px;
border-right-width: 0px;
}
body {
	background: url(f.jpg) center;
	background-repeat:repeat;
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
#mobilesevicelogo .border5 .border5 .style2 {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}

-->
</style>
</head>



<html>
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
		<td width="196" align="center"><span class="style14"><a href="services.jsp " class="hylink1">SERVICES</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
	   	<td width="151" align="center"><span class="style14"><a href="contactus.jsp" class="hylink1">CONTACT US</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="172" align="center"><span class="style14"><a href="myacc.jsp" class="hylink1">MY ACCOUNT</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

	  </tr>
</table>
</center> </div>
<br>
<br>

<br>
<br><table width="834" height="387" border=1 id="mobilesevicelogo" align="center">

	<tr class="border5">
		 <td colspan="5" class="border5" align="center"><span class="style2"> MOBILE SERVICES
		 </span></td>
	</tr >
	<tr class="border5">
		<td align="center" valign="middle" class="border5">	<a href="aircelservice.jsp" class="aircel"></a></td>
		<td align="center" valign="middle" class="border5"><a href="tatawalkyservice.jsp" class="tatawalky "></a></td>
		<td align="center" valign="middle" class="border5"><a href="loopservice.jsp" class="loop"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="bsnlservice.jsp" class="bsnl"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="ideaservice.jsp" class="idea"></a></td>
	</tr >

	<tr class="border5">
		<td align="center" valign="middle" class="border5"><a href="mtnlservice.jsp" class="mtnl"></a></td>
		<td align="center" valign="middle" class="border5"><a href="mtsservice.jsp" class="mts"></a></td>
		<td align="center" valign="middle" class="border5"><a href="relianceservice.jsp" class="reliance"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="docomoservice.jsp" class="docomo"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="uninorsevice.jsp" class="uninor"></a></td>
	</tr >
	
	<tr class="border5">
		<td align="center" valign="middle" class="border5">	<a href="tataindicomser.jsp" class="indicom"></a></td>
		<td align="center" valign="middle" class="border5"><a href="virginservice.jsp" class="virgin"></a></td>
		<td align="center" valign="middle" class="border5"><a href="vodafoneservice.jsp" class="vodafone"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="videoconservice.jsp" class="videoconmobile"></a></td>
		<td align="center" valign="middle" class="border5">	<a href="airtelservice.jsp" class="airtel"></a></td>
	</tr>
	</table>
	<br>
	</center>



</form>
    <%
         if(request.getParameter("logout")!=null)
        {
           
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            
            response.sendRedirect("login12.jsp");



}
    %>
</body>
</html>