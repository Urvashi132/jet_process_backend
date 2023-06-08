package io.jetprocess.internal.resource.v1_0;

import io.jetprocess.dto.v1_0.DraftRsModel;
import io.jetprocess.model.Draft;
import io.jetprocess.resource.v1_0.DraftRsModelResource;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Admin
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/draft-rs-model.properties",
	scope = ServiceScope.PROTOTYPE, service = DraftRsModelResource.class
)
public class DraftRsModelResourceImpl extends BaseDraftRsModelResourceImpl {

	@Reference
	private Draft draft;
	
	@Override
	public void deleteDraftById(@NotNull Long id) throws Exception {
		// TODO Auto-generated method stub
		super.deleteDraftById(id);
	}

	@Override
	public DraftRsModel getDraftById(@NotNull Long id) throws Exception {
		// TODO Auto-generated method stub
		return super.getDraftById(id);
	}

	@Override
	public DraftRsModel createDraft(DraftRsModel draftRsModel) throws Exception {
		// TODO Auto-generated method stub
		return super.createDraft(draftRsModel);
	}

	@Override
	public DraftRsModel updateDraft(@NotNull Long id, DraftRsModel draftRsModel) throws Exception {
		// TODO Auto-generated method stub
		return super.updateDraft(id, draftRsModel);
	}

	@Override
	public Page<DraftRsModel> getDraftList() throws Exception {
		// TODO Auto-generated method stub
		return super.getDraftList();
	}

	@Override
	public void setContextBatchUnsafeConsumer(
			UnsafeBiConsumer<Collection<DraftRsModel>, UnsafeConsumer<DraftRsModel, Exception>, Exception> contextBatchUnsafeConsumer) {
	}
}