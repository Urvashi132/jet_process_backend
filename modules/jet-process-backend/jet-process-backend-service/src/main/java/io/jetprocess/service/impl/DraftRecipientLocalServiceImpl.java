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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.model.DraftRecipient;
import io.jetprocess.service.base.DraftRecipientLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.DraftRecipient", service = AopService.class)
public class DraftRecipientLocalServiceImpl extends DraftRecipientLocalServiceBaseImpl {

	private final Log LOGGER = LogFactoryUtil.getLog(DraftRecipientLocalServiceImpl.class);

	public DraftRecipient createRecipient(long draftId, long organizationId, String name, String designation,
			String email, String mobile, String address, long stateId, String city, String pinCode) {
		long id = counterLocalService.increment();
		DraftRecipient draftRecipient = createDraftRecipient(id);
		draftRecipient.setDraftId(draftId);
		draftRecipient.setOrganizationId(organizationId);
		draftRecipient.setName(name);
		draftRecipient.setDesignation(designation);
		draftRecipient.setEmail(email);
		draftRecipient.setMobile(mobile);
		draftRecipient.setAddress(address);
		draftRecipient.setStateId(stateId);
		draftRecipient.setCity(city);
		draftRecipient.setPinCode(pinCode);
		draftRecipient = addDraftRecipient(draftRecipient);
		LOGGER.info(draftRecipient);
		return draftRecipient;
	}

	public DraftRecipient updateRecipient(long id, long organizationId, String name, String designation,
			String email, String mobile, String address, long stateId, String city, String pinCode) throws PortalException {
		DraftRecipient	draftRecipient = getDraftRecipient(id);
		draftRecipient.setOrganizationId(organizationId);
		draftRecipient.setName(name);
		draftRecipient.setDesignation(designation);
		draftRecipient.setEmail(email);
		draftRecipient.setMobile(mobile);
		draftRecipient.setAddress(address);
		draftRecipient.setStateId(stateId);
		draftRecipient.setCity(city);
		draftRecipient.setPinCode(pinCode);
		draftRecipient = updateDraftRecipient(draftRecipient);
		LOGGER.info(draftRecipient);
		return draftRecipient;
	}

	public List<DraftRecipient> getRecipientList(long draftId) {
		List<DraftRecipient> findByDraftId = draftRecipientPersistence.findByDraftId(draftId);
		LOGGER.info(findByDraftId);
		return findByDraftId;
	}
}