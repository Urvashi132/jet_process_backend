package io.jetprocess.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import io.jetprocess.internal.graphql.mutation.v1_0.Mutation;
import io.jetprocess.internal.graphql.query.v1_0.Query;
import io.jetprocess.resource.v1_0.FileRsModelResource;

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

		Query.setFileRsModelResourceComponentServiceObjects(
			_fileRsModelResourceComponentServiceObjects);
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

}