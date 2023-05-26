package io.jetprocess.helper;

import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

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
			page = "/jsp/file/file-list.jsp";
		}

		else if (parameter.equals("receipt")) {
			page = "/jsp/receipt/receipt-list.jsp";
		}

		else if (parameter.equals("note")) {
			page = "/jsp/note-document/notedoc-list.jsp";
		}

		
		else if(parameter.isEmpty() || Validator.isNull(parameter)){
			page = "/dashboard.jsp";
		}

		return page;
	}

}
