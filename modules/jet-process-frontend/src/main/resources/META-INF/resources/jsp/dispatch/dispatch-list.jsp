<%@include file="../../init.jsp"%>
<portlet:renderURL var="dispatchCreation">
	<portlet:param name="mvcPath" value="/jsp/dispatch/dispatch-form.jsp" />
</portlet:renderURL>
<!DOCTYPE html>
<html>
<head>
<script>
var portletNamespace='<portlet:namespace/>';
</script>
<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/dispatch-list.js"%>'></script>
</head>
<!-- body  -->
<body>
	<div class="container">
		<div class="row">
         <h1>Hello</h1>
		</div>
	</div>

</body>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
dispatchList.actions[0].handler.href = '<%=dispatchCreation%>';
var id="<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>";
	$(document).ready(() => {
		
		var jetList=JetList({"id":"dispatchList", "parentId":"dispatchListContainer", "form":dispatchList});
		jetList.setDataKey(id);
		jetList.render();
	});
	

</script>
</html>	
