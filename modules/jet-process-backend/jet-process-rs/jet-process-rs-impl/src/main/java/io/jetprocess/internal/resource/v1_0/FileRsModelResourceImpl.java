/*
 * package io.jetprocess.internal.resource.v1_0;
 * 
 * import io.jetprocess.dto.v1_0.FileRsModel; import
 * io.jetprocess.model.DocFile; import
 * io.jetprocess.resource.v1_0.FileRsModelResource; import
 * io.jetprocess.service.DocFileLocalService;
 * 
 * import com.liferay.petra.function.UnsafeBiConsumer; import
 * com.liferay.petra.function.UnsafeConsumer; import
 * com.liferay.portal.kernel.dao.orm.QueryUtil; import
 * com.liferay.portal.vulcan.pagination.Page;
 * 
 * import java.sql.Array; import java.util.Collection; import
 * java.util.Collections; import java.util.List;
 * 
 * import javax.validation.constraints.NotNull;
 * 
 * import org.osgi.service.component.annotations.Component; import
 * org.osgi.service.component.annotations.Reference; import
 * org.osgi.service.component.annotations.ServiceScope;
 * 
 *//**
	 * @author Admin
	 *//*
		 * @Component(properties =
		 * "OSGI-INF/liferay/rest/v1_0/file-rs-model.properties", scope =
		 * ServiceScope.PROTOTYPE, service = FileRsModelResource.class) public class
		 * FileRsModelResourceImpl extends BaseFileRsModelResourceImpl {
		 * 
		 * @Override public void setContextBatchUnsafeConsumer(
		 * UnsafeBiConsumer<Collection<FileRsModel>, UnsafeConsumer<FileRsModel,
		 * Exception>, Exception> contextBatchUnsafeConsumer) { // TODO Auto-generated
		 * method stub }
		 * 
		 * @Override public FileRsModel createDocFile(FileRsModel fileRsModel) throws
		 * Exception { docFileLocalService.createDocFile(fileRsModel.getGroupId(),
		 * fileRsModel.getNature(), fileRsModel.getType(), fileRsModel.getHeadId(),
		 * fileRsModel.getFileCodeId(), fileRsModel.getSubject(),
		 * fileRsModel.getFileNo(), fileRsModel.getCategoryId(),
		 * fileRsModel.getRemarks(), fileRsModel.getReference(), fileRsModel.getYear(),
		 * fileRsModel.getUserId(), fileRsModel.getCurrentUser(),
		 * fileRsModel.getCurrentState(), fileRsModel.getDealingOrganizationId());
		 * return super.createDocFile(fileRsModel); }
		 * 
		 * @Override public FileRsModel updateDocFile(@NotNull Long docFileId,
		 * FileRsModel fileRsModel) throws Exception {
		 * docFileLocalService.updateDocFile(fileRsModel.getDocFileId(),
		 * fileRsModel.getNature(), fileRsModel.getType(), fileRsModel.getHeadId(),
		 * fileRsModel.getFileCodeId(), fileRsModel.getSubject(),
		 * fileRsModel.getFileNo(), fileRsModel.getCategoryId(),
		 * fileRsModel.getRemarks(), fileRsModel.getReference(), fileRsModel.getYear(),
		 * fileRsModel.getUserId(), fileRsModel.getCurrentUser(),
		 * fileRsModel.getCurrentState(), fileRsModel.getDealingOrganizationId());
		 * return super.updateDocFile(docFileId, fileRsModel); }
		 * 
		 * @Override public Page<FileRsModel> getDocFileList() throws Exception {
		 * System.out.println("---"); List<?> docFileList =
		 * docFileLocalService.getDocFileList(); System.out.println("---" +
		 * docFileList); List<FileRsModel> list = (List<FileRsModel>) docFileList;
		 * 
		 * return (Page<FileRsModel>) Page.of(docFileList); }
		 * 
		 * @Override public void deleteDocFileById(@NotNull Long docFileId) throws
		 * Exception { docFileLocalService.deleteDocFileById(docFileId); }
		 * 
		 * @Override public Page<FileRsModel> getDocFileById(@NotNull Long docFileId)
		 * throws Exception { docFileLocalService.getDocFileById(docFileId); return
		 * super.getDocFileById(docFileId); }
		 * 
		 * @Reference private DocFileLocalService docFileLocalService;
		 * 
		 * }
		 */