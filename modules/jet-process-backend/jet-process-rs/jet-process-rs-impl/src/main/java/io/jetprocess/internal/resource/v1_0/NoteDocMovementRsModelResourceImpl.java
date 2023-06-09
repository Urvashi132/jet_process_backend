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
	}

	@Override
	public Page<NoteDocMovementRsModel> getNoteDocumentMovementList(@NotNull Long noteDocumentId) throws Exception {
		List<NoteDocMovementRsModel> movementRsModelList = new ArrayList<>();
		List<NoteDocumentMovement> movementList = movementLocalService.getListByNoteDocumentId(noteDocumentId);
		movementList.stream().forEach(movement -> {
			Object draftObj = ObjectMapperUtil.objectMapper(movement, NoteDocMovementRsModel.class);
			movementRsModelList.add((NoteDocMovementRsModel)draftObj);
		});
		return Page.of(movementRsModelList);
	}

	@Override
	public NoteDocMovementRsModel createNotedocMovement(NoteDocMovementRsModel noteDocMovementRsModel)
			throws Exception {
		LOGGER.info("create method rest api called");
		NoteDocumentMovement movement = movementLocalService.saveNoteDocumentMovement(noteDocMovementRsModel.getReceiverId(),
				noteDocMovementRsModel.getSenderId(), noteDocMovementRsModel.getNoteDocumentId(),
				noteDocMovementRsModel.getRemarks());
		Object draftObj = ObjectMapperUtil.objectMapper(movement, NoteDocMovementRsModel.class);
		return (NoteDocMovementRsModel)draftObj;
	}

	@Reference
	private NoteDocumentMovementLocalService movementLocalService;
	
	private final Log LOGGER = LogFactoryUtil.getLog(NoteDocMovementRsModelResourceImpl.class);

}