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

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import io.jetprocess.model.SecondaryHead;
import io.jetprocess.service.SecondaryHeadLocalService;
import io.jetprocess.service.SecondaryHeadLocalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DocFilePersistence;
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the secondary head local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.SecondaryHeadLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.SecondaryHeadLocalServiceImpl
 * @generated
 */
public abstract class SecondaryHeadLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, SecondaryHeadLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SecondaryHeadLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>SecondaryHeadLocalServiceUtil</code>.
	 */

	/**
	 * Adds the secondary head to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SecondaryHead addSecondaryHead(SecondaryHead secondaryHead) {
		secondaryHead.setNew(true);

		return secondaryHeadPersistence.update(secondaryHead);
	}

	/**
	 * Creates a new secondary head with the primary key. Does not add the secondary head to the database.
	 *
	 * @param secondaryHeadId the primary key for the new secondary head
	 * @return the new secondary head
	 */
	@Override
	@Transactional(enabled = false)
	public SecondaryHead createSecondaryHead(long secondaryHeadId) {
		return secondaryHeadPersistence.create(secondaryHeadId);
	}

	/**
	 * Deletes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws PortalException if a secondary head with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SecondaryHead deleteSecondaryHead(long secondaryHeadId)
		throws PortalException {

		return secondaryHeadPersistence.remove(secondaryHeadId);
	}

	/**
	 * Deletes the secondary head from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SecondaryHead deleteSecondaryHead(SecondaryHead secondaryHead) {
		return secondaryHeadPersistence.remove(secondaryHead);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return secondaryHeadPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			SecondaryHead.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return secondaryHeadPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return secondaryHeadPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return secondaryHeadPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return secondaryHeadPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return secondaryHeadPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SecondaryHead fetchSecondaryHead(long secondaryHeadId) {
		return secondaryHeadPersistence.fetchByPrimaryKey(secondaryHeadId);
	}

	/**
	 * Returns the secondary head matching the UUID and group.
	 *
	 * @param uuid the secondary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchSecondaryHeadByUuidAndGroupId(
		String uuid, long groupId) {

		return secondaryHeadPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the secondary head with the primary key.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head
	 * @throws PortalException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead getSecondaryHead(long secondaryHeadId)
		throws PortalException {

		return secondaryHeadPersistence.findByPrimaryKey(secondaryHeadId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(secondaryHeadLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SecondaryHead.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("secondaryHeadId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			secondaryHeadLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(SecondaryHead.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"secondaryHeadId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(secondaryHeadLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SecondaryHead.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("secondaryHeadId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<SecondaryHead>() {

				@Override
				public void performAction(SecondaryHead secondaryHead)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, secondaryHead);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(SecondaryHead.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return secondaryHeadPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return secondaryHeadLocalService.deleteSecondaryHead(
			(SecondaryHead)persistedModel);
	}

	@Override
	public BasePersistence<SecondaryHead> getBasePersistence() {
		return secondaryHeadPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return secondaryHeadPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the secondary heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the secondary heads
	 * @param companyId the primary key of the company
	 * @return the matching secondary heads, or an empty list if no matches were found
	 */
	@Override
	public List<SecondaryHead> getSecondaryHeadsByUuidAndCompanyId(
		String uuid, long companyId) {

		return secondaryHeadPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of secondary heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the secondary heads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching secondary heads, or an empty list if no matches were found
	 */
	@Override
	public List<SecondaryHead> getSecondaryHeadsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return secondaryHeadPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the secondary head matching the UUID and group.
	 *
	 * @param uuid the secondary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching secondary head
	 * @throws PortalException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead getSecondaryHeadByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return secondaryHeadPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of secondary heads
	 */
	@Override
	public List<SecondaryHead> getSecondaryHeads(int start, int end) {
		return secondaryHeadPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of secondary heads.
	 *
	 * @return the number of secondary heads
	 */
	@Override
	public int getSecondaryHeadsCount() {
		return secondaryHeadPersistence.countAll();
	}

	/**
	 * Updates the secondary head in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SecondaryHead updateSecondaryHead(SecondaryHead secondaryHead) {
		return secondaryHeadPersistence.update(secondaryHead);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SecondaryHeadLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		secondaryHeadLocalService = (SecondaryHeadLocalService)aopProxy;

		_setLocalServiceUtilService(secondaryHeadLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SecondaryHeadLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SecondaryHead.class;
	}

	protected String getModelClassName() {
		return SecondaryHead.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = secondaryHeadPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		SecondaryHeadLocalService secondaryHeadLocalService) {

		try {
			Field field = SecondaryHeadLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, secondaryHeadLocalService);
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
	protected DocFilePersistence docFilePersistence;

	@Reference
	protected PrimaryHeadPersistence primaryHeadPersistence;

	protected SecondaryHeadLocalService secondaryHeadLocalService;

	@Reference
	protected SecondaryHeadPersistence secondaryHeadPersistence;

	@Reference
	protected TertiaryHeadPersistence tertiaryHeadPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}