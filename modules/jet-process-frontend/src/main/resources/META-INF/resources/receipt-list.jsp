<%@include file="init.jsp"%>
<link rel="stylesheet" href="/css/style.css">

<portlet:renderURL var="receiptForm">
	<portlet:param name="mvcPath" value="/receipt-form.jsp"/>
</portlet:renderURL>


<div class="container">
	<div id="receiptList"></div>
</div>


<liferay-util:include page="/list-template.jsp"
	servletContext="<%=application%>">
	<liferay-util:param name="listContainerId" value="receiptList" />
	<liferay-util:param name="listId" value="userDataTable" />
	<liferay-util:param name="addPage" value="<%=receiptForm %>" />
</liferay-util:include>