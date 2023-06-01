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
		let searchParams = new URLSearchParams(window.location.search);
		let id = searchParams.get('id');
		fileMovement.actions[0].handler.href = '<%=fileList%>';
		fileMovement.providers.collection.ajax = "http://localhost:8080/o/jet-process-rs/v1.0/filemovement?id="+id+"&p_auth=" + Liferay.authToken;
		var jetList=JetList({"id":"fileMovement", "parentId":"fileMovementContainer", "form":fileMovement});
		jetList.render();
	});
</script>