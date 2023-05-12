<%@include file="init.jsp"%>

<!DOCTYPE html>
<html>
<head>
<title>Receipt Form</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/forms/receipt-form.js"></script>
	
</head>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-9" id="receiptFormContainer">
				<h3 id="receiptFormTitle"></h3>
				<form id="receiptForm">
					<div class="row" id="nameGroup"></div>				
						<div class="row" id="dates"></div>		
					<div class="row" id="middleGroup">					
					</div>
					<div class="row" id="lowerGroup">
					
					</div>
					<div class="row" id="lowerGroup1">
					
					</div>
					<div class="row" id="lowerGroup2">
					
					</div>								
				</form>
			</div>
		</div>
	</div>
	<liferay-util:include page="/templates/jetform-template.jsp"
		servletContext="<%=application%>">
	</liferay-util:include>

	<script>
	$(document).ready(() => {
		var jetform=JetForm({"id":"receiptForm", "parentId":"receiptFormContainer", "form":receiptForm});
		jetform.render();
	});
	
	$(document).ready(() => {
		$('#date').val(new Date().toISOString().split('T')[0]);
	});

</script>
</body>
</html>