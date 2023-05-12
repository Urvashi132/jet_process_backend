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

import io.jetprocess.model.DocFile;
import io.jetprocess.service.DocFileLocalService;
import io.jetprocess.service.DocFileLocalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DeliveryModePersistence;
import io.jetprocess.service.persistence.DocFilePersistence;
import io.jetprocess.service.persistence.OrganizationPersistence;
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.ReceiptPersistence;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;
import io.jetprocess.service.persistence.TypePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the doc file local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.DocFileLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.DocFileLocalServiceImpl
 * @generated
 */
public abstract class DocFileLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, DocFileLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>DocFileLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>DocFileLocalServiceUtil</code>.
	 */

	/**
	 * Adds the doc file to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocFileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param docFile the doc file
	 * @return the doc file that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DocFile addDocFile(DocFile docFile) {
		docFile.setNew(true);

		return docFilePersistence.update(docFile);
	}

	/**
	 * Creates a new doc file with the primary key. Does not add the doc file to the database.
	 *
	 * @param docFileId the primary key for the new doc file
	 * @return the new doc file
	 */
	@Override
	@Transactional(enabled = false)
	public DocFile createDocFile(long docFileId) {
		return docFilePersistence.create(docFileId);
	}

	/**
	 * Deletes the doc file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocFileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param docFileId the primary key of the doc file
	 * @return the doc file that was removed
	 * @throws PortalException if a doc file with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DocFile deleteDocFile(long docFileId) throws PortalException {
		return docFilePersistence.remove(docFileId);
	}

	/**
	 * Deletes the doc file from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocFileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param docFile the doc file
	 * @return the doc file that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DocFile deleteDocFile(DocFile docFile) {
		return docFilePersistence.remove(docFile);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return docFilePersistence.dslQuery(dslQuery);
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
			DocFile.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return docFilePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocFileModelImpl</code>.
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

		return docFilePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocFileModelImpl</code>.
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

		return docFilePersistence.findWithDynamicQuery(
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
		return docFilePersistence.countWithDynamicQuery(dynamicQuery);
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

		return docFilePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public DocFile fetchDocFile(long docFileId) {
		return docFilePersistence.fetchByPrimaryKey(docFileId);
	}

	/**
	 * Returns the doc file matching the UUID and group.
	 *
	 * @param uuid the doc file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching doc file, or <code>null</code> if a matching doc file could not be found
	 */
	@Override
	public DocFile fetchDocFileByUuidAndGroupId(String uuid, long groupId) {
		return docFilePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the doc file with the primary key.
	 *
	 * @param docFileId the primary key of the doc file
	 * @return the doc file
	 * @throws PortalException if a doc file with the primary key could not be found
	 */
	@Override
	public DocFile getDocFile(long docFileId) throws PortalException {
		return docFilePersistence.findByPrimaryKey(docFileId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(docFileLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DocFile.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("docFileId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			docFileLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(DocFile.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("docFileId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(docFileLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DocFile.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("docFileId");
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
			new ActionableDynamicQuery.PerformActionMethod<DocFile>() {

				@Override
				public void performAction(DocFile docFile)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, docFile);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(DocFile.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return docFilePersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return docFileLocalService.deleteDocFile((DocFile)persistedModel);
	}

	@Override
	public BasePersistence<DocFile> getBasePersistence() {
		return docFilePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return docFilePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the doc files matching the UUID and company.
	 *
	 * @param uuid the UUID of the doc files
	 * @param companyId the primary key of the company
	 * @return the matching doc files, or an empty list if no matches were found
	 */
	@Override
	public List<DocFile> getDocFilesByUuidAndCompanyId(
		String uuid, long companyId) {

		return docFilePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of doc files matching the UUID and company.
	 *
	 * @param uuid the UUID of the doc files
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of doc files
	 * @param end the upper bound of the range of doc files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching doc files, or an empty list if no matches were found
	 */
	@Override
	public List<DocFile> getDocFilesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DocFile> orderByComparator) {

		return docFilePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the doc file matching the UUID and group.
	 *
	 * @param uuid the doc file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching doc file
	 * @throws PortalException if a matching doc file could not be found
	 */
	@Override
	public DocFile getDocFileByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return docFilePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the doc files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocFileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of doc files
	 * @param end the upper bound of the range of doc files (not inclusive)
	 * @return the range of doc files
	 */
	@Override
	public List<DocFile> getDocFiles(int start, int end) {
		return docFilePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of doc files.
	 *
	 * @return the number of doc files
	 */
	@Override
	public int getDocFilesCount() {
		return docFilePersistence.countAll();
	}

	/**
	 * Updates the doc file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocFileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param docFile the doc file
	 * @return the doc file that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DocFile updateDocFile(DocFile docFile) {
		return docFilePersistence.update(docFile);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			DocFileLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		docFileLocalService = (DocFileLocalService)aopProxy;

		_setLocalServiceUtilService(docFileLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DocFileLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DocFile.class;
	}

	protected String getModelClassName() {
		return DocFile.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = docFilePersistence.getDataSource();

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
		DocFileLocalService docFileLocalService) {

		try {
			Field field = DocFileLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, docFileLocalService);
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

	protected DocFileLocalService docFileLocalService;

	@Reference
	protected DocFilePersistence docFilePersistence;

	@Reference
	protected OrganizationPersistence organizationPersistence;

	@Reference
	protected PrimaryHeadPersistence primaryHeadPersistence;

	@Reference
	protected ReceiptPersistence receiptPersistence;

	@Reference
	protected SecondaryHeadPersistence secondaryHeadPersistence;

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