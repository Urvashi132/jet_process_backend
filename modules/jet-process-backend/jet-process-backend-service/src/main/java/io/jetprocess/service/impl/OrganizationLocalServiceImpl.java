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

package io.jetprocess.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;

import java.util.List;

import io.jetprocess.model.Organization;
import io.jetprocess.service.base.OrganizationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=io.jetprocess.model.Organization",
	service = AopService.class
)
public class OrganizationLocalServiceImpl
	extends OrganizationLocalServiceBaseImpl {
	
	
	public List<Organization> getOrgnization(){
		System.out.println("data------"+getOrganizations(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		return getOrganizations(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	
}