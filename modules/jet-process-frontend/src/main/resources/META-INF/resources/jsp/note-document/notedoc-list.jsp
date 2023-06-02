<%@include file="../../init.jsp"%>

<portlet:renderURL var="noteDoc">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-form.jsp" />
</portlet:renderURL>
<portlet:renderURL var="send">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-send.jsp" />
</portlet:renderURL>
<portlet:renderURL var="movement">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-movement.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/notedoc-list.js"%>'></script>

<div class="container">
	<div id="noteDocListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />
<script>
	$(document).ready(() => {
		noteDocList.actions[0].handler.href = '<%=noteDoc%>';
		noteDocList.actions[1].handler.href = '<%=noteDoc%>';
		noteDocList.actions[4].handler.href = '<%=movement%>';
		var jetList=JetList({"id":"noteDocList", "parentId":"noteDocListContainer", "form":noteDocList});
		jetList.render();
	});
	
	//FOR SEND FUNCTION AND MOVEMENT FUNCTION
	function sendOnClick(event){
		event.preventDefault();
		var target = getEventTarget(event);
		var dataKey = $(target).attr('datakey');
		localStorage.setItem("noteDocumentId", dataKey);  
		window.location.href='<%=send%>';
	}
	
	function movementOnClick(event){
		 event.preventDefault();
		 invokeUrl(event);
	}
</script>