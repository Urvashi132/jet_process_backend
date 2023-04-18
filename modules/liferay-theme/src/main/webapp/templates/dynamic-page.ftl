
 <#assign json_data = jsonFactoryUtil.createJSONObject(jsonString) />

<#assign jsonArray = jsonFactoryUtil.createJSONArray() />

<#assign  json =  jsonArray.put(json_data) />

<# list json as json_data>
            <form action = "#myform">
           <input type = "hidden", id = "siteId" value="${themeDisplay.getScopeGroupId()}"> 
           <input type = "hidden", id = "userId" value="${themeDisplay.getUserId()}"> 
           <input type = "hidden", id = "pageName" value="${json_data.pageName}"> 
           <input type = "hidden", id = "pageTitle" value="${json_data.pageTitle}"> 
           <input type = "hidden", id = "pageDescription" value="${json_data.pageDescription}"> 
           <input type = "hidden", id = "pageType" value="${json_data.pageType}"> 
           <input type = "hidden", id = "pageUrl" value="${json_data.pageURL}">
           <input type = "hidden", id = "privateLayout" value="${json_data.privateLayout}">
           <input type = "hidden", id = "parentLayoutId" value="${json_data.parentLayoutId}">

           
           </form>
 </# list>

 <#assign userId = themeDisplay.getUserId() />
      <#assign siteId = themeDisplay.getScopeGroupId() />
       	



<script type="text/javascript">
 
 $(document).ready(function(e){
 var siteId = $("#siteId").val();
   var pageName = $("#pageName").val();
    var pageTitle = $("#pageTitle").val();
     var pageDescription = $("#pageDescription").val();
      var pageType = $("#pageType").val();
       var pageUrl = $("#pageUrl").val();
        var privateLayout = $("#privateLayout").val();
         var parentLayoutId = $("#parentLayoutId").val();
       
  AUI().use('aui-base', function(A){
		Liferay.Service(
                 '/layout/add-layout',
      {
                 groupId: siteId,
                 privateLayout: privateLayout,
                 parentLayoutId: parentLayoutId,
                 name: pageName,
                 title: pageTitle,
                 description: pageDescription,
                 type: pageType,
                 hidden: false,
                 friendlyURL: pageUrl
     },
             function(obj) {
             console.log(obj);
      }
      );
     })
   
    })
    
    
</script>



