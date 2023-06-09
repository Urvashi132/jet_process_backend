<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@include file="../../init.jsp"%>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/draft/draft-list.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addRecipient"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/jsp/draft/recipient-form.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/recipient-list.js"%>'></script>

<div class="container">
	<div class="row">	
		<div id="recipientListContainer"></div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	recipientList.actions[0].handler.script = 'openLiferayPopup';
	recipientList.actions[1].handler.href = '<%=list%>';
	var jetList=JetList({"id":"recipientList", "parentId":"recipientListContainer", "form":recipientList});
	jetList.render();
});
function draftListOnClick(event){
	 event.preventDefault();
	 invokeUrl(event);
}
</script>
<aui:script>

function openLiferayPopup(){
	var url= '<%=addRecipient.toString()%>';
	var dialogId='addRecipientDialog';
	var title ='Add Recipient';
	var width = 640;
	LiferayUtilOpenWindow(dialogId, title, url, true, 440, true, width);
}

function LiferayUtilOpenWindow(id, title, uri, centered, height, modal, width){
	Liferay.Util.openWindow({
		dialog: {
			centered: centered,
			height: height,
			modal: modal,
			width: width,
			destroyOnClose: true
		},
		id: id,
		title: title,
		uri: uri
	});
}
</aui:script>
