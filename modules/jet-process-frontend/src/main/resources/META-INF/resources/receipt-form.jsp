<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/receipt-list.jsp" />
</portlet:renderURL>

<div class="container border">
	<div id="userFormContainer"></div>
</div>

<h1 align="center">This is Receipt Page</h1>




<script>
var form ={
		"id" : "receiptForm",
		"title" : "",
		"subtitle" : "New Receipt Creation",
		"namespace" : "",
		"enctype" : "multipart/form-data",
		"fields" : [{
				"type": "group",
				"name": "fileGroup1",
				"label": "name",
				"cols": 2,
				"fields": [
					{
						"type" : "date",
						"name" : "date",
						"label" : "CreatedOn",
						"required" : false,
						"listable" : false,
						"searchable" : false
					},
					{
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
				},
				{
					"type" : "select",
					"name" : "deliveryMode",
					"label" : "Delivery Mode",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/DeliveryMode?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				},
				{
					"type" : "date",
					"name" : "date",
					"label" : "Letter Date",
					"required" : false,
					"listable" : false,
					"searchable" : false
				},
				{
					"type" : "date",
					"name" : "date",
					"label" : "Received Date",
					"required" : false,
					"listable" : false,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "refernceNo",
					"label" : "Reference Number",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "modeNo",
					"label" : "Mode Number",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "organization",
					"label" : "Organization",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/Organization?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				},
				{
					"type" : "text",
					"name" : "name",
					"label" : "Name",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "designation",
					"label" : "Designation",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "address",
					"label" : "Address",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "country",
					"label" : "Country",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/Country?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				},
				{
					"type" : "select",
					"name" : "state",
					"label" : "State",
					"required" : true,
					"provider" : {
						"url" : "?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				},
				{
					"type" : "text",
					"name" : "city",
					"label" : "City/District",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "pincode",
					"label" : "Pin Code",
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
					"type" : "text",
					"name" : "remark",
					"label" : "Remarks",
					"required" : true,
					"listable" : true,
					"searchable" : false
				}
				
				
				]				
				
		}],
		"actions": [{
			"name": "save",
			"type": "submit",
			"label": "Save",
			"applyTo": "form",
			"handler": {
				"type": "javascript",
				"func": "submitForm(event)",
				"method": "post",
				"url": ""
			},
			"cssClass": "btn-primary"
		}, {
			"name": "cancel",
			"type": "button",
			"label": "Cancel",
			"applyTo": "form",
			"cssClass": "btn-secondary"
		},
		{
			"name": "add",
			"type": "button",
			"label": "Add Candidate",
			"applyTo": "list",
			"cssClass": "btn-danger"
		}
	],
	"dataProvider":{
		"collection":{"url":""},
		"selector":{"url":""}
	}
			
	}; 
	
	</script>





<liferay-util:include page="/form-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="formContainerId" value="userFormContainer" />
	<liferay-util:param name="formId" value="selectionphase" />
	<liferay-util:param name="cancelPage" value="<%=list%>" />
	<liferay-util:param name="successPage" value="<%=list%>" />
</liferay-util:include>