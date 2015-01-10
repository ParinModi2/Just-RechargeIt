<%-- 
    Document   : newlogin
    Created on : Oct 14, 2012, 11:14:07 PM
    Author     : A-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


       <script type="text/javascript">
function validate()
{
	var flag=true;
	var eid=document.f1.username.value;
	var pass=document.f1.password.value;
	if(eid!='admin' )
	{
		f1.username.value="";
		flag=false;
							alert("Sorry you  have entered wrong USERNAME");

	}
	if(pass!='admin123')
		{

				f1.password.value="";
			flag=false;
									alert("Sorry you  have entered wrong PASSWORD");

				//alert(flag);
		}
		//alert(flag);
		return flag;
}
</script>
</head>
    
    <body>
        <table>
<tr>
    <td width="168"> <img src="logo.gif"></img></td>
    <td width="10"><img src="dotted_divider.gif"></img></td>
<td >Stay Connected ... Wherever you go ...</td>

</tr>
</table>
        <form name=f1 method="post" enctype="multipart/form-data"   >

<div id="header" >
<center>
  <table width="1000" height="10" border="0" align="center" >
  <tr>
		<td width="89" height="42" align="center">
		<span ><a href="login.php" ">HOME</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="213" align="center"><span ><a href="howtorecharge1.html">HOW TO RECHARGE</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
 </tr>
</table>
</center>
</div>
            <table>
                <tr>
                    <td>
                        <table>
                            <tr>
                                <td colspan="2">
                                    <p align="center">REGISTERED USER</p><br />
                                    <span>Simply login and enter the amount to recharge your registered Mobile.	     </span>
                                </td>

                            </tr>
                            <tr>
          <td height="30" align="left"><span >EMAIL ID:</span></td>
          <td align="left"><input type="text" name="username" /></td>
        </tr>
        <br />
        <br />
        <tr>
          <td height="30" align="left"><span> PASSWORD:</span></td>
          <td align="left"><input type="password" name="password"  /></td>
        </tr>
        <br />
        <br />
        <br />
		<tr>
		  <td  height="30" align="center" colspan="2"><input type="checkbox" name="check" />
		    <span > REMEMBER ME</span></td>
		</tr>

        <tr>
          <td height="47" colspan="2" align="center"><a href="mainregisteration.php">REGISTER HERE </a></td>
        </tr>
	<tr>
          <td height="47" colspan="2" align="center"><a href="forgotpass1.php" >FORGOT PASSWORD? </a></td>
        </tr>

        <tr>
          <td height="49" align="center"><input type="submit" name="button" value="LOGIN" /></td>
          <td height="49" align="center"><input type="submit" name="button1" value="ADMIN" onclick="return validate()"  /></td>

        </tr>

                        </table>
                    </td>
                    <td  width="539" height="300" bgcolor="#666666">
	<center>
  	 <p ><b>WHAT IS IT</b></p></center>
 	 <p >
	 JustRechargeIt provides you the convenience of recharging your prepaid mobile from anywhere in the world and at anytime,without visiting any retail shop or making any calls. All you need is a computer so that you can logon to our website JustRechargeIt.com and select the service and the service provider, you just need to enter the recharge amount.
<br /><br /><br />
JustRechargeIt offers simple and instant recharge for Aircel, Airtel, Loop Mobile (BPL Mobile), Vodafone, Tata Indicom Mobile, Reliance Mobile, Tata Docomo, BSNL, Idea, MTNL, MTS, Uninor, Tata Walky, Videocon Mobile and Virgin Mobile.     </p>
 </td>

                </tr>
                <tr>
  	<td height="200" colspan="2" align="center"><span >SERVICES AVAILABLE</span><br />
	<marquee direction="right" onmouseover="this.stop();" onmouseout="this.start();">


<img src="airtel.gif" ></img>&nbsp;&nbsp;
<img src="aircel.gif" ></img>&nbsp;&nbsp;
<img src="videocon.gif" ></img>&nbsp;&nbsp;
<img src="vodafone.gif" ></img>&nbsp;&nbsp;
<img src="vergin.gif" ></img>&nbsp;&nbsp;
<img src="tataindicom.gif" ></img>&nbsp;&nbsp;
<img src="docomo.gif" ></img>&nbsp;&nbsp;
<img src="reliance.gif" ></img>&nbsp;&nbsp;
<img src="uninor.gif" ></img>&nbsp;&nbsp;
<img src="mts.gif" ></img>&nbsp;&nbsp;
<img src="mtnl.gif" ></img>&nbsp;&nbsp;
<img src="idea.gif" ></img>&nbsp;&nbsp;
<img src="bsnl.gif" ></img>&nbsp;&nbsp;
<img src="loop.gif" ></img>&nbsp;&nbsp;
<img src="walky.gif" ></img>&nbsp;&nbsp;
</marquee>

</td>
<td ><input type="submit" name="b1" ></td>
  </tr>

            </table>
        </form>
        <%
        out.println("in jsp");
        if(request.getParameter("b1")!=null)
        {
            out.println("button clicked");
        }
        %>
    </body>
</html>
