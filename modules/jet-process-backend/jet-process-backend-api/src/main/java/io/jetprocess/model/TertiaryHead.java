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

package io.jetprocess.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the TertiaryHead service. Represents a row in the &quot;JP_TertiaryHead&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TertiaryHeadModel
 * @generated
 */
@ImplementationClassName("io.jetprocess.model.impl.TertiaryHeadImpl")
@ProviderType
public interface TertiaryHead extends PersistedModel, TertiaryHeadModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>io.jetprocess.model.impl.TertiaryHeadImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TertiaryHead, Long> TERTIARY_HEAD_ID_ACCESSOR =
		new Accessor<TertiaryHead, Long>() {

			@Override
			public Long get(TertiaryHead tertiaryHead) {
				return tertiaryHead.getTertiaryHeadId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TertiaryHead> getTypeClass() {
				return TertiaryHead.class;
			}

		};

}