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
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/file-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = FileRsModelResource.class
)
public class FileRsModelResourceImpl extends BaseFileRsModelResourceImpl {
private final Log LOGGER = LogFactoryUtil.getLog(FileRsModelResourceImpl.class);
	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<FileRsModel>, UnsafeConsumer<FileRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public FileRsModel createDocFile(FileRsModel fileRsModel) throws Exception {
		LOGGER.info(fileRsModel.toString());
		docFileLocalService.createDocFile(fileRsModel.getGroupId(), fileRsModel.getNature(), fileRsModel.getType(),
				fileRsModel.getHeadId(), fileRsModel.getFileCodeId(), fileRsModel.getSubject(), fileRsModel.getFileNo(),
				fileRsModel.getCategoryId(), fileRsModel.getRemarks(), fileRsModel.getReference(),
				fileRsModel.getYear(), fileRsModel.getUserPostId(), fileRsModel.getCurrentUser(),
				fileRsModel.getCurrentState(), fileRsModel.getDealingOrganizationId());
		LOGGER.info("after");
		return fileRsModel;
	}

	@Override
	public FileRsModel updateDocFile(@NotNull Long docFileId, FileRsModel fileRsModel) throws Exception {
		DocFile docFile = docFileLocalService.updateDocFile(fileRsModel.getDocFileId(), fileRsModel.getNature(),
				fileRsModel.getType(), fileRsModel.getHeadId(), fileRsModel.getFileCodeId(), fileRsModel.getSubject(),
				fileRsModel.getFileNo(), fileRsModel.getCategoryId(), fileRsModel.getRemarks(),
				fileRsModel.getReference(), fileRsModel.getYear(), fileRsModel.getUserPostId(),
				fileRsModel.getCurrentUser(), fileRsModel.getCurrentState(), fileRsModel.getDealingOrganizationId());
		return getFileRsModel(docFile);
	}

	@Override
	public Page<FileRsModel> getDocFileList() throws Exception {
		List<FileRsModel> fileRsModelList = new ArrayList<>();
		List<DocFile> docFileList = docFileLocalService.getDocFiles();
		docFileList.stream().forEach(docFile -> {
			fileRsModelList.add(getFileRsModel(docFile));
		});
		return Page.of(fileRsModelList);
	}

	@Override
	
	public void deleteDocFileById(@NotNull Long docFileId) throws Exception {
		docFileLocalService.deleteDocFileById(docFileId);
	}

	@Override
	public FileRsModel getDocFileById(@NotNull Long docFileId) throws Exception {
		DocFile docFile = docFileLocalService.getDocFileById(docFileId);
		return getFileRsModel(docFile);
	}

	private FileRsModel getFileRsModel(DocFile docFile) {
		FileRsModel createdDocFile = new FileRsModel();
		createdDocFile.setDocFileId(docFile.getDocFileId());
		createdDocFile.setGroupId(docFile.getGroupId());
		createdDocFile.setNature(docFile.getNature());
		createdDocFile.setType(docFile.getType());
		createdDocFile.setHeadId(docFile.getHeadId());
		createdDocFile.setFileCodeId(docFile.getFileCodeId());
		createdDocFile.setSubject(docFile.getSubject());
		createdDocFile.setFileNo(docFile.getFileNo());
		createdDocFile.setCategoryId(docFile.getCategoryId());
		createdDocFile.setRemarks(docFile.getRemarks());
		createdDocFile.setReference(docFile.getReference());
		createdDocFile.setYear(docFile.getYear());
		createdDocFile.setUserPostId(docFile.getUserPostId());
		createdDocFile.setCurrentUser(docFile.getCurrentUser());
		createdDocFile.setCurrentState(docFile.getCurrentState());
		createdDocFile.setDealingOrganizationId(docFile.getDealingOrganizationId());
		return createdDocFile;
	}

	@Reference
	private DocFileLocalService docFileLocalService;
}