<%@include file="../../init.jsp"%>

<portlet:renderURL var="draft">
	<portlet:param name="mvcPath" value="/jsp/draft/draft-form.jsp" />
</portlet:renderURL>

<portlet:renderURL var="recipientList">
	<portlet:param name="mvcPath" value="/jsp/draft/recipient-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/draft-list.js"%>'></script>

<div class="container">
	<div id="draftListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />

<script>
	$(document).ready(() => {
		draftList.actions[0].handler.href = '<%=draft%>';
		draftList.actions[1].handler.href = '<%=draft%>';
		draftList.actions[3].handler.href = '<%=recipientList%>';
		var jetList=JetList({"id":"draftList", "parentId":"draftListContainer", "form":draftList});
		jetList.render();
	});
	
	function recipientListOnClick(event){
		 event.preventDefault();
		 invokeUrl(event);
	}
</script>