<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/receipt/draft-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/recipient-form.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col m-2" id="recipientFormContainer">
		<form id="recipientForm">
		<div class="row" id="organizationDetails"></div>
		</form>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
	$(document).ready(() => {
		recipientForm.actions[0].redirects.success.href = '<%=list%>';
		recipientForm.actions[1].handler.href = '<%=list%>';
		var jetform=JetForm({"id":"recipientForm", "parentId":"recipientFormContainer", "form":recipientForm});
		jetform.render();
	});
</script>