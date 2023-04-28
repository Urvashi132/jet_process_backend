<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="fileForm">
	<portlet:param name="mvcPath" value="/file-form.jsp"/>
</portlet:renderURL>


<div class="container">
	<div id="fileList"></div>
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
					"type" : "select",
					"name" : "nature",
					"label" : "Nature",
					"options" : [ {
						"value" : "electronic",
						"label" : "Electronic",
						"selected" : "selected"
					}, {
						"value" : "physical",
						"label" : "Physical",
					}],
					"required" : true
				},
				{
					"type" : "select",
					"name" : "type",
					"label" : "Type",
					"options" : [ {
						"value" : "NON-SFS",
						"label" : "NON-SFS",
						"selected" : "selected"
					}, {
						"value" : "SFS",
						"label" : "SFS",
					}],
					"required" : true
				},
				{
					"type" : "select",
					"name" : "basicHead",
					"label" : "BasicHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "'http://localhost:8080/o/jet-process-rs/v1.0/BasicHead?p_auth='+ Liferay.authToken",
						"value" : "basicHeadId",
						"label" : "basicHeadValue"
					}
				},
				{
					"type" : "select",
					"name" : "primaryHead",
					"label" : "PrimaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "'http://localhost:8080/o/jet-process-rs/v1.0/primaryHead/?p_auth='+ Liferay.authToken",
						"value" : "primaryHeadId",
						"label" : "primaryHeadValue",
						"params" : [ {
							"name" : "basicHeadId",
							"value" : "#basicHead"
						}, {
							"name" : "deleted",
							"value" : "0"
						} ]
					}
				},
				{
					"type" : "select",
					"name" : "secondaryHead",
					"label" : "SecondaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "'http://localhost:8080/o/jet-process-rs/v1.0/SecondaryHead/?p_auth='+ Liferay.authToken",
						"value" : "secondaryHeadId",
						"label" : "secondaryHeadValue",
						"params" : [ {
							"name" : "primaryHeadId",
							"value" : "#primaryHead"
						}, {
							"name" : "deleted",
							"value" : "0"
						} ]
					}
				},
				{
					"type" : "select",
					"name" : "tertiaryHead",
					"label" : "TertiaryHead",
					"required" : true,
					"provider" : {
						"url" : "'http://localhost:8080/o/jet-process-rs/v1.0/TertiaryHead/?p_auth='+ Liferay.authToken",
						"value" : "tertiaryHeadId",
						"label" : "tertiaryHeadValue",
						"params" : [ {
							"name" : "secondaryHeadId",
							"value" : "#secondaryHead"
						}, {
							"name" : "deleted",
							"value" : "0"
						} ]
					},
					"listable" : false
				},				
				{
					"type" : "text",
					"name" : "year",
					"label" : "year",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},	
				{
					"type" : "text",
					"name" : "subject",
					"label" : "Subject",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "category",
					"label" : "Category",
					"required" : true,
					"provider" : {
						"url" : "'http://localhost:8080/o/jet-process-rs/v1.0/Category?p_auth='+ Liferay.authToken",
						"value" : "categoryId",
						"label" : "categoryValue"
					}
				},
				{
					"type" : "text",
					"name" : "remarks",
					"label" : "Remarks",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "reference",
					"label" : "Reference",
					"required" : false,
					"listable" : false,
					"searchable" : false
				}],
		"actions" : [ {
			"name" : "save",
			"type" : "submit",
			"label" : "Save",
			"applyTo" : "form",
			"handler" : {
				"type" : "javascript",
				"func" : "submitForm(event)",
				"method" : "post",
				"url" : "http://localhost:8082/api/v1/user"
			},
			"cssClass" : "btn-primary"
		}, {
			"name" : "cancel",
			"type" : "button",
			"label" : "Cancel",
			"applyTo" : "form",
			"handler" : {
				"type" : "javascript",
				"func" : "alert('ok');"
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
				"url" : ""
			},
			"selector" : {
				"url" : ""
			}
		}
	};
</script>

<liferay-ut il:include page="/list-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="listContainerId" value="fileList" />
	<liferay-util:param name="listId" value="userDataTable" />
	<liferay-util:param name="addPage" value="<%=fileForm %>" />
</liferay-util:include>