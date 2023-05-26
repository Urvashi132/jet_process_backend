<%@include file="../../init.jsp"%>

<portlet:renderURL var="fileCreation">
	<portlet:param name="mvcPath" value="/jsp/file/file-form.jsp" />
</portlet:renderURL>
<portlet:renderURL var="send">
	<portlet:param name="mvcPath" value="/jsp/file/file-send.jsp" />
</portlet:renderURL>
<portlet:renderURL var="movement">
	<portlet:param name="mvcPath" value="/jsp/file/file-movement.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-list.js"%>'></script>

<div class="container">
	<div id="fileListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		fileList.actions[0].handler.href = '<%=fileCreation%>';
		fileList.actions[1].handler.href = '<%=fileCreation%>';
		fileList.actions[3].handler.href = '<%=send%>';
		fileList.actions[4].handler.href = '<%=movement%>';
		var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
		var jetList=JetList({"id":"fileList", "parentId":"fileListContainer", "form":fileList});
		jetList.setDataKey(id);
		jetList.render();
	});
</script>