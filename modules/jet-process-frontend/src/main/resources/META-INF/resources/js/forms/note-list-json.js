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
		"redirects" : {
			"success" : {
				"href" : ""
			},
		}
	} ],
	"providers" : {
		"collection": {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocuments?p_auth=" + Liferay.authToken,
			//"method" : "get",
			"dataNode" : "items"
		},
		"selector" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocument?{id}",
			// "method": "get",
			"pathParams" : {
				"id" : "#id"
			},
			// "queryParams":{}
			"dataNode" : "data"

		},
		"create" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocument?p_auth=" + Liferay.authToken,
			"method" : "post",
			"pathParams" : {},
			"queryParams" : {},
			"requestParams" : {}
		},
		"update" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocument?p_auth=" + Liferay.authToken,
			"method" : "put",
			"dataNode" : "items"
		}
	}
};