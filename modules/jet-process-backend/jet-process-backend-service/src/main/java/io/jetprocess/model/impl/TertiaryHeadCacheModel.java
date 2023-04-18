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

import io.jetprocess.model.TertiaryHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TertiaryHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TertiaryHeadCacheModel
	implements CacheModel<TertiaryHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TertiaryHeadCacheModel)) {
			return false;
		}

		TertiaryHeadCacheModel tertiaryHeadCacheModel =
			(TertiaryHeadCacheModel)object;

		if (tertiaryHeadId == tertiaryHeadCacheModel.tertiaryHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tertiaryHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{tertiaryHeadId=");
		sb.append(tertiaryHeadId);
		sb.append(", tertiaryHeadvalue=");
		sb.append(tertiaryHeadvalue);
		sb.append(", secondaryHeadId=");
		sb.append(secondaryHeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TertiaryHead toEntityModel() {
		TertiaryHeadImpl tertiaryHeadImpl = new TertiaryHeadImpl();

		tertiaryHeadImpl.setTertiaryHeadId(tertiaryHeadId);

		if (tertiaryHeadvalue == null) {
			tertiaryHeadImpl.setTertiaryHeadvalue("");
		}
		else {
			tertiaryHeadImpl.setTertiaryHeadvalue(tertiaryHeadvalue);
		}

		tertiaryHeadImpl.setSecondaryHeadId(secondaryHeadId);

		tertiaryHeadImpl.resetOriginalValues();

		return tertiaryHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tertiaryHeadId = objectInput.readLong();
		tertiaryHeadvalue = objectInput.readUTF();

		secondaryHeadId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tertiaryHeadId);

		if (tertiaryHeadvalue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tertiaryHeadvalue);
		}

		objectOutput.writeLong(secondaryHeadId);
	}

	public long tertiaryHeadId;
	public String tertiaryHeadvalue;
	public long secondaryHeadId;

}