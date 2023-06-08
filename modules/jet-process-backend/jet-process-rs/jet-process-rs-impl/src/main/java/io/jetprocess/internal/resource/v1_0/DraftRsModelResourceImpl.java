package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DraftRsModel;
import io.jetprocess.resource.v1_0.DraftRsModelResource;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/draft-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = DraftRsModelResource.class
)
public class DraftRsModelResourceImpl extends BaseDraftRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRsModel>, UnsafeConsumer<DraftRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
}