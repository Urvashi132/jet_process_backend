var recipientForm = {
	"id" : "recipientForm",
	"parentId" : "recipientFormContainer",
	"title" : "",
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
				"type" : "select",
				"name" : "organization",
				"label" : "Organaization",
				"required" : true,
				"provider" : {
					"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Organization?p_auth=" + Liferay.authToken,
					"value" : "id",
					"label" : "name",
					"dataNode" : "items"
				}
			},
			{
				"type" : "text",
				"name" : "name",
				"label" : "Name",
				"required" : true,
			},
			{
				"type" : "text",
				"name" : "designation",
				"label" : "Designation",
				"required" : true,
			},
			{
				"type" : "text",
				"name" : "email",
				"label" : "Email",
			},
			{
				"type" : "text",
				"name" : "mobile",
				"label" : "Mobile",
			},
			{
				"type" : "textarea",
				"name" : "address",
				"label" : "Address",
			},
			{
				"type" : "select",
				"name" : "countryId",
				"label" : "Country",
				"tranzient" : true,
				"provider" : {
					"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Country?p_auth=" + Liferay.authToken,
					"value" : "id",
					"label" : "name",
					"dataNode" : "items",
				},
				"events" : {
					"change" : [ {
						"receiver" : "stateId",
						"type" : "field",
						"trigger" : "refill"
					} ]
				}
			},
			{
				"type" : "select",
				"name" : "stateId",
				"label" : "State",
				"required" : true,
				"provider" : {
					"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/State?p_auth=" + Liferay.authToken,
					"value" : "id",
					"label" : "name",
					"dataNode" : "items",
					"queryParams" : [ {
						"name" : "countryId",
						"value" : "#countryId"
					}, {
						"name" : "deleted",
						"value" : "0"
					} ]
				}
			}, {
				"type" : "text",
				"name" : "city",
				"label" : "City/District",
				"required" : true,
			}, {
				"type" : "text",
				"name" : "pincode",
				"label" : "Pin Code",
				"required" : true,
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
		"selector" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/draftrecipient?p_auth=" + Liferay.authToken,
			"method" : "get",
			"queryParams" : {
				"id" : "#id"
			}
		},
		"create" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/draftrecipient?p_auth="+ Liferay.authToken,
			"method" : "post",
		},
		"update" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/draftrecipient?p_auth=" + Liferay.authToken,
			"method" : "put",
			"queryParams" : {
				"id" : "#id"
			}
		}
	}
};