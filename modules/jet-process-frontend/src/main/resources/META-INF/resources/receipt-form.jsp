<%@include file="init.jsp"%>

<!DOCTYPE html>
<html>
<head>
<title>Receipt Form</title>
<style type="text/css">
.detail {
	background-color: lightgray;
	padding: 0.5%;
}
</style>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/forms/receipt-form.js"></script>

</head>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
			<div class="col" id="receiptFormContainer">
				<h3>Create Receipt</h3>
				<form id="receiptForm">

					<h5 class="detail">Diary Details</h5>
					<div class="row" id="diaryDetails"></div>

					<h5 class="detail">Sender Details</h5>
					<div class="row" id="senderDetails"></div>

					<h5 class="detail">Receipt Details</h5>
					<div class="row" id="receiptDetails"></div>

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
		jetform.form.providers.selector.pathParams={"id":"<%=request.getParameter("id")%>"};


		jetform.render();
	});
	
	$(document).ready(() => {
		$('#date').val(new Date().toISOString().split('T')[0]);
	});

</script>
</body>
</html>