package io.jetprocess.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import io.jetprocess.internal.graphql.mutation.v1_0.Mutation;
import io.jetprocess.internal.graphql.query.v1_0.Query;
import io.jetprocess.resource.v1_0.BasicHeadRsModelResource;
import io.jetprocess.resource.v1_0.CategoryRsModelResource;
import io.jetprocess.resource.v1_0.FileRsModelResource;
import io.jetprocess.resource.v1_0.PrimaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.SecondaryHeadRsModelResource;
import io.jetprocess.resource.v1_0.TertiaryHeadRsModelResource;

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

		Query.setBasicHeadRsModelResourceComponentServiceObjects(
			_basicHeadRsModelResourceComponentServiceObjects);
		Query.setCategoryRsModelResourceComponentServiceObjects(
			_categoryRsModelResourceComponentServiceObjects);
		Query.setFileRsModelResourceComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects);
		Query.setPrimaryHeadRsModelResourceComponentServiceObjects(
			_primaryHeadRsModelResourceComponentServiceObjects);
		Query.setSecondaryHeadRsModelResourceComponentServiceObjects(
			_secondaryHeadRsModelResourceComponentServiceObjects);
		Query.setTertiaryHeadRsModelResourceComponentServiceObjects(
			_tertiaryHeadRsModelResourceComponentServiceObjects);
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
	private ComponentServiceObjects<BasicHeadRsModelResource>
		_basicHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<CategoryRsModelResource>
		_categoryRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<PrimaryHeadRsModelResource>
		_primaryHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<SecondaryHeadRsModelResource>
		_secondaryHeadRsModelResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<TertiaryHeadRsModelResource>
		_tertiaryHeadRsModelResourceComponentServiceObjects;

}