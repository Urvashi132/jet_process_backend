package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DraftRecipientRsModel;
import io.jetprocess.resource.v1_0.DraftRecipientRsModelResource;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
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

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRecipientRsModel>, UnsafeConsumer<DraftRecipientRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
}