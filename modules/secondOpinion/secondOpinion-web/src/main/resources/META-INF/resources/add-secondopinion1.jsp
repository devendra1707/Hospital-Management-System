<%@ include file="init.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<style type="text/css">
.mq {
	text-align: center;
}

#te {
	height: 35px;
	width: 40px;
}
</style>

<body>

	<portlet:defineObjects />

	<portlet:actionURL name="addSecondOpinion"
		var="addSecondOpinionActionURL" />

	<strong><center>
			<h1 style="font-size: 35px;">Get Second Opinion</h1>
		</center></strong>
	<aui:form action="<%=addSecondOpinionActionURL%>"
		name="secondOpinionForm" method="POST">
		<aui:fieldset-group markupView="lexicon">

			<aui:row>
				<aui:col width="50">
					<aui:input label="Name" name="name" type="text"
						placeholder="Full Name" />
				</aui:col>
				<aui:col width="50">
					<aui:input label="Email" name="email" type="email"
						placeholder="Email Id" />
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Mobile" name="mobile" type="number"
						placeholder="Mobile No" />
				</aui:col>
				<aui:col width="50">

					<aui:select id="edit-speciality" name="specialty"
						label="Speciality" value="Select-Speciality"
						showEmptyOption="false">
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

					<%-- <aui:input label="Speciality" name="specialty" type="text" /> --%>

				</aui:col>
			</aui:row>
			<aui:input label="Remarks" name="remark" type="textarea"
				placeholder="Remarks" />
			<center>


				<div>
					<h4 class="mq">
						Math question 9 + 6 = <input id="te" type="number" />
					</h4>

					<h4 class="mq">Solve this simple math problem and enter the
						result. E.g. for 1+3, enter 4.</h4>
				</div>
				<br>

				<aui:button-row>
					<aui:button name="submitButton" type="submit" value="Submit" />
				</aui:button-row>
			</center>
		</aui:fieldset-group>
	</aui:form>
</body>
</html>