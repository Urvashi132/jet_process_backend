var receiptForm = {
	"id": "receiptForm",
	"parentId": "receiptFormContainer",
	"title": "",
	"subtitle": "",
	"namespace": "",
	"enctype": "multipart/form-data",
	"fields": [{
			"type": "hidden",
			"name": "receiptId",
			"id": true,
			"required": true,
		},
		{
			"type": "group",
			"name": "nameGroup",
			"label": "name",
			"fields": [{
				"type": "text",
				"name": "date",
				"label": "CreatedOn",
				"tranzient": true
			}, {
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
			}, {
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
		},
		{
			"type": "group",
			"name": "credentials",
			"label": "name",
			
			"fields": [{
				"type" : "select",
				"name" : "deliveryModeId",
				"label" : "Delivery Mode",
					"listable": false,
					"searchable": false,
					"provider" : {
						"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/DeliveryMode?p_auth=" + Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items"
					}
				},
				{
					"type" : "date",
					"name" : "letterDate",
					"label" : "Letter Date"	,									
					"listable" : false,
					"searchable" : false
					
				},
				{
					"type" : "date",
					"name" : "receivedOn",
					"label" : "Received Date",
					
					"required" : false,
					"listable" : false,
					"searchable" : false
				}
			]
		}, 
		{
			"type": "group",
			"name": "dates",
			"label": "name",
			
			"fields": [
				{
					"type" : "text",
					"name" : "referenceNo",
					"label" : "Reference Number",
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "modeNo",
					"label" : "Mode Number",
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "select",
					"name" : "organization",
					"label" : "Organization",				
					"required" : true,
					"provider" : {
						"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Organization?p_auth=" + Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items"
					}
				}
				
				
			]
		},
		{
			"type": "group",
			"name": "middleGroup",
			"label": "name",
			
			"fields": [
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
					"listable" : true,
					"searchable" : false
				}
				
				
			]
		},
		{
			"type": "group",
			"name": "lowerGroup",
			"label": "name",
			
			"fields": [
				{
					"type" : "text",
					"name" : "email",
					"label" : "Email",
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "mobile",
					"label" : "Mobile",
					"listable" : true,
					"searchable" : false
				},
				
				{
					"type" : "select",
					"name" : "countryId",
					"label" : "Country",
					"tranzient": true,
					"listable" : false,
					"provider" : {
						"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Country?p_auth=" + Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items",
					},
					"events" : {
						"change" : [ {
							"receiver" : "stateId",
							"type" : "field",
							"trigger" : "refill"
						} ]
					}
				}
				
				
			]
		},
		{
			"type": "group",
			"name": "lowerGroup1",
			"label": "name",
			
			"fields": [
				{
					"type" : "select",
					"name" : "stateId",
					"label" : "State",
					"required" : true,
					"listable" : false,
					"provider" : {
						"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/State?p_auth=" + Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items",
						"queryParams" : [ {
							"name" : "countryId",
							"value" : "#countryId"
						}, {
							"name" : "deleted",
							"value" : "0"
						} ]
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
				}				
				
			]
		},
		{
			"type": "group",
			"name": "lowerGroup2",
			"label": "name",
			"fields": [
				{
					"type" : "select",
					"name" : "categoryId",
					"label" : "Category",
					"required" : true,
					"provider" : {
						"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/category?p_auth=" + Liferay.authToken,
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
					"name" : "remarks",
					"label" : "Remarks",
					"listable" : true,
					"searchable" : false
				},

				
				{
					"type" : "hidden",
					"name" : "attachStatus",
					"value" : "abc",
					"listable" : false
				},
				{
					"type" : "hidden",
					"name" : "currentState",
					"value" : 0,
					"listable" : false
				},
				{
					"type" : "hidden",
					"name" : "currentlyWith",
					"value" : 0,
					"listable" : false
				},
				{
					"type" : "hidden",
					"name" : "docfileId",
					"value" : 0,
					"listable" : false
				},
				{
					"type" : "hidden",
					"name" : "groupId",
					"value" : 20121,
					"listable" : false
				},
				
				{
					"type" : "hidden",
					"name" : "userPostId",
					"value" : 0,
					"listable" : false
				},
				{
					"type" : "hidden",
					"name" : "viewPdfUrl",
					"value" : 0,
					"listable" : false
				}
				
				]
		}
		
		
		],
				
		"actions": [{
			"name": "save",
			"type": "submit",
			"label": "Save",
			"applyTo": "form",
			"handler": {
				"script": "submitForm(event)",
			},
			"redirects": {
				"success": {"href":"http://localhost:8080/web/jetcrm/jetprocess?view=note"},
				"failure": {"script":"alert('Saving operation failed')"}
			},
			"cssClass": "btn-primary"
		}, {
			"name": "cancel",
			"type": "button",
			"label": "Cancel",
			"applyTo": "form",
			"cssClass": "btn-secondary",
			"redirects": {
				"success": {"href":"http://localhost:8080/web/jetcrm/jetprocess?view=receipt"},
			}
		},
		{
			"name": "add",
			"type": "button",
			"label": "Add",
			"applyTo": "list",
			"cssClass": "btn-danger",
			"handler": {
				"href": ""
			}
		},
		{
			"name": "edit",
			"type": "button",
			"label": "Edit",
			"applyTo": "row",
			"cssClass": "btn-primary",
			"handler": {
				"href": "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"
				
			}
		}
	],
	"providers": {
		"collection": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipts?p_auth="+ Liferay.authToken,
			//"method": "get",
			"dataNode": "data"
		},
		"selector": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken
		},
		"create": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "post",
			"pathParams":{},
			"queryParams":{},
			"requestParams":{}
		}, 
		"update": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "put"
		},
		"delete": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "delete"
		}
	}
};