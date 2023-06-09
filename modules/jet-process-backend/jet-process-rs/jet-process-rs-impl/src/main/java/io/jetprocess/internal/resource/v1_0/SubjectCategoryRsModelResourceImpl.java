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

import io.jetprocess.dto.v1_0.SubjectCategoryRsModel;
import io.jetprocess.model.SubjectCategory;
import io.jetprocess.resource.v1_0.SubjectCategoryRsModelResource;
import io.jetprocess.service.SubjectCategoryLocalService;

/**
 * @author Admin
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/subject-category-rs-model.properties", scope = ServiceScope.PROTOTYPE, service = SubjectCategoryRsModelResource.class)
public class SubjectCategoryRsModelResourceImpl extends BaseSubjectCategoryRsModelResourceImpl {

	@Override
	public Page<SubjectCategoryRsModel> getSubjectCategoryList() throws Exception {
		List<SubjectCategoryRsModel> subjectCategoryRsModelList = new ArrayList<>();
		List<SubjectCategory> subjectCategoryList = subjectCategoryLocalService.getSubjectCategoryList();
		System.out.println(subjectCategoryList);
		subjectCategoryList.stream().forEach(subjectCategory -> {
			Object object = ObjectMapperUtil.objectMapper(subjectCategory, SubjectCategoryRsModel.class);
			subjectCategoryRsModelList.add((SubjectCategoryRsModel)object);
		});
		return Page.of(subjectCategoryRsModelList);
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<SubjectCategoryRsModel>, UnsafeConsumer<SubjectCategoryRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}

	@Reference
	private SubjectCategoryLocalService subjectCategoryLocalService;
}