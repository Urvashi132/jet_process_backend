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

package io.jetprocess.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import io.jetprocess.model.SecondaryHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SecondaryHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SecondaryHeadCacheModel
	implements CacheModel<SecondaryHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SecondaryHeadCacheModel)) {
			return false;
		}

		SecondaryHeadCacheModel secondaryHeadCacheModel =
			(SecondaryHeadCacheModel)object;

		if (secondaryHeadId == secondaryHeadCacheModel.secondaryHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, secondaryHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{secondaryHeadId=");
		sb.append(secondaryHeadId);
		sb.append(", secondaryHeadValue=");
		sb.append(secondaryHeadValue);
		sb.append(", primaryHeadId=");
		sb.append(primaryHeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SecondaryHead toEntityModel() {
		SecondaryHeadImpl secondaryHeadImpl = new SecondaryHeadImpl();

		secondaryHeadImpl.setSecondaryHeadId(secondaryHeadId);

		if (secondaryHeadValue == null) {
			secondaryHeadImpl.setSecondaryHeadValue("");
		}
		else {
			secondaryHeadImpl.setSecondaryHeadValue(secondaryHeadValue);
		}

		secondaryHeadImpl.setPrimaryHeadId(primaryHeadId);

		secondaryHeadImpl.resetOriginalValues();

		return secondaryHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		secondaryHeadId = objectInput.readLong();
		secondaryHeadValue = objectInput.readUTF();

		primaryHeadId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(secondaryHeadId);

		if (secondaryHeadValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryHeadValue);
		}

		objectOutput.writeLong(primaryHeadId);
	}

	public long secondaryHeadId;
	public String secondaryHeadValue;
	public long primaryHeadId;

}