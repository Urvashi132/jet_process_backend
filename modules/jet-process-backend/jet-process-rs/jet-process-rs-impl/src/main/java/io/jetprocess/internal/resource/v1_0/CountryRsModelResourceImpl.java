package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.service.CountryLocalService;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.CountryRsModel;
import io.jetprocess.resource.v1_0.CountryRsModelResource;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/country-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = CountryRsModelResource.class)
public class CountryRsModelResourceImpl extends BaseCountryRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<CountryRsModel>, UnsafeConsumer<CountryRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Page<CountryRsModel> getCountryList() throws Exception {
		List<CountryRsModel> countryRsList = new ArrayList<>();
		List<Country> countryList = countryLocalService.getCountries(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		countryList.stream().forEach(country -> {
			countryRsList.add(getCountryRsModel(country));
		});
		return Page.of(countryRsList);
	}

	private CountryRsModel getCountryRsModel(Country country) {
		CountryRsModel countryRsModel = new CountryRsModel();
		countryRsModel.setId(country.getCountryId());
		countryRsModel.setName(country.getName());
		return countryRsModel;
	}

	@Reference
	private CountryLocalService countryLocalService;
}