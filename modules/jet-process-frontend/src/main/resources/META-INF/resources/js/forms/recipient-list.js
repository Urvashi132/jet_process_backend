var recipientList = {
	"id" : "recipientList",
	"parentId" : "recipientListContainer",
	"title" : "Recipient Details List",
	"subtitle" : "",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [{
		"type" : "hidden",
		"name" : "id",
		"id" : true,
	}, {
		"type" : "text",
		"name" : "name",
		"label" : "Name",
	}, {
		"type" : "text",
		"name" : "designation",
		"label" : "Designation",
	}, {
		"type" : "text",
		"name" : "address",
		"label" : "Address",
	}, {
		"type" : "text",
		"name" : "organization",
		"label" : "Organization"
	} ],
	"actions" : [ {
		"name" : "add",
		"type" : "button",
		"label" : "Add Receipients",
		"applyTo" : "list",
		"cssClass" : "btn-primary",
		"handler" : {
			"dialog" : ""
		}},
		 {
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
		}
	],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth="	+ Liferay.authToken,
			"dataNode" : "items"
		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "delete"
		}
	}
};