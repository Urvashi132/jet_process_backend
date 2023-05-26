<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/file/file-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-send.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="fileSendContainer">
			<h3>Send File</h3>
			<div class="border p-3 m-1">
				<form id="fileSend"></form>
			</div>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	<%-- fileForm.actions[0].redirects.success.href = '<%=list%>';
	 --%>
	var id='<%=request.getParameter("id") != null ? request.getParameter("id") : ""%>';
	var jetform=JetForm({"id":"fileSend", "parentId":"fileSendContainer", "form":fileSend});
	console.log("id from jsp page"+id);
	jetform.setDataKey(id);
	jetform.render();

});
</script>
