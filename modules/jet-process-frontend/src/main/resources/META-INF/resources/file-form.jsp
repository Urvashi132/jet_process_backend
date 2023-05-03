<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/file-list.jsp" />
</portlet:renderURL>

<div class="container border">
	<div id="fileFormContainer"></div>
</div>

<script>
var form = {
		"id" : "fileForm",
		"title" : "File Creation",
		"subtitle" : "New File Creation",
		"namespace" : "",
		"enctype" : "multipart/form-data",
		"fields" : [{
			"type": "group",
			"name": "fileGroup1",
			"label": "name",
			"cols": 2,
			"fields": [{
				"type" : "select",
				"name" : "nature",
				"label" : "Nature",
				"options" : [{
					"value" : "electronic",
					"label" : "Electronic",
					"selected" : "selected"
				},
				{
					"value" : "physical",
					"label" : "Physical",
				}],
				"required" : true
			},
			{
				"type" : "select",
				"name" : "type",
				"label" : "Type",
				"options" : [{
					"value" : "NON-SFS",
					"label" : "NON-SFS",
					"selected" : "selected"
				},
				{
					"value" : "SFS",
					"label" : "SFS",
				}],
				"required" : true,
				"events":{
					"change":[{"receiver":"setFileDocIdFieldForSFS", "type":"javascript"}]
				}
			}]
			},
				{
				"type": "group",
				"name": "fileGroup2",
				"label": "name",
				"cols": 6,
				"fields": [{
					"type" : "select",
					"name" : "basicHeadId",
					"label" : "BasicHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/basichead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
						},
					"events":{
						"change":[{"receiver":"primaryHeadId", "type":"field", "trigger":"refill"}]
					}
				},
				{
					"type" : "select",
					"name" : "primaryHeadId",
					"label" : "PrimaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/primaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items",
						"params" : [{
							"name" : "basicHeadId",
							"value" : "#basicHeadId"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
						},
					"events":{
						"change":[{"receiver":"secondaryHeadId", "type":"field", "trigger":"refill"}]
					}
				},
				{
					"type" : "select",
					"name" : "secondaryHeadId",
					"label" : "SecondaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/secondaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items", 
						"params" : [{
							"name" : "primaryHeadId",
							"value" : "#primaryHeadId"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
					},
					"events":{
						"change":[{"receiver":"tertiaryHeadId", "type":"field", "trigger":"refill"}]
					}
				}, 
				{
					"type" : "select",
					"name" : "tertiaryHeadId",
					"label" : "TertiaryHead",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/tertiaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items", 
						"params" : [ {
							"name" : "secondaryHeadId",
							"value" : "#secondaryHeadId"
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
					"label" : "Year",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "fileCodeId",
					"label" : "File Code",
					"options" : [{
						"value" : "1",
						"label" : "A",
						"selected" : "selected"
						},{
						"value" : "2",
						"label" : "B",
						}],
					"required" : true
				}]
			},
			{
				"type" : "text",
				"name" : "docFileId",
				"label" : "FileId",
				"value" : 0,
				"required" : true,
				"listable" : false,
			},
			{
				"type": "group",
				"name": "fileGroup3",
				"label": "name",
				"cols": 2,
				"fields": [
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
					},
					{
					"type" : "text",
					"name" : "reference",
					"label" : "Reference",
					"required" : false,
					"listable" : false,
					"searchable" : false
				}]
			},{
				"type": "group",
				"name": "fileGroup4",
				"label": "name",
				"cols": 2,
				"fields": [{
					"type" : "textarea",
					"name" : "subject",
					"label" : "Subject",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},{
					"type" : "textarea",
					"name" : "remarks",
					"label" : "Remarks",
					"required" : true,
					"listable" : true,
					"searchable" : false
				}]
			},{
				"type" : "hidden",
				"name" : "groupId",
				"value" : 20121,
				"listable" : false,
			},
			{
				"type" : "hidden",
				"name" : "userPostId",
				"value" : 0,
				"listable" : false,
			},
			{
				"type" : "hidden",
				"name" : "fileNo",
				"value" : "",
				"listable" : false,
			},
			{
				"type" : "hidden",
				"name" : "currentState",
				"value" : 1,
				"listable" : false,
			},{
				"type" : "hidden",
				"name" : "currentUser",
				"value" : 0,
				"listable" : false,
			},
			{
				"type" : "hidden",
				"name" : "dealingOrganizationId",
				"value" : 0,
				"listable" : false,
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


<liferay-util:include page="/form-template.jsp"	servletContext="<%=application%>">
	<liferay-util:param name="formContainerId" value="fileFormContainer" />
	<liferay-util:param name="formId" value="fileForm" />
	<liferay-util:param name="cancelPage" value="<%=list%>" />
	<liferay-util:param name="successPage" value="<%=list%>" />
</liferay-util:include>

<script>
$(document).ready(() => {
	$('#docFileId').closest("div").hide();
	$('#groupId').val(Liferay.ThemeDisplay.getScopeGroupId());
	$('#year').val(new Date().getFullYear());
});
function setFileDocIdFieldForSFS(){
	var type = $('#type').val();
	if(type == "SFS"){
		$('#docFileId').closest("div").show();
		$('#docFileId').val("");
		$('#fileGroup2').css("display","none");
	}else{
		$('#fileGroup2').css("display","");
		$('#docFileId').val(0);
		$('#docFileId').closest("div").hide();
	}
 }
</script>