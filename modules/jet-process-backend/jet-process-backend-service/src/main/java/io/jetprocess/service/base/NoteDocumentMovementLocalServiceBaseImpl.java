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

import io.jetprocess.model.NoteDocumentMovement;
import io.jetprocess.service.NoteDocumentMovementLocalService;
import io.jetprocess.service.NoteDocumentMovementLocalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DeliveryModePersistence;
import io.jetprocess.service.persistence.DocFilePersistence;
import io.jetprocess.service.persistence.DocumentNoteMappingPersistence;
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
 * Provides the base implementation for the note document movement local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.NoteDocumentMovementLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.NoteDocumentMovementLocalServiceImpl
 * @generated
 */
public abstract class NoteDocumentMovementLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NoteDocumentMovementLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NoteDocumentMovementLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>NoteDocumentMovementLocalServiceUtil</code>.
	 */

	/**
	 * Adds the note document movement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NoteDocumentMovement addNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		noteDocumentMovement.setNew(true);

		return noteDocumentMovementPersistence.update(noteDocumentMovement);
	}

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	@Override
	@Transactional(enabled = false)
	public NoteDocumentMovement createNoteDocumentMovement(long id) {
		return noteDocumentMovementPersistence.create(id);
	}

	/**
	 * Deletes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws PortalException if a note document movement with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NoteDocumentMovement deleteNoteDocumentMovement(long id)
		throws PortalException {

		return noteDocumentMovementPersistence.remove(id);
	}

	/**
	 * Deletes the note document movement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NoteDocumentMovement deleteNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		return noteDocumentMovementPersistence.remove(noteDocumentMovement);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return noteDocumentMovementPersistence.dslQuery(dslQuery);
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
			NoteDocumentMovement.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return noteDocumentMovementPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
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

		return noteDocumentMovementPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
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

		return noteDocumentMovementPersistence.findWithDynamicQuery(
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
		return noteDocumentMovementPersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return noteDocumentMovementPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NoteDocumentMovement fetchNoteDocumentMovement(long id) {
		return noteDocumentMovementPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchNoteDocumentMovementByUuidAndGroupId(
		String uuid, long groupId) {

		return noteDocumentMovementPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the note document movement with the primary key.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws PortalException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement getNoteDocumentMovement(long id)
		throws PortalException {

		return noteDocumentMovementPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			noteDocumentMovementLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NoteDocumentMovement.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			noteDocumentMovementLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			NoteDocumentMovement.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			noteDocumentMovementLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NoteDocumentMovement.class);

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
			new ActionableDynamicQuery.PerformActionMethod
				<NoteDocumentMovement>() {

				@Override
				public void performAction(
						NoteDocumentMovement noteDocumentMovement)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, noteDocumentMovement);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					NoteDocumentMovement.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return noteDocumentMovementPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return noteDocumentMovementLocalService.deleteNoteDocumentMovement(
			(NoteDocumentMovement)persistedModel);
	}

	@Override
	public BasePersistence<NoteDocumentMovement> getBasePersistence() {
		return noteDocumentMovementPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return noteDocumentMovementPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the note document movements matching the UUID and company.
	 *
	 * @param uuid the UUID of the note document movements
	 * @param companyId the primary key of the company
	 * @return the matching note document movements, or an empty list if no matches were found
	 */
	@Override
	public List<NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId) {

		return noteDocumentMovementPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of note document movements matching the UUID and company.
	 *
	 * @param uuid the UUID of the note document movements
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching note document movements, or an empty list if no matches were found
	 */
	@Override
	public List<NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return noteDocumentMovementPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement
	 * @throws PortalException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement getNoteDocumentMovementByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return noteDocumentMovementPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of note document movements
	 */
	@Override
	public List<NoteDocumentMovement> getNoteDocumentMovements(
		int start, int end) {

		return noteDocumentMovementPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
	 */
	@Override
	public int getNoteDocumentMovementsCount() {
		return noteDocumentMovementPersistence.countAll();
	}

	/**
	 * Updates the note document movement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NoteDocumentMovement updateNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		return noteDocumentMovementPersistence.update(noteDocumentMovement);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NoteDocumentMovementLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		noteDocumentMovementLocalService =
			(NoteDocumentMovementLocalService)aopProxy;

		_setLocalServiceUtilService(noteDocumentMovementLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NoteDocumentMovementLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NoteDocumentMovement.class;
	}

	protected String getModelClassName() {
		return NoteDocumentMovement.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				noteDocumentMovementPersistence.getDataSource();

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
		NoteDocumentMovementLocalService noteDocumentMovementLocalService) {

		try {
			Field field =
				NoteDocumentMovementLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, noteDocumentMovementLocalService);
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

	@Reference
	protected FileCategoryPersistence fileCategoryPersistence;

	@Reference
	protected FileMovementPersistence fileMovementPersistence;

	@Reference
	protected NotePersistence notePersistence;

	@Reference
	protected NoteDocumentPersistence noteDocumentPersistence;

	protected NoteDocumentMovementLocalService noteDocumentMovementLocalService;

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