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
@Component(
	property = "model.class.name=io.jetprocess.model.DraftRecipient",
	service = AopService.class
)
public class DraftRecipientLocalServiceImpl
	extends DraftRecipientLocalServiceBaseImpl {
	
private final Log LOGGER = LogFactoryUtil.getLog(DraftRecipientLocalServiceImpl.class);
	
	public DraftRecipient createRecipient(DraftRecipient draftRecipient) {
		long id = counterLocalService.increment();
		draftRecipient = createDraftRecipient(id);
		draftRecipient = addDraftRecipient(draftRecipient);
		LOGGER.info(draftRecipient);
		return draftRecipient;
	}
	
	public DraftRecipient updateRecipient(long id, DraftRecipient draftRecipient) throws PortalException {
		draftRecipient = getDraftRecipient(id);
		draftRecipient = updateDraftRecipient(draftRecipient);
		LOGGER.info(draftRecipient);
		return draftRecipient;
	}
	
	public List<DraftRecipient> getRecipientList(long draftId){
		List<DraftRecipient> findByDraftId = draftRecipientPersistence.findByDraftId(draftId);
		LOGGER.info(findByDraftId);
		return findByDraftId;
	}
}