package com.liferay.header.setting.portlet;

import com.liferay.header.setting.config.HeaderSettingConfiguration;
import com.liferay.header.setting.constants.HeaderSettingPortletKeys;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

/**
 * @author Admin
 */
@Component(
	configurationPid = "com.liferay.header.setting.config.HeaderSettingConfiguration",	
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=HeaderSetting",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HeaderSettingPortletKeys.HEADERSETTING,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HeaderSettingPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		renderRequest.setAttribute(HeaderSettingConfiguration.class.getName(), _headerSettingConfiguration);

		super.render(renderRequest, renderResponse);
	}
	
    
    /**
     * 
     * (1)If a method is annoted with @Activate then the method will be called at the time of activation of the component
     *  so that we can perform initialization task
     *  
     * (2) This class is annoted with @Component where we have used configurationPid with id com.proliferay.configuration.DemoConfiguration
     * So if we modify any configuration then this method will be called. 
     */
    
    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        _log.info("#####Calling activate() method######");
        
        _headerSettingConfiguration = ConfigurableUtil.createConfigurable(HeaderSettingConfiguration.class, properties);
        
    }

    private static final Log _log = LogFactoryUtil.getLog(HeaderSettingPortlet.class);

    private volatile HeaderSettingConfiguration	_headerSettingConfiguration;  
}