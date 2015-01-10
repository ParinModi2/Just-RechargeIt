<%-- 
    Document   : newreg1
    Created on : Oct 15, 2012, 6:41:39 AM
    Author     : Stuti
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

<script type="text/javascript">
	//alert(t7);
	var firstpos=t8.indexOf("@");
	var lastpos=t8.lastIndexOf("@");
	var po2=t8.indexOf(".");
            var t9=document.f1.pass.value;
	//alert(t9);

       //alert(t12);


        function validatename()
        {
            var t1=document.f1.name.value;
          //  alert(t1);
	    if(t1.length==0)
            {
		document.getElementById("uname").innerHTML="* Please Enter User Name";
            }
            else
                document.getElementById("uname").innerHTML="";

        }


        function validateadd()
        {

            var t2=document.f1.address.value;
            if(t2.length==0)
            {
		document.getElementById("add").innerHTML="* Please Enter Address";
            }
            else
                document.getElementById("add").innerHTML="";
        }


        function validatestate()
        {

            var t4=document.f1.state.value;
            if(t4.length==0)
            {

		document.getElementById("state1").innerHTML="* Please Enter State";
            }
            else
               document.getElementById("state1").innerHTML="";
        }


        function validatecity()
        {
            var t5=document.f1.city.value;
            if(t5.length==0)
            {

		document.getElementById("city1").innerHTML="* Please Enter City";
            }
            else
                document.getElementById("city1").innerHTML="";
        }


        function validatepin()
        {
             var t6=document.f1.pin.value;

            if(t6.length==0 || t6.length!=6 || (isNaN(t6)))
            {

		document.getElementById("pin1").innerHTML="* Please Enter Pin Code";
            }
            else
            	document.getElementById("pin1").innerHTML="";
        }



        function validatemno()
        {
            var t7=document.f1.mno.value;

            if(t7.length!=10)
            {
		document.getElementById("mno1").innerHTML="* Please Enter 10 Digit Phone No";
	    }
            else
            {
                
                if(isNaN(t7))
                {
                    document.getElementById("mno1").innerHTML="* Please Enter Digits";
                }
	    	else
                    document.getElementById("mno1").innerHTML="";
             }
        }
          function validateemail()
          {

             var t8=document.f1.email.value;
            var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            if(t8.match(mailformat) || t8.length==0)
            {
                //alert("correct");
               
                 document.getElementById("mail1").innerHTML="";
            }
            else
            {
           // alert("not correct");
            document.getElementById("mail1").innerHTML="* Please enter correct Email-id";
           

             }
          }
        function validatepass()
             {
                var t9=document.f1.pass.value;
                if(t9.length!=6)
                {
            //re        alert(t9);
                    document.getElementById("pass1").innerHTML="* Please Enter correct Password";
		}
                else
                   {
                        alert(t9);
                            document.getElementById("pass1").innerHTML="";

                   }

             }
        function validatecpass()
          {
              var t9=document.f1.pass.value;
              var t10=document.f1.cpass.value;
            if(t10!=t9)

            {
                
		document.getElementById("cpass1").innerHTML="* Please Enter correcct  Confirm Password";
            }
            
            else
            {
                document.getElementById("cpass1").innerHTML=" ";

              }
            }


            
        function validateque()
        {
        var t11=document.f1.s1.value;
        if(t11=='q0')
	{
		document.getElementById("que").innerHTML="* Please enter correct question";
	}
        else
       		document.getElementById("que").innerHTML="";
        }



        function validateans()
        {
            var t12=document.f1.ans.value;
            if(t12.length==0)
		{
			document.getElementById("ans1").innerHTML="* Please enter Answer";
		}
                else
                    document.getElementById("ans1").innerHTML="";

	}
