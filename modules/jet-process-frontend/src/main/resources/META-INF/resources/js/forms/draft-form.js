var draftForm = {
	"id" : "draftForm",
	"parentId" : "draftFormContainer",
	"title" : "Create New Draft",
	"subtitle" : "",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [
			{
				"type" : "hidden",
				"name" : "id",
				"id" : true,
			},
			{
				"type" : "group",
				"name" : "onlineEditor",
				"label" : "name",
				
				"fields" : [ {
					"type" : "textarea",
					"name" : "content",
					"label" : "Content"
				} ]
			},
			{
				"type" : "group",
				"name" : "draftDetails",
				"label" : "name",
				"fields" : [
						{
							"type" : "select",
							"name" : "nature",
							"label" : "Nature",
							"col" : 6,
							"required" : "required",
							"options" : [ {
								"value" : "New/Fresh",
								"label" : "New/Fresh",
							}, {
								"value" : "Reply",
								"label" : "Reply",
								"selected" : "selected"
							}, {
								"value" : "Reminder",
								"label" : "Reminder",
							} ]
						},
						{
							"type" : "text",
							"name" : "receiptId",
							"label" : "Receipt No.",
							"required" : "required",
							"col" : 6,
						},
						{
							"type" : "select",
							"name" : "replyType",
							"label" : "Reply Type",
							"required" : true,
							"col" : 6,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filecategory?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							}
						},
						{
							"type" : "select",
							"name" : "categoryId",
							"label" : "Category",
							"required" : true,
							"col" : 6,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filecategory?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							}
						},
						{
							"type" : "textarea",
							"name" : "subject",
							"label" : "Subject",
							"required" : true,
							"listable" : true,
							"searchable" : false,
							"col" : 12,
							"validations" : {
								"rules" : {
									"maxlength" : 500
								},
								"messages" : {
									"maxlength" : "Subject should be maximum 500 charater."
								}
							}
						} ]
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
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filemovement?p_auth="
					+ Liferay.authToken,
			"method" : "post",
		}
	}
};