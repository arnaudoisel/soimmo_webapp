<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<html>
<body>
	<h2>SoImmo</h2>
 	
 	<p>Search</p>
	<form:form method="POST" commandName="searchAccommodationForm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Type :</td>
				<td>
				<form:select path="type" />
				</td>
				<td>
				<form:errors path="type" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Minimum surface :</td>
				<td>
				<form:input path="minSurface" />
				</td>
				<td>
				<form:errors path="minSurface" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Minimum number of rooms :</td>
				<td>
				<form:input path="minRooms" />
				</td>
				<td>
				<form:errors path="minRooms" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Floor :</td>
				<td>
				<form:input path="floor" />
				</td>
				<td>
				<form:errors path="floor" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Elevator :</td>
				<td>
				<form:select path="elevator" />
				</td>
				<td>
				<form:errors path="elevator" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Maximum rent (charge included) :</td>
				<td>
				<form:input path="maxRentCharge" />
				</td>
				<td>
				<form:errors path="maxRentCharge" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Maximum availability date :</td>
				<td>
				<form:input path="maxAvailabilityDate" />
				</td>
				<td>
				<form:errors path="maxAvailabilityDate" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" />
				</td>
			</tr>
		</table>
	</form:form>
 
</body>
</html>