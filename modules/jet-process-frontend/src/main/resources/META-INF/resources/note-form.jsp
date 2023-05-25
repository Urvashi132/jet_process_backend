<script src="//cdn.ckeditor.com/4.20.1/full/ckeditor.js"></script>
<%@include file="init.jsp"%>
<style>
.text-margin {
	margin: 0px 14px 9px;
}
</style>

<portlet:renderURL var="list">
	<portlet:param name="mvcPath" value="/note-list.jsp" />
</portlet:renderURL>

<script type="text/javascript"
	src='<%=request.getContextPath() + "/js/forms/note-json.js"%>'></script>

<div class="container">
	<div class="row">
		<div class="col" id="noteFormContainer">
			<h3>Create Note</h3>
			<form id="noteForm"></form>
		</div>
	</div>
</div>


<script>

	$(document).ready(() => {
		let content = noteForm.fields[2].name;
		noteForm.actions[1].handler.href = '<%=list%>';
		$('#subject').closest("div").addClass("text-margin");
		$('#content').closest("div").addClass("text-margin");
		var jetform=JetForm({"id":"noteForm", "parentId":"noteFormContainer", "form":noteForm});
		jetform.render(); 
		
		/* setTimeout(function(){
		CKEDITOR.replace('content');}, 2000); */
				 
		CKEDITOR.replace(content); 

		var m = new Date().getMonth()+1;
		$('#createDate').val(new Date().getDate()+"/"+m+"/"+new Date().getFullYear());
		$('#createDate').attr("disabled",true);
		$('#groupId').val(Liferay.ThemeDisplay.getScopeGroupId());
	});
</script>
<liferay-util:include page="/templates/jetform-template.jsp"
	servletContext="<%=application%>">
</liferay-util:include>