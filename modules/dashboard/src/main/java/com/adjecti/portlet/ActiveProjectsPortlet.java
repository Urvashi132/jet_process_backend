package com.adjecti.portlet;

import com.adjecti.constants.DashboardPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ACTIVE PROJECTS",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/active_projects.jsp",
		"javax.portlet.name=" + DashboardPortletKeys.ACTIVEPROJECTS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ActiveProjectsPortlet extends MVCPortlet{

}
