var fileForm = {
		"id" : "fileForm",
		"parentId": "fileFormContainer",
		"title" : "New File",
		"subtitle" : "New File Creation",
		"namespace" : "",
		"enctype" : "multipart/form-data",
		"fields" : [{
			"type": "group",
			"name": "fileGroup1",
			"label": "name",
			"fields": [{
				"type" : "select",
				"name" : "nature",
				"label" : "Nature",
				"required": "required",
				"placeHolder": "Nature",
				"listable" : true,
				"options" : [{
					"value" : "electronic",
					"label" : "Electronic",
					"selected" : "selected"
				},
				{
					"value" : "physical",
					"label" : "Physical",
				}]				
			},
			{
				"type" : "select",
				"name" : "type",
				"label" : "Type",
				"options" : [{
					"value" : "NON-SFS",
					"label" : "NON-SFS",
					"selected" : "selected"
				},
				{
					"value" : "SFS",
					"label" : "SFS",
				}],
				"required" : true,
				"events":{
					"change":[
						{
							"receiver":"fileNo",
							"type":"field",
							"trigger": "hide",
							"criterias": {
								"#type": "-1"
							}
						},
						{
							"receiver":"fileNo",
							"type":"field",
							"trigger": "hide",
							"criterias": {
								"#type": "NON-SFS"
							}
						},{
							"receiver":"fileGroup2",
							"type":"field",
							"trigger": "hide",
							"criterias": {
								"#type": "SFS"
							}
						
						}
					]
				}
			}]
		 },
				{
				"type": "group",
				"name": "fileGroup2",
				"label": "name",
				"fields": [{
					"type" : "select",
					"name" : "basicHeadId",
					"label" : "BasicHead",
					"required" : true,
					"listable" : false,
					"tranzient": true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/basichead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
						},
					"events":{
						"change":[{"receiver":"primaryHeadId", "type":"field", "trigger":"refill"},
							{"receiver":"secondaryHeadId", "type":"field", "trigger":"refill"},
							{"receiver":"headId", "type":"field", "trigger":"refill"}]
					}
				},
				{
					"type" : "select",
					"name" : "primaryHeadId",
					"label" : "PrimaryHead",
					"required" : true,
					"listable" : false,
					"tranzient": true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/primaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items",
						"params" : [{
							"name" : "basicHeadId",
							"value" : "#basicHeadId"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
						},
					"events":{
						"change":[{"receiver":"secondaryHeadId", "type":"field", "trigger":"refill"},
							{"receiver":"headId", "type":"field", "trigger":"refill"}]
					}
				},
				{
					"type" : "select",
					"name" : "secondaryHeadId",
					"label" : "SecondaryHead",
					"required" : true,
					"listable" : false,
					"tranzient": true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/secondaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items", 
						"params" : [{
							"name" : "primaryHeadId",
							"value" : "#primaryHeadId"
							},{
							"name" : "deleted",
							"value" : "0"
							}]
					},
					"events":{
						"change":[{"receiver":"headId", "type":"field", "trigger":"refill"}]
					}
				}, 
				{
					"type" : "select",
					"name" : "headId",
					"label" : "TertiaryHead",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/tertiaryhead?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items", 
						"params" : [ {
							"name" : "secondaryHeadId",
							"value" : "#secondaryHeadId"
						}, {
							"name" : "deleted",
							"value" : "0"
						} ]
					},
					"listable" : false
				},				
				{
					"type" : "text",
					"name" : "year",
					"label" : "Year",
					"required" : true,
					"listable" : false
				},
				{
					"type" : "select",
					"name" : "fileCodeId",
					"label" : "File Code",
					"options" : [{
						"value" : "1",
						"label" : "A",
						"selected" : "selected"
						},{
						"value" : "2",
						"label" : "B",
						}],
					"required" : true,
					"listable" : false
				}]
			},
			{
				"type" : "text",
				"name" : "fileNo",
				"label" : "File No",
				"required" : true,
				"listable" : true,		
			},
			{
				"type": "group",
				"name": "fileGroup3",
				"label": "name",
				"fields": [
					{
					"type" : "select",
					"name" : "categoryId",
					"label" : "Category",
					"required" : true,
					"provider" : {
						"url" : "http://localhost:8080/o/jet-process-rs/v1.0/category?p_auth="+ Liferay.authToken,
						"value" : "id",
						"label" : "name",
						"dataNode" : "items" 
						}
					},
					{
					"type" : "text",
					"name" : "reference",
					"label" : "Reference",
					"required" : false,
					"listable" : false
				}]
			},{
				"type": "group",
				"name": "fileGroup4",
				"label": "name",
				"fields": [{
					"type" : "textarea",
					"name" : "subject",
					"label" : "Subject",
					"required" : true,
					"listable" : true,
					"searchable" : false,
					"validations": {
						"rules": {
							"maxlength": 500
						},
						"messages": {
							"maxlength": "Subject should be maximum 500 charater."
						}
					}
				},{
					"type" : "textarea",
					"name" : "remarks",
					"label" : "Remarks",
					"listable" : true,
					"searchable" : false,
					"validations": {
						"rules": {
							"maxlength": 500
						},
						"messages": {
							"maxlength": "Remarks should be maximum 500 charater."
						}
					}
				}]
			},{
				"type" : "hidden",
				"name" : "groupId",
				"listable" : false
			},
			{
				"type" : "hidden",
				"name" : "userPostId",
				"value" : "0",
				"listable" : false
			},
			{
				"type" : "hidden",
				"name" : "docFileId",
				"value" : "0",
				"listable" : false
			},
			{
				"type" : "hidden",
				"name" : "currentState",
				"value" : 1,
				"listable" : false
			},{
				"type" : "hidden",
				"name" : "currentUser",
				"value" : "0",
				"listable" : false
			},
			{
				"type" : "hidden",
				"name" : "dealingOrganizationId",
				"value" : "0",
				"listable" : false
			}],
	"actions": [{
		"name": "save",
		"type": "submit",
		"label": "Save",
		"applyTo": "form",
		"handler": {
			"type": "javascript",
			"func": "submitForm(event)",
			"method": "post",
			"url": ""
		},
		"redirects": {
			"success": {"href":""},
			"failure": {"href":"#"}
		},
		"cssClass": "btn-primary"
	},{
		"name": "cancel",
		"type": "button",
		"label": "Cancel",
		"applyTo": "form",
		"cssClass": "btn-secondary",
		"redirects": {
			"success": {"href":""},
		}
	},
	{
		"name": "add",
		"type": "button",
		"label": "Add",
		"applyTo": "list",
		"cssClass": "btn-danger",
		"handler": {
			"href": ""
		}
	}
],
"dataProvider": {
	"collection": {
		"url": "http://localhost:8080/o/jet-process-rs/v1.0/docfiles?p_auth="+ Liferay.authToken,
		"method": "get",
		"dataNode": "items"
	},
	"selector": {
		"url": ""
	},
	"create": {
		"url": "http://localhost:8080/o/jet-process-rs/v1.0/docfile?p_auth="+ Liferay.authToken,
		"method": "post"
	},
	"update": {
		"url": "",
		"method": "post"
	},
	"delete": {
		"url": "",
		"method": "post"
	}
}
};