package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.NoteDocMovementRsModel;
import io.jetprocess.model.NoteDocumentMovement;
import io.jetprocess.resource.v1_0.NoteDocMovementRsModelResource;
import io.jetprocess.service.NoteDocumentMovementLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/note-doc-movement-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = NoteDocMovementRsModelResource.class)
public class NoteDocMovementRsModelResourceImpl extends BaseNoteDocMovementRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<NoteDocMovementRsModel>, UnsafeConsumer<NoteDocMovementRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<NoteDocMovementRsModel> getNoteDocumentMovementList(@NotNull Long noteDocumentId) throws Exception {
		List<NoteDocMovementRsModel> movementRsModelList = new ArrayList<>();
		List<NoteDocumentMovement> movementList = movementLocalService.getListByNoteDocumentId(noteDocumentId);
		movementList.stream().forEach(movement -> {
			movementRsModelList.add(getNoteDocMovementRsModel(movement));
		});
		return Page.of(movementRsModelList);
	}

	@Override
	public NoteDocMovementRsModel createNotedocMovement(NoteDocMovementRsModel noteDocMovementRsModel)
			throws Exception {
		LOGGER.info("create method rest api called");
		movementLocalService.saveNoteDocumentMovement(noteDocMovementRsModel.getReceiverId(),
				noteDocMovementRsModel.getSenderId(), noteDocMovementRsModel.getNoteDocumentId(),
				noteDocMovementRsModel.getRemarks());
		return noteDocMovementRsModel;
	}

	private NoteDocMovementRsModel getNoteDocMovementRsModel(NoteDocumentMovement noteDocumentMovement) {
		NoteDocMovementRsModel movementRsModel = new NoteDocMovementRsModel();
		movementRsModel.setId(noteDocumentMovement.getId());
		movementRsModel.setReceiverId(noteDocumentMovement.getReceiverId());
		movementRsModel.setSenderId(noteDocumentMovement.getSenderId());
		movementRsModel.setNoteDocumentId(noteDocumentMovement.getNoteDocumentId());
		movementRsModel.setRemarks(noteDocumentMovement.getRemarks());
		movementRsModel.setCreateDate(noteDocumentMovement.getCreateDate());
		return movementRsModel;
	}

	@Reference
	private NoteDocumentMovementLocalService movementLocalService;
	
	private final Log LOGGER = LogFactoryUtil.getLog(NoteDocMovementRsModelResourceImpl.class);

}