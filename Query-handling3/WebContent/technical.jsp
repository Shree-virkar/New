<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Technical Page</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<style>

		
		body {
		    background: #F1F3FA;
		  }
		  
		  /* Profile container */
		  .profile {
		    margin: 20px 0;
		  }
		  
		  /* Profile sidebar */
		  .profile-sidebar {
		    padding: 20px 0 10px 0;
		    background: #fff;
		  }
		  
		  .profile-userpic img {
		    float: none;
		    margin: 0 auto;
		    width: 50%;
		    height: 50%;
		    -webkit-border-radius: 50% !important;
		    -moz-border-radius: 50% !important;
		    border-radius: 50% !important;
		  }
		  
		  .profile-usertitle {
		    text-align: center;
		    margin-top: 20px;
		  }
		  
		  .profile-usertitle-name {
		    color: #5a7391;
		    font-size: 16px;
		    font-weight: 600;
		    margin-bottom: 7px;
		  }
		  
		  .profile-usertitle-job {
		    text-transform: uppercase;
		    color: #5b9bd1;
		    font-size: 12px;
		    font-weight: 600;
		    margin-bottom: 15px;
		  }
		  
		  .profile-userbuttons {
		    text-align: center;
		    margin-top: 10px;
		  }
		  
		  .profile-userbuttons .btn {
		    text-transform: uppercase;
		    font-size: 11px;
		    font-weight: 600;
		    padding: 6px 15px;
		    margin-right: 5px;
		  }
		  
		  .profile-userbuttons .btn:last-child {
		    margin-right: 0px;
		  }
		      
		  .profile-usermenu {
		    margin-top: 30px;
		  }
		  
		  .profile-usermenu ul li {
		    border-bottom: 1px solid #f0f4f7;
		  }
		  
		  .profile-usermenu ul li:last-child {
		    border-bottom: none;
		  }
		  
		  .profile-usermenu ul li a {
		    color: #93a3b5;
		    font-size: 14px;
		    font-weight: 400;
		  }
		  
		  .profile-usermenu ul li a i {
		    margin-right: 8px;
		    font-size: 14px;
		  }
		  
		  .profile-usermenu ul li a:hover {
		    background-color: #fafcfd;
		    color: #5b9bd1;
		  }
		  
		  .profile-usermenu ul li.active {
		    border-bottom: none;
		  }
		  
		  .profile-usermenu ul li.active a {
		    color: #5b9bd1;
		    background-color: #f6f9fb;
		    border-left: 2px solid #5b9bd1;
		    margin-left: -2px;
		  }
		  
		  /* Profile Content */
		  .profile-content {
		    padding: 20px;
		    background: #fff;
		    min-height: 460px;
		    
		  }
		
		</style>

    </head>


<body>
<div class="container">
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
						Student Name
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
							Previous Queries </a>
						</li>
						<li>
							<a href="logout">
							<i class="glyphicon glyphicon-user"></i>
							Logout </a>
						</li>
						
					</ul>
				</div>
				<!-- END MENU -->
			</div>
        </div>
        <form class = "form-container" action="submitquery" method="post">
		<div class="col-md-9">
            <div class="profile-content">
               <p><h2>Technical Queries</h2></p>
            
              <br>
				 <form class = "form-container" action="searchquery" method="post">
              <p align = "left">
                  
                <b>Subject :-</b> 

                <select name="subject">
                    <option>Java</option>
                    <option>CPP</option>
                    <option>DotNet</option>
                    <option>DataStructures</option>
                </select>
              </p>
              
               
              
              <p>
              		Enter topic :<input type="text">
              </p>
              
              <p>
              		<input type="submit" class="btn btn-info" value = "search related topic" align="middle" name = "btn1">
              </p>
              </form>

              <br>

              <p align = "left">
                  <b>Enter your query :-</b>

                  <textarea class="form-control" rows="8" id="comment" name="query"></textarea>
              </p>

              <input type="submit" class="btn btn-info" value="Submit" name = "btn2"></button>
            </div>

        </div>
        </form>
    
	</div>
</div>

<br>
<br>

</body>
</html>