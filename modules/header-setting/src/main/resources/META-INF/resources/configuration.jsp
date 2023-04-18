<%@ include file="init.jsp"%>
<style>
.clear_uploaded_icon {
	position: absolute;
	margin-top: -3rem;
	right: 12%;
	color: red;
	cursor: pointer;
}

.display_template  	.control-label {
	display: none;
}
</style>
<%
	long documentFolderId = 0;
	long groupId = themeDisplay.getScopeGroupId();
	List<Folder> mainFolders = DLAppServiceUtil.getFolders(groupId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID);
	try {
		for (Folder folder : mainFolders) {
			if (folder.getName().equals("Theme-HeaderSetting")) {
				documentFolderId = folder.getFolderId();
			}
		}
	} catch (Exception e) {
	}

	/* if folder is exist */
	if (documentFolderId == 0) {
%>
<div class="container mt-3">
	<div class="card">
		<div class="card-body text-center">
			<h4>
				Please create a folder "<span class="text-danger">Theme-HeaderSetting</span>"
				in Document and Media.
			</h4>
		</div>
	</div>
</div>
<%
	} else {

		String[] uploadedIconName1 = null;
		String[] uploadedIconName2 = null;
		String[] uploadedIconName3 = null;
		String[] uploadedIconName4 = null;
		String[] uploadedIconName5 = null;
		if (icon1 != null && icon1 != "") {
			 uploadedIconName1 = icon1.split("/"); 
		}
		if (icon2 != null && icon2 != "") {
			uploadedIconName2 = icon2.split("/");
		}
		if (icon3 != null && icon3 != "") {
			uploadedIconName3 = icon3.split("/");
		}
		if (icon4 != null && icon4 != "") {
			uploadedIconName4 = icon4.split("/");
		}
		if (icon5 != null && icon5 != "") {
			uploadedIconName5 = icon5.split("/");
		}
%>


<liferay-portlet:actionURL portletConfiguration="<%=true%>"
	var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%=true%>"
	var="configurationRenderURL" />
<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden"
		value="<%=configurationRenderURL%>" />


	<div class="container" id="setting1">
		<div class="container border rounded m-2">
			<legend>Setting 1</legend>
			<aui:input name="title1" label="Title"
				placeholder="Please enter title" value="<%=title1%>" />
			<aui:input name="icon1" label="Icon" type="file"
				onChange="uploadImg(1)" />
			<aui:input name="fileIdIcon1" type="hidden" value="<%=icon1%>" />
			<div id="error1"></div>
			<div id="uploaded_icon_1" style="display: none;">
				<aui:input type="text" name="uploaded_icon1" label="Icon"
					value="<%=uploadedIconName1 != null ? uploadedIconName1[4] : null%>" />
				<span class="clear_uploaded_icon" onclick="removeUploadIcon(1)">X</span>
			</div>
			<aui:input name="dataProviderURL1" label="Data ProviderURL"
				placeholder="Please enter your data provider url"
				value="<%=dataProviderURL1%>" />
			<aui:input name="displayTemplate1" label="Display Template"
				type="textarea" value="<%=displayTemplate1%>" />
			<aui:button cssClass="add2 mb-2" type="button"
				style="margin-left: 92.7%;" onclick="addHeaderSetting(2)"
				value="+ Add" />
		</div>
	</div>

	<div class="container" id="setting2" style="display: none;">
		<div class="container border rounded m-2">
			<legend>Setting 2</legend>
			<div class="text-right">
				<aui:button type="button" id="remove" value="- Remove"
					onClick="removeHeaderSetting(2)" style="margin-top: -4%;" />
			</div>
			<aui:input name="title2" label="Title" value="<%=title2%>"
				disabled="true" placeholder="Please enter title" />
			<aui:input name="icon2" label="Icon" type="file"
				onChange="uploadImg(2)" disabled="true" />
			<aui:input name="fileIdIcon2" type="hidden" value="<%=icon2%>" />
			<div id="error2"></div>
			<div id="uploaded_icon_2" style="display: none;">
				<aui:input type="text" name="uploaded_icon2" label="Icon"
					value="<%=uploadedIconName2 != null ? uploadedIconName2[4] : null%>" />
				<span class="clear_uploaded_icon" onclick="removeUploadIcon(2)">X</span>
			</div>
			<aui:input name="dataProviderURL2" label="Data ProviderURL"
				value="<%=dataProviderURL2%>" disabled="true"
				placeholder="Please enter your data provider url" />
			<aui:button cssClass="add3 mb-2" type="button"
				style="margin-left: 92.7%;" onclick="addHeaderSetting(3)"
				value="+ Add" />
		</div>
	</div>

	<div class="container" id="setting3" style="display: none;">
		<div class="container border rounded m-2">
			<legend>Setting 3</legend>
			<div class="text-right">
				<aui:button type="button" id="remove" value="- Remove"
					style="margin-top: -4%;" onClick="removeHeaderSetting(3)" />
			</div>
			<aui:input name="title3" label="Title" value="<%=title3%>"
				disabled="true" placeholder="Please enter title" />
			<aui:input name="icon3" label="Icon" type="file" disabled="true"
				onChange="uploadImg(3)" />
			<aui:input name="fileIdIcon3" type="hidden" value="<%=icon3%>"></aui:input>
			<div id="error3"></div>
			<div id="uploaded_icon_3" style="display: none;">
				<aui:input type="text" name="uploaded_icon3" label="Icon"
					value="<%=uploadedIconName3 != null ? uploadedIconName3[4] : null%>" />
				<span class="clear_uploaded_icon" onclick="removeUploadIcon(3)">X</span>
			</div>
			<aui:input name="dataProviderURL3" label="Data ProviderURL"
				disabled="true" value="<%=dataProviderURL3%>"
				placeholder="Please enter your data provider url" />
			<aui:button cssClass="add4 mb-2" type="button"
				style="margin-left: 92.7%;" onclick="addHeaderSetting(4)"
				value="+ Add" />
		</div>
	</div>

	<div class="container" id="setting4" style="display: none;">
		<div class="container border rounded m-2">
			<legend>Setting 4</legend>
			<div class="text-right">
				<aui:button type="button" id="remove" value="- Remove"
					style="margin-top: -4%;" onClick="removeHeaderSetting(4)" />
			</div>
			<aui:input name="title4" label="Title" value="<%=title4%>"
				placeholder="Please enter title" disabled="true" />
			<aui:input name="icon4" label="Icon" type="file"
				onChange="uploadImg(4)" disabled="true" />
			<aui:input name="fileIdIcon4" type="hidden" value="<%=icon4%>" />
			<div id="error4"></div>
			<div id="uploaded_icon_4" style="display: none;">
				<aui:input type="text" name="uploaded_icon4" label="Icon"
					value="<%=uploadedIconName4 != null ? uploadedIconName4[4] : null%>" />
				<span class="clear_uploaded_icon" onclick="removeUploadIcon(4)">X</span>
			</div>
			<aui:input name="dataProviderURL4" label="Data ProviderURL"
				value="<%=dataProviderURL4%>" disabled="true"
				placeholder="Please enter your data provider url" />
			<aui:button cssClass="add5 mb-2" type="button"
				style="margin-left: 92.7%;" onclick="addHeaderSetting(5)"
				value="+ Add" />
		</div>
	</div>

	<div class="container" id="setting5" style="display: none;">
		<div class="container border rounded m-2">
			<legend>Setting 5</legend>
			<div class="text-right">
				<aui:button type="button" id="remove" value="- Remove"
					style="margin-top: -4%;" onClick="removeHeaderSetting(5)" />
			</div>
			<aui:input name="title5" label="Title" value="<%=title5%>"
				placeholder="Please enter title" disabled="true" />
			<aui:input name="icon5" label="Icon" type="file"
				onChange="uploadImg(5)" disabled="true" />
			<aui:input name="fileIdIcon5" type="hidden" value="<%=icon5%>" />
			<div id="error5"></div>
			<div id="uploaded_icon_5" style="display: none;">
				<aui:input type="text" name="uploaded_icon5" label="Icon"
					value="<%=uploadedIconName5 != null ? uploadedIconName5[4] : null%>" />
				<span class="clear_uploaded_icon" onclick="removeUploadIcon(5)">X</span>
			</div>
			<aui:input name="dataProviderURL5" label="Data ProviderURL"
				value="<%=dataProviderURL5%>" disabled="true"
				placeholder="Please enter your data provider url" />
		</div>
	</div>

	<hr>
	<div class="float-right mr-4 pb-2">
		<aui:button id="save" type="submit" value="Save" />
	</div>
</aui:form>
<%
	}
