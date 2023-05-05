var receiptForm = {
	"id": "receiptForm",
	"parentId": "receiptFormContainer",
	"title": "New Receipt",
	"subtitle": "New Receipt",
	"namespace": "",
	"enctype": "multipart/form-data",
	"fields": [{
			"type": "group",
			"name": "nameGroup",
			"label": "name",
			"fields": [{
				"type": "text",
				"name": "date",
				"label": "CreatedOn",
				"required": true,
				"placeHolder": "First Name",
				"tranzient": true,
				"validations": {
					"rules": {
						"minlength": 5
					},
					"messages": {
						"minlength": " Your username must consist of at least 2 characters"
					}
				}
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
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/DeliveryMode?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
					}
				},
				{
					"type" : "date",
					"name" : "letterDate",
					"label" : "Letter Date",
					
					"required" : false,
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
					
					"required" : true,
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
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				{
					"type" : "text",
					"name" : "mobile",
					"label" : "Mobile",
					"required" : true,
					"listable" : true,
					"searchable" : false
				},
				
				{
					"type" : "select",
					"name" : "countryId",
					"label" : "Country",
					"required" : true,
					"listable" : false,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/Country?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
						},
					"events":{

						"change":[{"receiver":"stateId", "type":"field", "trigger":"refill"}]
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
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/State?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items",
						"params" : [{
							"name" : "countryId",
							"value" : "#countryId"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
						},
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
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/category?p_auth="+ Liferay.authToken,
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
		}

		

		
		
	],
	"actions": [{
			"name": "save",
			"type": "submit",
			"label": "Save",
			"applyTo": "form",
			"handler": {
				"type": "javascript",
				"func": "submitForm(event)",
				"method": "post",
				"url": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken
			},
			"redirects": {
				"success": {"href":"https://www.google.com"},
				"failure": {"href":"https://www.yahoo.com"}
			},
			"cssClass": "btn-primary"
		}, {
			"name": "cancel",
			"type": "button",
			"label": "Cancel",
			"applyTo": "form",
			"cssClass": "btn-secondary",
			"redirects": {
				"success": {"href":""},
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
		}
	],
	"dataProvider": {
		"collection": {
			"url": "",
			"method": "get",
			"dataNode": "items"
		},
		"selector": {
			"url": ""
		},
		"create": {
			"url": "",
			"method": "post"
		},
		"update": {
			"url": "",
			"method": "post"
		},
		"delete": {
			"url": "",
			"method": "post"
		}
	}
};