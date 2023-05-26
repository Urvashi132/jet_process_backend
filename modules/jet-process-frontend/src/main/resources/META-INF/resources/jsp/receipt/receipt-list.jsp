<%@include file="../../init.jsp" %>

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
	<portlet:param name="mvcPath" value="/receipt-form.jsp" />
</portlet:renderURL>
<!-- body  -->
<body>
	<div class="container">
	
		<div class="row">
			
	
			<div class="col-md-9" id="receiptListContainer" >
			
			</div>
			</div>
		</div>
	
</body>

<liferay-util:include page="/templates/jetform-template.jsp" servletContext="<%=application%>"/>
<script>

var id="<%=request.getParameter("id")!=null? request.getParameter("id"):""%>";
receiptList.actions[0].handler.href = '<%=receiptCreation%>';
receiptList.actions[1].handler.href = '<%=receiptCreation%>';
	$(document).ready(() => {
		var jetList=JetList({"id":"receiptList", "parentId":"receiptListContainer", "form":receiptList});
		jetList.setDataKey(id);
		jetList.render();
	});
</script>
</html>