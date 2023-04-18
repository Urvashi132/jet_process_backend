package com.liferay.header.setting.config.action;

import com.liferay.header.setting.config.HeaderSettingConfiguration;
import com.liferay.header.setting.constants.HeaderSettingPortletKeys;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

@Component(configurationPid = "com.liferay.header.setting.config.HeaderSettingConfiguration", configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true, property = "javax.portlet.name="
		+ HeaderSettingPortletKeys.HEADERSETTING, service = ConfigurationAction.class)
public class HeaderSettingConfigurationAction extends DefaultConfigurationAction {

	private volatile HeaderSettingConfiguration headerSettingConfiguration;

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		httpServletRequest.setAttribute(HeaderSettingConfiguration.class.getName(), headerSettingConfiguration);

		super.include(portletConfig, httpServletRequest, httpServletResponse);
	}

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		// get and set setting 1 preference
		String title1 = ParamUtil.getString(actionRequest, "title1");
		String icon1 = ParamUtil.getString(actionRequest, "fileIdIcon1");
		String dataProviderURL1 = ParamUtil.getString(actionRequest, "dataProviderURL1");
		String displayTemplate1 = ParamUtil.getString(actionRequest, "displayTemplate1");
		System.out.println("---------- "+icon1);
		
		setPreference(actionRequest, "title1", title1);
		setPreference(actionRequest, "icon1", icon1);
		setPreference(actionRequest, "dataProviderURL1", dataProviderURL1);
		setPreference(actionRequest, "displayTemplate1", displayTemplate1);

		// get and set setting 2 preference
		String title2 = ParamUtil.getString(actionRequest, "title2");
		String icon2 = ParamUtil.getString(actionRequest, "fileIdIcon2");
		String dataProviderURL2 = ParamUtil.getString(actionRequest, "dataProviderURL2");
		String displayTemplate2 = ParamUtil.getString(actionRequest, "displayTemplate2");
		
		setPreference(actionRequest, "title2", title2);
		setPreference(actionRequest, "icon2", icon2);
		setPreference(actionRequest, "dataProviderURL2", dataProviderURL2);
		setPreference(actionRequest, "displayTemplate2", displayTemplate2);

		// get and set setting 3 preference
		String title3 = ParamUtil.getString(actionRequest, "title3");
		String icon3 = ParamUtil.getString(actionRequest, "fileIdIcon3");
		String dataProviderURL3 = ParamUtil.getString(actionRequest, "dataProviderURL3");
		String displayTemplate3 = ParamUtil.getString(actionRequest, "displayTemplate3");
		
		setPreference(actionRequest, "title3", title3);
		setPreference(actionRequest, "icon3", icon3);
		setPreference(actionRequest, "dataProviderURL3", dataProviderURL3);
		setPreference(actionRequest, "displayTemplate3", displayTemplate3);

		// get and set setting 4 preference
		String title4 = ParamUtil.getString(actionRequest, "title4");
		String icon4 = ParamUtil.getString(actionRequest, "fileIdIcon4");
		String dataProviderURL4 = ParamUtil.getString(actionRequest, "dataProviderURL4");
		String displayTemplate4 = ParamUtil.getString(actionRequest, "displayTemplate4");
		
		setPreference(actionRequest, "title4", title4);
		setPreference(actionRequest, "icon4", icon4);
		setPreference(actionRequest, "dataProviderURL4", dataProviderURL4);
		setPreference(actionRequest, "displayTemplate4", displayTemplate4);

		// get and set setting 5 attribute
		String title5 = ParamUtil.getString(actionRequest, "title5");
		String icon5 = ParamUtil.getString(actionRequest, "fileIdIcon5");
		String dataProviderURL5 = ParamUtil.getString(actionRequest, "dataProviderURL5");
		String displayTemplate5 = ParamUtil.getString(actionRequest, "displayTemplate5");
		
		setPreference(actionRequest, "title5", title5);
		setPreference(actionRequest, "icon5", icon5);
		setPreference(actionRequest, "dataProviderURL5", dataProviderURL5);
		setPreference(actionRequest, "displayTemplate5", displayTemplate5);

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		headerSettingConfiguration = ConfigurableUtil.createConfigurable(HeaderSettingConfiguration.class, properties);
	}

}