package com.adjecti.appnavigation.portlet;

import com.adjecti.appnavigation.constants.AppNavigationPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Admin
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AppNavigation", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AppNavigationPortletKeys.APPNAVIGATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AppNavigationPortlet extends MVCPortlet {

	@Override

	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		List<Layout> layoutList = createPage(renderRequest);
		
		renderRequest.setAttribute("layoutList", layoutList);
		super.doView(renderRequest, renderResponse);

	}

	public JSONArray getJson() {
		JSONArray jsonArray = null;
		try {
			String jsonData = new String(Files.readAllBytes(Paths.get(
					"C:\\Users\\Admin\\Desktop\\liferayrestapi\\jet_process_backend\\modules\\app-navigation\\src\\main\\resources\\pages.json")));

			if (Validator.isNotNull(jsonData)) {
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject(jsonData);

				jsonArray = jsonObject.getJSONArray("publicPages");
			}

		} catch (Exception e) {

		}

		return jsonArray;
	}

	
	public List<Layout> createPage(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getSiteGroupId();
		Locale locale = themeDisplay.getLocale();
	
		List<Layout> allLayoutList = null;
		JSONArray jsonArray = getJson();

		for (int i = 0; i < jsonArray.length(); i++) {
			boolean isPageExist = false;
			JSONObject page = jsonArray.getJSONObject(i);
			
			String[] layouts = { "url", "portlet" , "content" };
			try {
				allLayoutList = layoutLocalService.getLayouts(groupId, false, layouts).stream()
						.filter(c -> c.getParentLayoutId() == 0).sorted().collect(Collectors.toList());
			} catch (PortalException e1) {
				e1.printStackTrace();
			}

			for (Layout layout : allLayoutList) {

				if (layout.getName(locale).equalsIgnoreCase(page.getString("pageName"))
						|| layout.getFriendlyURL(locale).equalsIgnoreCase(page.getString("pageUrl"))) {

					isPageExist = true;

				}
			}
			if (!isPageExist) {
				Layout createPageLayout = null;

				try {
					

					
					createPageLayout = layoutLocalService.addLayout(userId, groupId, page.getBoolean("privateLayout"),
							page.getLong("parentLayoutId"), page.getString("pageName"), page.getString("pageTitle"),
							page.getString("pageDescription"), page.getString("pageType"),
							page.getBoolean("pageVisiblity"), page.getString("pageUrl"), new ServiceContext());
					
					//String pageIcon = page.getString("pageIcon");
					
					
					String url = page.getString("pageType");
					if (url.equalsIgnoreCase("url")) {

						layoutLocalService.updateLayout(groupId, false, createPageLayout.getLayoutId(),
								"layout-template-id=2_columns_ii" + 
								"layoutUpdateable=true" + 
								"url="+page.getString("pageTypeSetting")
								);

					}
					/*
					 * if (!(page.getString("pageIcon") == null)){
					 * layoutLocalService.updateLayout(groupId, false,
					 * createPageLayout.getLayoutId(), "layout-template-id=2_columns_ii" +
					 * "layoutUpdateable=true" + "url="+page.getString("pageTypeSetting")+
					 * pageIcon);
					 * 
					 * }
					 */
					
						
					
				}

				catch (PortalException e) {

					e.printStackTrace();
				}

				if (Validator.isNotNull(createPageLayout)) {
					boolean isChildLayoutExist = isChildLayoutExist(jsonArray, i);

					if (isChildLayoutExist) {
						createChildLayout(renderRequest, createPageLayout.getLayoutId(), page);
					}
				}

			}

		}

		return allLayoutList;
	}

	public boolean isChildLayoutExist(JSONArray jsonArray, int count) {
		JSONObject page = jsonArray.getJSONObject(count);
		if (page.getJSONArray("layouts") != null) {
			return true;
		}
		return false;
	}

	public boolean createChildLayout(RenderRequest request, long parentLayoutId, JSONObject page) {

		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			long groupId = themeDisplay.getScopeGroupId();
			long userId = themeDisplay.getUserId();

			JSONArray childLayoutJson = page.getJSONArray("layouts");

			for (int i = 0; i < childLayoutJson.length(); i++) {

				JSONObject childLayoutJsonObject = childLayoutJson.getJSONObject(i);

				Layout childLayout = layoutLocalService.addLayout(userId, groupId,
						childLayoutJsonObject.getBoolean("privateLayout"), parentLayoutId,
						childLayoutJsonObject.getString("pageName"), childLayoutJsonObject.getString("pageTitle"),
						childLayoutJsonObject.getString("pageDescription"), childLayoutJsonObject.getString("pageType"),
						childLayoutJsonObject.getBoolean("pageVisiblity"), childLayoutJsonObject.getString("pageUrl"),
						new ServiceContext());
				System.out.println("test----"+childLayoutJsonObject.getString("pageTypeSetting"));
					layoutLocalService.updateLayout(groupId, false, childLayout.getLayoutId(),
							 
							"layoutUpdateable=true" + 
							"url="+childLayoutJsonObject.getString("pageTypeSetting")
							);
				}
			
			
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	

	
	@Reference
	private LayoutLocalService layoutLocalService;

}
