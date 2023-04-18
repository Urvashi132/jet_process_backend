package io.jetprocess.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import io.jetprocess.dto.v1_0.BasicHeadRsModel;
import io.jetprocess.dto.v1_0.CategoryRsModel;
import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.dto.v1_0.PrimaryHeadRsModel;
import io.jetprocess.dto.v1_0.SecondaryHeadRsModel;
import io.jetprocess.dto.v1_0.TertiaryHeadRsModel;
import io.jetprocess.resource.v1_0.BasicHeadRsModelResource;
import io.jetprocess.resource.v1_0.CategoryRsModelResource;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.PrimaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.SecondaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.TertiaryHeadRsModelResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Admin
 * @generated
 */
@Generated("")
public class Query {

	public static void setBasicHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<BasicHeadRsModelResource>
			basicHeadRsModelResourceComponentServiceObjects) {

		_basicHeadRsModelResourceComponentServiceObjects =
			basicHeadRsModelResourceComponentServiceObjects;
	}

	public static void setCategoryRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<CategoryRsModelResource>
			categoryRsModelResourceComponentServiceObjects) {

		_categoryRsModelResourceComponentServiceObjects =
			categoryRsModelResourceComponentServiceObjects;
	}

	public static void setFileRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<FileRsModelResource>
			fileRsModelResourceComponentServiceObjects) {

		_fileRsModelResourceComponentServiceObjects =
			fileRsModelResourceComponentServiceObjects;
	}

	public static void setPrimaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<PrimaryHeadRsModelResource>
			primaryHeadRsModelResourceComponentServiceObjects) {

		_primaryHeadRsModelResourceComponentServiceObjects =
			primaryHeadRsModelResourceComponentServiceObjects;
	}

	public static void setSecondaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<SecondaryHeadRsModelResource>
			secondaryHeadRsModelResourceComponentServiceObjects) {

		_secondaryHeadRsModelResourceComponentServiceObjects =
			secondaryHeadRsModelResourceComponentServiceObjects;
	}

	public static void setTertiaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<TertiaryHeadRsModelResource>
			tertiaryHeadRsModelResourceComponentServiceObjects) {

		_tertiaryHeadRsModelResourceComponentServiceObjects =
			tertiaryHeadRsModelResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {basicHeadList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public BasicHeadRsModelPage basicHeadList() throws Exception {
		return _applyComponentServiceObjects(
			_basicHeadRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			basicHeadRsModelResource -> new BasicHeadRsModelPage(
				basicHeadRsModelResource.getBasicHeadList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {categoryList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public CategoryRsModelPage categoryList() throws Exception {
		return _applyComponentServiceObjects(
			_categoryRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			categoryRsModelResource -> new CategoryRsModelPage(
				categoryRsModelResource.getCategoryList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {docFileList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public FileRsModelPage docFileList() throws Exception {
		return _applyComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> new FileRsModelPage(
				fileRsModelResource.getDocFileList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {docFileById(docFileId: ___){docFileId, groupId, companyId, userId, userName, createDate, modifiedDate, nature, type, headId, fileCodeId, subject, fileNo, categoryId, remarks, reference, year, userPostId, currentUser, currentState, dealingOrganizationId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public FileRsModel docFileById(@GraphQLName("docFileId") Long docFileId)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> fileRsModelResource.getDocFileById(
				docFileId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {primaryHeadByBasicHeadId(basicHeadId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public PrimaryHeadRsModelPage primaryHeadByBasicHeadId(
			@GraphQLName("basicHeadId") Long basicHeadId)
		throws Exception {

		return _applyComponentServiceObjects(
			_primaryHeadRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			primaryHeadRsModelResource -> new PrimaryHeadRsModelPage(
				primaryHeadRsModelResource.getPrimaryHeadByBasicHeadId(
					basicHeadId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {seondaryHeadByPrimaryHeadId(primaryHeadId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public SecondaryHeadRsModelPage seondaryHeadByPrimaryHeadId(
			@GraphQLName("primaryHeadId") Long primaryHeadId)
		throws Exception {

		return _applyComponentServiceObjects(
			_secondaryHeadRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			secondaryHeadRsModelResource -> new SecondaryHeadRsModelPage(
				secondaryHeadRsModelResource.getSeondaryHeadByPrimaryHeadId(
					primaryHeadId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {tertiaryHeadBySecondaryHeadId(secondaryHeadId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public TertiaryHeadRsModelPage tertiaryHeadBySecondaryHeadId(
			@GraphQLName("secondaryHeadId") Long secondaryHeadId)
		throws Exception {

		return _applyComponentServiceObjects(
			_tertiaryHeadRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			tertiaryHeadRsModelResource -> new TertiaryHeadRsModelPage(
				tertiaryHeadRsModelResource.getTertiaryHeadBySecondaryHeadId(
					secondaryHeadId)));
	}

	@GraphQLName("BasicHeadRsModelPage")
	public class BasicHeadRsModelPage {

		public BasicHeadRsModelPage(Page basicHeadRsModelPage) {
			actions = basicHeadRsModelPage.getActions();

			items = basicHeadRsModelPage.getItems();
			lastPage = basicHeadRsModelPage.getLastPage();
			page = basicHeadRsModelPage.getPage();
			pageSize = basicHeadRsModelPage.getPageSize();
			totalCount = basicHeadRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<BasicHeadRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("CategoryRsModelPage")
	public class CategoryRsModelPage {

		public CategoryRsModelPage(Page categoryRsModelPage) {
			actions = categoryRsModelPage.getActions();

			items = categoryRsModelPage.getItems();
			lastPage = categoryRsModelPage.getLastPage();
			page = categoryRsModelPage.getPage();
			pageSize = categoryRsModelPage.getPageSize();
			totalCount = categoryRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<CategoryRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("FileRsModelPage")
	public class FileRsModelPage {

		public FileRsModelPage(Page fileRsModelPage) {
			actions = fileRsModelPage.getActions();

			items = fileRsModelPage.getItems();
			lastPage = fileRsModelPage.getLastPage();
			page = fileRsModelPage.getPage();
			pageSize = fileRsModelPage.getPageSize();
			totalCount = fileRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<FileRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("PrimaryHeadRsModelPage")
	public class PrimaryHeadRsModelPage {

		public PrimaryHeadRsModelPage(Page primaryHeadRsModelPage) {
			actions = primaryHeadRsModelPage.getActions();

			items = primaryHeadRsModelPage.getItems();
			lastPage = primaryHeadRsModelPage.getLastPage();
			page = primaryHeadRsModelPage.getPage();
			pageSize = primaryHeadRsModelPage.getPageSize();
			totalCount = primaryHeadRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<PrimaryHeadRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("SecondaryHeadRsModelPage")
	public class SecondaryHeadRsModelPage {

		public SecondaryHeadRsModelPage(Page secondaryHeadRsModelPage) {
			actions = secondaryHeadRsModelPage.getActions();

			items = secondaryHeadRsModelPage.getItems();
			lastPage = secondaryHeadRsModelPage.getLastPage();
			page = secondaryHeadRsModelPage.getPage();
			pageSize = secondaryHeadRsModelPage.getPageSize();
			totalCount = secondaryHeadRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<SecondaryHeadRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("TertiaryHeadRsModelPage")
	public class TertiaryHeadRsModelPage {

		public TertiaryHeadRsModelPage(Page tertiaryHeadRsModelPage) {
			actions = tertiaryHeadRsModelPage.getActions();

			items = tertiaryHeadRsModelPage.getItems();
			lastPage = tertiaryHeadRsModelPage.getLastPage();
			page = tertiaryHeadRsModelPage.getPage();
			pageSize = tertiaryHeadRsModelPage.getPageSize();
			totalCount = tertiaryHeadRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<TertiaryHeadRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			BasicHeadRsModelResource basicHeadRsModelResource)
		throws Exception {

		basicHeadRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		basicHeadRsModelResource.setContextCompany(_company);
		basicHeadRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		basicHeadRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		basicHeadRsModelResource.setContextUriInfo(_uriInfo);
		basicHeadRsModelResource.setContextUser(_user);
		basicHeadRsModelResource.setGroupLocalService(_groupLocalService);
		basicHeadRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			CategoryRsModelResource categoryRsModelResource)
		throws Exception {

		categoryRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		categoryRsModelResource.setContextCompany(_company);
		categoryRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		categoryRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		categoryRsModelResource.setContextUriInfo(_uriInfo);
		categoryRsModelResource.setContextUser(_user);
		categoryRsModelResource.setGroupLocalService(_groupLocalService);
		categoryRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			FileRsModelResource fileRsModelResource)
		throws Exception {

		fileRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		fileRsModelResource.setContextCompany(_company);
		fileRsModelResource.setContextHttpServletRequest(_httpServletRequest);
		fileRsModelResource.setContextHttpServletResponse(_httpServletResponse);
		fileRsModelResource.setContextUriInfo(_uriInfo);
		fileRsModelResource.setContextUser(_user);
		fileRsModelResource.setGroupLocalService(_groupLocalService);
		fileRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			PrimaryHeadRsModelResource primaryHeadRsModelResource)
		throws Exception {

		primaryHeadRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		primaryHeadRsModelResource.setContextCompany(_company);
		primaryHeadRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		primaryHeadRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		primaryHeadRsModelResource.setContextUriInfo(_uriInfo);
		primaryHeadRsModelResource.setContextUser(_user);
		primaryHeadRsModelResource.setGroupLocalService(_groupLocalService);
		primaryHeadRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			SecondaryHeadRsModelResource secondaryHeadRsModelResource)
		throws Exception {

		secondaryHeadRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		secondaryHeadRsModelResource.setContextCompany(_company);
		secondaryHeadRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		secondaryHeadRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		secondaryHeadRsModelResource.setContextUriInfo(_uriInfo);
		secondaryHeadRsModelResource.setContextUser(_user);
		secondaryHeadRsModelResource.setGroupLocalService(_groupLocalService);
		secondaryHeadRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			TertiaryHeadRsModelResource tertiaryHeadRsModelResource)
		throws Exception {

		tertiaryHeadRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		tertiaryHeadRsModelResource.setContextCompany(_company);
		tertiaryHeadRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		tertiaryHeadRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		tertiaryHeadRsModelResource.setContextUriInfo(_uriInfo);
		tertiaryHeadRsModelResource.setContextUser(_user);
		tertiaryHeadRsModelResource.setGroupLocalService(_groupLocalService);
		tertiaryHeadRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BasicHeadRsModelResource>
		_basicHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<CategoryRsModelResource>
		_categoryRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<FileRsModelResource>
		_fileRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<PrimaryHeadRsModelResource>
		_primaryHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<SecondaryHeadRsModelResource>
		_secondaryHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<TertiaryHeadRsModelResource>
		_tertiaryHeadRsModelResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}