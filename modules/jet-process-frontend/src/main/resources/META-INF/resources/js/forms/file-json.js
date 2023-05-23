var fileForm = {
	"id" : "fileForm",
	"parentId" : "fileFormContainer",
	"title" : "New File",
	"subtitle" : "New File Creation",
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
				"name" : "fileType",
				"label" : "name",
				"fields" : [ {
					"type" : "select",
					"name" : "nature",
					"label" : "Nature",
					"required" : "required",
					"placeHolder" : "Nature",
					"listable" : true,
					"options" : [ {
						"value" : "electronic",
						"label" : "Electronic",
						"selected" : "selected"
					}, {
						"value" : "physical",
						"label" : "Physical",
					} ]
				}, {
					"type" : "select",
					"name" : "type",
					"label" : "Type",
					"options" : [ {
						"value" : "NON-SFS",
						"label" : "NON-SFS",
						"selected" : "selected"
					}, {
						"value" : "SFS",
						"label" : "SFS",
					} ],
					"required" : true,
					"events" : {
						"change" : [/* {
							"receiver" : "fileNoGroup",
							"type" : "field",
							"trigger" : "hide",
							"criterias" : {
								"#type" : "NON-SFS"
							}
						}, {
							"receiver" : "fileNumberGroup",
							"type" : "field",
							"trigger" : "hide",
							"criterias" : {
								"#type" : "SFS"
							}
						},*/
						 {
							"receiver" : "typeSFS",
							"type" : "javascript",
						}]
					}
				} ]
			},
			{
				"type" : "group",
				"name" : "fileNumberGroup",
				"label" : "name",
				"fields" : [
						{
							"type" : "select",
							"name" : "basicHeadId",
							"label" : "BasicHead",
							"required" : true,
							"listable" : false,
							"tranzient" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/basichead?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							},
							"events" : {
								"change" : [ {
									"receiver" : "primaryHeadId",
									"type" : "field",
									"trigger" : "refill"
								}, {
									"receiver" : "secondaryHeadId",
									"type" : "field",
									"trigger" : "refill"
								}, {
									"receiver" : "headId",
									"type" : "field",
									"trigger" : "refill"
								} ]
							}
						},
						{
							"type" : "select",
							"name" : "primaryHeadId",
							"label" : "PrimaryHead",
							"required" : true,
							"listable" : false,
							"tranzient" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/primaryhead?p_auth="
										+ Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items",
								"queryParams" : [ {
									"name" : "basicHeadId",
									"value" : "#basicHeadId"
								}, {
									"name" : "deleted",
									"value" : "0"
								} ]
							},
							"events" : {
								"change" : [ {
									"receiver" : "secondaryHeadId",
									"type" : "field",
									"trigger" : "refill"
								}, {
									"receiver" : "headId",
									"type" : "field",
									"trigger" : "refill"
								} ]
							}
						},
						{
							"type" : "select",
							"name" : "secondaryHeadId",
							"label" : "SecondaryHead",
							"required" : true,
							"listable" : false,
							"tranzient" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/secondaryhead?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items",
								"queryParams" : [ {
									"name" : "primaryHeadId",
									"value" : "#primaryHeadId"
								}, {
									"name" : "deleted",
									"value" : "0"
								} ]
							},
							"events" : {
								"change" : [ {
									"receiver" : "headId",
									"type" : "field",
									"trigger" : "refill"
								} ]
							}
						},
						{
							"type" : "select",
							"name" : "headId",
							"label" : "TertiaryHead",
							"required" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/tertiaryhead?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items",
								"queryParams" : [ {
									"name" : "secondaryHeadId",
									"value" : "#secondaryHeadId"
								}, {
									"name" : "deleted",
									"value" : "0"
								} ]
							},
							"listable" : false
						}, {
							"type" : "text",
							"name" : "year",
							"label" : "Year",
							"required" : true,
							"listable" : false
						}, {
							"type" : "select",
							"name" : "fileCodeId",
							"label" : "File Code",
							"options" : [ {
								"value" : "1",
								"label" : "A",
								"selected" : "selected"
							}, {
								"value" : "2",
								"label" : "B",
							} ],
							"required" : true,
							"listable" : false
						} ]
			},
			{
				"type" : "group",
				"name" : "fileNoGroup",
				"label" : "name",
				"fields" : [
					{
						"type" : "hidden",
						"name" : "fileNo",
						"required" : true,
					}]
			},
			{
				"type" : "group",
				"name" : "fileCategoryAndReference",
				"label" : "name",
				"fields" : [
						{
							"type" : "select",
							"name" : "categoryId",
							"label" : "Category",
							"required" : true,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/filecategory?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							}
						}, {
							"type" : "text",
							"name" : "reference",
							"label" : "Reference",
							"required" : false,
							"listable" : false
						} ]
			},
			{
				"type" : "textarea",
				"name" : "subject",
				"label" : "Subject",
				"required" : true,
				"listable" : true,
				"searchable" : false,
				"validations" : {
					"rules" : {
						"maxlength" : 500
					},
					"messages" : {
						"maxlength" : "Subject should be maximum 500 charater."
					}
				}
			},
			{
				"type" : "textarea",
				"name" : "remarks",
				"label" : "Remarks",
				"listable" : true,
				"searchable" : false,
				"validations" : {
					"rules" : {
						"maxlength" : 500
					},
					"messages" : {
						"maxlength" : "Remarks should be maximum 500 charater."
					}
				}
			}, {
				"type" : "hidden",
				"name" : "groupId",
				"listable" : false
			}, {
				"type" : "hidden",
				"name" : "userPostId",
				"value" : "0",
				"listable" : false
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
		},
		"handler" : {
			"href" : ""
		}
	} ],
	"providers" : {
		"selector" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "get",
			"queryParams" : {
				"id" : "#id"
			}
		},
		"create" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "post",
			"pathParams" : {},
			"queryParams" : {},
			"requestParams" : {}
		},
		"update" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth=" + Liferay.authToken,
			"method" : "put",
			"queryParams" : {
				"id" : "#id"
			}
		}
	}
};