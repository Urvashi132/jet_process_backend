<%@ include file="init.jsp"%>
<%
	long folderId = (long) request.getAttribute("addFolderId");
%>


<portlet:actionURL name="addDashboard" var="dashboardURL" />
<aui:container cssClass="border">
	<h3>Add Widgets</h3>
	<aui:form action="<%=dashboardURL%>" method="post" name="fm">
		<aui:select name="portletName" required="true">
			<aui:option value="">Select</aui:option>
			<aui:option value="com_adjecti_ActiveProjectsPortlet">Active Projects</aui:option>
			<aui:option value="com_adjecti_BestSellingProductsPortlet">Best Selling Products</aui:option>
			<aui:option value="com_adjecti_MyToDoItemsPortlet">My TODO Items</aui:option>
			<aui:option value="com_adjecti_ProjectsOverviewPortlet">Projects Overview</aui:option>
		</aui:select>
		<aui:input name="uploadFile" type="file" onChange="upload()" required="true"></aui:input>
		<aui:input name="thumbnail" type="hidden"></aui:input>
		<aui:button-row cssClass="mb-2">
			<aui:button type="submit"></aui:button>
		</aui:button-row>
	</aui:form>
</aui:container>


<aui:script>
	<!-- for upload icon -->
function upload(){
    var file= $('#<portlet:namespace />uploadFile')[0].files[0];
   	let formData = new FormData(); 
  	formData.append("file", file);
	$.ajax({
		 type : "POST",
		 url : "${portalURL}/o/headless-delivery/v1.0/document-folders/" + <%=folderId%> + "/documents?p_auth=" + Liferay.authToken,
		 data : formData,
		 cache : false,
		 processData : false,
	     contentType : false,		   
	}).done(function(response) {
			console.log(response);
			$('#error').remove();
			$('#<portlet:namespace />thumbnail').val(response.id);
	}).fail(function(e) {
		console.log("error --- "+e);
		$('#taken_file_name').remove();
      	$('#error').append('<p class="text-success" id="taken_file_name">This file name is already taken</p>');
	}); 
}

</aui:script>