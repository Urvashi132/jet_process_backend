<%@include file="../../init.jsp"%>

<portlet:renderURL var="fileList">
	<portlet:param name="mvcPath" value="/jsp/file/file-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-movement.js"%>'></script>

<div class="container">
	<div id="fileMovementContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		fileMovement.actions[0].handler.href = '<%=fileList%>';
		var jetList=JetList({"id":"fileMovement", "parentId":"fileMovementContainer", "form":fileMovement});
		jetList.render();
	});
</script>