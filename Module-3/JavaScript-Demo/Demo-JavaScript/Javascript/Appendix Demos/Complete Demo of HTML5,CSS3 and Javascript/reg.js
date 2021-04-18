
function checkName()
{
	  var name=document.getElementById("un").value;
	  
	 
	  for(i=0;i<name.length;i++)
		  {
		    var ch=name.charAt(i);
		    //alert(ch);
		    if( (ch <= 'Z' && ch >='A') || (ch <= 'z' && ch >='a'))
		    	{
		      	document.getElementById("ne").innerHTML="";
		    	}
		  
		    else
		    	{
		    	document.getElementById("ne").innerHTML="Invalid Character";
		    	}
		  }

}

function checkEmptyFields()
{
	  var name=document.getElementById("un").value;
	  var pwd=document.getElementById("pwd").value;
	  var email=document.getElementById("eml").value;
	  
	  var namePresent=true;
	  var pwdPresent=true;
	  var emailPresent=true;
	  
	  //alert(name+" "+pwd+ " "+email);
	  if(name==null || name.length<=0)
		  namePresent=false;
	  
	  if(pwd==null || pwd.length<=0)
		  pwdPresent=false;
	
	  if(email==null || email.length<=0)
		  emailPresent=false;
	  
	  if(!namePresent || !pwdPresent || !emailPresent)
		  {
		   document.getElementById("mem").innerHTML="* marked fields are mandatory";
		   return false;		  
		  }
	  
	  else
		  {
		   return true;
		  }
}