var fileSend = {
	"id" : "fileSend",
	"parentId" : "fileSendContainer",
	"title" : "Send File",
	"subtitle" : "File Send",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true
	},
	{
		"type" : "text",
		"name" : "fileId",
		"label":"File id",
		"value":"2"
	},
	
	
	 {
		"type" : "group",
		"name" : "sendGroup",
		"label" : "name",
		"col" : 12,
		"fields" : [ {
			"type" : "text",
			"name" : "receiverId",
			"label" : "User",
		 /*"required" : true,*/ 
			"col" : 12
		}, {
			"type" : "select",
			"name" : "priority",
			"label" : "Priority",
			"required" : "required",
			"col" : 6,
			"options" : [ {
				"value" : "highest",
				"label" : "Highest",
			}, {
				"value" : "high",
				"label" : "High",
			}, {
				"value" : "medium",
				"label" : "Medium",
			}, {
				"value" : "low",
				"label" : "Low",
			} ]
		}, {
			"type" : "date",
			"name" : "dueDate",
			"label" : "DueDate",
			"col" : 6,
			"required" : true
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
		} ]
	},{
		"type" : "hidden",
		"name" : "senderId",
		"value" : "1",
	}],

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
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filemovement?p_auth=" + Liferay.authToken,
			"method" : "post",
		},
		"selector" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filemovement?p_auth=" + Liferay.authToken,
			"method" : "get",
			"queryParams" : {
				"id" : "#id"
			}
		}
	}
};