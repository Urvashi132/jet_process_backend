package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DispatchRsModel;
import io.jetprocess.model.Dispatch;
import io.jetprocess.resource.v1_0.DispatchRsModelResource;
import io.jetprocess.service.DispatchLocalService;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/dispatch-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = DispatchRsModelResource.class)
public class DispatchRsModelResourceImpl extends BaseDispatchRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DispatchRsModel>, UnsafeConsumer<DispatchRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public DispatchRsModel createDispatch(DispatchRsModel dispatchRsModel) throws Exception {
		dispatchLocalService.addDispatch(dispatchRsModel.getDispatchedBy(), dispatchRsModel.getDeliveryMode(),
				dispatchRsModel.getAddress(), dispatchRsModel.getSubject(), dispatchRsModel.getDispatchedOn(),
				dispatchRsModel.getDispatchedType(), dispatchRsModel.getIssueNumber(),
				dispatchRsModel.getReceiptentId(), dispatchRsModel.getDraftId());
		return dispatchRsModel;
	}

	@Override
	public DispatchRsModel getDispatchById(@NotNull Long id) throws Exception {
		Dispatch dispatch = dispatchLocalService.getdispatchById(id);
		return getDispatchRsModel(dispatch);
	}

	@Override
	public void deleteDispatchyId(

			@NotNull Long id) throws Exception {
		dispatchLocalService.deleteDispatch(id);
	}

	private DispatchRsModel getDispatchRsModel(Dispatch dispatch) {

		DispatchRsModel dispatchRsModel = new DispatchRsModel();
		dispatchRsModel.setAddress(dispatch.getAddress());
		dispatchRsModel.setDeliveryMode(dispatch.getDeliveryMode());
		dispatchRsModel.setDispatchedBy(dispatch.getDispatchBy());
		dispatchRsModel.setDispatchedOn(dispatch.getDispathOn());
		dispatchRsModel.setDraftId(dispatch.getDraftId());
		dispatchRsModel.setReceiptentId(dispatch.getReceiptentId());
		dispatchRsModel.setDispatchedType(dispatch.getDispatchType());
		dispatchRsModel.setIssueNumber(dispatch.getIssueNo());
		dispatchRsModel.setSubject(dispatch.getSubject());

		return dispatchRsModel;

	}

	@Reference
	private DispatchLocalService dispatchLocalService;
}