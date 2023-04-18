package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.CategoryRsModel;
import io.jetprocess.dto.v1_0.FileRsModel;
import io.jetprocess.model.Category;
import io.jetprocess.model.DocFile;
import io.jetprocess.resource.v1_0.CategoryRsModelResource;
import io.jetprocess.service.CategoryLocalService;

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

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/category-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = CategoryRsModelResource.class
)
public class CategoryRsModelResourceImpl
	extends BaseCategoryRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<CategoryRsModel>, UnsafeConsumer<CategoryRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Page<CategoryRsModel> getCategoryList() throws Exception {
		return null;
		
	}
	
	@Reference
	private CategoryLocalService categoryLocalService;
	
	
	
}