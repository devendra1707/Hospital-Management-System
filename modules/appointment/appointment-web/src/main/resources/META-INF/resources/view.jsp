<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addAppointmentRenderURL">
    <portlet:param name="mvcPath" value="/add-appointment1.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addAppointmentRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Appointment
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Full Name</th>
        <th>Contact No</th>
        <th>Email Id</th>
        <th>Country</th>
        <th>Age</th>
        <th>Speciality</th>
        <th colspan="2" style="width: 100px">Action</th>
    </tr>
    <c:forEach items="${appointmentList}" var="appointment">  
    
        <portlet:renderURL var="updateAppointmentRenderURL">
            <portlet:param name="mvcPath" value="/update-appointment.jsp"/>
            <portlet:param name="name" value="${appointment.name}"/>
            <portlet:param name="mobile" value="${appointment.mobile}"/>
            <portlet:param name="email" value="${appointment.email}"/>
            <portlet:param name="country" value="${appointment.country}"/>
            <portlet:param name="age" value="${appointment.age}"/>
            <portlet:param name="speciality" value="${appointment.speciality}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteAppointment" var="deleteAppointmentActionURL">
            <portlet:param name="appointmentId" value="${appointment.getAppointmentId()}"/>
        </portlet:actionURL>
                
        <tr> 
            <td>${appointment.getName()}</td>
            <td>${appointment.getMobile()}</td>
            <td>${appointment.getEmail()}</td>
            <td>${appointment.getCountry()}</td>
            <td>${appointment.getAge()}</td>
            <td>${appointment.getSpeciality()}</td>
            <td class="text-center" style="width: 50px">
                <a href="<%=updateAppointmentRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
                <i class ="glyphicon glyphicon-edit"></i>
                </a>
            </td> 
            <td class="text-center" style="width:50px">
                <a href="<%=deleteAppointmentActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-2 py-1"
                    onclick="return confirm('Are you sure you want to delete this item?');"> 
                    <i class ="glyphicon glyphicon-remove"></i>
                </a>
            </td>                                     
         </tr>
    </c:forEach>
</table>
