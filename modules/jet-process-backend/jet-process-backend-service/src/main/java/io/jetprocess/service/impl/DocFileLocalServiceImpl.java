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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalService;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.DocFile;
import io.jetprocess.service.base.DocFileLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.DocFile", service = AopService.class)
public class DocFileLocalServiceImpl extends DocFileLocalServiceBaseImpl {

	@Reference
	private GroupLocalService groupLocalService;

	public DocFile createDocFile(long groupId, String nature, String type, long headId, long fileCodeId, String subject,
			String fileNo, long categoryId, String remarks, String reference, long year, long userPostId,
			long currentUser, int currentState, long dealingOrganizationId) throws PortalException {

		long docFileId = counterLocalService.increment(DocFile.class.getName());
		DocFile docFile = createDocFile(docFileId);
		Group group = groupLocalService.getGroup(groupId);
//			long userId = serviceContext.getUserId();
//			User user = userLocalService.getUser(userId);
		docFile.setGroupId(groupId);
		docFile.setCompanyId(group.getCompanyId());
//			docFile.setUserId(userId);
//			docFile.setUserName(user.getScreenName());
//			docFile.setCreateDate(serviceContext.getCreateDate(new Date()));
//			docFile.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		docFile.setNature(nature);
		docFile.setType(type);
		if (docFile.getType().equals("SFS")) {
			docFile.setHeadId(0);
		} else {
			docFile.setHeadId(headId);
		}

		docFile.setFileCodeId(fileCodeId);
		docFile.setSubject(subject);
		docFile.setFileNo(fileNo);
		docFile.setCategoryId(categoryId);
		docFile.setRemarks(remarks);
		docFile.setReference(reference);
		docFile.setYear(year);
		docFile.setUserPostId(userPostId);
		docFile.setCurrentUser(currentUser);
		docFile.setCurrentState(currentState);
		docFile.setDealingOrganizationId(dealingOrganizationId);
		docFile = super.addDocFile(docFile);
		return docFile;

	}

	public DocFile updateDocFile(long docFileId, String nature, String type, long headId, long fileCodeId,
			String subject, String fileNo, long categoryId, String remarks, String reference, long year,
			long userPostId, long currentUser, int currentState, long dealingOrganizationId) throws PortalException {
		DocFile docFile = getDocFile(docFileId);
		docFile.setNature(nature);
		docFile.setType(type);
		docFile.setHeadId(headId);
		docFile.setFileCodeId(fileCodeId);
		docFile.setSubject(subject);
		docFile.setFileNo(fileNo);
		docFile.setCategoryId(categoryId);
		docFile.setRemarks(remarks);
		docFile.setReference(reference);
		docFile.setYear(year);
		docFile.setUserPostId(userPostId);
		docFile.setCurrentUser(currentUser);
		docFile.setCurrentState(currentState);
		docFile.setDealingOrganizationId(dealingOrganizationId);
		docFile = super.updateDocFile(docFile);
		return docFile;
	}

	public DocFile deleteDocFileById(long docFileId) throws PortalException {
		DocFile docFile = super.deleteDocFile(docFileId);
		return docFile;
	}
	
	public DocFile getDocFileById(long docFileId) throws PortalException {
		return super.getDocFile(docFileId);
	}
	

	
	public String generateFileNo(long docFileId) {
		String number = String.valueOf(docFileId);
		String fileNo = 'F' + number;
		return fileNo;
	}

}