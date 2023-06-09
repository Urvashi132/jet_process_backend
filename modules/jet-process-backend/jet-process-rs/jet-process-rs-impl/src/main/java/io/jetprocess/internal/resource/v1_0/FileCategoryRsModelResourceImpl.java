package io.jetprocess.internal.resource.v1_0;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import io.jetprocess.dto.v1_0.FileCategoryRsModel;
import io.jetprocess.model.FileCategory;
import io.jetprocess.resource.v1_0.FileCategoryRsModelResource;
import io.jetprocess.service.FileCategoryLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/file-category-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = FileCategoryRsModelResource.class)
public class FileCategoryRsModelResourceImpl extends BaseFileCategoryRsModelResourceImpl {

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<FileCategoryRsModel>, UnsafeConsumer<FileCategoryRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}

	@Override
	public Page<FileCategoryRsModel> getFileCategoryList() throws Exception {
		List<FileCategoryRsModel> fileCategoryRsModelList = new ArrayList<>();
		List<FileCategory> fileCategories = fileCategoryLocalService.getFileCategoryList();
		fileCategories.stream().forEach(fileCategory -> {
			Object draftObj = ObjectMapperUtil.objectMapper(fileCategory, FileCategoryRsModel.class);
			fileCategoryRsModelList.add((FileCategoryRsModel)draftObj);
		});
		return Page.of(fileCategoryRsModelList);
	}

	@Reference
	private FileCategoryLocalService fileCategoryLocalService;
}