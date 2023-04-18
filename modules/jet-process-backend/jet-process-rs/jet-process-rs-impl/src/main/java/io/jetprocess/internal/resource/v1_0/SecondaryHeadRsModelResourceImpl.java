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

import io.jetprocess.dto.v1_0.SecondaryHeadRsModel;
import io.jetprocess.model.SecondaryHead;
import io.jetprocess.resource.v1_0.SecondaryHeadRsModelResource;
import io.jetprocess.service.SecondaryHeadLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/secondary-head-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = SecondaryHeadRsModelResource.class)
public class SecondaryHeadRsModelResourceImpl extends BaseSecondaryHeadRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<SecondaryHeadRsModel>, UnsafeConsumer<SecondaryHeadRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<SecondaryHeadRsModel> getSeondaryHeadByPrimaryHeadId(@NotNull Long primaryHeadId) throws Exception {

		List<SecondaryHeadRsModel> secondaryHeadRsModelList = new ArrayList<>();
		List<SecondaryHead> secondaryHeadList = secondaryHeadLocalService
				.getSecondaryHeadByPrimaryHeadId(primaryHeadId);
		secondaryHeadList.stream().forEach(secondary -> {
			secondaryHeadRsModelList.add(GetSecondaryHeadModel(secondary));
		});
		return Page.of(secondaryHeadRsModelList);
	}

	private SecondaryHeadRsModel GetSecondaryHeadModel(SecondaryHead secondaryHead) {
		SecondaryHeadRsModel createdSecondaryHead = new SecondaryHeadRsModel();
		createdSecondaryHead.setSecondaryHeadId(secondaryHead.getSecondaryHeadId());
		createdSecondaryHead.setSecondaryHeadValue(secondaryHead.getSecondaryHeadValue());
		return createdSecondaryHead;
	}

	@Reference
	private SecondaryHeadLocalService secondaryHeadLocalService;
}