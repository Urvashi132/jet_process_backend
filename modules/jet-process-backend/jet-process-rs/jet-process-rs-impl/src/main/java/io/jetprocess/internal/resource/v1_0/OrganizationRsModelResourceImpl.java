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

import io.jetprocess.dto.v1_0.OrganizationRsModel;
import io.jetprocess.model.Organization;
import io.jetprocess.resource.v1_0.OrganizationRsModelResource;
import io.jetprocess.service.OrganizationLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/organization-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = OrganizationRsModelResource.class
)
public class OrganizationRsModelResourceImpl
	extends BaseOrganizationRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<OrganizationRsModel>, UnsafeConsumer<OrganizationRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Page<OrganizationRsModel> getOrganizationList() throws Exception {
		List<OrganizationRsModel> organizationRsModelList = new ArrayList<>();
		List<Organization> organizationList = organizationLocalService.getOrgnization();
		System.out.println("------"+organizationList);
		organizationList.stream().forEach(oranization -> {
			organizationRsModelList.add(getOranizationModel(oranization));
		});
		return Page.of(organizationRsModelList);
	}

	private OrganizationRsModel getOranizationModel(Organization organization) {
		OrganizationRsModel organizationRsModel = new OrganizationRsModel();
		organizationRsModel.setId(organization.getId());
		organizationRsModel.setName(organization.getName());
		return organizationRsModel;
	}

	@Reference
	private OrganizationLocalService organizationLocalService;

}