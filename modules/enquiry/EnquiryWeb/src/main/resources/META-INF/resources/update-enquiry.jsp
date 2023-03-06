<%@ include file="init.jsp"%>
<portlet:defineObjects/>
 
<portlet:actionURL name="updateEnquiry" var="updateEnquiryActionURL"/>
 
<aui:form action="<%=updateEnquiryActionURL%>" name="enquiryForm" method="POST"/>
 
<%
    String enquiryId = renderRequest.getParameter("enquiryId");
    String name = renderRequest.getParameter("name");
    String mobileNo = renderRequest.getParameter("mobileNo");
    String concern = renderRequest.getParameter("concern");
%>
<aui:form action="<%= updateEnquiryActionURL %>" method="post" >
    <aui:input name="enquiryId" type="hidden" value="<%=Long.parseLong(enquiryId)%>"/>
    <aui:input name="name" type="text" value="${enquiry.name}"/>
    <aui:input name="mobileNo" type="number" value="${enquiry.mobileNo}"/>
    <aui:input name="concern" type="text" value="${enquiry.concern}" />
    
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>