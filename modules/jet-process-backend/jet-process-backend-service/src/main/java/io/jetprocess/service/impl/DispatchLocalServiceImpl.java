/**
 	* Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package io.jetprocess.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

import io.jetprocess.model.Dispatch;
import io.jetprocess.service.base.DispatchLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.Dispatch", service = AopService.class)
public class DispatchLocalServiceImpl extends DispatchLocalServiceBaseImpl {

	
	
	public Dispatch addDispatch(String dispatchBy ,String deliveryMode ,String address , String subject , String dispatchedOn , String dispatchType , String issuNo , long receiptentId , long draftId) {
		
		long dispatchId = 	counterLocalService.increment(Dispatch.class.getName());
		Dispatch dispatch = createDispatch(dispatchId) ;
		dispatch.setDispatchBy(dispatchBy);
		dispatch.setDeliveryMode(deliveryMode);
		dispatch.setAddress(address);
		dispatch.setSubject(subject);
	//	dispatch.setDispathOn(dispathOn);
		dispatch.setReceiptentId(receiptentId);
		dispatch.setDraftId(draftId);
		addDispatch(dispatch);
		
		return dispatch;
		
	}
	
	
	
	
	public List<Dispatch> getDispatchList() {

		return getDispatches(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public Dispatch getdispatchById(long dispatchId) {

		return getdispatchById(dispatchId);
	}

	public void deleteDispatchById(long dispatchId) throws PortalException {

		deleteDispatch(dispatchId);
	}

}