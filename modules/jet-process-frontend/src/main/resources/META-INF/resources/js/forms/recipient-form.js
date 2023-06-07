var recipientForm = {
	"id" : "recipientForm",
	"parentId" : "recipientFormContainer",
	"title" : "Add Recipient",
	"subtitle" : "",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [ {
		"type" : "hidden",
		"name" : "id",
		"id" : true,
	}, {
		"type" : "text",
		"name" : "name",
		"label" : "Name",
		"required" : "required",
		"col" : 6,
	}, {
		"type" : "text",
		"name" : "designation",
		"label" : "Designation",
		"col" : 6,
	}, {
		"type" : "textarea",
		"name" : "address",
		"label" : "Address",
		"col" : 12,
	}, {
		"type" : "select",
		"name" : "organization",
		"label" : "Organization",
		"required" : true,
		"provider" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Organization?p_auth=" + Liferay.authToken,
			"value" : "id",
			"label" : "name",
			"dataNode" : "items"
		},
		"col" : 12
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
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/hgghhg?p_auth=" + Liferay.authToken,
			"method" : "post",
		}
	}
};