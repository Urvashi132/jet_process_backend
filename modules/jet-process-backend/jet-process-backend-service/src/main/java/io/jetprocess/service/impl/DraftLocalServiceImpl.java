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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.model.Draft;
import io.jetprocess.service.base.DraftLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=io.jetprocess.model.Draft",
	service = AopService.class
)
public class DraftLocalServiceImpl extends DraftLocalServiceBaseImpl {
	
	private final Log LOGGER = LogFactoryUtil.getLog(DraftLocalServiceImpl.class);
	
	public Draft createDraft(Draft draft) {
		long id = counterLocalService.increment();
		draft = createDraft(id);
		String draftNo = generateDraftNo(id);
		draft.setDraftNo(draftNo);
		draft = addDraft(draft);
		LOGGER.info(draft);
		return draft;
	}
	
	public Draft updateDraft(long id, Draft draft) throws PortalException {
		draft = getDraft(id);
		draft = updateDraft(draft);
		LOGGER.info(draft);
		return draft;
	}
	
	public List<Draft> getDrafts(){
		return getDrafts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public String generateDraftNo(long id) {
		String number = String.valueOf(id);
		String dratNo = "DFA-" + number;
		return dratNo;
	}
	
}