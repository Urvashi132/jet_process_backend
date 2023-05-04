<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<%@include file="init.jsp"%>
</head>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<%-- <%@include file="left-nav.jsp"%> --%>
				<h1>s</h1>
			</div>

			<div class="col-md-9" id="employeeFormContainer">
				<h3 id="employeeFormTitle"></h3>
				<form id="employeeForm">
					<div class="row" id="nameGroup"></div>
					<div class="row">
						<div class="col-md-6" id="credentials"></div>
						<div class="col-md-6" id="dates"></div>
					</div>
					<div class="row" id="middleGroup"></div>
					<div class="row">
						<div class="col-md-6" id="address1"></div>
						<div class="col-md-6" id="address2"></div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- json  -->

	<script>
	var form1 = {
		"id": "employeeForm",
		"containerId":"employeeFormContainer",
		"title" : "New Employee",
		"subtitle" : "New Employee Registration",
		"namespace" : "",
		"enctype": "multipart/form-data",
		"fields": [{
				"type": "group",
				"name": "nameGroup",
				"label": "name",
				"fields": [{
					"type": "text",
					"name": "firstName",
					"label": "First Name",
					"required": true,
					"placeHolder": "First Name",
					"validations":{
						"rules":{
                        	"minlength": 5
						},
						"messages":{
	                        "minlength": " Your username must consist of at least 2 characters"
						}
					}
				}, {
					"type": "text",
					"name": "middleName",
					"label": "Middle Name",
					"placeHolder": "Middle Name",
				}, {
					"type": "text",
					"name": "lastName",
					"label": "Last Name",
					//"required": true,
					"placeHolder": "Last Name",
				}]
			}, 
			
			{
				"type": "group",
				"name": "credentials",
				"label": "name",
				"col":6,
				"fields": [{
					"type": "text",
					"name": "username",
					"label": "Screen Name",
					"listable":false,
					"searchable": false, 
					"col": 12
				},
				{
					"type": "email",
					"name": "emailAddress",
					"label": "Email",
					//"required": true,
					"col": 12,
					"validations":{
						"rules": {
		                    "required": true,
		                    "email": true
		                },
		                "messages":{
							"required": " Please enter a username",
	                        "email": " Please enter a valid email address"
						}
					}
				},
				{
					"type": "password",
					"name": "password_",
					"label": "Password",
					"minLength": 8,
					//"required": true,
					"listable":false,
					"searchable": false,
					"col": 12
				}]
			},
			{
				"type": "group",
				"name": "dates",
				"label": "name",
				"col":6,
				"fields": [{
					"type": "date",
					"name": "createDate",
					"label": "Create Date",
					"required": false,
					"col": 12
				},
				{
					"type": "date",
					"name": "passwordModifiedDate",
					"label": "Modify Date",
					//"required": false,
					"listable":false,
					"searchable": false,
					"col": 12
				}, {
					"type": "number",
					"name": "id",
					"label": "User Id",
					"required": false,
					"col": 12
				}]
			},
			{
				"type": "group",
				"name": "middleGroup",
				"label": "name",
				"fields": [{
					"type": "list",
					"name": "qualifications",
					"label": "Qualifications",
					"editMode": "inline", 
					"col":12,
					"fields": [{
						"type": "text",
						"name": "Grade",
						"label": "Grade",
						//"required": true,
						"placeHolder": "Grade",
						"showLabel": false
					}, {
						"type": "select",
						"name": "institution",
						"label": "School/University",
						"placeHolder": "School/University",
						"showLabel": false,
						"options": [{
							"value": "op",
							"label": "O+"
						}, {
							"value": "on",
							"label": "O-"
						}, {
							"value": "ap",
							"label": "A+"
						}]
					}, {
						"type": "text",
						"name": "passingYear",
						"label": "Passing Year",
						//"required": true,
						"placeHolder": "Passing Year",
						"showLabel": false
					}, {
						"type": "text",
						"name": "marks",
						"label": "Marks(%)",
						//"required": true,
						"placeHolder": "Marks(%)",
						"showLabel": false
					}],
					"actions": [{
						"name": "deleteRow",
						"type": "link",
						"label": "fa-minus-circle",
						"applyTo": "row",
						"handler": {
							"type": "javascript",
							"func": "deleteRow(event)",
							"method": "post",
							"url": "http://localhost:8082/api/v1/user"
						},
						"cssClass": ""
					},
					{
						"name": "editRow",
						"type": "link",
						"label": "fa-pencil",
						"applyTo": "row",
						"handler": {
							"type": "javascript",
							"func": "editRow(event)",
							"method": "post",
							"url": "http://localhost:8082/api/v1/user"
						},
						"cssClass": ""
					},
					{
						"name": "addRow",
						"type": "link",
						"label": "fa-plus-circle",
						"applyTo": "list",
						"handler": {
							"type": "javascript",
							"func": "addRow(event)",
							"method": "post",
							"url": "http://localhost:8082/api/v1/user"
						},
						"cssClass": ""
					}]
				},
				
				{
					"type": "radio",
					"name": "citizen",
					"label": "Are you an INDIAN Citizen?",
					//"required": true,
					"options": [{
						"value": "yes",
						"label": "Yes",
						"checked": "checked"
					}, {
						"value": "no",
						"label": "No"
					}]
				}, {
					"type": "radio",
					"name": "disability",
					"label": "Are you  Physically Handicaped ?",
					"provider": {
						"url": "https://mocki.io/v1/6e76eae7-a3b1-44cb-8e75-4526106568b7",
					}
				}, {
					"type": "select",
					"name": "maritalStatus",
					"label": "Marital Status",
					"options": [{
						"value": "md",
						"label": "Married"
					}, {
						"value": "um",
						"label": "Unmarried",
						"selected": "selected"
					}, {
						"value": "dc",
						"label": "Divorced"
					}],
					"col":6
					//"required": true
				}]
			},
			
			{
				"type": "group",
				"name": "address1",
				"label": "name",
				"fields": [{
					"type": "select",
					"name": "bloodGroup",
					"label": "Blood Group",
					"options": [{
						"value": "op",
						"label": "O+"
					}, {
						"value": "on",
						"label": "O-"
					}, {
						"value": "ap",
						"label": "A+"
					}, {
						"value": "an",
						"label": "A-"
					}, {
						"value": "bp",
						"label": "B+"
					}, {
						"value": "bn",
						"label": "B-"
					}, {
						"value": "abp",
						"label": "AB+"
					}, {
						"value": "abn",
						"label": "AB-"
					}],
					//"required": true,
					"value": "ap",
					"col": 12
				},
				{
					"type": "select",
					"name": "country",
					"label": "Country",
					//"required": true,
					"options":[{
						"value": "op",
						"label": "O+"
					}, {
						"value": "on",
						"label": "O-"
					}, {
						"value": "ap",
						"label": "A+"
					}],
					/*"provider": {
						"url": "http://localhost:8082/api/v1/country",
						"value": "id",
						"label": "name",
						"dataNode":"",
					},*/
					"events":{
						/*"change":[{"receiver":"state", "type":"field", "trigger":"hide"},
								{"receiver":"city", "type":"field", "trigger":"refill"}],*/
						"change":[{"receiver":"handleOnCountryChange", "type":"javascript"}],		
						"keypress":[{"receiver":"state", "type":"field", "trigger":"refill"},
							{"receiver":"city", "type":"field", "trigger":"refill"}]
					},
					"col": 12
				}, {
					"type": "select",
					"name": "state",
					"label": "State  ",
					//"required": true,
					"provider": {
						"url": "http://localhost:8082/api/v1/state/20566",
						"value": "id",
						"label": "name",
						"params":[
							{"name":"countryId", "value":"#country"},
							{"name":"deleted", "value":"0"}
						],
						"dataNode":"item",
						"col": 12
					}
				}, {
					"type": "select",
					"name": "city",
					"label": "City",
					//"required": true,
					"provider": {
						"url": "http://localhost:8082/api/v1/city/20600",
						"value": "id",
						"label": "name",
						"params":[
							{"name":"stateId", "value":"#state"},
							{"name":"deleted", "value":"0"}
						]
	
					},
					"col": 12
				}]
			},
			{"type": "group",
				"name": "address2",
				"label": "name",
				"fields": [{
					"type": "checkbox",
					"name": "hobbies",
					"label": "Hobbies",
					//"required": true,
					"provider": {
						"url": "https://mocki.io/v1/6e76eae7-a3b1-44cb-8e75-4526106568b7",
					},
					"col": 12
				},
				{
					"type": "file",
					"name": "aadhaar",
					"label": "Aadhaar",
					"accept": "image/png, image/jpeg",
					"col": 12
				}]
			}
		],
		"actions": [{
				"name": "save",
				"type": "submit",
				"label": "Save",
				"applyTo": "form",
				/*"handler": {
					"type": "javascript",
					"func": "submitForm(event)",
					"method": "post",
					"url": "http://localhost:8082/api/v1/user"
				},*/
				"cssClass": "btn-primary"
			}, {
				"name": "cancel",
				"type": "button",
				"label": "Cancel",
				"applyTo": "form",
				"cssClass": "btn-secondary"
			},
			{
				"name": "add",
				"type": "button",
				"label": "Add",
				"applyTo": "list",
				"cssClass": "btn-danger"
			}
		],
		"dataProvider":{
			"collection":{"url":"", "method":"get"},
			"selector":{"url":""},
			"create":{"url":"", "method":"post"},
			"update":{"url":"", "method":"post"},
			"delete":{"url":"", "method":"post"},
			
		}
	};
</script>
	<%-- <jsp:include page="/form-template.jsp">
		<jsp:param name="formContainerId" value="userFormContainer" />
		<jsp:param name="formId" value="userForm" />
		<jsp:param name="cancelPage" value="user-list.jsp" />
		<jsp:param name="successPage" value="user-list.jsp" />
	</jsp:include>
	 --%>
<liferay-util:include page="/form-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="formContainerId" value="userFormContainer" />
	<liferay-util:param name="formId" value="userForm" />
	<liferay-util:param name="cancelPage" value="user-list.jsp"  />
	<liferay-util:param name="successPage" value="user-list.jsp"/>
</liferay-util:include>
	<script>
	$(document).ready(() => {
		var jetform=JetForm({"id":"employeeForm", "parentId":"employeeFormContainer", "form":form1});
		jetform.render();
	});
	function helloUrvashi(){
		alert("Hi, I am Urvashi");
	}
</script>
</body>
</html>