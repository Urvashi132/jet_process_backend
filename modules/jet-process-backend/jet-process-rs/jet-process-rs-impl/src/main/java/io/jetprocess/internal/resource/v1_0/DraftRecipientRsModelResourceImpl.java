package io.jetprocess.internal.resource.v1_0;

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

import io.jetprocess.dto.v1_0.DraftRecipientRsModel;
import io.jetprocess.model.DraftRecipient;
import io.jetprocess.resource.v1_0.DraftRecipientRsModelResource;
import io.jetprocess.service.DraftRecipientLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/draft-recipient-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = DraftRecipientRsModelResource.class)
public class DraftRecipientRsModelResourceImpl extends BaseDraftRecipientRsModelResourceImpl {

	@Reference
	private DraftRecipientLocalService draftRecipientLocalService;

	@Override
	public void deleteDraftRecipientById(@NotNull Long id) throws Exception {
		draftRecipientLocalService.deleteDraftRecipient(id);
	}

	@Override
	public DraftRecipientRsModel getDraftRecipientById(@NotNull Long id) throws Exception {
		DraftRecipient draftRecipient = draftRecipientLocalService.getDraftRecipient(id);
		Object recipient = ObjectMapperUtil.objectMapper(draftRecipient, DraftRecipientRsModel.class);
		return (DraftRecipientRsModel) recipient;
	}

	@Override
	public DraftRecipientRsModel createDraftRecipient(DraftRecipientRsModel recipientRsModel) throws Exception {
		System.out.println("crartjs");
		DraftRecipient draftRecipient = draftRecipientLocalService.createRecipient(recipientRsModel.getDraftId(),
				recipientRsModel.getOrganizationId(), recipientRsModel.getName(), recipientRsModel.getDesignation(),
				recipientRsModel.getEmail(), recipientRsModel.getMobile(), recipientRsModel.getAddress(),
				recipientRsModel.getStateId(), recipientRsModel.getCity(), recipientRsModel.getPincode());
		Object recipient = ObjectMapperUtil.objectMapper(draftRecipient, DraftRecipientRsModel.class);
		return (DraftRecipientRsModel) recipient;
	}

	@Override
	public DraftRecipientRsModel updateDraftRecipient(@NotNull Long id, DraftRecipientRsModel recipientRsModel)
			throws Exception {
		DraftRecipient draftRecipient = draftRecipientLocalService.updateRecipient(id,
				recipientRsModel.getOrganizationId(), recipientRsModel.getName(), recipientRsModel.getDesignation(),
				recipientRsModel.getEmail(), recipientRsModel.getMobile(), recipientRsModel.getAddress(),
				recipientRsModel.getStateId(), recipientRsModel.getCity(), recipientRsModel.getPincode());
		Object recipient = ObjectMapperUtil.objectMapper(draftRecipient, DraftRecipientRsModel.class);
		return (DraftRecipientRsModel) recipient;
	}

	@Override
	public Page<DraftRecipientRsModel> getDraftRecipientList(@NotNull Long draftId) throws Exception {
		List<DraftRecipientRsModel> recipientRsModels = new ArrayList<>();
		List<DraftRecipient> draftRecipients = draftRecipientLocalService.getRecipientList(draftId);
		draftRecipients.stream().forEach(draftRecipient -> {
			Object recipient = ObjectMapperUtil.objectMapper(draftRecipient, DraftRecipientRsModel.class);
			recipientRsModels.add((DraftRecipientRsModel) recipient);
		});
		return Page.of(recipientRsModels);
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRecipientRsModel>, UnsafeConsumer<DraftRecipientRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}
}