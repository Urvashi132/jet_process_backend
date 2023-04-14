package io.jetprocess.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import io.jetprocess.dto.v1_0.DocFile;
import io.jetprocess.resource.v1_0.DocFileResource;

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
public class Mutation {

	public static void setDocFileResourceComponentServiceObjects(
		ComponentServiceObjects<DocFileResource>
			docFileResourceComponentServiceObjects) {

		_docFileResourceComponentServiceObjects =
			docFileResourceComponentServiceObjects;
	}

	@GraphQLField
	public DocFile createDocFile(@GraphQLName("docFile") DocFile docFile)
		throws Exception {

		return _applyComponentServiceObjects(
			_docFileResourceComponentServiceObjects,
			this::_populateResourceContext,
			docFileResource -> docFileResource.createDocFile(docFile));
	}

	@GraphQLField
	public boolean deleteDocFileById(@GraphQLName("docFileId") Long docFileId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_docFileResourceComponentServiceObjects,
			this::_populateResourceContext,
			docFileResource -> docFileResource.deleteDocFileById(docFileId));

		return true;
	}

	@GraphQLField
	public DocFile updateDocFile(
			@GraphQLName("docFileId") Long docFileId,
			@GraphQLName("docFile") DocFile docFile)
		throws Exception {

		return _applyComponentServiceObjects(
			_docFileResourceComponentServiceObjects,
			this::_populateResourceContext,
			docFileResource -> docFileResource.updateDocFile(
				docFileId, docFile));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}