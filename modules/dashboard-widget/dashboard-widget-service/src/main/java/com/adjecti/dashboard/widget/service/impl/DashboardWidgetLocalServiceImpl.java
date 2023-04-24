/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.dashboard.widget.service.impl;

import com.adjecti.dashboard.widget.model.DashboardWidget;
import com.adjecti.dashboard.widget.service.base.DashboardWidgetLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.persistence.CounterFinderUtil;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.adjecti.dashboard.widget.model.DashboardWidget",
	service = AopService.class
)
public class DashboardWidgetLocalServiceImpl
	extends DashboardWidgetLocalServiceBaseImpl {
	
	public DashboardWidget addDashboardWidget(String portletName,String thumbnail, boolean added) {
		long dashboardWidgetId = CounterFinderUtil.increment(DashboardWidget.class.getName());
		DashboardWidget dashboardWidget = dashboardWidgetLocalService.createDashboardWidget(dashboardWidgetId);
		dashboardWidget.setPortletName(portletName);
		dashboardWidget.setThumbnail(thumbnail);
		dashboardWidget.setAdded(added);
		dashboardWidgetLocalService.addDashboardWidget(dashboardWidget);
		return dashboardWidget;
	}
}