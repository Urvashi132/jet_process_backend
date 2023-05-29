var noteDocMovement = {
	"id" : "noteDocMovement",
	"parentId" : "noteDocMovementContainer",
	"title" : "Note Document Movement",
	"subtitle" : "File Movement List",
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
		"label" : "Note Document List",
		"applyTo" : "list",
		"cssClass" : "btn-primary",
		"handler" : {
			"href" : ""
		}
	}],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocumentmovement?id={id}&p_auth="	+ Liferay.authToken,
			"dataNode" : "items",
			"queryParams" : {
				"id" : "#id"
			}
		}
	}
};