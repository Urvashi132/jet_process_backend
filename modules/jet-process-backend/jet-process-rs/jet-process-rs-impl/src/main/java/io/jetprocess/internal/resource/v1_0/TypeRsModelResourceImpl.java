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

import io.jetprocess.dto.v1_0.TypeRsModel;
import io.jetprocess.model.Type;
import io.jetprocess.resource.v1_0.TypeRsModelResource;
import io.jetprocess.service.TypeLocalService;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/type-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = TypeRsModelResource.class
)
public class TypeRsModelResourceImpl extends BaseTypeRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<TypeRsModel>, UnsafeConsumer<TypeRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Page<TypeRsModel> getTypeList() throws Exception {
		List<TypeRsModel> typeRsModelList = new ArrayList<>();
		List<Type> typeList = typeLocalService.getTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		typeList.stream().forEach(type -> {
			typeRsModelList.add(getTypeModel(type));
		});
		return Page.of(typeRsModelList);
	}

	private TypeRsModel getTypeModel(Type type) {
		TypeRsModel typeRsModel = new TypeRsModel();
		typeRsModel.setId(type.getId());
		typeRsModel.setName(type.getName());
		return typeRsModel;
	}

	@Reference
	private TypeLocalService typeLocalService;
}