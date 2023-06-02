<%@include file="../../init.jsp"%>

<portlet:renderURL var="noteDocList">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/notedoc-movement.js"%>'></script>

<div class="container">
	<div id="noteDocMovementContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		let searchParams = new URLSearchParams(window.location.search);
		let id = searchParams.get('id');
		noteDocMovement.actions[0].handler.href = '<%=noteDocList%>';
		noteDocMovement.providers.collection.ajax = "http://localhost:8080/o/jet-process-rs/v1.0/notedocumentmovement?noteDocumentId="+id+"&p_auth=" + Liferay.authToken;
		var jetList=JetList({"id":"noteDocMovement", "parentId":"noteDocMovementContainer", "form":noteDocMovement});
		jetList.render();
	});
</script>