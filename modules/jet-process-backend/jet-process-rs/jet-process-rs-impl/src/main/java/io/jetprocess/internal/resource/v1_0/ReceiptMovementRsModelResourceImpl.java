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

import io.jetprocess.dto.v1_0.ReceiptMovementRsModel;
import io.jetprocess.model.ReceiptMovement;
import io.jetprocess.resource.v1_0.ReceiptMovementRsModelResource;
import io.jetprocess.service.ReceiptMovementLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/receipt-movement-rs-model.properties",
	scope = ServiceScope.PROTOTYPE,
	service = ReceiptMovementRsModelResource.class
)
public class ReceiptMovementRsModelResourceImpl
	extends BaseReceiptMovementRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<ReceiptMovementRsModel>, UnsafeConsumer<ReceiptMovementRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<ReceiptMovementRsModel> getReceiptMovementList(@NotNull Long receiptId) throws Exception {
		List<ReceiptMovementRsModel> list = new ArrayList<>();
		List<ReceiptMovement> receiptMovements = movementLocalService.getListByReceiptId(receiptId);
		receiptMovements.stream().forEach(movement -> {
			list.add(getReceiptMovementRsModel(movement));
		});
		return Page.of(list);
	}

	@Override
	public ReceiptMovementRsModel createReceiptMovement(ReceiptMovementRsModel receiptMovementRsModel)
			throws Exception {
		movementLocalService.saveReceiptMovement(receiptMovementRsModel.getReceiverId(), receiptMovementRsModel.getSenderId(),
				receiptMovementRsModel.getReceiptId(), receiptMovementRsModel.getPriority(), receiptMovementRsModel.getDueDate(),
				receiptMovementRsModel.getRemarks());
		return receiptMovementRsModel;
	}
	
	private ReceiptMovementRsModel getReceiptMovementRsModel(ReceiptMovement receiptMovement) {
		ReceiptMovementRsModel movementRsModel = new ReceiptMovementRsModel();
		movementRsModel.setId(receiptMovement.getId());
		movementRsModel.setReceiverId(receiptMovement.getReceiverId());
		movementRsModel.setSenderId(receiptMovement.getSenderId());
		movementRsModel.setReceiptId(receiptMovement.getReceiptId());
		movementRsModel.setPriority(receiptMovement.getPriority());
		movementRsModel.setDueDate(receiptMovement.getDueDate());
		movementRsModel.setRemarks(receiptMovement.getRemarks());
		movementRsModel.setCreateDate(receiptMovement.getCreateDate());
		return movementRsModel;
	}
	@Reference
	private ReceiptMovementLocalService movementLocalService;
}