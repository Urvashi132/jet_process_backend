<%@include file="init.jsp"%>

<portlet:renderURL var="noteDocumentCreation">
	<portlet:param name="mvcPath" value="/note-form.jsp" />
</portlet:renderURL>
<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/note-list-json.js"%>'></script>

<div class="container">
	<div id="noteListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		noteList.actions[0].handler.href = '<%=noteDocumentCreation%>';
		noteList.actions[1].handler.href = '<%=noteDocumentCreation%>';
		var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
		var jetList=JetList({"id":"noteList", "parentId":"noteListContainer", "form":noteList});
		jetList.setDataKey(id);
		jetList.render();
	});
</script>