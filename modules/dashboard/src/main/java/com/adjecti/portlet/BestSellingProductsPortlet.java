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
		"javax.portlet.display-name=BEST SELLING PRODUCTS",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/best_selling_products.jsp",
		"javax.portlet.name=" + DashboardPortletKeys.BESTSELLINGPRODUCTS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BestSellingProductsPortlet extends MVCPortlet{

}
