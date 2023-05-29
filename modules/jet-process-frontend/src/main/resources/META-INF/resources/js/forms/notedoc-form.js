var noteDocForm = {
	"id" : "noteDocForm",
	"parentId" : "noteDocFormContainer",
	"title" : "Create Note",
	"subtitle" : "Note",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [
			{
				"type" : "hidden",
				"name" : "id",
				"id" : true,
				"listable" : false
			},
			
			{
				"type" : "group",
				"name" : "noteDocument",
				"label" : "name",
				"col" : 12,
				"fields" : [
					{
						"type" : "textarea",
						"name" : "subject",
						"label" : "Subject",
						"required" : true,
						"validations" : {
							"rules" : {
								"maxlength" : 500
							},
							"messages" : {
								"maxlength" : "Subject should be maximum 500 charater."
							}
						},
						"col" : 12
					},
						{
							"type" : "select",
							"name" : "subjectCategoryId",
							"label" : "Subject Category",
							"required" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/subjectcategory?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							},
							"col" : 6
						}, {
							"type" : "text",
							"name" : "createDate",
							"label" : "Created On",
							"col" : 6
						} ]
			},{
				/*"type" : "textarea",
				"name" : "content",
				"label" : "Article Content",*/
				"type" : "group",
				"name" : "note",
				"label" : "name",
				"fields" : [ {
					"type" : "textarea",
					"name" : "content",
					"label" : "Article Content"
				}]
			}, {
				"type" : "hidden",
				"name" : "groupId",
			}, {
				"type" : "hidden",
				"name" : "createdBy",
				"value" : "0",
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
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/notedocument?p_auth=" + Liferay.authToken,
			"method": "get",
			"queryParams" : {
				"id" : "#id"
			}
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
		}
	}
};