<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="receiptForm">
	<portlet:param name="mvcPath" value="/receipt-form.jsp"/>
</portlet:renderURL>


<div class="container">
	<div id="createdReceiptList"></div>
</div>

<script>

var form = {
		"id": "receiptList",
		"title" : "Receipt List",
		"namespace" : "",
		"enctype": "multipart/form-data",
		"fields": [

		       {
					"type": "text",
					"name": "id",
					"label": "Id",
					"required": true
	     		},
			       {
						"type": "text",
						"name": "name",
						"label": "Category",
						"required": true
		     		}
/* 			    	{
						"type": "text",
						"name": "receiptNo",
						"label": "Receipt No",
						"required": true
			    	},
		     		{
						"type": "text",
						"name": "subject",
						"label": "Subject",
						"required": true
		     		},
		     		{
						"type": "text",
						"name": "category",
						"label": "Category",
						"required": true
		     		},
		     		{
						"type": "text",
						"name": "createdOn",
						"label": "CreatedOn",
						"required": true
		     		},
		     		{
						"type": "text",
						"name": "remarks",
						"label": "Remarks",
						"required": true
		     		}
		     		 */
		     		],
		"actions": 	[ {
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
					},  
					
					 {
						"name": "delete",
						"type": "link",
						"label": "Delete",
						"applyTo": "row",
						"handler": {
							"type": "javascript",
							"func": "submitForm(event)",
							"method": "post",
							"url": ""
						},
						"cssClass": ""
					}, 
					 
					{
						"name": "cancel",
						"type": "button",
						"label": "Cancel",
						"applyTo": "form",
						"cssClass": "btn-secondary"
					}, 
					 {
						"name": "add",
						"type": "button",
						"label": "New PO",
						"applyTo": "list",
						"cssClass": "btn-primary"
					} 
						],
		"dataProvider":{
			"collection":{"url":"http://localhost:8080/o/jet-process-rs/v1.0/Category?p_auth="+ Liferay.authToken },
			"selector":{"url":""}
					}
			
};

</script>

<liferay-util:include page="/list-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="listContainerId" value="createdReceiptList" />
	<liferay-util:param name="listId" value="receiptList" />
	<liferay-util:param name="addPage" value="<%=receiptForm %>" />
</liferay-util:include>