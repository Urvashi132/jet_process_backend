var fileList = {
	"id" : "fileList",
	"parentId" : "fileListContainer",
	"title" : "File List",
	"subtitle" : "File List",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true,
	}, {
		"type" : "select",
		"name" : "type",
		"label" : "Type",
	}, {
		"type" : "select",
		"name" : "nature",
		"label" : "Nature",
	}, {
		"type" : "text",
		"name" : "fileNo",
		"label" : "File No",
	}, {
		"type" : "textarea",
		"name" : "subject",
		"label" : "Subject",
		"searchable" : false,
	}, {
		"type" : "select",
		"name" : "categoryId",
		"label" : "Category",
		"provider" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filecategory?p_auth=" + Liferay.authToken,
			"value" : "id",
			"label" : "name",
			"dataNode" : "items"
		}
	}, {
		"type" : "date",
		"name" : "createDate",
		"label" : "created On",
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
		"cssClass" : "btn-primary",
		"handler" : {
			"href" : ""
		}
	}, {
		"name" : "edit",
		"type" : "button",
		"label" : "Edit",
		"applyTo" : "row",
		"cssClass" : "btn-primary",
		"handler" : {
			"href" : ""
		}
	}, {
		"name" : "delete",
		"type" : "button",
		"label" : "Delete",
		"applyTo" : "row",
		"cssClass" : "btn-danger",
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
	}],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfiles?p_auth="	+ Liferay.authToken,
			"dataNode" : "items"
		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "delete"
		}
	}
};