</script>

    </head>
      <body>
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
            

            <table align="center">
          <tr>
		<td width="115" height="38">Name:</td>
		<td width="197"><input type=text name=name value="<%=request.getParameter("name")!=null?request.getParameter("name"):""%>" onblur="validatename()"></td>
		<td><span class="style70">Full name as appearing on your bank statement</span></td>
		<td width="107"><div id="uname" style="color:red"  class="style70"> </div> </td>
	</tr>
	  <tr>
	    <td  height="38">Current Address:		</td>
		<td width="197"><textarea name=address  onblur="validateadd()" cols=30 rows=5><%=request.getParameter("address")!=null?request.getParameter("address"):""%></textarea></td>
		<td><span class="style70">Address as appearing on your bank statement</span></td>
		<td width="107"><div id="add" style="color:red"  class="style70"></div>		</td>
	</tr>
	<tr>
		<td width="115" height="38">Country:	</td>
		<td width="197"><input type=text name=country value="India">		</td>
		<td width="107"><div id="country1" style="color:red"  class="style70"></div></td>
	</tr>
        <tr>
		<td width="115" height="38">State:		</td>
		<td width="197"><input type=text name=state value="<%=request.getParameter("state")!=null?request.getParameter("state"):""%>" onblur="validatestate()">		</td>
		<td width="107"><div id="state1" style="color:red"  class="style70"></div></td>
	</tr>
        <tr>
		<td width="115" height="38">City:</td>
                <td width="197"><input type="text" name=city value="<%=request.getParameter("city")!=null?request.getParameter("city"):""%>" onblur="validatecity()"></td>
		<td width="107"><div id="city1" style="color:red"  class="style70"></div>		</td>
	</tr>
	<tr>
		<td width="115" height="38">Pin Code:</td>
                <td width="197"><input type="text" name=pin value="<%=request.getParameter("pin")!=null?request.getParameter("pin"):""%>" onblur="validatepin()"></td>
		<td width="107"><div id="pin1" style="color:red"  class="style70"></div>		</td>
	</tr>
	<tr>
		<td width="115" height="38">Mobile No:	</td>
                <td width="197"><input type=text name=mno value="<%=request.getParameter("mno")!=null?request.getParameter("mno"):""%>" onblur="validatemno()"></td>
                <td width="107"><div id="mno1" style="color:red"  class="style70"></div>	</td>
	</tr>
        <tr>
		<td width="115" height="38">Email:	</td>
                <td width="197"><input type=text name=email value="<%=request.getParameter("email")!=null?request.getParameter("email"):""%>" onblur="validateemail()">	</td>
		<td><span class="style70">Enter a valid email ID. We proactively track all bounced emails</span></td>
		<td width="107"><div id="mail1" style="color:red"  class="style70"></div>	</td>
	</tr>
        <tr>
		<td width="115" height="38">Password:	</td>
                <td width="197"><input type=password name=pass  onblur="validatepass()" >	</td>
		<td><span class="style70">Length of the Password should be 6 only</span></td>
		<td width="107"><div id="pass1" style="color:red"  class="style70"></div>	</td>
	</tr>
        <tr>
		<td  td width="115" height="38">Confirm password:	</td>
                <td width="197"><input type=password  name=cpass onblur="validatecpass()">	</td>
		<td width="107"><div id="cpass1" style="color:red" class="style70"></div></td>
	</tr>
	<tr>
	<td  width="115" height="38">Select question:</td>
        <td><select name=s1  onblur="validateque()">
		<option value=q0>-Select any question-</option>
		<option value=q1>Which is your favourite place?</option>
		<option value=q2>Who is your best friend?</option>
		<option value=q3>Which is your favourite pet?</option>
		<option value=q4>Who is your favourite actor?</option>
	</select>	</td>
			<td width="107"><div id="que" style="color:red"  class="style70" ></div>	</td>

    </tr>
<tr>
	<td width="115" height="38">Your answer:</td>
        <td width="115" height="38"><input type=text name=ans value="<%=request.getParameter("ans")!=null?request.getParameter("ans"):""%>" onblur="validateans()"></td>
			<td width="107"><div id="ans1" style="color:red"  class="style70"></div>	</td>

</tr>
    
      </table>
          <div align="right"><center>

    <tr>     <input type=submit name="b1"  value="Submit Form">
        </tr>
              </center>
              </div>
	
         </form>
       </body>
</html>
<%
    try
    {
//        out.println("in trry");
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        
    
if(request.getParameter("b1")!=null)
       {
    //            out.println("in button");
             String name=request.getParameter("name");
             String add=request.getParameter("address");
             String country=request.getParameter("country");
             String state=request.getParameter("state");
             String city=request.getParameter("city");
             String pin=request.getParameter("pin");
             String mno=request.getParameter("mno");
             String email=request.getParameter("email");
             String pass=request.getParameter("pass");
             String cpass=request.getParameter("cpass");
             String que=request.getParameter("s1");
             String ans=request.getParameter("ans");
             Statement st=cn.createStatement();
             ResultSet rs=st.executeQuery("select email from registeration where email='"+email+"'");
             out.println("select email from registeration where email='"+email+"'");
             if(rs.next())
         {
               out.println("This Id already exist");
         }
         else
         {
                 out.println("in else");
         PreparedStatement pst=cn.prepareStatement("insert into registeration values(?,?,?,?,?,?,?,?,?,?,?)");
         pst.setString(1,name);
         pst.setString(2,add);
         pst.setString(3,country);
         pst.setString(4,state);
         pst.setString(5,city);
         pst.setString(6,pin);
         pst.setString(7,email);
         pst.setString(8,mno);
         pst.setString(9,pass);
         pst.setString(10,que);
         pst.setString(11,ans);

       //  pst.setS+","+country+","++","++","++","++","+email+","+pass+","+cpass+","+que+","+ans);
         pst.execute();
         pst.close();
         out.println("\n");
         out.println(email);
              ResultSet rs2=st.executeQuery("select email from registeration where email='"+email+"'");
             // out.println("select email from registeration where email='"+email+"'");
              if(rs2.next())
              {
                 String qemail=rs2.getString(1);
                //out.println(qemail);
                // out.println("select name from registeration where email='"+qemail+"'");
                 ResultSet  rs1=st.executeQuery("select name,mno from registeration where email='"+qemail+"'");
                if(rs1.next())
                {
                  String sesname=rs1.getString(1);
                  String sesmno=rs1.getString(2);
                //   String sesemail=rs1.getString(3);
                  HttpSession ses=request.getSession();
                  ses.setAttribute("sesvarname",sesname );
                  ses.setAttribute("sesvarmno",sesmno );
                  ses.setAttribute("sesvaremail",qemail );
                 // out.println(ses.getAttribute("sesvarname"));
                }
              }


         response.sendRedirect("howtorecharge.jsp");

         }
       }
    }
    catch(Exception ex)
               {
               out.println(ex);
    }
%>