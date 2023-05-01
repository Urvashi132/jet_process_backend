package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.DeliveryModeRsModel;
import io.jetprocess.model.DeliveryMode;
import io.jetprocess.resource.v1_0.DeliveryModeRsModelResource;
import io.jetprocess.service.DeliveryModeLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/delivery-mode-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = DeliveryModeRsModelResource.class
)
public class DeliveryModeRsModelResourceImpl
	extends BaseDeliveryModeRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DeliveryModeRsModel>, UnsafeConsumer<DeliveryModeRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Page<DeliveryModeRsModel> getDeliveryModeist() throws Exception {
		List<DeliveryModeRsModel> deliveryModeRsList = new ArrayList<>();
		List<DeliveryMode> deliveryModeList = deliveryModeLocalService
				.getDeliveryModes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		deliveryModeList.stream().forEach(deliveryMode -> {
			deliveryModeRsList.add(getDeliveryModeRsModel(deliveryMode));
		});
		return Page.of(deliveryModeRsList);
	}

	private DeliveryModeRsModel getDeliveryModeRsModel(DeliveryMode deliveryMode) {
		DeliveryModeRsModel deliveryModeRsModel = new DeliveryModeRsModel();
		deliveryModeRsModel.setId(deliveryMode.getId());
		deliveryModeRsModel.setName(deliveryMode.getName());
		return deliveryModeRsModel;
	}

	@Reference
	private DeliveryModeLocalService deliveryModeLocalService;

}