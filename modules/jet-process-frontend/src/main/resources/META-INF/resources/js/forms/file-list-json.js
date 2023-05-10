var fileList = {
	"id" : "fileList",
	"parentId" : "fileListContainer",
	"title" : "File List",
	"subtitle" : "File List",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [
			{
				"type" : "hidden",
				"name" : "docFileId",
				"id" : true,
			},
			{
				"type" : "select",
				"name" : "nature",
				"label" : "Nature",
			},
			{
				"type" : "text",
				"name" : "fileNo",
				"label" : "File No",
			},
			{
				"type" : "select",
				"name" : "categoryId",
				"label" : "Category",
			}, {
				"type" : "textarea",
				"name" : "subject",
				"label" : "Subject",
				"searchable" : false,
			}, {
				"type" : "textarea",
				"name" : "remarks",
				"label" : "Remarks",
				"searchable" : false,
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
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfiles?p_auth=" + Liferay.authToken,
			"method" : "get",
			"dataNode" : "items"
		},
		"selector" : {
			"ajax" : "https://mocki.io/v1/d4867d8b-b5d5-4a48-a4ab-79131b5809b8/{name}",
			"method" : "get",
			"pathParams" : {},
			"queryParams" : {}

		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "delete"
		}
	}
};