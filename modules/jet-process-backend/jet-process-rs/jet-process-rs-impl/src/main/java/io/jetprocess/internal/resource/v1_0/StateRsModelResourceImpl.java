package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.service.RegionService;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.StateRsModel;
import io.jetprocess.resource.v1_0.StateRsModelResource;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/state-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = StateRsModelResource.class
)
public class StateRsModelResourceImpl extends BaseStateRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<StateRsModel>, UnsafeConsumer<StateRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Page<StateRsModel> getStateByCountryId(@NotNull Long countryId) throws Exception {
		List<StateRsModel> stateRsModelList = new ArrayList<>();
		List<Region> stateList = regionService.getRegions(countryId);
		
		stateList.stream().forEach(state -> {
			stateRsModelList.add(getStateModel(state));
		});
		return Page.of(stateRsModelList);
	}

	private StateRsModel getStateModel(Region region) {
		StateRsModel stateRsModel = new StateRsModel();
		stateRsModel.setId(region.getRegionId());
		stateRsModel.setName(region.getName());
		
		return stateRsModel;
	}

	
	@Reference
	private RegionService regionService;
}