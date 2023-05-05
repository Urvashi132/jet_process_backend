var receiptList = {
	"id": "receiptList",
	"parentId": "receiptListContainer",
	"title": "New Receipt",
	"subtitle": "New Receipt",
	"namespace": "",
	"enctype": "multipart/form-data",
	"fields": [
				{
				"type" : "text",
				"name" : "type",
				"label" : "Type",
				"required" : true,
				"listable" : true,
				"searchable" : false
			},
			{
				"type" : "text",
				"name" : "receiptNo",
				"label" : "Receipt No",
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
				"type" : "text",
				"name" : "category",
				"label" : "Category",
				"required" : true,
				"listable" : true,
				"searchable" : false
			},
			{
				"type" : "text",
				"name" : "createdOn",
				"label" : "CreatedOn",
				"required" : true,
				"listable" : true,
				"searchable" : false
			}
			,
			{
				"type" : "text",
				"name" : "remarks",
				"label" : "Remarks",
				"required" : true,
				"listable" : true,
				"searchable" : false
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
			"url" : ""
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
		"label": "Add Receipt",
		"applyTo": "list",
		"cssClass": "btn-danger",
		"handler": {
			"href": "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"
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