%>

<aui:script>
if(('#<portlet:namespace />title1' == '') || ('#<portlet:namespace />title1' == null)){
 var requiredFields = ['#<portlet:namespace />title1' , '#<portlet:namespace />icon1','#<portlet:namespace />dataProviderURL1' ];
	$(requiredFields.join()).attr("required","true");
}
	<!-- for have the value fileIdIcon  -->
for(var i=1; i<6; i++ ){
	var uploaded_file =$("#<portlet:namespace />fileIdIcon"+i).val();
	if(uploaded_file != ''){
		document.getElementById('setting'+i).style.display = "block";
		$('#<portlet:namespace />icon'+i).css("display", "none");
		let fileLabel='label[for=<portlet:namespace />icon'+i+']';
		$(fileLabel).hide();
		$('#uploaded_icon_'+i).css("display", "block");
		$('.add'+i).css("display", "none");	
		var required_field = ['#<portlet:namespace />title'+i , '#<portlet:namespace />dataProviderURL'+i ];
		$(required_field.join()).attr("required","true");
		var setting = ['#<portlet:namespace />title'+i , '#<portlet:namespace />icon'+i,'#<portlet:namespace />dataProviderURL'+i ];
		$(setting.join()).removeClass("disabled");
		$(setting.join()).removeAttr("disabled");
	}
}


