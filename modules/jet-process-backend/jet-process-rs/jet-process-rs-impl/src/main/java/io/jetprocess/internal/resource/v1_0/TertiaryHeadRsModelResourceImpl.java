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

import io.jetprocess.dto.v1_0.TertiaryHeadRsModel;
import io.jetprocess.model.TertiaryHead;
import io.jetprocess.resource.v1_0.TertiaryHeadRsModelResource;
import io.jetprocess.service.TertiaryHeadLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/tertiary-head-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = TertiaryHeadRsModelResource.class)
public class TertiaryHeadRsModelResourceImpl extends BaseTertiaryHeadRsModelResourceImpl {

	@Override
	public Page<TertiaryHeadRsModel> getTertiaryHeadBySecondaryHeadId(@NotNull Long secondaryHeadId) throws Exception {
		List<TertiaryHeadRsModel> tertiaryHeadRsModelList = new ArrayList<>();
		List<TertiaryHead> tertiaryHeadList = tertiaryHeadLocalService
				.getTeritaryHeadBySecondaryHeadId(secondaryHeadId);
		tertiaryHeadList.stream().forEach(tertiary -> {
			Object object = ObjectMapperUtil.objectMapper(tertiary, TertiaryHeadRsModel.class);
			tertiaryHeadRsModelList.add((TertiaryHeadRsModel)object);
		});
		return Page.of(tertiaryHeadRsModelList);
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<TertiaryHeadRsModel>, UnsafeConsumer<TertiaryHeadRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}

	@Reference
	private TertiaryHeadLocalService tertiaryHeadLocalService;

}