<%@include file="../../init.jsp"%>

<!DOCTYPE html>
<html>
<head>
<script>
var portletNamespace='<portlet:namespace/>';
</script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/forms/receipt-list.js"></script>
</head>
<portlet:renderURL var="receiptCreation">
	<portlet:param name="mvcPath" value="/jsp/receipt/receipt-form.jsp" />
</portlet:renderURL>
<portlet:renderURL var="send">
	<portlet:param name="mvcPath" value="/jsp/receipt/receipt-send.jsp" />
</portlet:renderURL>
<portlet:renderURL var="movement">
	<portlet:param name="mvcPath" value="/jsp/receipt/receipt-movement.jsp" />
</portlet:renderURL>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
			<div class="col" id="receiptListContainer"></div>
		</div>
	</div>

</body>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>

var id="<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>";
receiptList.actions[0].handler.href = '<%=receiptCreation%>';
receiptList.actions[1].handler.href = '<%=receiptCreation%>';
receiptList.actions[4].handler.href = '<%=movement%>';
	$(document).ready(() => {
		var jetList=JetList({"id":"receiptList", "parentId":"receiptListContainer", "form":receiptList});
		jetList.setDataKey(id);
		jetList.render();
	});
	//FOR SEND FUNCTION AND MOVEMENT FUNCTION
	function sendOnClick(event){
		event.preventDefault();
		var target = getEventTarget(event);
		var dataKey = $(target).attr('datakey');
		localStorage.setItem("receirId", dataKey);  
		window.location.href='<%=send%>';
	}
	
	function movementOnClick(event){
		 invokeUrl(event);
	}
</script>
</html>