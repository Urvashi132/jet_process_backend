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

import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.model.DocFile;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.service.DocFileLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/file-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = FileRsModelResource.class)
public class FileRsModelResourceImpl extends BaseFileRsModelResourceImpl {
	private final Log LOGGER = LogFactoryUtil.getLog(FileRsModelResourceImpl.class);

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<FileRsModel>, UnsafeConsumer<FileRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public FileRsModel createDocFile(FileRsModel fileRsModel) throws Exception {
		LOGGER.info(fileRsModel);
		/*
		 * Object object = ObjectMapperUtil.objectMapper(docFile, fileRsModel,
		 * FileRsModel.class); docFileLocalService.addDocFile(docFile);
		 */
		DocFile createDocFile = docFileLocalService.createDocFile(fileRsModel.getGroupId(), fileRsModel.getNature(), fileRsModel.getType(),
				fileRsModel.getHeadId(), fileRsModel.getFileCodeId(), fileRsModel.getSubject(), fileRsModel.getFileNo(),
				fileRsModel.getCategoryId(), fileRsModel.getRemarks(), fileRsModel.getReference(),
				fileRsModel.getYear(), fileRsModel.getUserPostId());
		LOGGER.info(createDocFile);
		return fileRsModel;
	}

	@Override
	public FileRsModel updateDocFile(@NotNull Long docFileId, FileRsModel fileRsModel) throws Exception {
		DocFile docFile = docFileLocalService.updateDocFile(fileRsModel.getId(), fileRsModel.getSubject(),
				fileRsModel.getCategoryId(), fileRsModel.getRemarks(), fileRsModel.getReference());
		Object object = ObjectMapperUtil.objectMapper(docFile, fileRsModel, FileRsModel.class);
//		docFileLocalService.editDocFile(docFileId, (DocFile)object);
		return (FileRsModel) object;
	}

	@Override
	public Page<FileRsModel> getDocFileList() throws Exception {
		List<FileRsModel> fileRsModelList = new ArrayList<>();
		List<DocFile> docFileList = docFileLocalService.getDocFiles();
		docFileList.stream().forEach(docFile -> {
			FileRsModel fileRsModel = new FileRsModel();
			Object object = ObjectMapperUtil.objectMapper(docFile, fileRsModel, FileRsModel.class);
			fileRsModelList.add((FileRsModel) object);
		});
		return Page.of(fileRsModelList);
	}

	@Override
	public void deleteDocFileById(@NotNull Long docFileId) throws Exception {
		docFileLocalService.deleteDocFile(docFileId);
	}

	@Override
	public FileRsModel getDocFileById(@NotNull Long docFileId) throws Exception {
		DocFile docFile = docFileLocalService.getDocFile(docFileId);
		FileRsModel fileRsModel = new FileRsModel();
		Object object = ObjectMapperUtil.objectMapper(docFile, fileRsModel, FileRsModel.class);
		return (FileRsModel) object;
	}

	@Reference
	private DocFileLocalService docFileLocalService;
}