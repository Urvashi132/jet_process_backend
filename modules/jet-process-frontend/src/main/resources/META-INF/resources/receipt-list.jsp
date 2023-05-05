<%@include file="init.jsp" %>

<!DOCTYPE html>
<html>
<head>
<%@include file="/cdns.jsp"%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/forms/receipt-list.js"></script>
	<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/jetform.js"></script>
</head>
<!-- body  -->
<body>
	<div class="container">
	
		<div class="row">
			
	
			<div class="col-md-9" id="receiptListContainer" >
			<div class="row" id="nameGroup"></div>
			</div>
			</div>
		</div>
	
</body>

<liferay-util:include page="/templates/jetform-template.jsp" servletContext="<%=application%>"/>
<script>
	$(document).ready(() => {
		var jetList=JetList({"id":"receiptList", "parentId":"receiptListContainer", "form":receiptList});
		jetList.render();
	});
</script>
</html>