<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div>
	<div>
		<form action="saveVehicle" method="POST">
		
   			<div>
      			<label>Vehicle Type:</label>
       			<input type="text" name="vehicleType" />
   			</div>	
    
   			<div>
      			<label>Vehicle Model :</label>
       			<input type="text" name="vehicleModel"/>
   			</div>	  
    
   			<div>
      			<label>Vehicle Creation Date:</label>
      			<input type="date" name="date"/>
   			</div>			
    
   			<div>
       			<label>Vehicle Price:</label>
       			<input type="number" name="vehiclePrice"/>
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
