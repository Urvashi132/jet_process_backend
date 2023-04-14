package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DocFile;
import io.jetprocess.resource.v1_0.DocFileResource;
import io.jetprocess.service.DocFileLocalService;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/doc-file.properties",
	scope = ServiceScope.PROTOTYPE, service = DocFileResource.class
)
public class DocFileResourceImpl extends BaseDocFileResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DocFile>, UnsafeConsumer<DocFile, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Page<DocFile> getDocFileList() throws Exception {
		Collection<?> docFileList = docFileLocalService.getDocFileList();
		return (Page<DocFile>) (docFileList);
	}

	@Override
	public DocFile createDocFile(DocFile docFile) throws Exception {
		docFileLocalService.createDocFile(docFile.getGroupId(), docFile.getNature(), docFile.getType(),
				docFile.getHeadId(), docFile.getFileCodeId(), docFile.getSubject(), docFile.getFileNo(),
				docFile.getCategoryId(), docFile.getRemarks(), docFile.getReference(),
				docFile.getYear(), docFile.getUserId(), docFile.getCurrentUser(),
				docFile.getCurrentState(), docFile.getDealingOrganizationId());
		return super.createDocFile(docFile);
	}

	@Override
	public void deleteDocFileById(@NotNull Long docFileId) throws Exception {
		docFileLocalService.deleteDocFileById(docFileId);
		super.deleteDocFileById(docFileId);
	}

	@Override
	public Page<DocFile> getDocFileById(@NotNull Long docFileId) throws Exception {
		docFileLocalService.getDocFileById(docFileId);
		return super.getDocFileById(docFileId);
	}

	@Override
	public DocFile updateDocFile(@NotNull Long docFileId, DocFile docFile) throws Exception {
		docFileLocalService.updateDocFile(docFile.getDocFileId(), docFile.getNature(), docFile.getType(),
				docFile.getHeadId(), docFile.getFileCodeId(), docFile.getSubject(), docFile.getFileNo(),
				docFile.getCategoryId(), docFile.getRemarks(), docFile.getReference(),
				docFile.getYear(), docFile.getUserId(), docFile.getCurrentUser(),
				docFile.getCurrentState(), docFile.getDealingOrganizationId());
		return super.updateDocFile(docFileId, docFile);
	}
	
	@Reference
	private DocFileLocalService docFileLocalService;

}