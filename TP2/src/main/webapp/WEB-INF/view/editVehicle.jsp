<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<div>
	<hr>
	<div>
		<form action="updateVehicle" method="post">
 			<div>
 				<label >Vehicle ID :</label>
 				<input type="text" name="vehicleId" value="${vehicle.vehicleId}" readonly />
 			</div>
 			
 			<div >
 				<label >Vehicle Type :</label>
 				<input type="text" name=vehicleType value="${vehicle.vehicleType}"/>
 			</div>
 			
 			<div>
 				<label >Vehicle Model:</label>
 				<input type="text" name="vehicleModel" value="${vehicle.vehicleModel}"/>
 			</div>
 			
 			<div>
				 <label> Vehicle Creation Date:</label>
 				 <fmt:formatDate pattern="yyyy-MM-dd" value="${vehicle.vehicleCreationDate}" var="formatDate"/>
 				 <input type="date" name="date" value="${formatDate}"/>
			 </div>
			 
			 <div>
 				<label >Vehicle Price:</label>
 				<input type="number" name="vehiclePrice" value="${vehicle.vehiclePrice}"/>
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
