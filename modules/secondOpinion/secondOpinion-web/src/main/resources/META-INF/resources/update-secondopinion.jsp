<%@ include file="init.jsp" %>
<portlet:defineObjects/>

<portlet:actionURL name="updateSecondOpinion" var="updateSecondOpinionActionURL" />

<aui:form action="<%= updateSecondOpinionActionURL %>" method="post" name="secondOpinionForm" />

<%
	String id = renderRequest.getParameter("id");
	String name = renderRequest.getParameter("name");
	String email = renderRequest.getParameter("email");
	String mobile = renderRequest.getParameter("mobile");
	String specialty = renderRequest.getParameter("specialty");
	String remark = renderRequest.getParameter("remark");
%>

<aui:form action="<%= updateSecondOpinionActionURL %>" method="post">
<aui:input name="id" type="hidden" value="<%=Long.parseLong(id) %>" />
<aui:input name="name" type="text" value="${secondOpinion.name}" />
<aui:input name="email" type="email" value="${secondOpinion.email}" />
<aui:input name="mobile" type="number" value="${secondOpinion.mobile}" />
<%-- <aui:input name="specialty" type="text" value="${secondOpinion.specialty}" /> --%>

	<aui:select id="edit-speciality" name="specialty" type="text" value="${secondOpinion.specialty}">
		<aui:option value="" selected="selected">-Select Speciality-</aui:option>
	<aui:option value="Anaesthesia and Critical Care">Anaesthesia and Critical Care</aui:option>
	<aui:option value="Audiology">Audiology</aui:option>
	<aui:option value="Cardiology">Cardiology</aui:option>
	<aui:option value="Chest Physician">Chest Physician</aui:option>
	<aui:option value="Chest Physician">Chest Physician</aui:option>
	<aui:option value="Pain Management">Pain Management</aui:option>
	<aui:option value="Dental Care">Dental Care</aui:option>
	<aui:option value="Dermatology">Dermatology</aui:option>
	<aui:option value="Diabetics">Diabetics</aui:option>
	<aui:option value="Diabetologist">Diabetologist</aui:option>
	<aui:option value="Dialysis/Nephro">Dialysis/Nephro</aui:option>
	<aui:option value="Dietician">Dietician</aui:option>
	<aui:option value="Emergency Services">Emergency Services</aui:option>
	<aui:option value="ENT">ENT</aui:option>
	<aui:option value="Head and Neck Surgery">Head and Neck Surgery</aui:option>
	<aui:option value="Eye Care">Eye Care</aui:option>
	<aui:option value="Gastroenterology">Gastroenterology</aui:option>
	<aui:option value="Laproscopic Surgery">Laproscopic Surgery</aui:option>
	<aui:option value="Gen and Neurosurgeon">Gen and Neurosurgeon</aui:option>
	<aui:option value="Gynaecology">Gynaecology</aui:option>
	<aui:option value="Heath Checkup">Heath Checkup</aui:option>
	<aui:option value="Homoeopathy">Homoeopathy</aui:option>
	<aui:option value="Internal Medicine">Internal Medicine</aui:option>
	<aui:option value="Lab">Lab</aui:option>
	<aui:option value="Laparoscopic Surgery">Laparoscopic Surgery</aui:option>
	<aui:option value="Nephrology">Nephrology</aui:option>
	<aui:option value="Neurosciences">Neurosciences</aui:option>
	<aui:option value="Oncology">Oncology</aui:option>
	<aui:option value="Ophthalmology (Eye)">Ophthalmology (Eye)</aui:option>
	<aui:option value="Orthopaedics">Orthopaedics</aui:option>
	<aui:option value="Pediatric Surgeon">Pediatric Surgeon</aui:option>
	<aui:option value="Pharmacy">Pharmacy</aui:option>
	<aui:option value="Phsyiotherapy">Phsyiotherapy</aui:option>
	<aui:option value="Radiology">Radiology</aui:option>
	<aui:option value="Rheumatologist">Rheumatologist</aui:option>
	<aui:option value="Spine Surgery">Spine Surgery</aui:option>
	<aui:option value="Surgery">Surgery</aui:option>
	<aui:option value="Urology">Urology</aui:option>
	<aui:option value="Vaccination">Vaccination</aui:option>
	</aui:select>
  

<aui:input name="remark" type="text" value="${secondOpinion.remark}" />
	
<aui:input name="update" type="submit" value="Update" />

</aui:form>
