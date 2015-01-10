<?php
session_start();
	if(isset($_SESSION['check']))
	{
		echo $_COOKIE["cemail"];
		echo $_COOKIE["cpass"];
	}
	else
	{
		$email=$_SESSION['email'];
	echo "$email";
	}
?>
<?php
		mysql_connect('localhost','root','');
		mysql_select_db('project');
	//	session_start();
		$email1= $_SESSION['email'];
		$row=mysql_query("select *from registeration where email='$email1' ");
	//	$path="imageuser/".$profilepic;	
	//	move_uploaded_file($_FILES['propic']['tmp_name'],$path);
	
		$col=mysql_fetch_array($row);
			if(isset($_POST['profile']));
			{
				$row=mysql_query("select *from registeration where email='$email1' ");
				$col=mysql_fetch_array($row);
			}
		//	$profilepic='imageuser/$col[1]';
	//		echo "$profilepic";

?>
<?php
		mysql_connect('localhost','root','');
		mysql_select_db('project');
	//	session_start();
		if(isset($_POST['s1']))
		{
		
			$email1=$_SESSION['email'];
			$name=$_POST['name1'];
			$profilepic=$_FILES['pic']['name'];
			echo "$profilepic";
			$address=$_POST['address1'];
			$country=$_POST['country1'];
			$state=$_POST['state1'];
			$city=$_POST['city1'];
			$pin=$_POST['pin1'];
			$mno=$_POST['mno1'];
		
			
			mysql_query("update registeration set name='$name',profilepic='$profilepic',address='$address',country='$country',state='$state',city='$city',pin='$pin',mno='$mno' where email='$email1' ");
			
			$path="imageuser/".$profilepic;	
 			move_uploaded_file($_FILES['pic']['tmp_name'],$path);
		
	
}
?>
<?php
	//session_start();
	if(isset($_POST['logout']))
	{
		session_unset();
		session_destroy();
		header("location:login.php");
	}

?>




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
				var flag=true;
				if(amt1.length==0)
				{
					
					alert("Please enter amount");
					flag false;
				}
				if(isNaN(amt1))
				{
					alert("Please enter digits");
					flag false;
				}
				return flag;
	}
-->
</script>

</head>
<body>
<form name=f1 method="post" enctype="multipart/form-data">
<table>
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...</td>
<td align="right" width="800"><input type="submit" name="logout" value="LOGOUT" /></td>
</tr>
</table>



<table cellpadding="10" align="center">
	<table id="profile" cellpadding="10" align="center" style="display:none">
	<tr>
	<th colspan="2" class="style16" >MY PROFILE</th>
	</tr>
	<tr>
		<td > NAME:</td>
		<td> <input type="text" name="name" value=<?php echo "$col[0]"?>></td>
	</tr>
	<tr>
		<td >PROFILE PICTURE:</td>
		<td><?php	echo" <img src=imageuser/$col[1] height=90 width=200>"?></td>
		
	<tr>
		<td > ADDRESS:</td>
		<td> <textarea ><?php echo "$col[2]"?></textarea></td><br>
	</tr>
	<tr>
		<td > COUNTRY:</td>
		<td> <input type="text" name="country" value=<?php echo "$col[3]"?>></td>
	</tr>
	<tr>
		<td > STATE:</td>
		<td> <input type="text" name="state" value=<?php echo "$col[4]"?>></td>
	</tr>
	<tr>
		<td > CITY:</td>
		<td> <input type="text" name="city" value=<?php echo "$col[5]"?>></td>
	</tr>
	<tr>
		<td > PIN CODE:</td>
		<td> <input type="text" name="pin" value=<?php echo "$col[6]"?>></td>		
	</tr>
	
	<tr>
		<td > E-MAIL:</td>
		<td> <input type="text" name="no" value=<?php echo "$col[7]"?>></td>
	</tr>
	<tr>
		<td > MOBILE:</td>
		<td> <input type="text" name="mail" value=<?php echo "$col[8]"?>></td>
	</tr>
	
	<tr>
	<td colspan="2" align="center" class="style16"><a href=changepass.php class="style16" >Change Password </a></td>
	</tr>
	<tr>
			<td colspan="2" align="center" class="style16"><input type="button" name="profile1" value="EDIT PROFILE" onClick="visibility('edit','profile')"></td>

		</tr>
		
		<tr >
		<td  align="center" colspan="2"><input type="submit" name="transaction" value="SHOW TRANSACTIONS" onClick="visibility('transaction','profile')"></td>				    </tr>


	
<!-- transection search table-->



<table id="transaction" border="0" align="center" style="display:block" cellpadding="10">
<tr>
<th colspan="2" align="center" class="style16">TRANSACTION</th>
</tr>	
<tr>
	<td colspan="2" align="center" class="style16">SEARCH BY</td>
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

<table cellpadding="10" align="center">
	<table id="edit" cellpadding="10" align="center" style="display:none" >
	<tr>
		<th class="style16" colspan="2">EDIT PROFILE</th>
	</tr>		
	<tr>
		<td > NAME:</td>
		<td> <input type="text" name="name1" ></td>
	</tr>
	<tr>
		<td >UPLOAD YOUR PHOTO HERE:</td>
		<td><input type=file name="pic" ></td>
	<tr>
		<td> ADDRESS:</td>
		<td> <textarea name="address1" ></textarea></td>
	</tr>
	<tr>
		<td> COUNTRY:</td>
		<td> <input type="text" name="country1"></td>
	</tr>
	<tr>
		<td> STATE:</td>
		<td> <input type="text" name="state1"></td>
	</tr>
	<tr>
		<td> CITY:</td>
		<td> <input type="text" name="city1" ></td>
	</tr>
	<tr>
		<td> PIN CODE:</td>
		<td> <input type="text" name="pin1"></td>		
	</tr>
	
	
	<tr>
		<td> MOBILE:</td>
		<td> <input type="text" name="mno1"></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" name=s1 value="SUBMIT" onClick="visibility('edit')" /></td>
		</td>
	</tr>

</form>
</body>
</html>

<%

if(request.getParameterById("b2")!=null)
{
	response.sendRedirect("transhistory.jsp");
}	
if(request.getParameterById("b1")!=null)
{
	amt=response.getParameter("amt");
	if(strlen(amt)==0)
	{
				echo "Please enter amount";

	}
	else 
	{
		sessoin=amt;
		response.sendRedirect("amttransaction.jsp");
	}
	
}
?>