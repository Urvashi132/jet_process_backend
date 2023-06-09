var draftList = {
	"id" : "draftList",
	"parentId" : "draftListContainer",
	"title" : "Draft List",
	"subtitle" : "",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true
	}, {
		"type" : "text",
		"name" : "draftNo",
		"label" : "Draft No."
	}, {
		"type" : "text",
		"name" : "subject",
		"label" : "Subject"
	}, {
		"type" : "text",
		"name" : "status",
		"label" : "Status"
	}, {
		"type" : "text",
		"name" : "approvedBy",
		"label" : "Approved By"
	}, {
		"type" : "date",
		"name" : "modifiedDate",
		"label" : "Last Updated On"
	} ],
	"actions" : [ {
		"name" : "add",
		"type" : "button",
		"label" : "Create New Draft",
		"applyTo" : "list",
		"cssClass" : "btn-primary",
		"handler" : {
			"href" : ""
		}
	},{
		"name": "edit",
		"type": "button",
		"label": "Edit",
		"applyTo": "row",
		"cssClass": "btn-primary",
		"handler": {
			"href": ""
		}
	}, {
		"name" : "delete",
		"type" : "button",
		"label" : "Delete",
		"applyTo" : "row",
		"cssClass" : "btn-danger"
	},{
		"name": "recipientList",
		"type": "button",
		"label": "Recipient List",
		"applyTo": "row",
		"cssClass": "btn-primary",
		"handler": {
			"href": ""
		}
	}
	],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/drafts?p_auth=" + Liferay.authToken,
			"dataNode" : "items"
		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/draft?p_auth=" + Liferay.authToken,
			"method" : "delete"
		}
	}
};