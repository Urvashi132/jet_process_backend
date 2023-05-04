<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<%@include file="init.jsp" %>
<script type="text/javascript" src='<%=request.getContextPath() + "/js/forms/employee-form.js"%>'></script>
</head>
<!-- body  -->
<body>l
	<div class="container">
	
		<div class="row">
			<div class="col-md-3">
				<%@include file="left-nav.jsp"%>
			</div>
	
			<div class="col-md-9" id="employeeListContainer" >
			</div>
		</div>
	</div>
</body>

<liferay-util:include page="/templates/jetform-template.jsp" servletContext="<%=application%>"/>
<script>
	$(document).ready(() => {
		var jetList=JetList({"id":"employeeList", "parentId":"employeeListContainer", "form":employeeForm});
		jetList.render();
	});
</script>
</html>