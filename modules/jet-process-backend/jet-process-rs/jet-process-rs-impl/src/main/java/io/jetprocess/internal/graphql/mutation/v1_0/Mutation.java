package io.jetprocess.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.dto.v1_0.NoteDocumentRsModel;
import io.jetprocess.dto.v1_0.ReceiptRsModel;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.NoteDocumentRsModelResource;
import io.jetprocess.resource.v1_0.ReceiptRsModelResource;

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

	public static void setFileRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<FileRsModelResource>
			fileRsModelResourceComponentServiceObjects) {

		_fileRsModelResourceComponentServiceObjects =
			fileRsModelResourceComponentServiceObjects;
	}

	public static void setNoteDocumentRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<NoteDocumentRsModelResource>
			noteDocumentRsModelResourceComponentServiceObjects) {

		_noteDocumentRsModelResourceComponentServiceObjects =
			noteDocumentRsModelResourceComponentServiceObjects;
	}

	public static void setReceiptRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<ReceiptRsModelResource>
			receiptRsModelResourceComponentServiceObjects) {

		_receiptRsModelResourceComponentServiceObjects =
			receiptRsModelResourceComponentServiceObjects;
	}

	@GraphQLField
	public boolean deleteDocFileById(@GraphQLName("id") Long id)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> fileRsModelResource.deleteDocFileById(id));

		return true;
	}

	@GraphQLField
	public FileRsModel createDocFile(
			@GraphQLName("fileRsModel") FileRsModel fileRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> fileRsModelResource.createDocFile(
				fileRsModel));
	}

	@GraphQLField
	public FileRsModel updateDocFile(
			@GraphQLName("id") Long id,
			@GraphQLName("fileRsModel") FileRsModel fileRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> fileRsModelResource.updateDocFile(
				id, fileRsModel));
	}

	@GraphQLField
	public boolean deleteNoteDocumentById(@GraphQLName("id") Long id)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_noteDocumentRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocumentRsModelResource ->
				noteDocumentRsModelResource.deleteNoteDocumentById(id));

		return true;
	}

	@GraphQLField
	public NoteDocumentRsModel createNotedocument(
			@GraphQLName("noteDocumentRsModel") NoteDocumentRsModel
				noteDocumentRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_noteDocumentRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocumentRsModelResource ->
				noteDocumentRsModelResource.createNotedocument(
					noteDocumentRsModel));
	}

	@GraphQLField
	public NoteDocumentRsModel updateNoteDocument(
			@GraphQLName("id") Long id,
			@GraphQLName("noteDocumentRsModel") NoteDocumentRsModel
				noteDocumentRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_noteDocumentRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocumentRsModelResource ->
				noteDocumentRsModelResource.updateNoteDocument(
					id, noteDocumentRsModel));
	}

	@GraphQLField
	public boolean deleteReceiptById(@GraphQLName("id") Long id)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptRsModelResource -> receiptRsModelResource.deleteReceiptById(
				id));

		return true;
	}

	@GraphQLField
	public ReceiptRsModel createReceipt(
			@GraphQLName("receiptRsModel") ReceiptRsModel receiptRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptRsModelResource -> receiptRsModelResource.createReceipt(
				receiptRsModel));
	}

	@GraphQLField
	public ReceiptRsModel updateReceipt(
			@GraphQLName("id") Long id,
			@GraphQLName("receiptRsModel") ReceiptRsModel receiptRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptRsModelResource -> receiptRsModelResource.updateReceipt(
				id, receiptRsModel));
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
			NoteDocumentRsModelResource noteDocumentRsModelResource)
		throws Exception {

		noteDocumentRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		noteDocumentRsModelResource.setContextCompany(_company);
		noteDocumentRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		noteDocumentRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		noteDocumentRsModelResource.setContextUriInfo(_uriInfo);
		noteDocumentRsModelResource.setContextUser(_user);
		noteDocumentRsModelResource.setGroupLocalService(_groupLocalService);
		noteDocumentRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			ReceiptRsModelResource receiptRsModelResource)
		throws Exception {

		receiptRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		receiptRsModelResource.setContextCompany(_company);
		receiptRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		receiptRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		receiptRsModelResource.setContextUriInfo(_uriInfo);
		receiptRsModelResource.setContextUser(_user);
		receiptRsModelResource.setGroupLocalService(_groupLocalService);
		receiptRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<FileRsModelResource>
		_fileRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<NoteDocumentRsModelResource>
		_noteDocumentRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<ReceiptRsModelResource>
		_receiptRsModelResourceComponentServiceObjects;

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