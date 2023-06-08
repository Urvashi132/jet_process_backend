package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DraftRecipientRsModel;
import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.model.DocFile;
import io.jetprocess.model.DraftRecipient;
import io.jetprocess.resource.v1_0.DraftRecipientRsModelResource;
import io.jetprocess.service.DraftRecipientLocalService;

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

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/draft-recipient-rs-model.properties",
	scope = ServiceScope.PROTOTYPE,
	service = DraftRecipientRsModelResource.class
)
public class DraftRecipientRsModelResourceImpl
	extends BaseDraftRecipientRsModelResourceImpl {
	
	@Reference
	private DraftRecipientLocalService draftRecipientLocalService;

	@Override
	public void deleteDraftRecipientById(@NotNull Long id) throws Exception {
		// TODO Auto-generated method stub
		super.deleteDraftRecipientById(id);
	}

	@Override
	public DraftRecipientRsModel getDraftRecipientById(@NotNull Long id) throws Exception {
		// TODO Auto-generated method stub
		return super.getDraftRecipientById(id);
	}

	@Override
	public DraftRecipientRsModel createDraftRecipient(DraftRecipientRsModel draftRecipientRsModel) throws Exception {
		// TODO Auto-generated method stub
		return super.createDraftRecipient(draftRecipientRsModel);
	}

	@Override
	public DraftRecipientRsModel updateDraftRecipient(@NotNull Long id, DraftRecipientRsModel draftRecipientRsModel)
			throws Exception {
		// TODO Auto-generated method stub
		return super.updateDraftRecipient(id, draftRecipientRsModel);
	}

	@Override
	public Page<DraftRecipientRsModel> getDraftRecipientList(@NotNull Long draftId) throws Exception {
		List<DraftRecipientRsModel> recipientRsModels = new ArrayList<>();
		List<DocFile> docFileList = draftRecipientLocalService.getdr;
		docFileList.stream().forEach(docFile -> {
			DraftRecipientRsModel fileRsModel = new DraftRecipientRsModel();
			Object object = ObjectMapperUtil.objectMapper(docFile, fileRsModel, FileRsModel.class);
			recipientRsModels.add((FileRsModel) object);
		});
		return Page.of(recipientRsModels);
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRecipientRsModel>, UnsafeConsumer<DraftRecipientRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
}