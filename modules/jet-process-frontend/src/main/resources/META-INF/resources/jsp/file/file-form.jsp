<%@include file="../../init.jsp"%>
<style>
.text-margin {
	margin: 0px 14px 9px;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/file/file-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/file-form.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="fileFormContainer">
			<h3>New File</h3>
			<div class="border p-3 m-1">
				<form id="fileForm">
					<div class="row" id="fileType"></div>
					<h6>File No</h6>
					<div class="row border m-1" id="fileNumberGroup"></div>
					<div class="row" id="fileNoGroup"></div>
					<div class="row mt-3" id="fileCategoryAndReference"></div>
				</form>
			</div>
		</div>
	</div>
</div>

<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>

<script>
$(document).ready(() => {
	fileForm.actions[0].redirects.success.href = '<%=list%>';
	fileForm.actions[1].handler.href = '<%=list%>';
	
	var jetform=JetForm({"id":"fileForm", "parentId":"fileFormContainer", "form":fileForm});
	jetform.render();

	$('#groupId').val(Liferay.ThemeDisplay.getScopeGroupId());
	$('#year').val(new Date().getFullYear());
	$('#year').attr("readonly", true);
		
});
function typeSFS(){
	var type = $('#type').val();
	if(type == "SFS"){
		$('#fileNo').attr("type","text").addClass("form-control");
		$('#fileNumberGroup').css("display","none");
	}else{
		$('#fileNumberGroup').css("display","");
		$('#fileNo').attr("type","hidden");
	}
 } 
</script>