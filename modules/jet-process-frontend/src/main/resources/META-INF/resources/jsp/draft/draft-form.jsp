<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@include file="../../init.jsp"%>
<style>
.detail {
	background-color: lightgray;
	padding: 0.5%;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/draft/draft-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/draft-form.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="draftFormContainer">
			<form id="draftForm">
				<h1>Create Draft</h1>
				<div class="row m-2 border" id="draftDetails">
					<h5 class="detail">Draft Details</h5>
				</div>
				<div class="row m-2 border" id="onlineEditor">
					<h5 class="detail">Online Content</h5>
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
	jetform.render();
	setTimeout(function(){
		CKEDITOR.replace('content');
	}, 2000); 
});
</script>