
<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<portlet:renderURL var="addEnquiryRenderURL">
    <portlet:param name="mvcPath" value="/add-enquiry.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addEnquiryRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Enquiry
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Name</th>
        <th>Mobile No</th>
        <th>Concern</th>
       <th colspan="2" style="width: 100px">Action</th>
    </tr>
    <c:forEach items="${enquiryList}" var="enquiry">  
    
        <portlet:renderURL var="updateEnquiryRenderURL">
            <portlet:param name="mvcPath" value="/update-enquiry.jsp"/>
            <portlet:param name="name" value="${enquiry.name}"/>
            <portlet:param name="mobileNo" value="${enquiry.mobileNo}"/>
            <portlet:param name="concern" value="${enquiry.concern}"/>
            <portlet:param name="enquiryId" value="${enquiry.enquiryId}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteEnquiry" var="deleteEnquiryActionURL">
            <portlet:param name="enquiryId" value="${enquiry.getEnquiryId()}"/>
        </portlet:actionURL>
                
        <tr> 
            <td>${enquiry.getName()}</td>
            <td>${enquiry.getMobileNo()}</td>
            <td>${enquiry.getConcern()}</td>
            
            <td class="text-center" style="width: 50px">
                <a href="<%=updateEnquiryRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
                <i class ="glyphicon glyphicon-edit">UPDATE</i>
                </a>
            </td> 
            <td class="text-center" style="width:50px">
                <a href="<%=deleteEnquiryActionURL%>" 
                    class="btn  btn-primary btn-default btn-sm px-2 py-1"
                    onclick="return confirm('Are you sure you want to delete this item?');"> 
                    <i class ="glyphicon glyphicon-remove">DELETE</i>
                </a>
            </td>                                     
         </tr>
    </c:forEach>
</table>
