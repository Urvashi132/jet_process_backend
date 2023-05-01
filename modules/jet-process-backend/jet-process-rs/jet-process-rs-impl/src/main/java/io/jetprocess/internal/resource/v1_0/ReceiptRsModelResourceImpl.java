package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.ReceiptRsModel;
import io.jetprocess.resource.v1_0.ReceiptRsModelResource;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

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
}