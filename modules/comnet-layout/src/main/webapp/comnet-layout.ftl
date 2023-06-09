<div class="dashboard-layout" id="main-content" role="main">
	<div class="row">
		<div class="col-md-11 pt-2">
			<div class="portlet-layout row">
				<div class="col-md-8 portlet-column portlet-column-first" id="column-1">
					${processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")}
				</div>
		
				<div class="col-md-4 portlet-column" id="column-2">
					${processor.processColumn("column-2", "portlet-column-content")}
				</div>
				
			</div>	
			<div class="portlet-layout row">
				<div class="col portlet-column portlet-column-first" id="column-3">
					${processor.processColumn("column-3", "portlet-column-content portlet-column-content-first")}
				</div>
		
			</div>
			
			<div class="portlet-layout row">
				<div class="col portlet-column portlet-column-first" id="column-4">
					${processor.processColumn("column-4", "portlet-column-content portlet-column-content-first")}
				</div>
		
			</div>
			
			<div class="portlet-layout row">
				<div class="col-md-3 portlet-column portlet-column-first" id="column-5">
					${processor.processColumn("column-5", "portlet-column-content portlet-column-content-first")}
				</div>
		
				<div class="col-md-3 portlet-column" id="column-6">
					${processor.processColumn("column-6", "portlet-column-content")}
				</div>
				
				<div class="col-md-6 portlet-column portlet-column-last" id="column-7">
					${processor.processColumn("column-7", "portlet-column-content")}
				</div>
			</div>	
			
			<div class="portlet-layout row">
				<div class="col-md-3 portlet-column portlet-column-first" id="column-8">
					${processor.processColumn("column-8", "portlet-column-content portlet-column-content-first")}
				</div>
		
				<div class="col-md-6 portlet-column" id="column-9">
					${processor.processColumn("column-9", "portlet-column-content")}
				</div>
				
				<div class="col-md-3 portlet-column portlet-column-last" id="column-10">
					${processor.processColumn("column-10", "portlet-column-content")}
				</div>
			</div>	
			
			<div class="portlet-layout row">
				<div class="col-md-3 portlet-column portlet-column-first" id="column-11">
					${processor.processColumn("column-11", "portlet-column-content portlet-column-content-first")}
				</div>
		
				<div class="col-md-3 portlet-column" id="column-12">
					${processor.processColumn("column-12", "portlet-column-content")}
				</div>
				
				<div class="col-md-3 portlet-column" id="column-13">
					${processor.processColumn("column-13", "portlet-column-content")}
				</div>
				
				<div class="col-md-3 portlet-column portlet-column-last" id="column-14">
					${processor.processColumn("column-14", "portlet-column-content portlet-column-content-last")}
				</div>
				
			</div>
		
			<div class="portlet-layout row">
				<div class="col-md-6 portlet-column portlet-column-first" id="column-15">
					${processor.processColumn("column-15", "portlet-column-content portlet-column-content-first")}
				</div>
		
				<div class="col-md-6 portlet-column portlet-column-last" id="column-16">
					${processor.processColumn("column-16", "portlet-column-content portlet-column-content-last")}
				</div>
			</div>
		</div>
		<div class="col-md-1">
			<div id="right-panel" class="float-right" style="width:5%; transition: all 1s ease-in-out;">
				<aside class="newSideBarRight float-right">            
					<div class="profile list-unstyled">
						<a id="portlet-list" class="text-white" title="View Dashboard Widgets">
							<i class="fa fa-cog" aria-hidden="true" style='color: white'></i>
						</a>
					</div>
				</aside>
			</div>
			<div id="application-view" style="position: absolute;right: 70px;width: 280px;mt-2; display: none;" class="overlay">
			    ${processor.processPortlet("com_adjecti_dashboard_widget_web_DashboardWidgetPortlet_INSTANCE_application")}
			    ${processor.processColumn("column-17", "portlet-column-content portlet-column-content-last")}
			</div>
		</div>
	</div>
</div>
<script>

$("#portlet-list").click(function(){
	$("#application-view").toggle();
});
$("#application-widget-close").click(function(){
	$("#application-view").hide();
});
setTimeout(function() {
	var removeLink = '<a onclick="removeWidget(this)"><i class="fa fa-remove"></i></a>';
	$(".dashboard-layout").find(".portlet-topper-toolbar").html(removeLink);
}, 5000);
</script>