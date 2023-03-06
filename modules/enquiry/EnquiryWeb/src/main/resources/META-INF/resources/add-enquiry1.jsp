
<%@ include file="init.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<style type="text/css">

.subdiv {
	background-color: #172A38;
	padding-top: 30px;
	padding-left: 20px;
	padding-right: 20px;
	padding-bottom: 30px;
}

.maindiv {
	margin-left: 5%;
	margin-right: 5%;
	height: 100%;
	width: 90%;
}

.mq {
	color: white;
	text-align: center;
}

#te {
	height: 35px;
	width: 40px;
}
</style>

<body>

	<portlet:defineObjects />

	<portlet:actionURL name="addEnquiry" var="addEnquiryActionURL" />
	<div class="maindiv">
		<br>
		<center>
			<strong><h2 style="font-size: 35px;">For Quick Enquiry</h2></strong>
		</center>
		<br>

		<aui:form action="<%=addEnquiryActionURL%>" name="enquiryForm"
			method="POST">
			
				<div class="subdiv">

					<%-- <aui:input name="name" placeholder="Name" type="text">
     			<aui:validator name="required"/>
         		<aui:validator name="string"/>
    </aui:input>
     
     &nbsp;&nbsp; 
     <aui:input name="mobileNo" placeholder="Mobile No."  type="number" >
     			<aui:validator name="required"/>
         		<aui:validator name="digits"/>
    </aui:input>
    
      &nbsp;&nbsp;
     <aui:input name="concern" placeholder="Concern" type="text">
     			<aui:validator name="required"/>
       		    <aui:validator name="string"/>
    </aui:input>  --%>


					<aui:row>
						<aui:col width="32">
							<aui:input label="" name="name" type="text"
								placeholder="Full Name" />
						</aui:col>
						<aui:col width="32">
							<aui:input label="" name="mobileNo" type="email"
								placeholder="Email Id" />
						</aui:col>
						<aui:col width="32">
							<aui:input label="" name="concern" type="text"
								placeholder="Concern" />
						</aui:col>
					</aui:row>
					<div>
						<h4 class="mq">
							Math question 9 + 0 = <input id="te" type="number" />
						</h4>

						<h4 class="mq">Solve this simple math problem and enter the
							result. E.g. for 1+3, enter 4.</h4>
					</div>
					<br> <br>

					<center>
						<aui:button type="submit"
							style="background-color: #019A50;color: #fff;font-size: 14px;font-weight: 400;padding: 10px 30px;text-decoration: none;border: 0;max-width: 150px;"
							name="" value="Submit"></aui:button>
					</center>

				</div>
			
		</aui:form>
	</div>
</body>
</html>