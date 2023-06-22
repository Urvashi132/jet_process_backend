<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath"
		value="/jsp/note-document/notedoc-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/notedoc-send.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="noteDocSendContainer"></div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	noteDocSend.actions[0].redirects.success.href = '<%=list%>';
	noteDocSend.actions[1].handler.href = '<%=list%>';
	var jetform=JetForm({"id":"noteDocSend", "parentId":"noteDocSendContainer", "form":noteDocSend});
	jetform.render();
	/* var id=localStorage.getItem("noteDocumentId");  
	$('#noteDocumentId').val(id); */
});
</script>
