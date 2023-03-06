<%@ include file="init.jsp" %>

<liferay-theme:defineObjects/>

<portlet:renderURL var="addSecondOpinionRenderURL">
<portlet:param name="mvcPath" value="/add-secondopinion.jsp"/>
</portlet:renderURL>

<center><div class="mb-5">
<strong><h2 style="font-size: 35px;">Get Second Opinion</h2></strong>
<a href="<%=addSecondOpinionRenderURL %>" class="btn  btn-primary btn-default">
<i class="glyphicon glyphicon-plus"></i>Second Opinion
</a>
</div>
</center>
<table class="table table-striped">
	<tr>
		<th>Full Name</th>
		<th>Email Id</th>
		<th>Mobile No</th>
		<th>Specialty</th>
		<th>Remark</th>
		
		<th colspan="2" style="width: 100px">Action</th>
	</tr>
	
	<c:forEach items="${secondOpinionList}" var="secondOpinion">

		<portlet:renderURL var="updateSecondOpinionRenderURL">
			<portlet:param name="mvcPath" value="/update-secondopinion.jsp" />
			<portlet:param name="name" value="${secondOpinion.name}" />
			<portlet:param name="mobile" value="${secondOpinion.mobile}" />
			<portlet:param name="email" value="${secondOpinion.email}" />
			<portlet:param name="specialty" value="${secondOpinion.specialty}" />
			<portlet:param name="remark" value="${secondOpinion.remark}" />
			<portlet:param name="id" value="${secondOpinion.id}" />
		</portlet:renderURL>

		<portlet:actionURL name="deleteSecondOpinion"
			var="deleteSecondOpinionActionURL">
			<portlet:param name="id"
				value="${secondOpinion.getId()}" />
		</portlet:actionURL>

		<tr>
			<td>${secondOpinion.getName()}</td>
			<td>${secondOpinion.getEmail()}</td>
			<td>${secondOpinion.getMobile()}</td>
			<td>${secondOpinion.getSpecialty()}</td>
			<td>${secondOpinion.getRemark()}</td>
			<td class="text-center" style="width: 50px"><a
				href="<%=updateSecondOpinionRenderURL%>"
				class="btn  btn-primary btn-default btn-sm px-2 py-1"> <i
					class="glyphicon glyphicon-edit">UPDATE</i>
			</a></td>
			<td class="text-center" style="width: 50px"><a
				href="<%=deleteSecondOpinionActionURL%>"
				class="btn  btn-primary btn-default btn-sm px-2 py-1"
				onclick="return confirm('Are you sure you want to delete this item?');">
					<i class="glyphicon glyphicon-remove">DELETE</i>
			</a></td>
		</tr>
	</c:forEach>
</table>