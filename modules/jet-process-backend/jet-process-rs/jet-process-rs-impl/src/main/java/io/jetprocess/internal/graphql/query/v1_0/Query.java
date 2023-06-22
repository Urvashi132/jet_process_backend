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
import io.jetprocess.dto.v1_0.CountryRsModel;
import io.jetprocess.dto.v1_0.DeliveryModeRsModel;
import io.jetprocess.dto.v1_0.DispatchRsModel;
import io.jetprocess.dto.v1_0.DraftRecipientRsModel;
import io.jetprocess.dto.v1_0.DraftRsModel;
import io.jetprocess.dto.v1_0.FileCategoryRsModel;
import io.jetprocess.dto.v1_0.FileMovementRsModel;
import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.dto.v1_0.NoteDocMovementRsModel;
import io.jetprocess.dto.v1_0.NoteDocumentRsModel;
import io.jetprocess.dto.v1_0.OrganizationRsModel;
import io.jetprocess.dto.v1_0.PostalRsModel;
import io.jetprocess.dto.v1_0.PrimaryHeadRsModel;
import io.jetprocess.dto.v1_0.ReceiptMovementRsModel;
import io.jetprocess.dto.v1_0.ReceiptRsModel;
import io.jetprocess.dto.v1_0.SecondaryHeadRsModel;
import io.jetprocess.dto.v1_0.StateRsModel;
import io.jetprocess.dto.v1_0.SubjectCategoryRsModel;
import io.jetprocess.dto.v1_0.TertiaryHeadRsModel;
import io.jetprocess.dto.v1_0.TypeRsModel;
import io.jetprocess.resource.v1_0.BasicHeadRsModelResource;
import io.jetprocess.resource.v1_0.CategoryRsModelResource;
import io.jetprocess.resource.v1_0.CountryRsModelResource;
import io.jetprocess.resource.v1_0.DeliveryModeRsModelResource;
import io.jetprocess.resource.v1_0.DispatchRsModelResource;
import io.jetprocess.resource.v1_0.DraftRecipientRsModelResource;
import io.jetprocess.resource.v1_0.DraftRsModelResource;
import io.jetprocess.resource.v1_0.FileCategoryRsModelResource;
import io.jetprocess.resource.v1_0.FileMovementRsModelResource;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.NoteDocMovementRsModelResource;
import io.jetprocess.resource.v1_0.NoteDocumentRsModelResource;
import io.jetprocess.resource.v1_0.OrganizationRsModelResource;
import io.jetprocess.resource.v1_0.PostalRsModelResource;
import io.jetprocess.resource.v1_0.PrimaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.ReceiptMovementRsModelResource;
import io.jetprocess.resource.v1_0.ReceiptRsModelResource;
import io.jetprocess.resource.v1_0.SecondaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.StateRsModelResource;
import io.jetprocess.resource.v1_0.SubjectCategoryRsModelResource;
import io.jetprocess.resource.v1_0.TertiaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.TypeRsModelResource;

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

	public static void setCountryRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<CountryRsModelResource>
			countryRsModelResourceComponentServiceObjects) {

		_countryRsModelResourceComponentServiceObjects =
			countryRsModelResourceComponentServiceObjects;
	}

	public static void setDeliveryModeRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<DeliveryModeRsModelResource>
			deliveryModeRsModelResourceComponentServiceObjects) {

		_deliveryModeRsModelResourceComponentServiceObjects =
			deliveryModeRsModelResourceComponentServiceObjects;
	}

	public static void setDispatchRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<DispatchRsModelResource>
			dispatchRsModelResourceComponentServiceObjects) {

		_dispatchRsModelResourceComponentServiceObjects =
			dispatchRsModelResourceComponentServiceObjects;
	}

	public static void setDraftRecipientRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<DraftRecipientRsModelResource>
			draftRecipientRsModelResourceComponentServiceObjects) {

		_draftRecipientRsModelResourceComponentServiceObjects =
			draftRecipientRsModelResourceComponentServiceObjects;
	}

	public static void setDraftRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<DraftRsModelResource>
			draftRsModelResourceComponentServiceObjects) {

		_draftRsModelResourceComponentServiceObjects =
			draftRsModelResourceComponentServiceObjects;
	}

	public static void setFileCategoryRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<FileCategoryRsModelResource>
			fileCategoryRsModelResourceComponentServiceObjects) {

		_fileCategoryRsModelResourceComponentServiceObjects =
			fileCategoryRsModelResourceComponentServiceObjects;
	}

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

	public static void setOrganizationRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<OrganizationRsModelResource>
			organizationRsModelResourceComponentServiceObjects) {

		_organizationRsModelResourceComponentServiceObjects =
			organizationRsModelResourceComponentServiceObjects;
	}

	public static void setPostalRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<PostalRsModelResource>
			postalRsModelResourceComponentServiceObjects) {

		_postalRsModelResourceComponentServiceObjects =
			postalRsModelResourceComponentServiceObjects;
	}

	public static void setPrimaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<PrimaryHeadRsModelResource>
			primaryHeadRsModelResourceComponentServiceObjects) {

		_primaryHeadRsModelResourceComponentServiceObjects =
			primaryHeadRsModelResourceComponentServiceObjects;
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

	public static void setSecondaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<SecondaryHeadRsModelResource>
			secondaryHeadRsModelResourceComponentServiceObjects) {

		_secondaryHeadRsModelResourceComponentServiceObjects =
			secondaryHeadRsModelResourceComponentServiceObjects;
	}

	public static void setStateRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<StateRsModelResource>
			stateRsModelResourceComponentServiceObjects) {

		_stateRsModelResourceComponentServiceObjects =
			stateRsModelResourceComponentServiceObjects;
	}

	public static void setSubjectCategoryRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<SubjectCategoryRsModelResource>
			subjectCategoryRsModelResourceComponentServiceObjects) {

		_subjectCategoryRsModelResourceComponentServiceObjects =
			subjectCategoryRsModelResourceComponentServiceObjects;
	}

	public static void setTertiaryHeadRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<TertiaryHeadRsModelResource>
			tertiaryHeadRsModelResourceComponentServiceObjects) {

		_tertiaryHeadRsModelResourceComponentServiceObjects =
			tertiaryHeadRsModelResourceComponentServiceObjects;
	}

	public static void setTypeRsModelResourceComponentServiceObjects(
		ComponentServiceObjects<TypeRsModelResource>
			typeRsModelResourceComponentServiceObjects) {

		_typeRsModelResourceComponentServiceObjects =
			typeRsModelResourceComponentServiceObjects;
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
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {countryList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public CountryRsModelPage countryList() throws Exception {
		return _applyComponentServiceObjects(
			_countryRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			countryRsModelResource -> new CountryRsModelPage(
				countryRsModelResource.getCountryList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {deliveryModeist{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DeliveryModeRsModelPage deliveryModeist() throws Exception {
		return _applyComponentServiceObjects(
			_deliveryModeRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			deliveryModeRsModelResource -> new DeliveryModeRsModelPage(
				deliveryModeRsModelResource.getDeliveryModeist()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dispatchById(id: ___){dispatchedBy, deliveryMode, address, subject, dispatchedOn, dispatchedType, issueNumber, receiptentId, draftId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DispatchRsModel dispatchById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_dispatchRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			dispatchRsModelResource -> dispatchRsModelResource.getDispatchById(
				id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dispatchList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DispatchRsModelPage dispatchList() throws Exception {
		return _applyComponentServiceObjects(
			_dispatchRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			dispatchRsModelResource -> new DispatchRsModelPage(
				dispatchRsModelResource.getDispatchList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {draftRecipientById(id: ___){id, draftId, organizationId, name, designation, mobile, email, address, stateId, city, pincode}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DraftRecipientRsModel draftRecipientById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_draftRecipientRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			draftRecipientRsModelResource ->
				draftRecipientRsModelResource.getDraftRecipientById(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {draftRecipientList(draftId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DraftRecipientRsModelPage draftRecipientList(
			@GraphQLName("draftId") Long draftId)
		throws Exception {

		return _applyComponentServiceObjects(
			_draftRecipientRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			draftRecipientRsModelResource -> new DraftRecipientRsModelPage(
				draftRecipientRsModelResource.getDraftRecipientList(draftId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {draftById(id: ___){id, draftNo, nature, receiptId, replyTypeId, categoryId, subject, content, status, approvedBy, modifiedDate}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DraftRsModel draftById(@GraphQLName("id") Long id) throws Exception {
		return _applyComponentServiceObjects(
			_draftRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			draftRsModelResource -> draftRsModelResource.getDraftById(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {draftList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DraftRsModelPage draftList() throws Exception {
		return _applyComponentServiceObjects(
			_draftRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			draftRsModelResource -> new DraftRsModelPage(
				draftRsModelResource.getDraftList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {fileCategoryList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public FileCategoryRsModelPage fileCategoryList() throws Exception {
		return _applyComponentServiceObjects(
			_fileCategoryRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileCategoryRsModelResource -> new FileCategoryRsModelPage(
				fileCategoryRsModelResource.getFileCategoryList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {fileMovementList(fileId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public FileMovementRsModelPage fileMovementList(
			@GraphQLName("fileId") Long fileId)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileMovementRsModelResource -> new FileMovementRsModelPage(
				fileMovementRsModelResource.getFileMovementList(fileId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {docFileById(id: ___){id, groupId, nature, type, headId, fileCodeId, subject, fileNo, categoryId, remarks, reference, year, userPostId, createDate}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public FileRsModel docFileById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			fileRsModelResource -> fileRsModelResource.getDocFileById(id));
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
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {noteDocumentMovementList(noteDocumentId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public NoteDocMovementRsModelPage noteDocumentMovementList(
			@GraphQLName("noteDocumentId") Long noteDocumentId)
		throws Exception {

		return _applyComponentServiceObjects(
			_noteDocMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocMovementRsModelResource -> new NoteDocMovementRsModelPage(
				noteDocMovementRsModelResource.getNoteDocumentMovementList(
					noteDocumentId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {noteDocumentId(id: ___){id, groupId, noteDocumentNo, subject, subjectCategoryId, content, createdBy, createDate}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public NoteDocumentRsModel noteDocumentId(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_noteDocumentRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocumentRsModelResource ->
				noteDocumentRsModelResource.getNoteDocumentId(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {noteDocumentList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public NoteDocumentRsModelPage noteDocumentList() throws Exception {
		return _applyComponentServiceObjects(
			_noteDocumentRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			noteDocumentRsModelResource -> new NoteDocumentRsModelPage(
				noteDocumentRsModelResource.getNoteDocumentList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {organizationList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public OrganizationRsModelPage organizationList() throws Exception {
		return _applyComponentServiceObjects(
			_organizationRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			organizationRsModelResource -> new OrganizationRsModelPage(
				organizationRsModelResource.getOrganizationList()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {postalById(id: ___){postalMode, postalCharge, medium, weight, modeNumber, peonBookNo, peonName, outDate, deliveryDate}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public PostalRsModel postalById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_postalRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			postalRsModelResource -> postalRsModelResource.getPostalById(id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {postalList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public PostalRsModelPage postalList() throws Exception {
		return _applyComponentServiceObjects(
			_postalRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			postalRsModelResource -> new PostalRsModelPage(
				postalRsModelResource.getPostalList()));
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
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {receiptMovementList(receiptId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public ReceiptMovementRsModelPage receiptMovementList(
			@GraphQLName("receiptId") Long receiptId)
		throws Exception {

		return _applyComponentServiceObjects(
			_receiptMovementRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptMovementRsModelResource -> new ReceiptMovementRsModelPage(
				receiptMovementRsModelResource.getReceiptMovementList(
					receiptId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {receiptById(id: ___){id, groupId, type, deliveryModeId, receivedOn, letterDate, referenceNo, modeNo, receiptNo, categoryId, subject, remarks, name, designation, mobile, email, address, stateId, pincode, organization, city, userPostId, viewPdfUrl, docfileId, nature, createdOn, currentlyWith, attachStatus, currentState, errorCode, status, errorMessage}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public ReceiptRsModel receiptById(@GraphQLName("id") Long id)
		throws Exception {

		return _applyComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptRsModelResource -> receiptRsModelResource.getReceiptById(
				id));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {receiptList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public ReceiptRsModelPage receiptList() throws Exception {
		return _applyComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			receiptRsModelResource -> new ReceiptRsModelPage(
				receiptRsModelResource.getReceiptList()));
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
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {stateByCountryId(countryId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public StateRsModelPage stateByCountryId(
			@GraphQLName("countryId") Long countryId)
		throws Exception {

		return _applyComponentServiceObjects(
			_stateRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			stateRsModelResource -> new StateRsModelPage(
				stateRsModelResource.getStateByCountryId(countryId)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {subjectCategoryList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public SubjectCategoryRsModelPage subjectCategoryList() throws Exception {
		return _applyComponentServiceObjects(
			_subjectCategoryRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			subjectCategoryRsModelResource -> new SubjectCategoryRsModelPage(
				subjectCategoryRsModelResource.getSubjectCategoryList()));
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

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {typeList{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public TypeRsModelPage typeList() throws Exception {
		return _applyComponentServiceObjects(
			_typeRsModelResourceComponentServiceObjects,
			this::_populateResourceContext,
			typeRsModelResource -> new TypeRsModelPage(
				typeRsModelResource.getTypeList()));
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

	@GraphQLName("CountryRsModelPage")
	public class CountryRsModelPage {

		public CountryRsModelPage(Page countryRsModelPage) {
			actions = countryRsModelPage.getActions();

			items = countryRsModelPage.getItems();
			lastPage = countryRsModelPage.getLastPage();
			page = countryRsModelPage.getPage();
			pageSize = countryRsModelPage.getPageSize();
			totalCount = countryRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<CountryRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DeliveryModeRsModelPage")
	public class DeliveryModeRsModelPage {

		public DeliveryModeRsModelPage(Page deliveryModeRsModelPage) {
			actions = deliveryModeRsModelPage.getActions();

			items = deliveryModeRsModelPage.getItems();
			lastPage = deliveryModeRsModelPage.getLastPage();
			page = deliveryModeRsModelPage.getPage();
			pageSize = deliveryModeRsModelPage.getPageSize();
			totalCount = deliveryModeRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DeliveryModeRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DispatchRsModelPage")
	public class DispatchRsModelPage {

		public DispatchRsModelPage(Page dispatchRsModelPage) {
			actions = dispatchRsModelPage.getActions();

			items = dispatchRsModelPage.getItems();
			lastPage = dispatchRsModelPage.getLastPage();
			page = dispatchRsModelPage.getPage();
			pageSize = dispatchRsModelPage.getPageSize();
			totalCount = dispatchRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DispatchRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DraftRecipientRsModelPage")
	public class DraftRecipientRsModelPage {

		public DraftRecipientRsModelPage(Page draftRecipientRsModelPage) {
			actions = draftRecipientRsModelPage.getActions();

			items = draftRecipientRsModelPage.getItems();
			lastPage = draftRecipientRsModelPage.getLastPage();
			page = draftRecipientRsModelPage.getPage();
			pageSize = draftRecipientRsModelPage.getPageSize();
			totalCount = draftRecipientRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DraftRecipientRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DraftRsModelPage")
	public class DraftRsModelPage {

		public DraftRsModelPage(Page draftRsModelPage) {
			actions = draftRsModelPage.getActions();

			items = draftRsModelPage.getItems();
			lastPage = draftRsModelPage.getLastPage();
			page = draftRsModelPage.getPage();
			pageSize = draftRsModelPage.getPageSize();
			totalCount = draftRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<DraftRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("FileCategoryRsModelPage")
	public class FileCategoryRsModelPage {

		public FileCategoryRsModelPage(Page fileCategoryRsModelPage) {
			actions = fileCategoryRsModelPage.getActions();

			items = fileCategoryRsModelPage.getItems();
			lastPage = fileCategoryRsModelPage.getLastPage();
			page = fileCategoryRsModelPage.getPage();
			pageSize = fileCategoryRsModelPage.getPageSize();
			totalCount = fileCategoryRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<FileCategoryRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("FileMovementRsModelPage")
	public class FileMovementRsModelPage {

		public FileMovementRsModelPage(Page fileMovementRsModelPage) {
			actions = fileMovementRsModelPage.getActions();

			items = fileMovementRsModelPage.getItems();
			lastPage = fileMovementRsModelPage.getLastPage();
			page = fileMovementRsModelPage.getPage();
			pageSize = fileMovementRsModelPage.getPageSize();
			totalCount = fileMovementRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<FileMovementRsModel> items;

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

	@GraphQLName("NoteDocMovementRsModelPage")
	public class NoteDocMovementRsModelPage {

		public NoteDocMovementRsModelPage(Page noteDocMovementRsModelPage) {
			actions = noteDocMovementRsModelPage.getActions();

			items = noteDocMovementRsModelPage.getItems();
			lastPage = noteDocMovementRsModelPage.getLastPage();
			page = noteDocMovementRsModelPage.getPage();
			pageSize = noteDocMovementRsModelPage.getPageSize();
			totalCount = noteDocMovementRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<NoteDocMovementRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("NoteDocumentRsModelPage")
	public class NoteDocumentRsModelPage {

		public NoteDocumentRsModelPage(Page noteDocumentRsModelPage) {
			actions = noteDocumentRsModelPage.getActions();

			items = noteDocumentRsModelPage.getItems();
			lastPage = noteDocumentRsModelPage.getLastPage();
			page = noteDocumentRsModelPage.getPage();
			pageSize = noteDocumentRsModelPage.getPageSize();
			totalCount = noteDocumentRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<NoteDocumentRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("OrganizationRsModelPage")
	public class OrganizationRsModelPage {

		public OrganizationRsModelPage(Page organizationRsModelPage) {
			actions = organizationRsModelPage.getActions();

			items = organizationRsModelPage.getItems();
			lastPage = organizationRsModelPage.getLastPage();
			page = organizationRsModelPage.getPage();
			pageSize = organizationRsModelPage.getPageSize();
			totalCount = organizationRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<OrganizationRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("PostalRsModelPage")
	public class PostalRsModelPage {

		public PostalRsModelPage(Page postalRsModelPage) {
			actions = postalRsModelPage.getActions();

			items = postalRsModelPage.getItems();
			lastPage = postalRsModelPage.getLastPage();
			page = postalRsModelPage.getPage();
			pageSize = postalRsModelPage.getPageSize();
			totalCount = postalRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<PostalRsModel> items;

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

	@GraphQLName("ReceiptMovementRsModelPage")
	public class ReceiptMovementRsModelPage {

		public ReceiptMovementRsModelPage(Page receiptMovementRsModelPage) {
			actions = receiptMovementRsModelPage.getActions();

			items = receiptMovementRsModelPage.getItems();
			lastPage = receiptMovementRsModelPage.getLastPage();
			page = receiptMovementRsModelPage.getPage();
			pageSize = receiptMovementRsModelPage.getPageSize();
			totalCount = receiptMovementRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<ReceiptMovementRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("ReceiptRsModelPage")
	public class ReceiptRsModelPage {

		public ReceiptRsModelPage(Page receiptRsModelPage) {
			actions = receiptRsModelPage.getActions();

			items = receiptRsModelPage.getItems();
			lastPage = receiptRsModelPage.getLastPage();
			page = receiptRsModelPage.getPage();
			pageSize = receiptRsModelPage.getPageSize();
			totalCount = receiptRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<ReceiptRsModel> items;

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

	@GraphQLName("StateRsModelPage")
	public class StateRsModelPage {

		public StateRsModelPage(Page stateRsModelPage) {
			actions = stateRsModelPage.getActions();

			items = stateRsModelPage.getItems();
			lastPage = stateRsModelPage.getLastPage();
			page = stateRsModelPage.getPage();
			pageSize = stateRsModelPage.getPageSize();
			totalCount = stateRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<StateRsModel> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("SubjectCategoryRsModelPage")
	public class SubjectCategoryRsModelPage {

		public SubjectCategoryRsModelPage(Page subjectCategoryRsModelPage) {
			actions = subjectCategoryRsModelPage.getActions();

			items = subjectCategoryRsModelPage.getItems();
			lastPage = subjectCategoryRsModelPage.getLastPage();
			page = subjectCategoryRsModelPage.getPage();
			pageSize = subjectCategoryRsModelPage.getPageSize();
			totalCount = subjectCategoryRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<SubjectCategoryRsModel> items;

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

	@GraphQLName("TypeRsModelPage")
	public class TypeRsModelPage {

		public TypeRsModelPage(Page typeRsModelPage) {
			actions = typeRsModelPage.getActions();

			items = typeRsModelPage.getItems();
			lastPage = typeRsModelPage.getLastPage();
			page = typeRsModelPage.getPage();
			pageSize = typeRsModelPage.getPageSize();
			totalCount = typeRsModelPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<TypeRsModel> items;

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
			CountryRsModelResource countryRsModelResource)
		throws Exception {

		countryRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		countryRsModelResource.setContextCompany(_company);
		countryRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		countryRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		countryRsModelResource.setContextUriInfo(_uriInfo);
		countryRsModelResource.setContextUser(_user);
		countryRsModelResource.setGroupLocalService(_groupLocalService);
		countryRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			DeliveryModeRsModelResource deliveryModeRsModelResource)
		throws Exception {

		deliveryModeRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		deliveryModeRsModelResource.setContextCompany(_company);
		deliveryModeRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		deliveryModeRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		deliveryModeRsModelResource.setContextUriInfo(_uriInfo);
		deliveryModeRsModelResource.setContextUser(_user);
		deliveryModeRsModelResource.setGroupLocalService(_groupLocalService);
		deliveryModeRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			DispatchRsModelResource dispatchRsModelResource)
		throws Exception {

		dispatchRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		dispatchRsModelResource.setContextCompany(_company);
		dispatchRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		dispatchRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		dispatchRsModelResource.setContextUriInfo(_uriInfo);
		dispatchRsModelResource.setContextUser(_user);
		dispatchRsModelResource.setGroupLocalService(_groupLocalService);
		dispatchRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			DraftRecipientRsModelResource draftRecipientRsModelResource)
		throws Exception {

		draftRecipientRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		draftRecipientRsModelResource.setContextCompany(_company);
		draftRecipientRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		draftRecipientRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		draftRecipientRsModelResource.setContextUriInfo(_uriInfo);
		draftRecipientRsModelResource.setContextUser(_user);
		draftRecipientRsModelResource.setGroupLocalService(_groupLocalService);
		draftRecipientRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			DraftRsModelResource draftRsModelResource)
		throws Exception {

		draftRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		draftRsModelResource.setContextCompany(_company);
		draftRsModelResource.setContextHttpServletRequest(_httpServletRequest);
		draftRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		draftRsModelResource.setContextUriInfo(_uriInfo);
		draftRsModelResource.setContextUser(_user);
		draftRsModelResource.setGroupLocalService(_groupLocalService);
		draftRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			FileCategoryRsModelResource fileCategoryRsModelResource)
		throws Exception {

		fileCategoryRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		fileCategoryRsModelResource.setContextCompany(_company);
		fileCategoryRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		fileCategoryRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		fileCategoryRsModelResource.setContextUriInfo(_uriInfo);
		fileCategoryRsModelResource.setContextUser(_user);
		fileCategoryRsModelResource.setGroupLocalService(_groupLocalService);
		fileCategoryRsModelResource.setRoleLocalService(_roleLocalService);
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
			OrganizationRsModelResource organizationRsModelResource)
		throws Exception {

		organizationRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		organizationRsModelResource.setContextCompany(_company);
		organizationRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		organizationRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		organizationRsModelResource.setContextUriInfo(_uriInfo);
		organizationRsModelResource.setContextUser(_user);
		organizationRsModelResource.setGroupLocalService(_groupLocalService);
		organizationRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			PostalRsModelResource postalRsModelResource)
		throws Exception {

		postalRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		postalRsModelResource.setContextCompany(_company);
		postalRsModelResource.setContextHttpServletRequest(_httpServletRequest);
		postalRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		postalRsModelResource.setContextUriInfo(_uriInfo);
		postalRsModelResource.setContextUser(_user);
		postalRsModelResource.setGroupLocalService(_groupLocalService);
		postalRsModelResource.setRoleLocalService(_roleLocalService);
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
			StateRsModelResource stateRsModelResource)
		throws Exception {

		stateRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		stateRsModelResource.setContextCompany(_company);
		stateRsModelResource.setContextHttpServletRequest(_httpServletRequest);
		stateRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		stateRsModelResource.setContextUriInfo(_uriInfo);
		stateRsModelResource.setContextUser(_user);
		stateRsModelResource.setGroupLocalService(_groupLocalService);
		stateRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			SubjectCategoryRsModelResource subjectCategoryRsModelResource)
		throws Exception {

		subjectCategoryRsModelResource.setContextAcceptLanguage(
			_acceptLanguage);
		subjectCategoryRsModelResource.setContextCompany(_company);
		subjectCategoryRsModelResource.setContextHttpServletRequest(
			_httpServletRequest);
		subjectCategoryRsModelResource.setContextHttpServletResponse(
			_httpServletResponse);
		subjectCategoryRsModelResource.setContextUriInfo(_uriInfo);
		subjectCategoryRsModelResource.setContextUser(_user);
		subjectCategoryRsModelResource.setGroupLocalService(_groupLocalService);
		subjectCategoryRsModelResource.setRoleLocalService(_roleLocalService);
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

	private void _populateResourceContext(
			TypeRsModelResource typeRsModelResource)
		throws Exception {

		typeRsModelResource.setContextAcceptLanguage(_acceptLanguage);
		typeRsModelResource.setContextCompany(_company);
		typeRsModelResource.setContextHttpServletRequest(_httpServletRequest);
		typeRsModelResource.setContextHttpServletResponse(_httpServletResponse);
		typeRsModelResource.setContextUriInfo(_uriInfo);
		typeRsModelResource.setContextUser(_user);
		typeRsModelResource.setGroupLocalService(_groupLocalService);
		typeRsModelResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<BasicHeadRsModelResource>
		_basicHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<CategoryRsModelResource>
		_categoryRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<CountryRsModelResource>
		_countryRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<DeliveryModeRsModelResource>
		_deliveryModeRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<DispatchRsModelResource>
		_dispatchRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<DraftRecipientRsModelResource>
		_draftRecipientRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<DraftRsModelResource>
		_draftRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<FileCategoryRsModelResource>
		_fileCategoryRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<FileMovementRsModelResource>
		_fileMovementRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<FileRsModelResource>
		_fileRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<NoteDocMovementRsModelResource>
		_noteDocMovementRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<NoteDocumentRsModelResource>
		_noteDocumentRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<OrganizationRsModelResource>
		_organizationRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<PostalRsModelResource>
		_postalRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<PrimaryHeadRsModelResource>
		_primaryHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<ReceiptMovementRsModelResource>
		_receiptMovementRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<ReceiptRsModelResource>
		_receiptRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<SecondaryHeadRsModelResource>
		_secondaryHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<StateRsModelResource>
		_stateRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<SubjectCategoryRsModelResource>
		_subjectCategoryRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<TertiaryHeadRsModelResource>
		_tertiaryHeadRsModelResourceComponentServiceObjects;
	private static ComponentServiceObjects<TypeRsModelResource>
		_typeRsModelResourceComponentServiceObjects;

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