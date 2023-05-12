var receiptList = {
	"id": "receiptList",
	"parentId": "receiptListContainer",
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
			"name": "add",
			"type": "button",
			"label": "Add Receipt",
			"applyTo": "list",
			"cssClass": "btn-primary",
			"handler": {
				"href": "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"
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
		}
	],
	"providers": {
		"collection": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipts?p_auth="+ Liferay.authToken,
			"method": "get"
			//"dataNode":"data"
		},
		"selector": {
			"ajax": "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="+ Liferay.authToken,
			"method": "get",
			//"dataNode":"data",
			//"pathParams":{"id":"#id"},
			//"queryParams":{"id":"#id"}
			
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
			"method": "delete"
		}
	}
};