<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addPatientRenderURL">
    <portlet:param name="mvcPath" value="/add-patient.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addPatientRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Patient
    </a>
</div>

