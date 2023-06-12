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
import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;
import java.util.List;

import io.jetprocess.model.Postal;
import io.jetprocess.service.base.PostalLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.Postal", service = AopService.class)
public class PostalLocalServiceImpl extends PostalLocalServiceBaseImpl {

	
	public Postal addPostal(String postalMode , String postalCharge , String medium , String weight , long modeNo , String peonBookNo , String peonName , Date outDate , Date deliveryDate , String deliveryStatus) {
		
		long postalId = counterLocalService.increment(Postal.class.getName());
		Postal postal = createPostal(postalId);
		postal.setPostalMode(postalMode);
		postal.setPostalCharge(postalCharge);
		postal.setMedium(medium);
		postal.setWeight(weight);
		postal.setModeNo(modeNo);
		postal.setPeonBookNo(peonBookNo);
		postal.setPeonName(peonName);
		postal.setOutDate(outDate);
		postal.setDeliveryDate(deliveryDate);
		postal.setDeliveryStatus(deliveryStatus);
		addPostal(postal);
		return null;
	}
	
	
	public List<Postal> getPostalList() {
		return getPostals(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public Postal getPostalById(long postalId) {

		return getPostalById(postalId);
	}

	public void deletePostalById(long postalId) throws PortalException {

		deletePostal(postalId);
	}

}