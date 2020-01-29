<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Home Page</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="/css/admin.css" >

    </head>

<body style = "background-color: #8585ad">
	
<div class="container" style = "background-color: #B1ECE5;">
    <div class="row profile">
		<div class="col-md-3">
			<div class="profile-sidebar">
				<!-- SIDEBAR USERPIC -->
				<div class="profile-userpic">
					<img src="https://static.change.org/profile-img/default-user-profile.svg" class="img-responsive" alt="">
				</div>
				<!-- END SIDEBAR USERPIC -->
				<!-- SIDEBAR USER TITLE -->
				<div class="profile-usertitle">
					<div class="profile-usertitle-name">
						CDAC ADMIN
					</div>
					<div class="profile-usertitle-job">
						PG-DAC
					</div>
				</div>
				<!-- END SIDEBAR USER TITLE -->
				<!-- SIDEBAR BUTTONS -->
				
				<!-- END SIDEBAR BUTTONS -->
				<!-- SIDEBAR MENU -->
				<div class="profile-usermenu">
					<ul class="nav">
						
						<li>
							<a href="#">
							<i class="glyphicon glyphicon-user"></i>
							Logout </a>
						</li>
						
					</ul>
				</div>
				<!-- END MENU -->
			</div>
		</div>
		<div class="col-md-9">
            <div class="profile-content">
			   <p><h2>Welcome Admin to query handling system, click on the respective link to proceed further.</h2></p>
				<br> <br>
			  
                <table align="center" border="1" width = "70%">
                    <tr height = "100" style="text-align: center;">
                      <td><a href="facultyRegistration.jsp">Add Faculty details</td>
                      <td><a href="<spring:url value='/admin/deleteFaculty'/>">Delete Faculty</td>
                     
                      
                    </tr>
                    <tr height = "100" style="text-align: center;">
                        <td><a href="<spring:url value='/admin/getQueries'/>">Resolve Non-Technical queries</td>
                        
                         <td><a href="<spring:url value='/admin/getQueries2'/>">Show All Non_Technical Queries</td>
                      
                    </tr>
                     <tr height = "100" style="text-align: center;">
                       
                            
                      
                    </tr>
                    
                  </table>
				
			

            </div>
		</div>
	</div>
</div>

<br>
<br>
</body>
</html>