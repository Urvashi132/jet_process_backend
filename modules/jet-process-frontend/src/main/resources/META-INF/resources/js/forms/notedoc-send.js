var noteDocSend = {
	"id" : "noteDocSend",
	"parentId" : "noteDocSendContainer",
	"title" : "Send Note Document",
	"subtitle" : "Send",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true,
	}, {
		"type" : "text",
		"name" : "noteDocumentId",
	}, {
		"type" : "text",
		"name" : "receiverId",
		"label" : "User",
		"col" : 12
	}, {
		"type" : "hidden",
		"name" : "senderId",
		"value" : "1",
	}, {
		"type" : "textarea",
		"name" : "remarks",
		"label" : "Remarks",
		"col" : 12,
		"validations" : {
			"rules" : {
				"maxlength" : 500
			},
			"messages" : {
				"maxlength" : "Remarks should be maximum 500 charater."
			}
		}
	} ],
	"actions" : [ {
		"name" : "save",
		"type" : "submit",
		"label" : "Save",
		"applyTo" : "form",
		"handler" : {
			"script" : "submitForm(event)",
		},
		"redirects" : {
			"success" : {
				"href" : ""
			},
			"failure" : {
				"script" : "alert('Saving operation failed')"
			}
		},
		"cssClass" : "btn-primary"
	}, {
		"name" : "cancel",
		"type" : "button",
		"label" : "Cancel",
		"applyTo" : "form",
		"cssClass" : "btn-secondary",
		"handler" : {
			"href" : ""
		}
	} ],
	"providers" : {
		"create" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocumentmovement?p_auth="	+ Liferay.authToken,
			"method" : "post",
		}
	}
};