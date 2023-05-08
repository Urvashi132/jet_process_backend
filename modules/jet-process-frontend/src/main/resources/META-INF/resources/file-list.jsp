<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="fileCreation">
	<portlet:param name="mvcPath" value="/file-form.jsp" />
</portlet:renderURL>
<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-json.js"%>'></script>

<div class="container">
	<div id="fileListContainer"></div>

</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		fileForm.actions[2].handler.href = '<%=fileCreation%>';
	
		var jetList=JetList({"id":"fileList", "parentId":"fileListContainer", "form":fileForm});
		jetList.render();
	});
</script>