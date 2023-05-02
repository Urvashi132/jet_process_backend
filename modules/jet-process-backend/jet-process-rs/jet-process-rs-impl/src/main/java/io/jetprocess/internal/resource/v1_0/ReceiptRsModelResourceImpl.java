package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.ReceiptRsModel;
import io.jetprocess.model.Receipt;
import io.jetprocess.resource.v1_0.ReceiptRsModelResource;
import io.jetprocess.service.ReceiptLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/receipt-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = ReceiptRsModelResource.class
)
public class ReceiptRsModelResourceImpl extends BaseReceiptRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<ReceiptRsModel>, UnsafeConsumer<ReceiptRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ReceiptRsModel createReceipt(ReceiptRsModel receiptRsModel) throws Exception {
		receiptLocalService.createReceipt(receiptRsModel.getGroupId(), receiptRsModel.getTypeId(), receiptRsModel.getDeliveryModeId(),
				receiptRsModel.getReceivedOn(), receiptRsModel.getLetterDate(), receiptRsModel.getReferenceNo(), receiptRsModel.getModeNo(),
				receiptRsModel.getCategoryId(),receiptRsModel.getSubject(), receiptRsModel.getRemarks(), receiptRsModel.getName(),
				receiptRsModel.getDesignation(), receiptRsModel.getMobile(), receiptRsModel.getEmail(),
				receiptRsModel.getAddress(), receiptRsModel.getStateId(),receiptRsModel.getPincode(),
				receiptRsModel.getOrganization(),receiptRsModel.getCity() , receiptRsModel.getUserPostId() , receiptRsModel.getViewPdfUrl() , 
				receiptRsModel.getDocfileId() , receiptRsModel.getNature() , receiptRsModel.getCurrentlyWith() ,receiptRsModel.getCurrentState() , receiptRsModel.getAttachStatus(),receiptRsModel.getReceiptNo());
		return receiptRsModel;
	}
   
	@Override
	public ReceiptRsModel updateReceipt(@NotNull Long receiptId, ReceiptRsModel receiptRsModel) throws Exception {
		Receipt receipt = receiptLocalService.updateReceipt(receiptId ,receiptRsModel.getGroupId(), receiptRsModel.getTypeId(), receiptRsModel.getDeliveryModeId(),
				receiptRsModel.getReceivedOn(), receiptRsModel.getLetterDate(), receiptRsModel.getReferenceNo(), receiptRsModel.getModeNo(),
				receiptRsModel.getCategoryId(),receiptRsModel.getSubject(), receiptRsModel.getRemarks(), receiptRsModel.getName(),
				receiptRsModel.getDesignation(), receiptRsModel.getMobile(), receiptRsModel.getEmail(),
				receiptRsModel.getAddress(), receiptRsModel.getStateId(),receiptRsModel.getPincode(),receiptRsModel.getOrganization(),receiptRsModel.getCity() , receiptRsModel.getUserPostId() , receiptRsModel.getViewPdfUrl() , 
				receiptRsModel.getDocfileId() , receiptRsModel.getNature() , receiptRsModel.getCurrentlyWith() ,receiptRsModel.getCurrentState() , receiptRsModel.getAttachStatus(),receiptRsModel.getReceiptNo());
		return getReceiptRsModel(receipt);
	}

	@Override
	public Page<ReceiptRsModel> getReceiptList() throws Exception {
		List<ReceiptRsModel> ReceiptRsModelList = new ArrayList<>();
		List<Receipt> docFileList = receiptLocalService.getReceipts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		docFileList.stream().forEach(docFile -> {
			ReceiptRsModelList.add(getReceiptRsModel(docFile));
		});
		return Page.of(ReceiptRsModelList);
	}

	@Override
	
	public void deleteReceiptById(@NotNull Long receiptId) throws Exception {
		receiptLocalService.deleteReceipt(receiptId);
	}

	@Override
	public ReceiptRsModel getReceiptById(@NotNull Long receiptId) throws Exception {
		Receipt receipt = receiptLocalService.getReceipt(receiptId);
		return getReceiptRsModel(receipt);
	}

	private ReceiptRsModel getReceiptRsModel(Receipt receipt) {
		ReceiptRsModel createdReceipt = new ReceiptRsModel();
		createdReceipt.setReceiptId(receipt.getReceiptId());
		createdReceipt.setGroupId(receipt.getGroupId());
		createdReceipt.setTypeId(receipt.getTypeId());
		createdReceipt.setDeliveryModeId(receipt.getDeliveryModeId());
		createdReceipt.setReceiptNo(receipt.getReceiptNo());
		createdReceipt.setLetterDate(receipt.getLetterDate());
		createdReceipt.setLetterDate(receipt.getReferenceNo());		
		createdReceipt.setModeNo(receipt.getModeNo());
		createdReceipt.setCategoryId(receipt.getCategoryId());
		createdReceipt.setSubject(receipt.getSubject());
		createdReceipt.setRemarks(receipt.getRemarks());
		createdReceipt.setName(receipt.getName());
		createdReceipt.setDesignation(receipt.getDesignation());
		createdReceipt.setMobile(receipt.getMobile());
		createdReceipt.setEmail(receipt.getEmail());
		createdReceipt.setAddress(receipt.getAddress());
		createdReceipt.setStateId(receipt.getStateId());
		createdReceipt.setPincode(receipt.getPinCode());
		createdReceipt.setReceiptNo(receipt.getReceiptNo());
		createdReceipt.setOrganization(receipt.getOrganizationId());
		createdReceipt.setCity(receipt.getCity());
		createdReceipt.setUserPostId(receipt.getUserPostId());
		createdReceipt.setViewPdfUrl(receipt.getViewPdfUrl());
		createdReceipt.setDocfileId(receipt.getDocFileId());
		createdReceipt.setNature(receipt.getNature());
		createdReceipt.setCurrentlyWith(receipt.getCurrentlyWith());
		createdReceipt.setCurrentState(receipt.getCurrentState());
		
		return createdReceipt;
	}

	@Reference
	private ReceiptLocalService receiptLocalService;
	
}