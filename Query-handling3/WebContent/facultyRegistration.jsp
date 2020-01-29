<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
    <head>
        <title>Student Registration Form</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="/css/studentreg.css">
    </head>
    <body>
    <form action="admin/registerFaculty" method="post">
        <div class = "container">
            <div class = "row">
                <div class = "col-md-3"></div>
                <div class = "col-md-6">
                    <h1 class = "text-center">Faculty Registration</h1>

                    <label class = "label col-md-3 control-label">UserName</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="username" placeholder = "Enter username">
                    </div>

                    <label class = "label col-md-3 control-label">PASSWORD</label>
                    <div class = "col-md-9">
                        <input type = "Password" class = "form-control" name="password" placeholder = "Enter Password">
                    </div>
                    <label class = "label col-md-3 control-label">FIRST_NAME</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="first_name" placeholder = "Enter Password">
                    </div>
                    <label class = "label col-md-3 control-label">LAST_NAME</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="last_name" placeholder = "Enter Password">
                    </div>
                    
                    <label class = "label col-md-3 control-label">Contact</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="contact" placeholder = "Enter mobile number">
                    </div>

                    <label class = "label col-md-3 control-label">EMAIL</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="email" placeholder = "Enter email">
                    </div>

                    <label class = "label col-md-3 control-label">UserRole</label>
                    <div class = "col-md-9">
                        <input type = "text" class = "form-control" name="userRole" placeholder = "user role" value="faculty" readonly>
                    </div>
                    

                   
                    
                    <input type="submit" class="btn btn-primary btn-block" name="Register">

                    
                </div>
                <div class = "col-md-3"></div>
            </div>
        </div>
        </form>
    </body>
</html>