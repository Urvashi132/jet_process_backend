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

package io.jetprocess.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import io.jetprocess.model.Postal;
import io.jetprocess.service.PostalService;
import io.jetprocess.service.PostalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DeliveryModePersistence;
import io.jetprocess.service.persistence.DispatchPersistence;
import io.jetprocess.service.persistence.DocFilePersistence;
import io.jetprocess.service.persistence.DocumentNoteMappingPersistence;
import io.jetprocess.service.persistence.DraftPersistence;
import io.jetprocess.service.persistence.DraftRecipientPersistence;
import io.jetprocess.service.persistence.FileCategoryPersistence;
import io.jetprocess.service.persistence.FileMovementPersistence;
import io.jetprocess.service.persistence.NoteDocumentMovementPersistence;
import io.jetprocess.service.persistence.NoteDocumentPersistence;
import io.jetprocess.service.persistence.NotePersistence;
import io.jetprocess.service.persistence.OrganizationPersistence;
import io.jetprocess.service.persistence.PostalPersistence;
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.ReceiptMovementPersistence;
import io.jetprocess.service.persistence.ReceiptPersistence;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.SubjectCategoryPersistence;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;
import io.jetprocess.service.persistence.TypePersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the postal remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.PostalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.PostalServiceImpl
 * @generated
 */
public abstract class PostalServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, PostalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PostalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>PostalServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PostalService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		postalService = (PostalService)aopProxy;

		_setServiceUtilService(postalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PostalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Postal.class;
	}

	protected String getModelClassName() {
		return Postal.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = postalPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(PostalService postalService) {
		try {
			Field field = PostalServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, postalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected BasicHeadPersistence basicHeadPersistence;

	@Reference
	protected CategoryPersistence categoryPersistence;

	@Reference
	protected DeliveryModePersistence deliveryModePersistence;

	@Reference
	protected DispatchPersistence dispatchPersistence;

	@Reference
	protected DocFilePersistence docFilePersistence;

	@Reference
	protected DocumentNoteMappingPersistence documentNoteMappingPersistence;

	@Reference
	protected DraftPersistence draftPersistence;

	@Reference
	protected DraftRecipientPersistence draftRecipientPersistence;

	@Reference
	protected FileCategoryPersistence fileCategoryPersistence;

	@Reference
	protected FileMovementPersistence fileMovementPersistence;

	@Reference
	protected NotePersistence notePersistence;

	@Reference
	protected NoteDocumentPersistence noteDocumentPersistence;

	@Reference
	protected NoteDocumentMovementPersistence noteDocumentMovementPersistence;

	@Reference
	protected OrganizationPersistence organizationPersistence;

	@Reference
	protected io.jetprocess.service.PostalLocalService postalLocalService;

	protected PostalService postalService;

	@Reference
	protected PostalPersistence postalPersistence;

	@Reference
	protected PrimaryHeadPersistence primaryHeadPersistence;

	@Reference
	protected ReceiptPersistence receiptPersistence;

	@Reference
	protected ReceiptMovementPersistence receiptMovementPersistence;

	@Reference
	protected SecondaryHeadPersistence secondaryHeadPersistence;

	@Reference
	protected SubjectCategoryPersistence subjectCategoryPersistence;

	@Reference
	protected TertiaryHeadPersistence tertiaryHeadPersistence;

	@Reference
	protected TypePersistence typePersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}