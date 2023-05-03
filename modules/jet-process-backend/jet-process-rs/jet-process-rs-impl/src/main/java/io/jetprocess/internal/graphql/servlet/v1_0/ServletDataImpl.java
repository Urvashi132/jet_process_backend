package io.jetprocess.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import io.jetprocess.internal.graphql.mutation.v1_0.Mutation;
import io.jetprocess.internal.graphql.query.v1_0.Query;
import io.jetprocess.resource.v1_0.BasicHeadRsModelResource;
import io.jetprocess.resource.v1_0.CategoryRsModelResource;
import io.jetprocess.resource.v1_0.CountryRsModelResource;
import io.jetprocess.resource.v1_0.DeliveryModeRsModelResource;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.OrganizationRsModelResource;
import io.jetprocess.resource.v1_0.PrimaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.ReceiptRsModelResource;
import io.jetprocess.resource.v1_0.SecondaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.StateRsModelResource;
import io.jetprocess.resource.v1_0.TertiaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.TypeRsModelResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Admin
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setFileRsModelResourceComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects);
		Mutation.setReceiptRsModelResourceComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects);

		Query.setBasicHeadRsModelResourceComponentServiceObjects(
			_basicHeadRsModelResourceComponentServiceObjects);
		Query.setCategoryRsModelResourceComponentServiceObjects(
			_categoryRsModelResourceComponentServiceObjects);
		Query.setCountryRsModelResourceComponentServiceObjects(
			_countryRsModelResourceComponentServiceObjects);
		Query.setDeliveryModeRsModelResourceComponentServiceObjects(
			_deliveryModeRsModelResourceComponentServiceObjects);
		Query.setFileRsModelResourceComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects);
		Query.setOrganizationRsModelResourceComponentServiceObjects(
			_organizationRsModelResourceComponentServiceObjects);
		Query.setPrimaryHeadRsModelResourceComponentServiceObjects(
			_primaryHeadRsModelResourceComponentServiceObjects);
		Query.setReceiptRsModelResourceComponentServiceObjects(
			_receiptRsModelResourceComponentServiceObjects);
		Query.setSecondaryHeadRsModelResourceComponentServiceObjects(
			_secondaryHeadRsModelResourceComponentServiceObjects);
		Query.setStateRsModelResourceComponentServiceObjects(
			_stateRsModelResourceComponentServiceObjects);
		Query.setTertiaryHeadRsModelResourceComponentServiceObjects(
			_tertiaryHeadRsModelResourceComponentServiceObjects);
		Query.setTypeRsModelResourceComponentServiceObjects(
			_typeRsModelResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/jet-process-rs-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<FileRsModelResource>
		_fileRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ReceiptRsModelResource>
		_receiptRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<BasicHeadRsModelResource>
		_basicHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<CategoryRsModelResource>
		_categoryRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<CountryRsModelResource>
		_countryRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<DeliveryModeRsModelResource>
		_deliveryModeRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<OrganizationRsModelResource>
		_organizationRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<PrimaryHeadRsModelResource>
		_primaryHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<SecondaryHeadRsModelResource>
		_secondaryHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<StateRsModelResource>
		_stateRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<TertiaryHeadRsModelResource>
		_tertiaryHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<TypeRsModelResource>
		_typeRsModelResourceComponentServiceObjects;

}