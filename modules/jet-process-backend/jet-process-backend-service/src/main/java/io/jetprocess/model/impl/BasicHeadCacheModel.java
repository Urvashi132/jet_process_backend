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

import io.jetprocess.model.BasicHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BasicHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BasicHeadCacheModel
	implements CacheModel<BasicHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BasicHeadCacheModel)) {
			return false;
		}

		BasicHeadCacheModel basicHeadCacheModel = (BasicHeadCacheModel)object;

		if (basicHeadId == basicHeadCacheModel.basicHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, basicHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{basicHeadId=");
		sb.append(basicHeadId);
		sb.append(", basicHeadValue=");
		sb.append(basicHeadValue);
		sb.append(", basicHeadCode=");
		sb.append(basicHeadCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BasicHead toEntityModel() {
		BasicHeadImpl basicHeadImpl = new BasicHeadImpl();

		basicHeadImpl.setBasicHeadId(basicHeadId);

		if (basicHeadValue == null) {
			basicHeadImpl.setBasicHeadValue("");
		}
		else {
			basicHeadImpl.setBasicHeadValue(basicHeadValue);
		}

		basicHeadImpl.setBasicHeadCode(basicHeadCode);

		basicHeadImpl.resetOriginalValues();

		return basicHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		basicHeadId = objectInput.readLong();
		basicHeadValue = objectInput.readUTF();

		basicHeadCode = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(basicHeadId);

		if (basicHeadValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(basicHeadValue);
		}

		objectOutput.writeLong(basicHeadCode);
	}

	public long basicHeadId;
	public String basicHeadValue;
	public long basicHeadCode;

}