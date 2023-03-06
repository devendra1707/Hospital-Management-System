<%@ include file="init.jsp"%>
<portlet:defineObjects />

<portlet:actionURL name="addAppointment" var="addAppointmentActionURL" />


<h2>Add Appointment Form here !</h2>

<aui:form action="<%=addAppointmentActionURL%>" name="appointmentForm"
	method="POST">
	<aui:input name="name">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>

	<aui:input name="mobile" type="number">
		<aui:validator name="required" />
		<aui:validator name="digits" />
	</aui:input>

	<aui:input name="email">
		<aui:validator name="required" />
		<aui:validator name="email" />
	</aui:input>

	<aui:input name="country">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>

	<aui:input name="age">
		<aui:validator name="required" />
		<aui:validator name="digits" />
	</aui:input>

	<aui:input name="speciality">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>

	<aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>
