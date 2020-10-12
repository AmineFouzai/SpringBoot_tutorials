<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstLCss"/>
<link href="${jstLCss}" rel="stylesheet">
<script type="text/javascript" src="webjars/bootstrap/4.3.1/css/bootstrap.min.js"></script>


<div class="container">
	<div class="card">
		<div class="card-header">
			Liste Of Vehicles
		</div>
	<div>	
	<div class="card-body">	
		<table class="table table-striped">
	 		<tr>
				<th>Vehicle Id</th>
				<th>Vehicle Type</th>
				<th>Vehicle Model</th>
				<th>Vehicle Creation Date</th>
				<th>Vehicle Price</th>
				<th>Edit</th>
				<th></th>
 			</tr>
 			<c:forEach items="${vehicles}" var="v">
 			<tr>
 				<td>${v.vehicleId }</td>
 				<td>${v.vehicleType }</td>
 				<td>${v.vehicleModel }</td>
				<td><fmt:formatDate pattern="dd/MM/yyyy" value="${v.vehicleCreationDate }"/></td>
    			<td>${v.vehiclePrice }</td>
 				<td><a onclick="return confirm('are you sure ?')" href="deleteVehicle?id=${v.vehicleId}">Delete</a></td>
 				<td><a href="changeVehicle?id=${v.vehicleId}">Edit</a></td>
 			</tr>
 	 		</c:forEach>
 		</table>
	</div>
</div>
</div>
</div>
