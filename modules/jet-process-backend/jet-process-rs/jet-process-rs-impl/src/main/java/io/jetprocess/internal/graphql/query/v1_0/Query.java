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

import io.jetprocess.dto.v1_0.DocFile;
import io.jetprocess.resource.v1_0.DocFileResource;

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

	public static void setDocFileResourceComponentServiceObjects(
		ComponentServiceObjects<DocFileResource>
			docFileResourceComponentServiceObjects) {

		_docFileResourceComponentServiceObjects =
			docFileResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {docFileList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DocFilePage docFileList() throws Exception {
		return _applyComponentServiceObjects(
			_docFileResourceComponentServiceObjects,
			this::_populateResourceContext,
			docFileResource -> new DocFilePage(
				docFileResource.getDocFileList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {docFileById(docFileId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DocFilePage docFileById(@GraphQLName("docFileId") Long docFileId)
		throws Exception {

		return _applyComponentServiceObjects(
			_docFileResourceComponentServiceObjects,
			this::_populateResourceContext,
			docFileResource -> new DocFilePage(
				docFileResource.getDocFileById(docFileId)));
	}

	@GraphQLName("DocFilePage")
	public class DocFilePage {

		public DocFilePage(Page docFilePage) {
			actions = docFilePage.getActions();

			items = docFilePage.getItems();
			lastPage = docFilePage.getLastPage();
			page = docFilePage.getPage();
			pageSize = docFilePage.getPageSize();
			totalCount = docFilePage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DocFile> items;

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

	private void _populateResourceContext(DocFileResource docFileResource)
		throws Exception {

		docFileResource.setContextAcceptLanguage(_acceptLanguage);
		docFileResource.setContextCompany(_company);
		docFileResource.setContextHttpServletRequest(_httpServletRequest);
		docFileResource.setContextHttpServletResponse(_httpServletResponse);
		docFileResource.setContextUriInfo(_uriInfo);
		docFileResource.setContextUser(_user);
		docFileResource.setGroupLocalService(_groupLocalService);
		docFileResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<DocFileResource>
		_docFileResourceComponentServiceObjects;

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