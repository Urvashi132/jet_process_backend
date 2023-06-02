<%@include file="../../init.jsp"%>

<portlet:renderURL var="fileCreation">
	<portlet:param name="mvcPath" value="/jsp/file/file-form.jsp" />
</portlet:renderURL>
<portlet:renderURL var="send">
	<portlet:param name="mvcPath" value="/jsp/file/file-send.jsp" />
</portlet:renderURL>
<portlet:renderURL var="movement">
	<portlet:param name="mvcPath" value="/jsp/file/file-movement.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-list.js"%>'></script>

<div class="container">
	<div id="fileListContainer"></div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>" />

<script>
	$(document).ready(() => {
		fileList.actions[0].handler.href = '<%=fileCreation%>';
		fileList.actions[1].handler.href = '<%=fileCreation%>';
		fileList.actions[4].handler.href = '<%=movement%>';
		var jetList=JetList({"id":"fileList", "parentId":"fileListContainer", "form":fileList});
		jetList.render();
	});
	
	//FOR SEND FUNCTION AND MOVEMENT FUNCTION
	function sendOnClick(event){
		event.preventDefault();
		var target = getEventTarget(event);
		var dataKey = $(target).attr('datakey');
		localStorage.setItem("fileId", dataKey);  
		window.location.href='<%=send%>';
	}
	
	function movementOnClick(event){
		 event.preventDefault();
		 invokeUrl(event);
	}
</script>