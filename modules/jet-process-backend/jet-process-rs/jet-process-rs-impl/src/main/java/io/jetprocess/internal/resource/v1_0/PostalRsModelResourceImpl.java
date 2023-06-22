package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.PostalRsModel;
import io.jetprocess.resource.v1_0.PostalRsModelResource;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/postal-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = PostalRsModelResource.class
)
public class PostalRsModelResourceImpl extends BasePostalRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<PostalRsModel>, UnsafeConsumer<PostalRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
}