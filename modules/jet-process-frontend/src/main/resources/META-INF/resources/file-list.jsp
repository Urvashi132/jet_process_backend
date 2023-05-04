<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="fileCreation">
	<portlet:param name="mvcPath" value="/file-form.jsp"/>
</portlet:renderURL>


<div class="container">
	<div id="fileList">
	
	</div>
	
</div>

<script>
var form = {
		"id" : "fileForm",
		"title" : "File Creation",
		"subtitle" : "New File Creation",
		"namespace" : "",
		"enctype" : "multipart/form-data",
		"fields" : [
			{
				"type" : "text",
				"name" : "id",
				"label" : "File Id",
			},
			{
				"type" : "select",
				"name" : "type",
				"label" : "Type",
				"searchable" : true
			},
			{
				"type" : "text",
				"name" : "fileNo",
				"label" : "File No.",
				"searchable" : true
			},
			{
				"type" : "textarea",
				"name" : "subject",
				"label" : "Subject",
				"searchable" : false
			},{
				"type" : "textarea",
				"name" : "remarks",
				"label" : "Remarks",
				"searchable" : false
			},
			{
				"type" : "select",
				"name" : "categoryId",
				"label" : "Category",
				"required" : true,
				"provider" : {
					"url" : "http://localhost:8080/o/jet-process-rs/v1.0/category?p_auth="+ Liferay.authToken,
					"value" : "id",
					"label" : "name",
					"dataNode" : "items" 
					}
			}
		],
		"actions" : [ {
			"name" : "save",
			"type" : "submit",
			"label" : "Save",
			"applyTo" : "form",
			"handler" : {
				"type" : "javascript",
				"func" : "submitForm(event)",
				"method" : "post",
				"url" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth="+ Liferay.authToken
			},
			"cssClass" : "btn-primary"
		}, {
			"name" : "cancel",
			"type" : "button",
			"label" : "Cancel",
			"applyTo" : "form",
			"handler" : {
				"type" : "javascript",
				"func" : "cancelOnClick(event)"
			},
			"cssClass" : "btn-secondary"
		}, {
			"name" : "add",
			"type" : "button",
			"label" : "Create File",
			"applyTo" : "list",
			"cssClass" : "btn-danger"
		} ],
		"dataProvider" : {
			"collection" : {
				"url" : "http://localhost:8080/o/jet-process-rs/v1.0/docfiles?p_auth="+ Liferay.authToken
			},
			"selector" : {
				"url" : ""
			}
		}
	};
</script>
<liferay-util:include page="/list-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="listContainerId" value="fileList" />
	<liferay-util:param name="listId" value="userDataTable" />
	<liferay-util:param name="addPage" value="<%=fileCreation %>" />
</liferay-util:include>