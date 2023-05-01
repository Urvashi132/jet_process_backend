<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/file-list.jsp" />
</portlet:renderURL>

<div class="container border">
	<div id="userFormContainer"></div>
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
						},{
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
						},{
						"value" : "SFS",
						"label" : "SFS",
						}],
					"required" : true
				}]
			},{
				"type": "group",
				"name": "fileGroup2",
				"label": "name",
				"cols": 6,
				"fields": [{
					"type" : "select",
					"name" : "basicHead",
					"label" : "BasicHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/BasicHead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
						}
				},
				{
					"type" : "select",
					"name" : "primaryHead",
					"label" : "PrimaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/primaryHead/?p_auth="+ Liferay.authToken,
						"value" : "primaryHeadId",
						"label" : "primaryHeadValue",
						"dataNode" : "items",
						"params" : [{
							"name" : "basicHeadId",
							"value" : "#basicHead"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
						}
				},
				{
					"type" : "select",
					"name" : "secondaryHead",
					"label" : "SecondaryHead",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/SecondaryHead/?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items", 
						"params" : [{
							"name" : "primaryHeadId",
							"value" : "#primaryHead"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
					}
				},
				{
					"type" : "select",
					"name" : "tertiaryHead",
					"label" : "TertiaryHead",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/TertiaryHead/?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "value",
						"dataNode" : "items", 
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
					"label" : "Year",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "fileCode",
					"label" : "File Code",
					"options" : [{
						"value" : "A",
						"label" : "A",
						"selected" : "selected"
						},{
						"value" : "B",
						"label" : "B",
						}],
					"required" : true
				}]
			},
			{
				"type": "group",
				"name": "fileGroup3",
				"label": "name",
				"cols": 2,
				"fields": [{
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
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/Category?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				}]
			}
			,{
				"type": "group",
				"name": "fileGroup4",
				"label": "name",
				"cols": 2,
				"fields": [{
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
				}]
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


<liferay-util:include page="/form-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="formContainerId" value="userFormContainer" />
	<liferay-util:param name="formId" value="userForm" />
	<liferay-util:param name="cancelPage" value="<%=list%>" />
	<liferay-util:param name="successPage" value="<%=list%>" />
</liferay-util:include>

<script>
/* $(document).ready(() => {
	form.fields.forEach(field => {
			if(field.provider){
				$.each(field.provider.params, function(key, val) {
					if(key == 0){
						$.each(val, function(key, value) {
							$(value).on('change', function(){
								var selectedValue = $(value).val(); 
								var arr = field.provider.url.split('?');
								var newURL = arr[0]+ selectedValue +'?' + arr[1];
								field.provider.url =newURL;
								fillOptions();
							});
						});
					}
				});
			}
		
	});
});  */
</script>