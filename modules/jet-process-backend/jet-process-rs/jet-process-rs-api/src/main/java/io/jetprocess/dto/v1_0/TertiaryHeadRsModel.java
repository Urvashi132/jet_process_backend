package io.jetprocess.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Admin
 * @generated
 */
@Generated("")
@GraphQLName("TertiaryHeadRsModel")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "TertiaryHeadRsModel")
public class TertiaryHeadRsModel implements Serializable {

	public static TertiaryHeadRsModel toDTO(String json) {
		return ObjectMapperUtil.readValue(TertiaryHeadRsModel.class, json);
	}

	public static TertiaryHeadRsModel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			TertiaryHeadRsModel.class, json);
	}

	@Schema
	public Long getSecondaryHeadId() {
		return secondaryHeadId;
	}

	public void setSecondaryHeadId(Long secondaryHeadId) {
		this.secondaryHeadId = secondaryHeadId;
	}

	@JsonIgnore
	public void setSecondaryHeadId(
		UnsafeSupplier<Long, Exception> secondaryHeadIdUnsafeSupplier) {

		try {
			secondaryHeadId = secondaryHeadIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long secondaryHeadId;

	@Schema
	public Long getTertiaryHeadId() {
		return tertiaryHeadId;
	}

	public void setTertiaryHeadId(Long tertiaryHeadId) {
		this.tertiaryHeadId = tertiaryHeadId;
	}

	@JsonIgnore
	public void setTertiaryHeadId(
		UnsafeSupplier<Long, Exception> tertiaryHeadIdUnsafeSupplier) {

		try {
			tertiaryHeadId = tertiaryHeadIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long tertiaryHeadId;

	@Schema
	public String getTertiaryHeadValue() {
		return tertiaryHeadValue;
	}

	public void setTertiaryHeadValue(String tertiaryHeadValue) {
		this.tertiaryHeadValue = tertiaryHeadValue;
	}

	@JsonIgnore
	public void setTertiaryHeadValue(
		UnsafeSupplier<String, Exception> tertiaryHeadValueUnsafeSupplier) {

		try {
			tertiaryHeadValue = tertiaryHeadValueUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String tertiaryHeadValue;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TertiaryHeadRsModel)) {
			return false;
		}

		TertiaryHeadRsModel tertiaryHeadRsModel = (TertiaryHeadRsModel)object;

		return Objects.equals(toString(), tertiaryHeadRsModel.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (secondaryHeadId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"secondaryHeadId\": ");

			sb.append(secondaryHeadId);
		}

		if (tertiaryHeadId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tertiaryHeadId\": ");

			sb.append(tertiaryHeadId);
		}

		if (tertiaryHeadValue != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tertiaryHeadValue\": ");

			sb.append("\"");

			sb.append(_escape(tertiaryHeadValue));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "io.jetprocess.dto.v1_0.TertiaryHeadRsModel",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}