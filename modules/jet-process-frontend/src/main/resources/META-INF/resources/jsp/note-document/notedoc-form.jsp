<%@include file="../../init.jsp"%>
<style>
.text-margin {
	margin: 0px 14px 9px;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/jsp/note-document/notedoc-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/notedoc-form.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="noteDocFormContainer">
			<h3>Create Note</h3>
			<form id="noteDocForm"></form>
		</div>
	</div>
</div>


<script>

	$(document).ready(() => {
		let content = noteDocForm.fields[2].name;
		noteDocForm.actions[1].handler.href = '<%=list%>';
		$('#subject').closest("div").addClass("text-margin");
		$('#content').closest("div").addClass("text-margin");
		var jetform=JetForm({"id":"noteDocForm", "parentId":"noteDocFormContainer", "form":noteDocForm});
		jetform.render(); 
		
		setTimeout(function(){
		CKEDITOR.replace('content');}, 2000); 
				 
		/* CKEDITOR.replace(content);  */

		var m = new Date().getMonth()+1;
		$('#createDate').val(new Date().getDate()+"/"+m+"/"+new Date().getFullYear());
		$('#createDate').attr("disabled",true);
		$('#groupId').val(Liferay.ThemeDisplay.getScopeGroupId());
	});
</script>
<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>