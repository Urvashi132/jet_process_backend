<%@include file="../../init.jsp"%>

<portlet:renderURL var="noteDoc">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-form.jsp" />
</portlet:renderURL>
<portlet:renderURL var="send">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-send.jsp" />
</portlet:renderURL>
<portlet:renderURL var="movement">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-movement.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/note-list.js"%>'></script>

<div class="container">
	<div id="noteListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		noteList.actions[0].handler.href = '<%=noteDoc%>';
		noteList.actions[1].handler.href = '<%=noteDoc%>';
		noteList.actions[2].handler.href = '<%=noteDoc%>';
		noteList.actions[3].handler.href = '<%=noteDoc%>';
		var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
		var jetList=JetList({"id":"noteList", "parentId":"noteListContainer", "form":noteList});
		jetList.setDataKey(id);
		jetList.render();
	});
</script>