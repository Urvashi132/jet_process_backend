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

import io.jetprocess.dto.v1_0.DraftRsModel;
import io.jetprocess.model.Draft;
import io.jetprocess.resource.v1_0.DraftRsModelResource;
import io.jetprocess.service.DraftLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/draft-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = DraftRsModelResource.class)
public class DraftRsModelResourceImpl extends BaseDraftRsModelResourceImpl {

	private final Log LOGGER = LogFactoryUtil.getLog(DraftRsModelResourceImpl.class);
	
	@Reference
	private DraftLocalService draftLocalService;

	@Override
	public void deleteDraftById(@NotNull Long id) throws Exception {
		draftLocalService.deleteDraft(id);
	}

	@Override
	public DraftRsModel getDraftById(@NotNull Long id) throws Exception {
		Draft draft = draftLocalService.getDraft(id);
		Object draftObj = ObjectMapperUtil.objectMapper(draft, DraftRsModel.class);
		return (DraftRsModel) draftObj;
	}

	@Override
	public DraftRsModel createDraft(DraftRsModel draftRsModel) throws Exception {
		Draft draft = draftLocalService.createDraft(draftRsModel.getNature(), draftRsModel.getReceiptId(),
				draftRsModel.getReplyTypeId(), draftRsModel.getCategoryId(), draftRsModel.getSubject(),
				draftRsModel.getContent());
		Object draftObj = ObjectMapperUtil.objectMapper(draft, DraftRsModel.class);
		return (DraftRsModel) draftObj;
	}

	@Override
	public DraftRsModel updateDraft(@NotNull Long id, DraftRsModel draftRsModel) throws Exception {
		Draft draft = draftLocalService.updateDraft(draftRsModel.getId(), draftRsModel.getNature(),
				draftRsModel.getReceiptId(), draftRsModel.getReplyTypeId(), draftRsModel.getCategoryId(),
				draftRsModel.getSubject(), draftRsModel.getContent());
		Object draftObj = ObjectMapperUtil.objectMapper(draft, DraftRsModel.class);
		return (DraftRsModel) draftObj;
	}

	@Override
	public Page<DraftRsModel> getDraftList() throws Exception {
		List<DraftRsModel> draftRsModels = new ArrayList<>();
		List<Draft> drafts = draftLocalService.getDrafts();
		drafts.stream().forEach(draft -> {
			Object draftObj = ObjectMapperUtil.objectMapper(draft, DraftRsModel.class);
			draftRsModels.add((DraftRsModel) draftObj);
		});
		return Page.of(draftRsModels);
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRsModel>, UnsafeConsumer<DraftRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}
}