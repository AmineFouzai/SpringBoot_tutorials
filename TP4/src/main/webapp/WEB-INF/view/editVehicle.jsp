<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstLCss"/>
<link href="${jstLCss}" rel="stylesheet">
<script type="text/javascript" src="webjars/bootstrap/4.3.1/css/bootstrap.min.js"></script>


<div class="container">
	<hr>
	<div class="card-body">
		<form action="updateVehicle" method="post">
 			<div class="form-group">
 				<label class="control-label" >Vehicle ID :</label>
 				<input type="text" name="vehicleId" value="${vehicle.vehicleId}" readonly  class="form-control"/>
 			</div>
 			
 			<div class="form-group">
 				<label class="control-label">Vehicle Type :</label>
 				<input type="text" name=vehicleType value="${vehicle.vehicleType}" class="form-control"/>
 			</div>
 			
 			<div class="form-group">
 				<label class="control-label">Vehicle Model:</label>
 				<input type="text" name="vehicleModel" value="${vehicle.vehicleModel}" class="form-control"/>
 			</div>
 			
 			<div class="form-group">
				 <label class="control-label"> Vehicle Creation Date:</label>
 				 <fmt:formatDate pattern="yyyy-MM-dd" value="${vehicle.vehicleCreationDate}" var="formatDate"/>
 				 <input type="date" name="date" value="${formatDate}" class="form-control"/>
			 </div>
			 
			 <div class="form-group">
 				<label class="control-label">Vehicle Price:</label>
 				<input type="number" name="vehiclePrice" value="${vehicle.vehiclePrice}" class="form-control"/>
 			</div>
			 
 			<div>
 				<button type="submit" class="btn btn-primary">Change</button>
			</div>
		</form>
	</div>
	<br/>
	<br/>
	<a href="listeVehicles" >Liste Vehicles</a>
</div>
