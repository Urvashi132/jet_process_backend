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

import io.jetprocess.model.State;
import io.jetprocess.service.StateLocalService;
import io.jetprocess.service.StateLocalServiceUtil;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.CategoryPersistence;
import io.jetprocess.service.persistence.DeliveryModePersistence;
import io.jetprocess.service.persistence.DocFilePersistence;
import io.jetprocess.service.persistence.OrganizationPersistence;
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.ReceiptPersistence;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.StatePersistence;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;
import io.jetprocess.service.persistence.TypePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the state local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link io.jetprocess.service.impl.StateLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see io.jetprocess.service.impl.StateLocalServiceImpl
 * @generated
 */
public abstract class StateLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, StateLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>StateLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>StateLocalServiceUtil</code>.
	 */

	/**
	 * Adds the state to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param state the state
	 * @return the state that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public State addState(State state) {
		state.setNew(true);

		return statePersistence.update(state);
	}

	/**
	 * Creates a new state with the primary key. Does not add the state to the database.
	 *
	 * @param id the primary key for the new state
	 * @return the new state
	 */
	@Override
	@Transactional(enabled = false)
	public State createState(long id) {
		return statePersistence.create(id);
	}

	/**
	 * Deletes the state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the state
	 * @return the state that was removed
	 * @throws PortalException if a state with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public State deleteState(long id) throws PortalException {
		return statePersistence.remove(id);
	}

	/**
	 * Deletes the state from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param state the state
	 * @return the state that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public State deleteState(State state) {
		return statePersistence.remove(state);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return statePersistence.dslQuery(dslQuery);
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
			State.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return statePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.StateModelImpl</code>.
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

		return statePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.StateModelImpl</code>.
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

		return statePersistence.findWithDynamicQuery(
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
		return statePersistence.countWithDynamicQuery(dynamicQuery);
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

		return statePersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public State fetchState(long id) {
		return statePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the state with the primary key.
	 *
	 * @param id the primary key of the state
	 * @return the state
	 * @throws PortalException if a state with the primary key could not be found
	 */
	@Override
	public State getState(long id) throws PortalException {
		return statePersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(stateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(State.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(stateLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(State.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(stateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(State.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return statePersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return stateLocalService.deleteState((State)persistedModel);
	}

	@Override
	public BasePersistence<State> getBasePersistence() {
		return statePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return statePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.StateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @return the range of states
	 */
	@Override
	public List<State> getStates(int start, int end) {
		return statePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of states.
	 *
	 * @return the number of states
	 */
	@Override
	public int getStatesCount() {
		return statePersistence.countAll();
	}

	/**
	 * Updates the state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param state the state
	 * @return the state that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public State updateState(State state) {
		return statePersistence.update(state);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			StateLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		stateLocalService = (StateLocalService)aopProxy;

		_setLocalServiceUtilService(stateLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return StateLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return State.class;
	}

	protected String getModelClassName() {
		return State.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = statePersistence.getDataSource();

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
		StateLocalService stateLocalService) {

		try {
			Field field = StateLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, stateLocalService);
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
	protected OrganizationPersistence organizationPersistence;

	@Reference
	protected PrimaryHeadPersistence primaryHeadPersistence;

	@Reference
	protected ReceiptPersistence receiptPersistence;

	@Reference
	protected SecondaryHeadPersistence secondaryHeadPersistence;

	protected StateLocalService stateLocalService;

	@Reference
	protected StatePersistence statePersistence;

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