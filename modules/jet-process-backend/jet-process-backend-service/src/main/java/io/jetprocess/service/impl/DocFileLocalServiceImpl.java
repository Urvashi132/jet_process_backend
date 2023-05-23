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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalService;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.exception.DuplicateFileNumberException;
import io.jetprocess.model.DocFile;
import io.jetprocess.service.base.DocFileLocalServiceBaseImpl;
import io.jetprocess.validator.FileValidator;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.DocFile", service = AopService.class)
public class DocFileLocalServiceImpl extends DocFileLocalServiceBaseImpl {

	@Reference
	private GroupLocalService groupLocalService;

	public DocFile createDocFile(long groupId, String nature, String type, long headId, long fileCodeId, String subject,
			String fileNo, long categoryId, String remarks, String reference, long year, long userPostId)
			throws PortalException {
		LOGGER.info("--");
		DocFile docFile = null;
		List<String> error = fileValidator.validate(subject, type);
		if (!error.isEmpty()) {
		} else {
			long id = counterLocalService.increment(DocFile.class.getName());
			docFile = createDocFile(id);
			Group group = groupLocalService.getGroup(groupId);
//    			long userId = serviceContext.getUserId();
//    			User user = userLocalService.getUser(userId);
//    			docFile.setUserId(userId);
//    			docFile.setUserName(user.getScreenName());
			docFile.setGroupId(groupId);
			docFile.setCompanyId(group.getCompanyId());

			docFile.setNature(nature);
			docFile.setType(type);
			if (type.equals("SFS")) {
				List<DocFile> docFileList = getDocFiles();
				for (DocFile docFileObj : docFileList) {
					if (fileNo.equals(docFileObj.getFileNo())) {
						throw new DuplicateFileNumberException("DuplicateFileNumber");
					} else {
						docFile.setFileNo(fileNo);
					}
				}
			} else {
				docFile.setHeadId(headId);
				docFile.setYear(year);
				docFile.setFileCodeId(fileCodeId);
				String fileNumber = generateFileNo(id);
				docFile.setFileNo(fileNumber);
			}
			docFile.setSubject(subject);
			docFile.setCategoryId(categoryId);
			docFile.setRemarks(remarks);
			docFile.setReference(reference);
			docFile.setUserPostId(userPostId);
			docFile.setCurrentUser(userPostId);
			docFile.setCurrentState(1);
//			docFile.setDealingOrganizationId(dealingOrganizationId);
			docFile = super.addDocFile(docFile);
		}
		return docFile;
	}

	public DocFile updateDocFile(long id, String subject, long categoryId, String remarks, String reference)
			throws PortalException {
		DocFile docFile = getDocFile(id);
		docFile.setSubject(subject);
		docFile.setCategoryId(categoryId);
		docFile.setRemarks(remarks);
		docFile.setReference(reference);
		docFile = super.updateDocFile(docFile);
		return docFile;
	}
	
	public String generateFileNo(long id) {
		String number = String.valueOf(id);
		String fileNo = 'F' + number;
		return fileNo;
	}

	public List<DocFile> getDocFiles() throws PortalException {
		List<DocFile> docFileList = getDocFiles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		System.out.println(docFileList);
		return docFileList;
	}

	@Reference
	private FileValidator fileValidator;

	private final Log LOGGER = LogFactoryUtil.getLog(DocFileLocalServiceImpl.class);
}