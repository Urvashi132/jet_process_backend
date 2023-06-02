<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/receipt/receipt-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/receipt-send.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="receiptSendContainer"></div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
	$(document).ready(() => {
		receiptSend.actions[0].redirects.success.href = '<%=list%>';
		receiptSend.actions[1].handler.href = '<%=list%>';
		var jetform=JetForm({"id":"receiptSend", "parentId":"receiptSendContainer", "form":receiptSend});
		jetform.render();
	});
</script>