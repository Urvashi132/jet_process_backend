<%@include file="init.jsp"%>

<portlet:renderURL var="fileCreation">
	<portlet:param name="mvcPath" value="/file-form.jsp" />
</portlet:renderURL>
<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-list-json.js"%>'></script>

<div class="container">
	<div id="fileListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		fileList.actions[0].handler.href = '<%=fileCreation%>';
		fileList.actions[1].handler.href = '<%=fileCreation%>';
		var jetList=JetList({"id":"fileList", "parentId":"fileListContainer", "form":fileList});
		jetList.render();
	});
</script>