<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/receipt/receipt-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/receipt-movement.js"%>'></script>

<div class="container">
	<div id="receiptMovementContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
	
<script>
	$(document).ready(() => {
		let searchParams = new URLSearchParams(window.location.search);
		let id = searchParams.get('id');
		receiptMovement.actions[0].handler.href = '<%=list%>';
		receiptMovement.providers.collection.ajax = "http://localhost:8080/o/jet-process-rs/v1.0/receiptmovement?receiptId="+id+"&p_auth=" + Liferay.authToken;
		var jetList=JetList({"id":"receiptMovement", "parentId":"receiptMovementContainer", "form":receiptMovement});
		jetList.render();
	});
</script>