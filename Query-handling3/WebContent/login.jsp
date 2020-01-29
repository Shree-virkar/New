<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
    <head>
    <meta charset = "ISO-8859-1">
        <title>Login FORM</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel = "stylesheet"  href="login.css" >
 
        <style>
       

		.form-container{
		  position: absolute;
		  top: 15vh;
		  background : ghostwhite;
		  padding : 30px;
		  border-radius : 10px;
		  box-shadow: 0px 0px 10px 0px black;
		}

		.a{
		
		  text-align: center;
		  
		}
        
        </style>
        
    </head>
     <body>

            <section class = "container-fluid bg">
            
              <div style="font-style: oblique; color: rgb(187, 116, 116);">
               
            
                <h1 align="center">Login</h1>
             
              
              </div>
                <section class = "row justify-content-center"> 
                    <section class = "col-12 col-sm-6 col-md-3">
                            <form class = "form-container" action="student" method="post">
                           
                                    <div class="form-group">
                                      <label for="exampleInputUsername1">Username</label>
                                      <input type="name" class="form-control" id="exampleInputUsername1" name="userName" aria-describedby="nameHelp" placeholder="Enter username" required>
            
                                      <small id="nameHelp" class="form-text text-muted">We'll never share your details with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                      <label for="exampleInputPassword1">Password</label>
                                      <input type="password" class="form-control"  name="passWord" id="exampleInputPassword1" placeholder="Enter Password" required>
                                    
                                    </div> 
                                     <div class="form-group">
                                     
                                     	<input type="radio" name="userRole" value="admin" checked> ADMIN
  										<input type="radio" name=userRole value="student"> STUDENT
 										 <input type="radio" name="userRole" value="faculty"> FACULTY  
                                     
                                     	<!-- <input type="checkbox" name="userRole" value="admin">ADMIN
                                     	<input type="checkbox" name="userRole" value="student">STUDENT
               	                        <input type="checkbox" name="userRole" value="faculty">FACULTY -->
                                     	
                                     </div>
                                    <input type="submit" class="btn btn-primary btn-block" name="Login">
                                    <div>
                                      <a href="registration.jsp">Click here to register.</a>
                                    </div>

                                  </form>
                    </section>
                </section>
            </section>
            <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>

