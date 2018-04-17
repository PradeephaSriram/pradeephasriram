<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wood House</title>
<style>
<%@ include file="/WEB-INF/resources/css/styles/header.css" %>

</style>
</head>
<body>
<nav class="navbar navbar-inverse" id="nav_bar">
		<div class="container-fluid">
		<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#collapse-example" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
			<div class="navbar-header">
			<!-- mapping /resources/**  -> /resources/images/niit.jpg
			/WEB-INF/resources/images/niit.jpg
			url - http://localhost:8080/project1frontend/resources/images/niit.jpg
			 -->
				<a class="navbar-brand" href="">
		<img src='<c:url value="/resources/images/niit.jpg"></c:url>' alt="NIIT" height="30px" width="120px"></a>
			</div>
			<div class="collapse navbar-collapse" id="collapse-example">
			<ul class="nav navbar-nav" id="links">
				<li class="active"><a href='<c:url value="/home"></c:url>'>Home</a></li>
				<!-- value is for DispatcherServlet
				DispatcherServlet using the value it has to find the handler method which can handle the request
				http://localhost:8080/project1frontend/all/getproducts -> DispatcherServlet -> /all/getproducts
				-> ProductController.getAllProducts() -> Service -> Dao -> Select * from product 
				
				controller returns ModelAndView [model is List<Product>,view is productlist]
				/WEB-INF/views/productlist.jsp
				 -->
				<li><a href='<c:url value="/all/getproducts"></c:url>'>Browse All Products</a></li>
				<li><a href='<"#">Contact Us</a></li>
				<li><a href='<c:url value="/admin/update"></c:url>'>About Us</a></li>
				
				
				<li class="dropdown"><a href="" class="dropdown-toggle"
					data-toggle="dropdown">Select by Categories<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="">General</a></li>
						<li><a href="">Discount sale</a></li>
						<li><a href="">Special edition</a></li>
						
					</ul></li>
				 <li><form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search">
	  <label="Search" class="glyphicon glyphicon-search"></label>
	
	 
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form></li>
						<li><a href=""><span class="glyphicon glyphicon-user" style="color:blue"></span>
						sign in</a></li>
				<li><a href="">
				<span class="glyphicon glyphicon-user"></span>
				sign up</a></li>
				
					</li><li><a href="#">
          <span class="glyphicon glyphicon-shopping-cart"></span>
        cart </a>  
		</li>
			</ul>
			</div>
		</div>
	</nav>
</body>
</html>


</body>
</html>