<!-- for add header setting -->
function addHeaderSetting(id) {
	document.getElementById('setting'+id).style.display = "block";
	$('.add'+id).css("display", "none");
	var setting = ['#<portlet:namespace />title'+id , '#<portlet:namespace />icon'+id,'#<portlet:namespace />dataProviderURL'+id ];
	$(setting.join()).attr("required","true");
	$(setting.join()).removeClass("disabled");
	$(setting.join()).removeAttr("disabled");
}

<!-- for add header setting -->
function removeHeaderSetting(id) {
	document.getElementById('setting'+id).style.display = "none";
	$('.add'+id).css("display", "block");
	$('#<portlet:namespace />title'+id).val("");
	$('#<portlet:namespace/>icon'+id).val("");
	$('#<portlet:namespace />fileIdIcon'+id).val("");
	$('#<portlet:namespace />dataProviderURL'+id).val("");
	var setting = ['#<portlet:namespace />title'+id , '#<portlet:namespace />icon'+id,'#<portlet:namespace />dataProviderURL'+id ];
	$(setting.join()).removeAttr("required");
	$(setting.join()).addClass("disabled");
	$(setting.join()).attr("disabled");
}

<!-- for upload icon -->
function uploadImg(i){
    var file= $('#<portlet:namespace />icon'+i)[0].files[0];
   	let formData = new FormData(); 
  	formData.append("file", file);
	$.ajax({
		 type : "POST",
		 url : "${portalURL}/o/headless-delivery/v1.0/document-folders/" + <%=documentFolderId%> + "/documents?p_auth=" + Liferay.authToken,
		 data : formData,
		 cache : false,
		 processData : false,
	     contentType : false,		   
	}).done(function(response) {
			console.log(response.contentUrl);
			$('#error'+i).remove();
			$('#<portlet:namespace />fileIdIcon'+i).val(response.contentUrl);
	}).fail(function(e) {
		console.log("error --- "+e);
		$('#taken_file_name').remove();
      	$('#error'+i).append('<p class="text-success" id="taken_file_name">This file name is already taken</p>');
	}); 
}

<!-- for display the value of icon in field -->
function removeUploadIcon(id){
	$('#<portlet:namespace />fileIdIcon'+id).val("");
	$('#<portlet:namespace />icon'+id).css("display", "block");
	let fileLabel='label[for=<portlet:namespace />icon'+id+']';
	$(fileLabel).css("display", "block");
	$('#uploaded_icon_'+id).css("display", "none");
	var setting = ['#<portlet:namespace />title'+id , '#<portlet:namespace />icon'+id,'#<portlet:namespace />dataProviderURL'+id ];
	$(setting.join()).attr("required","true");
}

</aui:script>