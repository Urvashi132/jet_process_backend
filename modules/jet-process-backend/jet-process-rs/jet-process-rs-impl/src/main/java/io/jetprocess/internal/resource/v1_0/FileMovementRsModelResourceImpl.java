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
	public Page<FileMovementRsModel> getFileMovementList(@NotNull Long fileId) throws Exception {
		LOGGER.info("rest api");
		List<FileMovementRsModel> list = new ArrayList<>();
		List<FileMovement> fileMovements = movementLocalService.getListByFileId(fileId);
		fileMovements.stream().forEach(movement -> {
			Object object = ObjectMapperUtil.objectMapper(movement, FileMovementRsModel.class);
			list.add((FileMovementRsModel)object);
		});
		return Page.of(list);
	}

	@Override
	public FileMovementRsModel createFileMovement(FileMovementRsModel fileMovementRsModel) throws Exception {
		LOGGER.info("rest api");
		FileMovement fileMovement = movementLocalService.saveFileMovement(fileMovementRsModel.getReceiverId(),
				fileMovementRsModel.getSenderId(), fileMovementRsModel.getFileId(), fileMovementRsModel.getPriority(),
				fileMovementRsModel.getDueDate(), fileMovementRsModel.getRemarks());
		Object object = ObjectMapperUtil.objectMapper(fileMovement, FileMovementRsModel.class);
		return (FileMovementRsModel)object;
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<FileMovementRsModel>, UnsafeConsumer<FileMovementRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}

	private final Log LOGGER = LogFactoryUtil.getLog(FileMovementRsModel.class);

	@Reference
	private FileMovementLocalService movementLocalService;
}