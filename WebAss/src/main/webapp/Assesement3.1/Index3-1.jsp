<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Form</title>
</head>
<body>
<div style="text-align: center">
<h1>Web Register Form</h1>
    <form action="#">
 Enter a name :<input type="text" id="name"><br><br>
 Enter a password :<input type="password" id="pass"><br><br>
 Enter a Email :<input type="email" id="email"><br><br>
 <input type="submit" value="Register" id="sub">
    </form>
    </div>
<script type="text/javascript">
       const li=document.getElementById("sub").onclick=function(){
        let val= document.getElementById("name").value;
        let pas= document.getElementById("pass").value;
        
    
           if(val==""){
               alert("Shall not empty");
           }else{
            if(val.length<8){
                alert("Name should be minimum 5 characters");
            }else{
                if(pas.length<8){
            alert("Password should have one special character and minimum of length 8 chars")
           }
            }
           }
        }
       </script>
</body>
</html>