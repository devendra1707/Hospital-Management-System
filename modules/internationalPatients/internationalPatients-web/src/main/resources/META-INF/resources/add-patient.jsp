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

.maindiv {
	border-radius: 10px;
    background: #EDF6FB;
    padding: 30px 20px;
}
</style>

<body>
	<portlet:defineObjects />

	<portlet:actionURL name="addInternational" var="addPatientActionURL" />

	<center>

		<aui:form name="fm" action="<%=addPatientActionURL%>" method="POST">
			<div class="maindiv">

				<br>
				<h2>Please Fill Your Details</h2>
				<br>
				<aui:col>
					<aui:col>
						<aui:input label="" name="name" type="text" placeholder="Name" />
					</aui:col>
					<aui:col>
						<aui:input label="" name="email" type="email"
							placeholder="Email Id" />
					</aui:col>

					<aui:col>
						<aui:input label="" name="country" type="text"
							placeholder="Country" />
					</aui:col>
					<aui:col>
						<aui:input label="" name="mobile" type="number"
							placeholder="Mobile No" />
					</aui:col>

					<aui:input label="" name="query" type="textarea"
						placeholder="Please Type Your Query" style="width:96%;" />
				</aui:col>

				<div>
					<h4 class="mq">
						Math question 5 + 4 = <input id="te" type="number" />
					</h4>

					<h4 class="mq">Solve this simple math problem and enter the
						result. E.g. for 1+3, enter 4.</h4>
				</div>
				<br>

				<aui:button name="submitButton" type="submit" value="Submit"
					style="width:95%;">
				</aui:button>

			</div>

		</aui:form>

	</center>
</body>
</html>