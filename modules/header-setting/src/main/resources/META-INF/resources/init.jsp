<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page
	import="com.liferay.header.setting.config.HeaderSettingConfiguration"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="java.util.List"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page
	import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>

<%
	HeaderSettingConfiguration configuration = (HeaderSettingConfiguration) renderRequest
			.getAttribute(HeaderSettingConfiguration.class.getName());

	//for setting 1
	String title1 = StringPool.BLANK;
	String icon1 = StringPool.BLANK;
	String dataProviderURL1 = StringPool.BLANK;
	String displayTemplate1 = StringPool.BLANK;

	//for setting 2
	String title2 = StringPool.BLANK;
	String icon2 = StringPool.BLANK;
	String dataProviderURL2 = StringPool.BLANK;
	String displayTemplate2 = StringPool.BLANK;

	//for setting 3
	String title3 = StringPool.BLANK;
	String icon3 = StringPool.BLANK;
	String dataProviderURL3 = StringPool.BLANK;
	String displayTemplate3 = StringPool.BLANK;

	//for setting 4
	String title4 = StringPool.BLANK;
	String icon4 = StringPool.BLANK;
	String dataProviderURL4 = StringPool.BLANK;
	String displayTemplate4 = StringPool.BLANK;

	//for setting 5
	String title5 = StringPool.BLANK;
	String icon5 = StringPool.BLANK;
	String dataProviderURL5 = StringPool.BLANK;
	String displayTemplate5 = StringPool.BLANK;

	if (Validator.isNotNull(configuration)) {

		//for setting 1
		title1 = portletPreferences.getValue("title1", configuration.title1());
		icon1 = portletPreferences.getValue("icon1", configuration.icon1());
		dataProviderURL1 = portletPreferences.getValue("dataProviderURL1", configuration.dataProviderURL1());
		displayTemplate1 = portletPreferences.getValue("displayTemplate1", configuration.displayTemplate1());

		//for setting 2
		title2 = portletPreferences.getValue("title2", configuration.title2());
		icon2 = portletPreferences.getValue("icon2", configuration.icon2());
		dataProviderURL2 = portletPreferences.getValue("dataProviderURL2", configuration.dataProviderURL2());
		displayTemplate2 = portletPreferences.getValue("displayTemplate2", configuration.displayTemplate2());

		//for setting 3
		title3 = portletPreferences.getValue("title3", configuration.title3());
		icon3 = portletPreferences.getValue("icon3", configuration.icon3());
		dataProviderURL3 = portletPreferences.getValue("dataProviderURL3", configuration.dataProviderURL3());
		displayTemplate3 = portletPreferences.getValue("displayTemplate3", configuration.displayTemplate3());

		//for setting 4
		title4 = portletPreferences.getValue("title4", configuration.title4());
		icon4 = portletPreferences.getValue("icon4", configuration.icon4());
		dataProviderURL4 = portletPreferences.getValue("dataProviderURL4", configuration.dataProviderURL4());
		displayTemplate4 = portletPreferences.getValue("displayTemplate4", configuration.displayTemplate4());

		//for setting 5
		title5 = portletPreferences.getValue("title5", configuration.title5());
		icon5 = portletPreferences.getValue("icon5", configuration.icon5());
		dataProviderURL5 = portletPreferences.getValue("dataProviderURL5", configuration.dataProviderURL5());
		displayTemplate5 = portletPreferences.getValue("displayTemplate5", configuration.displayTemplate5());

	}
%>