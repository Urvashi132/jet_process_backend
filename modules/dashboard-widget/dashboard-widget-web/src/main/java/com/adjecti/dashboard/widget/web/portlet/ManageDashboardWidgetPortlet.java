package com.adjecti.dashboard.widget.web.portlet;

import com.adjecti.dashboard.widget.service.DashboardWidgetLocalService;
import com.adjecti.dashboard.widget.web.constants.DashboardWidgetPortletKeys;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author adj
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=Manage Dashboard Widgets",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/manage-dashboard-widget.jsp",
		"javax.portlet.name=" + DashboardWidgetPortletKeys.MANAGEDASHBOARDWIDGET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class ManageDashboardWidgetPortlet extends MVCPortlet {

	@Reference
	private DashboardWidgetLocalService dashboardWidgetLocalService;

	@Reference
	private DLAppService _dlAppService;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long addFolderId = 0;
		try {
			addFolderId = addFolder(themeDisplay.getScopeGroupId(), renderRequest, renderResponse);
			renderRequest.setAttribute("addFolderId", addFolderId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);

	}

	public void addDashboard(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		boolean added = true;
		String portletName = ParamUtil.getString(actionRequest, "portletName");
		String thumbnail = ParamUtil.getString(actionRequest, "thumbnail");
		dashboardWidgetLocalService.addDashboardWidget(portletName, thumbnail, added);
	}

	public long addFolder(long groupId, RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortalException {
		long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		String name = "Dashboard_Widget";
		String description = "Dashboard Widget Thumbnail";
		ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), renderRequest);
		List<Folder> mainFolders = DLAppServiceUtil.getFolders(groupId, parentFolderId);
		Folder dashboardWidgetFolder = null;
		if (mainFolders.isEmpty()) {
			dashboardWidgetFolder = _dlAppService.addFolder(groupId, parentFolderId, name, description, serviceContext);
		} else {
			for (Folder folder : mainFolders) {
				if (folder.getName().equalsIgnoreCase("Dashboard_Widget")) {
					dashboardWidgetFolder = folder;
				}
			}
		}
		return dashboardWidgetFolder.getFolderId();
	}
}