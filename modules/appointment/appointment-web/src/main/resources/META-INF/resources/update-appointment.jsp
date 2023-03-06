<%@ include file="init.jsp"%>

<portlet:defineObjects/>
 
<portlet:actionURL name="updateAppointment" var="updateAppointmentActionURL"/>
 
<aui:form action="<%=updateAppointmentActionURL%>" name="appointmentForm" method="POST"/>
 
<%
    String appointmentId = renderRequest.getParameter("appointmentId");
    String name = renderRequest.getParameter("name");
    String mobile = renderRequest.getParameter("mobile");
    String email = renderRequest.getParameter("email");
    String country = renderRequest.getParameter("country");
    String age = renderRequest.getParameter("age");
    String speciality = renderRequest.getParameter("speciality");
%>
<aui:form action="<%= updateAppointmentActionURL %>" method="post" >
    <aui:input name="appointmentId" type="hidden" value="<%=Long.parseLong(appointmentId)%>"/>
    <aui:input name="name" type="text" value="${appointment.name}"/>
    <aui:input name="mobile" type="number" value="${appointment.mobile}"/>
    <aui:input name="email" type="email" value="${appointment.email}" />
    <%-- <aui:input name="country" type="text" value="${appointment.country}" /> --%>
    
    <aui:select id="options" name="country" value="${appointment.country}"
		required="true" showEmptyOption="false">
		<aui:option value="select-country">-Select Country-</aui:option>
		<aui:option value="Afghanistan">Afghanistan</aui:option>
		<aui:option value="Åland Islands">Åland Islands</aui:option>
		<aui:option value="Albania">Albania</aui:option>
		<aui:option value="Algeria">Algeria</aui:option>
		<aui:option value="Andorra">Andorra</aui:option>
		<aui:option value="Angola">Angola</aui:option>
		<aui:option value="Anguilla">Anguilla</aui:option>
		<aui:option value="Antarctica">Antarctica</aui:option>
		<aui:option value="Argentina">Argentina</aui:option>
		<aui:option value="Armenia">Armenia</aui:option>
		<aui:option value="Aruba">Aruba</aui:option>
		<aui:option value="Australia">Australia</aui:option>
		<aui:option value="Austria">Austria</aui:option>
		<aui:option value="Azerbaijan">Azerbaijan</aui:option>
		<aui:option value="Bahamas">Bahamas</aui:option>
		<aui:option value="Bahrain">Bahrain</aui:option>
		<aui:option value="Bangladesh">Bangladesh</aui:option>
		<aui:option value="Barbados">Barbados</aui:option>
		<aui:option value="Belarus">Belarus</aui:option>
		<aui:option value="Belgium">Belgium</aui:option>
		<aui:option value="Belize">Belize</aui:option>
		<aui:option value="Benin">Benin</aui:option>
		<aui:option value="Bermuda">Bermuda</aui:option>
		<aui:option value="Bhutan">Bhutan</aui:option>
		<aui:option value="Bolivia">Bolivia</aui:option>
		<aui:option value="Botswana">Botswana</aui:option>
		<aui:option value="Bouvet Island">Bouvet Island</aui:option>
		<aui:option value="Brazil">Brazil</aui:option>
		<aui:option value="Bulgaria">Bulgaria</aui:option>
		<aui:option value="Burkina Faso">Burkina Faso</aui:option>
		<aui:option value="Burundi">Burundi</aui:option>
		<aui:option value="Cambodia">Cambodia</aui:option>
		<aui:option value="Cameroon">Cameroon</aui:option>
		<aui:option value="Canada">Canada</aui:option>
		<aui:option value="Cape Verde">Cape Verde</aui:option>
		<aui:option value="Cayman Islands">Cayman Islands</aui:option>
		<aui:option value="Central African Republic">Central African Republic</aui:option>
		<aui:option value="Chad">Chad</aui:option>
		<aui:option value="Chile">Chile</aui:option>
		<aui:option value="China">China</aui:option>
		<aui:option value="Christmas Island">Christmas Island</aui:option>
		<aui:option value="Colombia">Colombia</aui:option>
		<aui:option value="Comoros">Comoros</aui:option>
		<aui:option value="Congo">Congo</aui:option>
		<aui:option value="Costa Rica">Costa Rica</aui:option>
		<aui:option value="Croatia">Croatia</aui:option>
		<aui:option value="Cuba">Cuba</aui:option>
		<aui:option value="Cyprus">Cyprus</aui:option>
		<aui:option value="Denmark">Denmark</aui:option>
		<aui:option value="Djibouti">Djibouti</aui:option>
		<aui:option value="Dominica">Dominica</aui:option>
		<aui:option value="Ecuador">Ecuador</aui:option>
		<aui:option value="Egypt">Egypt</aui:option>
		<aui:option value="Eritrea">Eritrea</aui:option>
		<aui:option value="Estonia">Estonia</aui:option>
		<aui:option value="Ethiopia">Ethiopia</aui:option>
		<aui:option value="Faroe Islands">Faroe Islands</aui:option>
		<aui:option value="Fiji">Fiji</aui:option>
		<aui:option value="Finland">Finland</aui:option>
		<aui:option value="France">France</aui:option>
		<aui:option value="French Guiana">French Guiana</aui:option>
		<aui:option value="Gabon">Gabon</aui:option>
		<aui:option value="Gambia">Gambia</aui:option>
		<aui:option value="Georgia">Georgia</aui:option>
		<aui:option value="Germany">Germany</aui:option>
		<aui:option value="Ghana">Ghana</aui:option>
		<aui:option value="Gibraltar">Gibraltar</aui:option>
		<aui:option value="Greece">Greece</aui:option>
		<aui:option value="Greenland">Greenland</aui:option>
		<aui:option value="Grenada">Grenada</aui:option>
		<aui:option value="Guadeloupe">Guadeloupe</aui:option>
		<aui:option value="Guam">Guam</aui:option>
		<aui:option value="Guatemala">Guatemala</aui:option>
		<aui:option value="Guernsey">Guernsey</aui:option>
		<aui:option value="Guinea">Guinea</aui:option>
		<aui:option value="Guinea-bissau">Guinea-bissau</aui:option>
		<aui:option value="Guyana">Guyana</aui:option>
		<aui:option value="Haiti">Haiti</aui:option>
		<aui:option value="Honduras">Honduras</aui:option>
		<aui:option value="Hong Kong">Hong Kong</aui:option>
		<aui:option value="Hungary">Hungary</aui:option>
		<aui:option value="Iceland">Iceland</aui:option>
		<aui:option value="India">India</aui:option>
		<aui:option value="Indonesia">Indonesia</aui:option>
		<aui:option value="Iraq">Iraq</aui:option>
		<aui:option value="Ireland">Ireland</aui:option>
		<aui:option value="Isle of Man">Isle of Man</aui:option>
		<aui:option value="Israel">Israel</aui:option>
		<aui:option value="Italy">Italy</aui:option>
		<aui:option value="Jamaica">Jamaica</aui:option>
		<aui:option value="Japan">Japan</aui:option>
		<aui:option value="Jersey">Jersey</aui:option>
		<aui:option value="Jordan">Jordan</aui:option>
		<aui:option value="Kazakhstan">Kazakhstan</aui:option>
		<aui:option value="Kenya">Kenya</aui:option>
		<aui:option value="Kiribati">Kiribati</aui:option>
		<aui:option value="Kuwait">Kuwait</aui:option>
		<aui:option value="Latvia">Latvia</aui:option>
		<aui:option value="Lebanon">Lebanon</aui:option>
		<aui:option value="Lesotho">Lesotho</aui:option>
		<aui:option value="Liberia">Liberia</aui:option>
		<aui:option value="Liechtenstein">Liechtenstein</aui:option>
		<aui:option value="Lithuania">Lithuania</aui:option>
		<aui:option value="Luxembourg">Luxembourg</aui:option>
		<aui:option value="Macao">Macao</aui:option>
		<aui:option value="Madagascar">Madagascar</aui:option>
		<aui:option value="Malawi">Malawi</aui:option>
		<aui:option value="Malaysia">Malaysia</aui:option>
		<aui:option value="Maldives">Maldives</aui:option>
		<aui:option value="Mali">Mali</aui:option>
		<aui:option value="Malta">Malta</aui:option>
		<aui:option value="Marshall Islands">Marshall Islands</aui:option>
		<aui:option value="Martinique">Martinique</aui:option>
		<aui:option value="Mauritania">Mauritania</aui:option>
		<aui:option value="Mauritius">Mauritius</aui:option>
		<aui:option value="Mayotte">Mayotte</aui:option>
		<aui:option value="Mexico">Mexico</aui:option>
		<aui:option value="Monaco">Monaco</aui:option>
		<aui:option value="Mongolia">Mongolia</aui:option>
		<aui:option value="Montenegro">Montenegro</aui:option>
		<aui:option value="Montserrat">Montserrat</aui:option>
		<aui:option value="Morocco">Morocco</aui:option>
		<aui:option value="Mozambique">Mozambique</aui:option>
		<aui:option value="Myanmar">Myanmar</aui:option>
		<aui:option value="Namibia">Namibia</aui:option>
		<aui:option value="Nauru">Nauru</aui:option>
		<aui:option value="Nepal">Nepal</aui:option>
		<aui:option value="Netherlands">Netherlands</aui:option>
		<aui:option value="New Caledonia">New Caledonia</aui:option>
		<aui:option value="New Zealand">New Zealand</aui:option>
		<aui:option value="Nicaragua">Nicaragua</aui:option>
		<aui:option value="Niger">Niger</aui:option>
		<aui:option value="Nigeria">Nigeria</aui:option>
		<aui:option value="Niue">Niue</aui:option>
		<aui:option value="Norfolk Island">Norfolk Island</aui:option>
		<aui:option value="Norway">Norway</aui:option>
		<aui:option value="Oman">Oman</aui:option>
		<aui:option value="Pakistan">Pakistan</aui:option>
		<aui:option value="Palau">Palau</aui:option>
		<aui:option value="Panama">Panama</aui:option>
		<aui:option value="Paraguay">Paraguay</aui:option>
		<aui:option value="Peru">Peru</aui:option>
		<aui:option value="Philippines">Philippines</aui:option>
		<aui:option value="Pitcairn">Pitcairn</aui:option>
		<aui:option value="Poland">Poland</aui:option>
		<aui:option value="Portugal">Portugal</aui:option>
		<aui:option value="Puerto Rico">Puerto Rico</aui:option>
		<aui:option value="Qatar">Qatar</aui:option>
		<aui:option value="Reunion">Reunion</aui:option>
		<aui:option value="Romania">Romania</aui:option>
		<aui:option value="Russian Federation">Russian Federation</aui:option>
		<aui:option value="Rwanda">Rwanda</aui:option>
		<aui:option value="Saint Lucia">Saint Lucia</aui:option>
		<aui:option value="Samoa">Samoa</aui:option>
		<aui:option value="San Marino">San Marino</aui:option>
		<aui:option value="Saudi Arabia">Saudi Arabia</aui:option>
		<aui:option value="Senegal">Senegal</aui:option>
		<aui:option value="Serbia">Serbia</aui:option>
		<aui:option value="Seychelles">Seychelles</aui:option>
		<aui:option value="Sierra Leone">Sierra Leone</aui:option>
		<aui:option value="Singapore">Singapore</aui:option>
		<aui:option value="Slovakia">Slovakia</aui:option>
		<aui:option value="Slovenia">Slovenia</aui:option>
		<aui:option value="Solomon Islands">Solomon Islands</aui:option>
		<aui:option value="Somalia">Somalia</aui:option>
		<aui:option value="South Africa">South Africa</aui:option>
		<aui:option value="Spain">Spain</aui:option>
		<aui:option value="Sri Lanka">Sri Lanka</aui:option>
		<aui:option value="Sudan">Sudan</aui:option>
		<aui:option value="Suriname">Suriname</aui:option>
		<aui:option value="Swaziland">Swaziland</aui:option>
		<aui:option value="Sweden">Sweden</aui:option>
		<aui:option value="Tajikistan">Tajikistan</aui:option>
		<aui:option value="Thailand">Thailand</aui:option>
		<aui:option value="Timor-leste">Timor-leste</aui:option>
		<aui:option value="Togo">Togo</aui:option>
		<aui:option value="Tokelau">Tokelau</aui:option>
		<aui:option value="Tonga">Tonga</aui:option>
		<aui:option value="Tunisia">Tunisia</aui:option>
		<aui:option value="Turkey">Turkey</aui:option>
		<aui:option value="Turkmenistan">Turkmenistan</aui:option>
		<aui:option value="Tuvalu">Tuvalu</aui:option>
		<aui:option value="Uganda">Uganda</aui:option>
		<aui:option value="Ukraine">Ukraine</aui:option>
		<aui:option value="United Arab Emirates">United Arab Emirates</aui:option>
		<aui:option value="United Kingdom">United Kingdom</aui:option>
		<aui:option value="United States">United States</aui:option>
		<aui:option value="Uruguay">Uruguay</aui:option>
		<aui:option value="Uzbekistan">Uzbekistan</aui:option>
		<aui:option value="Vanuatu">Vanuatu</aui:option>
		<aui:option value="Venezuela">Venezuela</aui:option>
		<aui:option value="Viet Nam">Viet Nam</aui:option>
		<aui:option value="Virgin Islands, British">Virgin Islands, British</aui:option>
		<aui:option value="Wallis and Futuna">Wallis and Futuna</aui:option>
		<aui:option value="Western Sahara">Western Sahara</aui:option>
		<aui:option value="Yemen">Yemen</aui:option>
		<aui:option value="Zambia">Zambia</aui:option>
		<aui:option value="Zimbabwe">Zimbabwe</aui:option>
	</aui:select>
    
    <aui:input name="age" type="number" value="${appointment.age}"/>
    
     <%-- <aui:input name="speciality" type="text" value="${appointment.speciality}"/>  --%>
     
	<aui:select id="edit-speciality" name="speciality" type="text" value="${appointment.speciality}">
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
     
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>

