package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.NoteDocumentRsModel;
import io.jetprocess.model.DocumentNoteMapping;
import io.jetprocess.model.Note;
import io.jetprocess.model.NoteDocument;
import io.jetprocess.resource.v1_0.NoteDocumentRsModelResource;
import io.jetprocess.service.DocumentNoteMappingLocalService;
import io.jetprocess.service.NoteDocumentLocalService;
import io.jetprocess.service.NoteLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/note-document-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = NoteDocumentRsModelResource.class)
public class NoteDocumentRsModelResourceImpl extends BaseNoteDocumentRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<NoteDocumentRsModel>, UnsafeConsumer<NoteDocumentRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteNoteDocumentById(@NotNull Long id) throws Exception {
		mappingLocalService.deleteDocumentNoteMappingById(id);
	}

	@Override
	public NoteDocumentRsModel createNotedocument(NoteDocumentRsModel noteDocumentRsModel) throws Exception {

		System.out.println(noteDocumentRsModel.getSubject() + "   " + noteDocumentRsModel.getSubjectCategoryId() + "   "
				+ noteDocumentRsModel.getCreatedBy() + "   " + noteDocumentRsModel.getContent());

		mappingLocalService.addDocumentNoteMapping(noteDocumentRsModel.getSubject(),
				noteDocumentRsModel.getSubjectCategoryId(), noteDocumentRsModel.getCreatedBy(),
				noteDocumentRsModel.getContent());
		return noteDocumentRsModel;
	}

	@Override
	public NoteDocumentRsModel updateNoteDocument(@NotNull Long id, NoteDocumentRsModel noteDocumentRsModel)
			throws Exception {
		mappingLocalService.updateDocumentNoteMapping(id, noteDocumentRsModel.getSubject(),
				noteDocumentRsModel.getSubjectCategoryId(), noteDocumentRsModel.getContent());
		return noteDocumentRsModel;
	}

	@Override
	public NoteDocumentRsModel getNoteDocumentId(@NotNull Long id) throws Exception {
		DocumentNoteMapping mapping = mappingLocalService.getDocumentNoteMapping(id);
		NoteDocument noteDocument = noteDocumentLocalService.getNoteDocument(mapping.getId());
		Note note = noteLocalService.getNote(id);
		return getNoteDocumentByIdRsModel(noteDocument, note);
	}

	@Override
	public Page<NoteDocumentRsModel> getNoteDocumentList() throws Exception {
		List<NoteDocumentRsModel> noteDocumentRsModelList = new ArrayList<>();
		List<NoteDocument> noteDocumentList = noteDocumentLocalService.getNoteDocuments();
		noteDocumentList.stream().forEach(noteDocument -> {
			noteDocumentRsModelList.add(getNoteDocumentRsModel(noteDocument));
		});
		return Page.of(noteDocumentRsModelList);
	}

	private NoteDocumentRsModel getNoteDocumentRsModel(NoteDocument noteDocument) {
		NoteDocumentRsModel noteDocumentRsModel = new NoteDocumentRsModel();
		noteDocumentRsModel.setId(noteDocument.getId());
		noteDocumentRsModel.setNoteDocumentNo(noteDocument.getNoteDocumentNumber());
		noteDocumentRsModel.setSubject(noteDocument.getSubject());
		noteDocumentRsModel.setSubjectCategoryId(noteDocument.getSubjectCategoryId());
		noteDocumentRsModel.setModifiedDate(noteDocument.getModifiedDate());
		return noteDocumentRsModel;
	}

	private NoteDocumentRsModel getNoteDocumentByIdRsModel(NoteDocument noteDocument, Note note) {
		NoteDocumentRsModel noteDocumentRsModel = new NoteDocumentRsModel();
		noteDocumentRsModel.setSubject(noteDocument.getSubject());
		noteDocumentRsModel.setSubjectCategoryId(noteDocument.getSubjectCategoryId());
		noteDocumentRsModel.setContent(note.getContent());
		return noteDocumentRsModel;
	}

	@Reference
	private DocumentNoteMappingLocalService mappingLocalService;

	@Reference
	private NoteDocumentLocalService noteDocumentLocalService;

	@Reference
	private NoteLocalService noteLocalService;
}