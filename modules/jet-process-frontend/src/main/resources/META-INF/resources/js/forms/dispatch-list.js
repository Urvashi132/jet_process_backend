var dispatchList = {
	"id": "dispatchList",
	"parentId": "dispatchListContainer",
	"title": "",
	"subtitle": "",
	"namespace": "",
	"enctype": "multipart/form-data",
	"fields": [{
			"type": "hidden",
			"name": "id",
			"id": true,
			"required": true,
		},
		{
			"type" : "text",
			"name" : "",
			"label" : "ReceiptType"
		},
		{
			"type" : "text",
			"name" : "",
			"label" : "Dispatch No"
		},
		{
			"type" : "text",
			"name" : "",
			"label" : "Address"
		},
		{
			"type" : "text",
			"name" : "",
			"label" : "Send Through"
		},
		{
			"type" : "text",
			"name" : "",
			"label" : "Status"
		}
			
		],
		"actions": [
		{
			"name": "add",
			"type": "button",
			"label": "Add Receipt",
			"applyTo": "list",
			"cssClass": "btn-primary",
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
				"href": ""
			}
		},
		{
			"name": "delete",
			"type": "button",
			"label": "Delete",
			"applyTo": "row",
			"cssClass": "btn-danger",
			/*"handler": {
				"script": "delete(event)"
			}*/
		}, 
		{
			"name" : "dispatch",
			"type" : "button",
			"label" : "Dispatch",
			"applyTo" : "row",
			"cssClass" : "btn-primary",
			"handler" : {
				"href" : ""
			}
		}
	],
	"providers": {
		"collection": {
			"ajax": "https://dummy.restapiexample.com/api/v1/employees"+ Liferay.authToken,
			//"method": "get"
			"dataNode":"items"
		},
		"selector": {
			"ajax": ""+ Liferay.authToken,
			"method": "get",
			//"dataNode":"data",
			//"pathParams":{"id":"#id"},
			"queryParams":{"id":"#id"}
		},
		"create": {
			"ajax": "",
			"method": "post",
			"pathParams":{},
			"queryParams":{},
			"requestParams":{}
		},
		"update": {
			"ajax": ""+ Liferay.authToken,
			"method": "put"
		},
		"delete": {
			"ajax": ""+ Liferay.authToken,
			"method": "delete",
			"queryParams":{"id":"#id"}
		}
	}
};