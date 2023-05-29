<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/notedoc-send.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="noteDocSendContainer">
			<h3>Send Note Document</h3>
			<div class="border p-3 m-1">
				<form id="noteDocSend"></form>
			</div>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	noteDocSend.actions[0].redirects.success.href = '<%=list%>';
	noteDocSend.actions[1].handler.href = '<%=list%>';
	var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
	var jetform=JetForm({"id":"noteDocSend", "parentId":"noteDocSendContainer", "form":noteDocSend});
	console.log("id from jsp page"+id);
	jetform.setDataKey(id);
	jetform.render();

});
</script>
