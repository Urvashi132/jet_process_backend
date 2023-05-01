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

import io.jetprocess.dto.v1_0.BasicHeadRsModel;
import io.jetprocess.model.BasicHead;
import io.jetprocess.resource.v1_0.BasicHeadRsModelResource;
import io.jetprocess.service.BasicHeadLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/basic-head-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = BasicHeadRsModelResource.class
)
public class BasicHeadRsModelResourceImpl
	extends BaseBasicHeadRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<BasicHeadRsModel>, UnsafeConsumer<BasicHeadRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Page<BasicHeadRsModel> getBasicHeadList() throws Exception {
		List<BasicHeadRsModel> basicHeadRsModelList = new ArrayList<>();
		List<BasicHead> basicHeadList = basicHeadLocalService.getBasicHeads(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		basicHeadList.stream().forEach(basicHead -> {
			basicHeadRsModelList.add(GetBasicHeadModel(basicHead));
		});
		return Page.of(basicHeadRsModelList);
	}

	private BasicHeadRsModel GetBasicHeadModel(BasicHead basicHead) {
		BasicHeadRsModel createdBasicHead = new BasicHeadRsModel();
		createdBasicHead.setId(basicHead.getBasicHeadId());
		createdBasicHead.setName(basicHead.getBasicHeadValue());
		
		return createdBasicHead;
	}

	@Reference
	private BasicHeadLocalService basicHeadLocalService;

}