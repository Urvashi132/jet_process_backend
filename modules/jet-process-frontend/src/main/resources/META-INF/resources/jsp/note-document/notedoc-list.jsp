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
	src='<%=request.getContextPath() + "/js/forms/notedoc-list.js"%>'></script>

<div class="container">
	<div id="noteDocListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		noteDocList.actions[0].handler.href = '<%=noteDoc%>';
		noteDocList.actions[1].handler.href = '<%=noteDoc%>';
		noteDocList.actions[3].handler.href = '<%=send%>';
		noteDocList.actions[4].handler.href = '<%=movement%>';
		var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
		var jetList=JetList({"id":"noteDocList", "parentId":"noteDocListContainer", "form":noteDocList});
		jetList.setDataKey(id);
		jetList.render();
	});
</script>