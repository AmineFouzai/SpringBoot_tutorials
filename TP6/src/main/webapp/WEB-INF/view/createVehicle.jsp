<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstLCss"/>
<link href="${jstLCss}" rel="stylesheet">
<script type="text/javascript" src="webjars/bootstrap/4.3.1/css/bootstrap.min.js"></script>

<div class="conatainer">
	<div class="card-body">
		<form action="saveVehicle" method="POST">
		
   			<div class="form-group">
      			<label class="control-label">Vehicle Type:</label>
       			<input type="text" name="vehicleType" class="form-control" />
   			</div>	
    
   			<div class="form-group">
      			<label class="control-label">Vehicle Model :</label>
       			<input type="text" name="vehicleModel" class="form-control"/>
   			</div>	  
    
   			<div class="form-group">
      			<label class="control-label">Vehicle Creation Date:</label>
      			<input type="date" name="date" class="form-control"/>
   			</div>			
    
   			<div class="form-group">
       			<label class="control-label" >Vehicle Price:</label>
       			<input type="number" name="vehiclePrice" class="form-control"/>
   			</div>
     
   			<div>
 		  		<button type="submit" class="btn btn-primary">Add</button>
   			</div>
		</form>
	</div>
	<div>
	${msg}
	<br/>
	<br/>
	<a href="listeVehicles">Liste Vehicles</a>
	</div>
</div>
