package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.NoteDocumentRsModel;
import io.jetprocess.resource.v1_0.NoteDocumentRsModelResource;
import io.jetprocess.service.DocumentNoteMappingLocalService;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/note-document-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = NoteDocumentRsModelResource.class
)
public class NoteDocumentRsModelResourceImpl
	extends BaseNoteDocumentRsModelResourceImpl {

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
		mappingLocalService.addDocumentNoteMapping(noteDocumentRsModel.getSubject(), noteDocumentRsModel.getSubjectCategoryId(), noteDocumentRsModel.getCreatedBy(), noteDocumentRsModel.getContent());
		return noteDocumentRsModel;
	}

	@Override
	public NoteDocumentRsModel updateNoteDocument(@NotNull Long id, NoteDocumentRsModel noteDocumentRsModel)
			throws Exception {
		mappingLocalService.updateDocumentNoteMapping(id, noteDocumentRsModel.getSubject(), noteDocumentRsModel.getSubjectCategoryId(), noteDocumentRsModel.getContent());
		return noteDocumentRsModel;
	}
	
	@Reference
	private DocumentNoteMappingLocalService mappingLocalService;
	
}