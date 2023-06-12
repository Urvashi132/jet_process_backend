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

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
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
@GraphQLName("PostalRsModel")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PostalRsModel")
public class PostalRsModel implements Serializable {

	public static PostalRsModel toDTO(String json) {
		return ObjectMapperUtil.readValue(PostalRsModel.class, json);
	}

	public static PostalRsModel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PostalRsModel.class, json);
	}

	@Schema
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@JsonIgnore
	public void setDeliveryDate(
		UnsafeSupplier<Date, Exception> deliveryDateUnsafeSupplier) {

		try {
			deliveryDate = deliveryDateUnsafeSupplier.get();
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
	protected Date deliveryDate;

	@Schema
	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	@JsonIgnore
	public void setMedium(
		UnsafeSupplier<String, Exception> mediumUnsafeSupplier) {

		try {
			medium = mediumUnsafeSupplier.get();
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
	protected String medium;

	@Schema
	public String getModeNumber() {
		return modeNumber;
	}

	public void setModeNumber(String modeNumber) {
		this.modeNumber = modeNumber;
	}

	@JsonIgnore
	public void setModeNumber(
		UnsafeSupplier<String, Exception> modeNumberUnsafeSupplier) {

		try {
			modeNumber = modeNumberUnsafeSupplier.get();
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
	protected String modeNumber;

	@Schema
	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	@JsonIgnore
	public void setOutDate(
		UnsafeSupplier<Date, Exception> outDateUnsafeSupplier) {

		try {
			outDate = outDateUnsafeSupplier.get();
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
	protected Date outDate;

	@Schema
	public String getPeonBookNo() {
		return peonBookNo;
	}

	public void setPeonBookNo(String peonBookNo) {
		this.peonBookNo = peonBookNo;
	}

	@JsonIgnore
	public void setPeonBookNo(
		UnsafeSupplier<String, Exception> peonBookNoUnsafeSupplier) {

		try {
			peonBookNo = peonBookNoUnsafeSupplier.get();
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
	protected String peonBookNo;

	@Schema
	public String getPeonName() {
		return peonName;
	}

	public void setPeonName(String peonName) {
		this.peonName = peonName;
	}

	@JsonIgnore
	public void setPeonName(
		UnsafeSupplier<String, Exception> peonNameUnsafeSupplier) {

		try {
			peonName = peonNameUnsafeSupplier.get();
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
	protected String peonName;

	@Schema
	public String getPostalCharge() {
		return postalCharge;
	}

	public void setPostalCharge(String postalCharge) {
		this.postalCharge = postalCharge;
	}

	@JsonIgnore
	public void setPostalCharge(
		UnsafeSupplier<String, Exception> postalChargeUnsafeSupplier) {

		try {
			postalCharge = postalChargeUnsafeSupplier.get();
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
	protected String postalCharge;

	@Schema
	public String getPostalMode() {
		return postalMode;
	}

	public void setPostalMode(String postalMode) {
		this.postalMode = postalMode;
	}

	@JsonIgnore
	public void setPostalMode(
		UnsafeSupplier<String, Exception> postalModeUnsafeSupplier) {

		try {
			postalMode = postalModeUnsafeSupplier.get();
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
	protected String postalMode;

	@Schema
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@JsonIgnore
	public void setWeight(
		UnsafeSupplier<String, Exception> weightUnsafeSupplier) {

		try {
			weight = weightUnsafeSupplier.get();
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
	protected String weight;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PostalRsModel)) {
			return false;
		}

		PostalRsModel postalRsModel = (PostalRsModel)object;

		return Objects.equals(toString(), postalRsModel.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (deliveryDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(deliveryDate));

			sb.append("\"");
		}

		if (medium != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"medium\": ");

			sb.append("\"");

			sb.append(_escape(medium));

			sb.append("\"");
		}

		if (modeNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modeNumber\": ");

			sb.append("\"");

			sb.append(_escape(modeNumber));

			sb.append("\"");
		}

		if (outDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(outDate));

			sb.append("\"");
		}

		if (peonBookNo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"peonBookNo\": ");

			sb.append("\"");

			sb.append(_escape(peonBookNo));

			sb.append("\"");
		}

		if (peonName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"peonName\": ");

			sb.append("\"");

			sb.append(_escape(peonName));

			sb.append("\"");
		}

		if (postalCharge != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalCharge\": ");

			sb.append("\"");

			sb.append(_escape(postalCharge));

			sb.append("\"");
		}

		if (postalMode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"postalMode\": ");

			sb.append("\"");

			sb.append(_escape(postalMode));

			sb.append("\"");
		}

		if (weight != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"weight\": ");

			sb.append("\"");

			sb.append(_escape(weight));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "io.jetprocess.dto.v1_0.PostalRsModel",
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