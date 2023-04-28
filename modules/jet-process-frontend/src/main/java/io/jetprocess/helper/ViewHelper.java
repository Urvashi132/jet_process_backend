package io.jetprocess.helper;

import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;

public class ViewHelper {

	public static String getDisplayPage(RenderRequest renderRequest) {

		HttpServletRequest httpRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));
		String parameter = httpRequest.getParameter("view");
		String page = null;
		if (parameter.equals("dashboard")) {
			page = "/dashboard.jsp";
		} else if (parameter.equals("file")) {
			page = "/file-form.jsp";
		}

		else if (parameter.equals("receipt")) {
			page = "/receipt-form.jsp";
		}

		else if (parameter.equals("note")) {
			page = "/note-form.jsp";
		}

		
		else {
			page = "/dashboard.jsp";
		}

		return page;
	}

}
