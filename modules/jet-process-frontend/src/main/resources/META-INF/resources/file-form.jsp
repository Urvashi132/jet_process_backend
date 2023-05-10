<%@include file="init.jsp"%>
<style>
.text-margin {
	margin: 0px 14px 9px;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/file-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-json.js"%>'></script>

<div class="container border m-2">
	<div class="row">
		<div class="col" id="fileFormContainer">
			<h3>New File</h3>
			<form id="fileForm"></form>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	fileForm.actions[0].redirects.success.href = '<%=list%>';
	fileForm.actions[1].redirects.success.href = '<%=list%>';
	
	var jetform=JetForm({"id":"fileForm", "parentId":"fileFormContainer", "form":fileForm});
	jetform.render();

	$('#fileNo').closest("div").hide();
	$('#fileNo').closest("div").addClass("text-margin");
	$('#groupId').val(Liferay.ThemeDisplay.getScopeGroupId());
	$('#year').val(new Date().getFullYear());
	$('#year').attr("readonly", true);
});
/* function setFileDocIdFieldForSFS(){
	var type = $('#type').val();
	if(type == "SFS"){
		$('#fileNo').closest("div").show();
		$('#fileGroup2').css("display","none");
	}else{
		$('#fileGroup2').css("display","");
		$('#fileNo').closest("div").hide();
	}
 } */
</script>
