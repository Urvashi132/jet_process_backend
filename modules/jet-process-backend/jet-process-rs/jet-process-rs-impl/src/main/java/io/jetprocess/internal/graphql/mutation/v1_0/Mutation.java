package io.jetprocess.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import io.jetprocess.dto.v1_0.FileMovementRsModel;
import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.dto.v1_0.NoteDocMovementRsModel;
import io.jetprocess.dto.v1_0.NoteDocumentRsModel;
import io.jetprocess.dto.v1_0.ReceiptMovementRsModel;
import io.jetprocess.dto.v1_0.ReceiptRsModel;
import io.jetprocess.resource.v1_0.FileMovementRsModelResource;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.NoteDocMovementRsModelResource;
import io.jetprocess.resource.v1_0.NoteDocumentRsModelResource;
import io.jetprocess.resource.v1_0.ReceiptMovementRsModelResource;
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

	public static void setFileMovementRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<FileMovementRsModelResource>
			fileMovementRsModelResourceComponentServiceObjects) {

		_fileMovementRsModelResourceComponentServiceObjects =
			fileMovementRsModelResourceComponentServiceObjects;
	}

	public static void setFileRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<FileRsModelResource>
			fileRsModelResourceComponentServiceObjects) {

		_fileRsModelResourceComponentServiceObjects =
			fileRsModelResourceComponentServiceObjects;
	}

	public static void setNoteDocMovementRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<NoteDocMovementRsModelResource>
			noteDocMovementRsModelResourceComponentServiceObjects) {

		_noteDocMovementRsModelResourceComponentServiceObjects =
			noteDocMovementRsModelResourceComponentServiceObjects;
	}

	public static void setNoteDocumentRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<NoteDocumentRsModelResource>
			noteDocumentRsModelResourceComponentServiceObjects) {

		_noteDocumentRsModelResourceComponentServiceObjects =
			noteDocumentRsModelResourceComponentServiceObjects;
	}

	public static void setReceiptMovementRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<ReceiptMovementRsModelResource>
			receiptMovementRsModelResourceComponentServiceObjects) {

		_receiptMovementRsModelResourceComponentServiceObjects =
			receiptMovementRsModelResourceComponentServiceObjects;
	}

	public static void setReceiptRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<ReceiptRsModelResource>
			receiptRsModelResourceComponentServiceObjects) {

		_receiptRsModelResourceComponentServiceObjects =
			receiptRsModelResourceComponentServiceObjects;
	}

	@GraphQLField
	public FileMovementRsModel createFileMovement(
			@GraphQLName("fileMovementRsModel") FileMovementRsModel
				fileMovementRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileMovementRsModelResource ->
				fileMovementRsModelResource.createFileMovement(
					fileMovementRsModel));
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
	public NoteDocMovementRsModel createNotedocMovement(
			@GraphQLName("noteDocMovementRsModel") NoteDocMovementRsModel
				noteDocMovementRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_noteDocMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocMovementRsModelResource ->
				noteDocMovementRsModelResource.createNotedocMovement(
					noteDocMovementRsModel));
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
	public ReceiptMovementRsModel createReceiptMovement(
			@GraphQLName("receiptMovementRsModel") ReceiptMovementRsModel
				receiptMovementRsModel)
		throws Exception {

		return _applyComponentServiceObjects(
			_receiptMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptMovementRsModelResource ->
				receiptMovementRsModelResource.createReceiptMovement(
					receiptMovementRsModel));
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
			FileMovementRsModelResource fileMovementRsModelResource)
		throws Exception {

		fileMovementRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		fileMovementRsModelResource.setContextCompany(_company);
		fileMovementRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		fileMovementRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		fileMovementRsModelResource.setContextUriInfo(_uriInfo);
		fileMovementRsModelResource.setContextUser(_user);
		fileMovementRsModelResource.setGroupLocalService(_groupLocalService);
		fileMovementRsModelResource.setRoleLocalService(_roleLocalService);
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
			NoteDocMovementRsModelResource noteDocMovementRsModelResource)
		throws Exception {

		noteDocMovementRsModelResource.setContextAcceptLanguage(
			_acceptLanguage);
		noteDocMovementRsModelResource.setContextCompany(_company);
		noteDocMovementRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		noteDocMovementRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		noteDocMovementRsModelResource.setContextUriInfo(_uriInfo);
		noteDocMovementRsModelResource.setContextUser(_user);
		noteDocMovementRsModelResource.setGroupLocalService(_groupLocalService);
		noteDocMovementRsModelResource.setRoleLocalService(_roleLocalService);
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
			ReceiptMovementRsModelResource receiptMovementRsModelResource)
		throws Exception {

		receiptMovementRsModelResource.setContextAcceptLanguage(
			_acceptLanguage);
		receiptMovementRsModelResource.setContextCompany(_company);
		receiptMovementRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		receiptMovementRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		receiptMovementRsModelResource.setContextUriInfo(_uriInfo);
		receiptMovementRsModelResource.setContextUser(_user);
		receiptMovementRsModelResource.setGroupLocalService(_groupLocalService);
		receiptMovementRsModelResource.setRoleLocalService(_roleLocalService);
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

	private static ComponentServiceObjects<FileMovementRsModelResource>
		_fileMovementRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<FileRsModelResource>
		_fileRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<NoteDocMovementRsModelResource>
		_noteDocMovementRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<NoteDocumentRsModelResource>
		_noteDocumentRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<ReceiptMovementRsModelResource>
		_receiptMovementRsModelResourceComponentServiceObjects;
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