package com.adjecti.customcontributor.context.contributor;

import com.liferay.portal.kernel.template.TemplateContextContributor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {"type=" + TemplateContextContributor.TYPE_THEME},
	service = TemplateContextContributor.class
)
public class CustomContributorTemplateContextContributor
	implements TemplateContextContributor {

	@Override
	public void prepare(
		Map<String, Object> contextObjects, HttpServletRequest request) {
		
		 String jsonData = "";
		    try {
		    	jsonData = new String(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\Desktop\\liferay-theme-workspace\\liferay-theme-workspace\\modules\\custom-contributor\\src\\main\\resources\\pages.json")));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }	
		  contextObjects.put(
			        "jsonString", jsonData);
		 
	}

}