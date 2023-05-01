package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.PrimaryHeadRsModel;
import io.jetprocess.model.PrimaryHead;
import io.jetprocess.resource.v1_0.PrimaryHeadRsModelResource;
import io.jetprocess.service.PrimaryHeadLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/primary-head-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = PrimaryHeadRsModelResource.class
)
public class PrimaryHeadRsModelResourceImpl
	extends BasePrimaryHeadRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<PrimaryHeadRsModel>, UnsafeConsumer<PrimaryHeadRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Page<PrimaryHeadRsModel> getPrimaryHeadByBasicHeadId(Long basicHeadId) throws Exception {

		List<PrimaryHeadRsModel> primaryHeadRsModelList = new ArrayList<>();
		List<PrimaryHead> primaryHeadList = primaryHeadLocalService.getPrimaryHeadByBasicHead(basicHeadId);
		primaryHeadList.stream().forEach(primaryHead -> {
			primaryHeadRsModelList.add(getPrimaryHeadModel(primaryHead));
		});
		return Page.of(primaryHeadRsModelList);

	}

	private PrimaryHeadRsModel getPrimaryHeadModel(PrimaryHead primaryHead) {
		PrimaryHeadRsModel createdPrimaryHead = new PrimaryHeadRsModel();
		createdPrimaryHead.setId(primaryHead.getPrimaryHeadId());
		createdPrimaryHead.setName(primaryHead.getPrimaryHeadValue());
		;
		return createdPrimaryHead;
	}

	@Reference
	private PrimaryHeadLocalService primaryHeadLocalService;
}