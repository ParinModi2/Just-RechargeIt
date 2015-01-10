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


<body>
<table>
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>

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
		<span class="style14"><a href="home.php" class="hylink1">HOME</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="213" align="center"><span class="style14"><a href="howtorecharge.html" class="hylink1">HOW TO RECHARGE</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="196" align="center"><span class="style14"><a href="rechargeplans1.php " class="hylink1">RECHARGE PLANS</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
	    <td width="121" align="center"><span class="style14"><a href="services.html" class="hylink1">SERVICES</a><td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="151" align="center"><span class="style14"><a href="contactus.html" class="hylink1">CONTACT US</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="172" align="center"><span class="style14"><a href="myacc.php" class="hylink1">MY ACCOUNT</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			
	  </tr>
</table>	
</center> </div>
<br>
<br>
<br>

<?php
			session_start();
		$provider=$_SESSION['serprov'];
		//echo "$provider";
		$amt1=$_SESSION['mnt'];
		//echo "$amt1";
		$mno1=$_SESSION['mob'];
		
		$email=$_SESSION['email'];
		//echo "$email";
		//echo "$provider";
		//echo "$amt1";
		//echo "$mno1";
		mysql_connect('localhost','root','');
		mysql_select_db('project');
	
		$row=mysql_query("select amt from registeration where email='$email'");
		$row1=mysql_query("select mno from registeration where email='$email'");

		$amt=mysql_fetch_array($row);
		$mno=mysql_fetch_array($row1);
		
		$curbal=$amt[0];
		$mno=$mno[0];
		if($mno==$mno1)
		{
			if($amt[0]>=$amt1)
			{
				$amt=$amt[0]-$amt1;
				mysql_query("update registeration set amt='$amt' where email='$email'");
				mysql_query("insert into transaction values('$email','$mno','$provider','$amt1')");
				echo "<table align=center border=1 class=style16>";
				echo "<tr>";
				echo "<td  height=45 width=200>Account Balance:		</td>";
				echo "<td  height=45 width=200><input type=text name=accbalace value=$curbal />		</td>";
				echo "</tr>";
				echo "<tr>";
				echo "<td  height=45 width=200>Recharge Amount:		</td>";
				echo "<td  height=45 width=200><input type=text name=rechargeamt value=$amt1 />		</td>";
				echo "</tr>";
				echo"<tr>";
				echo"<td  height=45 width=200>Current Balance:		</td>";
				echo "<td  height=45 width=200><input type=text name=currentrecharge value=$amt />		</td>";
				echo "</tr>";
				echo "</table>";
			}
			
			else 
			{
				echo " You have insufficient balance";
				echo "<br>";
				echo "<br>";
				echo "<br>";
				echo"<table align=center class=style16>";
				echo"<tr>";
				echo"<td>Current Balance:		</td>";
				echo "<td><input type=text name=currentrecharge value=$curbal />		</td>";
				echo "</tr>";
				echo"</table>";
			}
		}
		else
		echo "Pease enter correct DATA";
		
?>
