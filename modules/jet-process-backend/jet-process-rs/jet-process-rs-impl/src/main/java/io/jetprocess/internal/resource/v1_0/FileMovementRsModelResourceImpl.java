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

import io.jetprocess.dto.v1_0.FileMovementRsModel;
import io.jetprocess.model.FileMovement;
import io.jetprocess.resource.v1_0.FileMovementRsModelResource;
import io.jetprocess.service.FileMovementLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/file-movement-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = FileMovementRsModelResource.class)
public class FileMovementRsModelResourceImpl extends BaseFileMovementRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<FileMovementRsModel>, UnsafeConsumer<FileMovementRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<FileMovementRsModel> getFileMovementList(@NotNull Long id) throws Exception {
		LOGGER.info("rest api");
		List<FileMovementRsModel> list = new ArrayList<>();
		List<FileMovement> fileMovements = movementLocalService.getListByFileId(id);
		fileMovements.stream().forEach(movement -> {
			list.add(getFileMovementRsModel(movement));
		});
		return Page.of(list);
	}

	@Override
	public FileMovementRsModel createFileMovement(FileMovementRsModel fileMovementRsModel) throws Exception {
		LOGGER.info("rest api");
		movementLocalService.saveFileMovement(fileMovementRsModel.getReceiverId(), fileMovementRsModel.getSenderId(),
				fileMovementRsModel.getFileId(), fileMovementRsModel.getPriority(), fileMovementRsModel.getDueDate(), fileMovementRsModel.getRemarks());
		return fileMovementRsModel;
	}
	
	private FileMovementRsModel getFileMovementRsModel(FileMovement fileMovement) {
		FileMovementRsModel movementRsModel = new FileMovementRsModel();
		movementRsModel.setId(fileMovement.getId());
		movementRsModel.setReceiverId(fileMovement.getReceiverId());
		movementRsModel.setSenderId(fileMovement.getSenderId());
		movementRsModel.setFileId(fileMovement.getFileId());
		movementRsModel.setPriority(fileMovement.getPriority());
		movementRsModel.setDueDate(fileMovement.getDueDate());
		movementRsModel.setRemarks(fileMovement.getRemarks());
		return movementRsModel;
	}

	private final Log LOGGER = LogFactoryUtil.getLog(FileMovementRsModel.class);

	@Reference
	private FileMovementLocalService movementLocalService;
}