<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:actionURL name="addEnquiry" var="addEnquiryActionURL"/>
            
                
<h2>Add Enquiry Form here !</h2>
 
<aui:form action="<%=addEnquiryActionURL %>" name="enquiryForm" method="POST">
    <aui:input name="name" >
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>
 
    <aui:input name="mobileNo" >
         <aui:validator name="required"/>
         <aui:validator name="digits"/>
    </aui:input>
  
    <aui:input name="concern">
         <aui:validator name="required"/>
         <aui:validator name="string"/>
    </aui:input>  
 
    <aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>