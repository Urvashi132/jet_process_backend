var receiptMovement = {
	"id" : "receiptMovement",
	"parentId" : "receiptMovementContainer",
	"title" : "Receipt Movement",
	"subtitle" : "Receipt Movement List",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true,
	},{
		"type" : "date",
		"name" : "createDate",
		"label" : "Sent On",
		"searchable" : false,
	}, {
		"type" : "text",
		"name" : "senderId",
		"label" : "Sent By",
	},{
		"type" : "text",
		"name" : "receiverId",
		"label" : "Sent To",
	}, {
		"type" : "textarea",
		"name" : "remarks",
		"label" : "Remarks",
		"searchable" : false,
	} ],
	"actions" : [ {
		"name" : "add",
		"type" : "button",
		"label" : "Receipt List",
		"applyTo" : "list",
		"cssClass" : "btn-primary",
		"handler" : {
			"href" : ""
		}
	}],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/receiptmovement?p_auth="	+ Liferay.authToken,
			"dataNode" : "items",
		}
	}
};