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

import io.jetprocess.model.Draft;
import io.jetprocess.service.DraftLocalService;
import io.jetprocess.service.DraftLocalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DeliveryModePersistence;
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
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.ReceiptMovementPersistence;
import io.jetprocess.service.persistence.ReceiptPersistence;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.SubjectCategoryPersistence;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;
import io.jetprocess.service.persistence.TypePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the draft local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.DraftLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.DraftLocalServiceImpl
 * @generated
 */
public abstract class DraftLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, DraftLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>DraftLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>DraftLocalServiceUtil</code>.
	 */

	/**
	 * Adds the draft to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Draft addDraft(Draft draft) {
		draft.setNew(true);

		return draftPersistence.update(draft);
	}

	/**
	 * Creates a new draft with the primary key. Does not add the draft to the database.
	 *
	 * @param id the primary key for the new draft
	 * @return the new draft
	 */
	@Override
	@Transactional(enabled = false)
	public Draft createDraft(long id) {
		return draftPersistence.create(id);
	}

	/**
	 * Deletes the draft with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the draft
	 * @return the draft that was removed
	 * @throws PortalException if a draft with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Draft deleteDraft(long id) throws PortalException {
		return draftPersistence.remove(id);
	}

	/**
	 * Deletes the draft from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Draft deleteDraft(Draft draft) {
		return draftPersistence.remove(draft);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return draftPersistence.dslQuery(dslQuery);
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
			Draft.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return draftPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
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

		return draftPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
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

		return draftPersistence.findWithDynamicQuery(
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
		return draftPersistence.countWithDynamicQuery(dynamicQuery);
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

		return draftPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Draft fetchDraft(long id) {
		return draftPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the draft matching the UUID and group.
	 *
	 * @param uuid the draft's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft, or <code>null</code> if a matching draft could not be found
	 */
	@Override
	public Draft fetchDraftByUuidAndGroupId(String uuid, long groupId) {
		return draftPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the draft with the primary key.
	 *
	 * @param id the primary key of the draft
	 * @return the draft
	 * @throws PortalException if a draft with the primary key could not be found
	 */
	@Override
	public Draft getDraft(long id) throws PortalException {
		return draftPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(draftLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Draft.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(draftLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Draft.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(draftLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Draft.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
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
			new ActionableDynamicQuery.PerformActionMethod<Draft>() {

				@Override
				public void performAction(Draft draft) throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, draft);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Draft.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return draftPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return draftLocalService.deleteDraft((Draft)persistedModel);
	}

	@Override
	public BasePersistence<Draft> getBasePersistence() {
		return draftPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return draftPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the drafts matching the UUID and company.
	 *
	 * @param uuid the UUID of the drafts
	 * @param companyId the primary key of the company
	 * @return the matching drafts, or an empty list if no matches were found
	 */
	@Override
	public List<Draft> getDraftsByUuidAndCompanyId(
		String uuid, long companyId) {

		return draftPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of drafts matching the UUID and company.
	 *
	 * @param uuid the UUID of the drafts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching drafts, or an empty list if no matches were found
	 */
	@Override
	public List<Draft> getDraftsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Draft> orderByComparator) {

		return draftPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the draft matching the UUID and group.
	 *
	 * @param uuid the draft's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft
	 * @throws PortalException if a matching draft could not be found
	 */
	@Override
	public Draft getDraftByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return draftPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the drafts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @return the range of drafts
	 */
	@Override
	public List<Draft> getDrafts(int start, int end) {
		return draftPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of drafts.
	 *
	 * @return the number of drafts
	 */
	@Override
	public int getDraftsCount() {
		return draftPersistence.countAll();
	}

	/**
	 * Updates the draft in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Draft updateDraft(Draft draft) {
		return draftPersistence.update(draft);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			DraftLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		draftLocalService = (DraftLocalService)aopProxy;

		_setLocalServiceUtilService(draftLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DraftLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Draft.class;
	}

	protected String getModelClassName() {
		return Draft.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = draftPersistence.getDataSource();

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
		DraftLocalService draftLocalService) {

		try {
			Field field = DraftLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, draftLocalService);
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
	protected DocFilePersistence docFilePersistence;

	@Reference
	protected DocumentNoteMappingPersistence documentNoteMappingPersistence;

	protected DraftLocalService draftLocalService;

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
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}