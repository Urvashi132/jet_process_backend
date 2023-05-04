<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<%@include file="init.jsp" %>
<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/user-list.jsp" />
</portlet:renderURL>
<script type="text/javascript" src='<%=request.getContextPath() + "/js/forms/employee-form.js"%>'></script>
</head>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
			<%-- <div class="col-md-3">
				<%@include file="left-nav.jsp"%>
			</div> --%>
	
			<div class="col" id="employeeFormContainer" >
				<h3 id="employeeFormTitle"></h3>
				<form id="employeeForm">
					<div class="row" id="nameGroup">
					
					</div>
					<div class="row">
						<div class="col-md-6" id="credentials">
						</div>
						<div class="col-md-6" id="dates">
						</div>
					</div>
					<div class="row" id="middleGroup">
					
					</div>
					<div class="row">
						<div class="col-md-6" id="address1">
						</div>
						<div class="col-md-6" id="address2">
						</div>
						</div>
				</form>
			</div>
		</div>
	</div>

<liferay-util:include page="/templates/jetform-template.jsp" servletContext="<%=application%>"></liferay-util:include>
<script>
	$(document).ready(() => {
		employeeForm.actions[1].redirects.success.href = '<%=list %>';
		console.log(employeeForm.actions[1].redirects.success.href);
		
		
		var jetform=JetForm({"id":"employeeForm", "parentId":"employeeFormContainer", "form":employeeForm});
		jetform.render();
	});
</script>
</body>
</html>