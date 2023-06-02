<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/file/file-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-send.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="fileSendContainer"></div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
	$(document).ready(() => {
		fileSend.actions[0].redirects.success.href = '<%=list%>';
		fileSend.actions[1].handler.href = '<%=list%>';
		var jetform=JetForm({"id":"fileSend", "parentId":"fileSendContainer", "form":fileSend});
		jetform.render();
		var id=localStorage.getItem("fileId");  
		$('#fileId').val(id);
	});
</script>