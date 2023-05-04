var receiptList = {
	"id": "receiptList",
	"parentId": "receiptListContainer",
	"title": "New Receipt",
	"subtitle": "New Receipt",
	"namespace": "",
	"enctype": "multipart/form-data",
	"fields": [{
			"type": "group",
			"name": "nameGroup",
			"label": "name",
			"fields": [
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
	}
],
"actions": [
	{
		"name" : "save",
		"type" : "submit",
		"label" : "Save",
		"applyTo" : "form",
		"handler" : {
			"type" : "javascript",
			"func" : "submitForm(event)",
			"method" : "post",
			"url" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken
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
	},
	
	{
		"name": "add",
		"type": "button",
		"label": "Add",
		"applyTo": "list",
		"cssClass": "btn-danger",
		"handler": {
			"href": "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"
		}
	}
],
"dataProvider": {
	"collection": {
		"url": "http://localhost:8080/o/jet-process-rs/v1.0/Receipts?p_auth="+ Liferay.authToken,
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