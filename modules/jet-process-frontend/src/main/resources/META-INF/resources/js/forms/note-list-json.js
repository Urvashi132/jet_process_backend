var noteList = {
	"id" : "noteList",
	"parentId" : "noteListContainer",
	"title" : "Note Document List",
	"subtitle" : "Note",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true,
		"listable" : false
	}, {
		"type" : "text",
		"name" : "noteDocumentNo",
		"label" : "Note Document No"
	}, {
		"type" : "textarea",
		"name" : "subject",
		"label" : "Subject"
	}, {
		"type" : "select",
		"name" : "subjectCategoryId",
		"label" : "Subject Category"

	}, {
		"type" : "text",
		"name" : "modifiedDate",
		"label" : "Created On"

	} ],
	"actions" : [ {
		"name" : "add",
		"type" : "button",
		"label" : "Add",
		"applyTo" : "list",
		"cssClass" : "btn-danger",
		"handler" : {
			"href" : ""
		}
	}, {
		"name" : "edit",
		"type" : "button",
		"label" : "Edit",
		"applyTo" : "row",
		"cssClass" : "btn-danger",
		"handler" : {
			"href" : ""
		}
	}, {
		"name" : "delete",
		"type" : "button",
		"label" : "Delete",
		"applyTo" : "row",
		"cssClass" : "btn-danger",
	} ],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocuments?p_auth=" + Liferay.authToken,
			"dataNode" : "items"
		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocument?p_auth=" + Liferay.authToken,
			"method" : "delete"
		}
	}
};