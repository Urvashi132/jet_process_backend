var receiptList = {
	"id": "receiptList",
	"parentId": "receiptListContainer",
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
			"name" : "type",
			"label" : "Type"
		},
		{
			"type" : "text",
			"name" : "receiptNo",
			"label" : "Receipt No"
		},
		{
			"type" : "text",
			"name" : "subject",
			"label" : "Subject"
		},
		{
			"type" : "text",
			"name" : "categoryId",
			"label" : "Category"
		},
		{
			"type" : "text",
			"name" : "createdOn",
			"label" : "CreatedOn"
		},
		{
			"type" : "text",
			"name" : "remarks",
			"label" : "Remarks"
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
		}, {
			"name" : "send",
			"type" : "button",
			"label" : "Send",
			"applyTo" : "row",
			"cssClass" : "btn-primary",
			"handler" : {
				"href" : ""
			}
		}, {
			"name" : "movement",
			"type" : "button",
			"label" : "Movement",
			"applyTo" : "row",
			"cssClass" : "btn-primary",
			"handler" : {
				"href" : ""
			}
		}, {
			"name" : "draft",
			"type" : "button",
			"label" : "Draft",
			"applyTo" : "row",
			"cssClass" : "btn-primary",
			"handler" : {
				"href" : ""
			}
		}
	],
	"providers": {
		"collection": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipts?p_auth="+ Liferay.authToken,
			//"method": "get"
			"dataNode":"items"
		},
		"selector": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
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
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "put"
		},
		"delete": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "delete",
			"queryParams":{"id":"#id"}
		}
	}
};