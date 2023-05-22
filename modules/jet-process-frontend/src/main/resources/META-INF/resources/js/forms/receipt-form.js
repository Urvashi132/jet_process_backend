var receiptForm = {
	"id" : "receiptForm",
	"parentId" : "receiptFormContainer",
	"title" : "",
	"subtitle" : "",
	"namespace" : "",
	"enctype" : "multipart/form-data",
	"fields" : [
			{
				"type" : "hidden",
				"name" : "id",
				"id" : true,
				"required" : true,
			},
			{
				"type" : "group",
				"name" : "diaryDetails",
				"label" : "name",
				"col" : 12,
				"fields" : [
						{
							"type" : "text",
							"name" : "date",
							"label" : "CreatedOn",
							"tranzient" : true,
							"col" : 6
						},
						{
							"type" : "select",
							"name" : "nature",
							"label" : "Nature",
							"options" : [ {
								"value" : "electronic",
								"label" : "Electronic",
								"selected" : "selected"
							}, {
								"value" : "physical",
								"label" : "Physical",
							} ],
							"required" : true,
							"col" : 6
						},
						{
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
							"col" : 6
						},
						{
							"type" : "select",
							"name" : "deliveryModeId",
							"label" : "Delivery Mode",
							"listable" : false,
							"searchable" : false,
							"provider" : {
								"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/DeliveryMode?p_auth=" + Liferay.authToken,
								"value" : "id",
								"label" : "name",
								"dataNode" : "items"
							},
							"col" : 6
						}, {
							"type" : "date",
							"name" : "letterDate",
							"label" : "Letter Date",
							"listable" : false,
							"searchable" : false,
							"col" : 6
						}, {
							"type" : "date",
							"name" : "receivedOn",
							"label" : "Received Date",
							"col" : 6,
							"required" : false,
							"listable" : false,
							"searchable" : false
						}, {
							"type" : "text",
							"name" : "referenceNo",
							"label" : "Reference Number",
							"listable" : true,
							"searchable" : false,
							"col" : 6
						}, {
							"type" : "text",
							"name" : "modeNo",
							"label" : "Mode Number",
							"listable" : true,
							"searchable" : false,
							"col" : 6
						} ]
			},
			{
				"type" : "group",
				"name" : "senderDetails",
				"label" : "name",
				"col" : 12,
				"fields" : [
						{
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
						}, {
							"type" : "text",
							"name" : "name",
							"label" : "Name",
							"required" : true,
							"listable" : true,
							"searchable" : false,
							"col" : 6
						}, {
							"type" : "text",
							"name" : "designation",
							"label" : "Designation",
							"required" : true,
							"listable" : true,
							"searchable" : false,
							"col" : 6
						},
						{
							"type" : "text",
							"name" : "email",
							"label" : "Email",
							"listable" : true,
							"searchable" : false,
							"col" : 6
						},
						{
							"type" : "text",
							"name" : "mobile",
							"label" : "Mobile",
							"listable" : true,
							"searchable" : false,
							"col" : 6
						},
						 {
							"type" : "textarea",
							"name" : "address",
							"label" : "Address",
							"listable" : true,
							"searchable" : false,
							"col" : 12
						},
						{
							"type" : "select",
							"name" : "countryId",
							"label" : "Country",
							"tranzient" : true,
							"listable" : false,
							"col" : 6,
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
							"listable" : false,
							"col" : 6,
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
							"col" : 6,
							"label" : "City/District",
							"required" : true,
							"listable" : true,
							"searchable" : false
						}, {
							"type" : "text",
							"name" : "pincode",
							"label" : "Pin Code",
							"required" : true,
							"listable" : true,
							"searchable" : false,
							"col" : 6
						}
				]
			},
			{
				"type" : "group",
				"name" : "receiptDetails",
				"label" : "name",
				"col" : 12,
				"fields" : [
					{
						"type" : "select",
						"name" : "categoryId",
						"label" : "Category",
						"required" : true,
						"provider" : {
							"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/category?p_auth=" + Liferay.authToken,
							"value" : "id",
							"label" : "name",
							"dataNode" : "items"
						},
						"col" : 12
					}, {
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
					}, {
						"type" : "textarea",
						"name" : "remarks",
						"label" : "Remarks",
						"listable" : true,
						"searchable" : false,
						"col" : 12,
						"validations" : {
							"rules" : {
								"maxlength" : 500
							},
							"messages" : {
								"maxlength" : "Remarks should be maximum 500 charater."
							}
						}
					}
					]
			},
			{
				"type" : "group",
				"name" : "lowerGroup2",
				"label" : "name",
				"fields" : [
						{
							"type" : "hidden",
							"name" : "attachStatus",
							"value" : "abc",
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "currentState",
							"value" : 0,
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "currentlyWith",
							"value" : 0,
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "docfileId",
							"value" : 0,
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "groupId",
							"value" : 20121,
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "userPostId",
							"value" : 0,
							"listable" : false
						}, {
							"type" : "hidden",
							"name" : "viewPdfUrl",
							"value" : 0,
							"listable" : false
						}
				]
			}
	],
	"actions" : [
			{
				"name" : "save",
				"type" : "submit",
				"label" : "Save",
				"applyTo" : "form",
				"handler" : {
					"script" : "submitForm(event)",
				},
				"redirects" : {
					"success" : {
						"href" : "http://localhost:8080/web/jetcrm/jetprocess?view=note"
					},
					"failure" : {
						"script" : "alert('Saving operation failed')"
					}
				},
				"cssClass" : "btn-primary"
			},
			{
				"name" : "cancel",
				"type" : "button",
				"label" : "Cancel",
				"applyTo" : "form",
				"cssClass" : "btn-secondary",
				"redirects" : {
					"success" : {
						"href" : "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"
					},
				}
			},
			{
				"name" : "add",
				"type" : "button",
				"label" : "Add",
				"applyTo" : "list",
				"cssClass" : "btn-danger",
				"handler" : {
					"href" : ""
				}
			},
			{
				"name" : "edit",
				"type" : "button",
				"label" : "Edit",
				"applyTo" : "row",
				"cssClass" : "btn-primary",
				"handler" : {
					"href" : "http://localhost:8080/web/jetcrm/jetprocess?view=receipt"

				}
			} ],
	"providers" : {
		"collection" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipts?p_auth=" + Liferay.authToken,
			 "method": "get"
			 
			
		},
		"selector" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth=" + Liferay.authToken,
			 "method": "get",
			"queryParams":{"id":"#id"}
		},
		"create" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth=" + Liferay.authToken,
			"method" : "post",
			"pathParams" : {},
			"queryParams" : {},
			"requestParams" : {}
		},
		"update" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth=" + Liferay.authToken,
			"method" : "put"
		},
		"delete" : {
			"ajax" : "http://localhost:8080/o/jet-process-rs/v1.0/Receipt?p_auth=" + Liferay.authToken,
			"method" : "delete",
			"queryParams":{"id":"#id"}
		}
	}
};