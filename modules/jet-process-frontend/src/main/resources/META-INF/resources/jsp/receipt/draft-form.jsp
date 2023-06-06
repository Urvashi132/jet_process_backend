<%@include file="../../init.jsp"%>
<style>
.text-margin {
	margin: 0px 14px 9px;
}

.detail {
	background-color: lightgray;
	padding: 0.5%;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/receipt/draft-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/draft-form.js"%>'></script>
<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/recipient-list.js"%>'></script>


<div class="container">
	<div class="row">
		<div class="col border" id="draftFormContainer">
			<h3>Draft</h3>
			<form id="draftForm">
				<div class="row">
					<div class="col-6" id="onlineEditor"></div>
					<div class="col-6">
						<h5 class="detail">Draft Details</h5>
						<div class="row" id="draftDetails"></div>
						<div id="recipientListContainer"></div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	draftForm.actions[0].redirects.success.href = '<%=list%>';
	draftForm.actions[1].handler.href = '<%=list%>';
	var jetform=JetForm({"id":"draftForm", "parentId":"draftFormContainer", "form":draftForm});
	var jetList=JetList({"id":"recipientList", "parentId":"recipientListContainer", "form":recipientList});
	jetform.render();
	jetList.render();
	CKEDITOR.replace('content'); 
});
</script>