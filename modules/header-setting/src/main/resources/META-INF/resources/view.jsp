<%@ include file="init.jsp"%>

<style>
.header_setting li {
	float: left;
}

.header_setting .header_setting_icon {
	margin-top: 0.8rem;
	margin-right: 1.5rem;
}
</style>
<div class="header_setting">
	<c:choose>
		<c:when test="<%=icon1 == null || icon1 == ""%>">
			<h6 class="text-white header_setting_icon">choose your header
				setting</h6>
		</c:when>
		<c:otherwise>

			<c:if test="<%=icon1 != ""%>">
				<li class="nav-item dropdown notification_dropdown">
					<%-- <h1><%=title%></h1> --%> <img alt="icon"
					class="header_setting_icon" src="${portalURL}<%=icon1%>"
					data-bs-toggle="dropdown" height="17.5" width="17.5" /> <%-- <a href="<%=dataProviderURL %>"></a> --%>
					<div class="dropdown-menu dropdown-menu-end">
						<div id="DZ_W_TimeLine02"
							class="widget-timeline dz-scroll style-1 p-3 height370">
							<ul class="timeline" id="header_setting_1_data">

							</ul>
						</div>
					</div>
				</li>
			</c:if>


			<c:if test="<%=icon2 != ""%>">
				<li class="nav-item dropdown notification_dropdown">
					<%-- <h1><%=title%></h1> --%> <img alt="icon"
					class="header_setting_icon" src="${portalURL}<%=icon2%>"
					height="17.5" width="17.5"> <%-- <a href="<%=dataProviderURL %>"></a> --%>
				</li>
			</c:if>
			<c:if test="<%=icon3 != ""%>">
				<li class="nav-item dropdown notification_dropdown">
					<%-- <h1><%=title%></h1> --%> <img alt="icon"
					class="header_setting_icon" src="${portalURL}<%=icon3%>"
					height="17.5" width="17.5"> <%-- <a href="<%=dataProviderURL %>"></a> --%>
				</li>
			</c:if>
			<c:if test="<%=icon4 != ""%>">
				<li class="nav-item dropdown notification_dropdown">
					<%-- <h1><%=title%></h1> --%> <img alt="icon"
					class="header_setting_icon" src="${portalURL}<%=icon4%>"
					height="17.5" width="17.5"> <%-- <a href="<%=dataProviderURL %>"></a> --%>
				</li>
			</c:if>
			<c:if test="<%=icon5 != ""%>">
				<li class="nav-item dropdown notification_dropdown">
					<%-- <h1><%=title%></h1> --%> <img alt="icon"
					class="header_setting_icon" src="${portalURL}<%=icon5%>"
					height="17.5" width="17.5"> <%-- <a href="<%=dataProviderURL %>"></a> --%>
				</li>
			</c:if>
		</c:otherwise>
	</c:choose>
</div>

<script>
	var themeTemplate = [ {
		"color" : "primary",
		"time" : "10 minutes ago",
		"text" : "Youtube, a video-sharing website, goes live",
		"strong-text" : "$500.",
	}, {
		"color" : "info",
		"time" : "20 minutes ago",
		"text" : "New order placed",
		"strong-text" : "#XF-2356.",
	},{
		"color" : "warning",
		"time" : "20 minutes ago",
		"text" : "Mashable, a news website and blog, goes live.",
		"strong-text" : "",
	}, {
		"color" : "danger",
		"time" : "30 minutes ago",
		"text" : "john just buy your product ",
		"strong-text" : "Sell $250",
	}
	];
</script>


<script type="text/x-handlebars-template"
	id="header_setting_1_data_tmpl">
<%=displayTemplate1%>

</script>


<script>
$( document ).ready(function() {
	themeTemplate.forEach(data => {
   		const template = $('#header_setting_1_data_tmpl').html();
	    const compiledTemplate = Handlebars.compile(template);
	    const html = compiledTemplate(data);
	    $('#header_setting_1_data').append(html);
  });
});

</script>
