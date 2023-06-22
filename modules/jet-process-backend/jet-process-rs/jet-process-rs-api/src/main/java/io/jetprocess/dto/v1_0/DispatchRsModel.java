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
@GraphQLName("DispatchRsModel")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DispatchRsModel")
public class DispatchRsModel implements Serializable {

	public static DispatchRsModel toDTO(String json) {
		return ObjectMapperUtil.readValue(DispatchRsModel.class, json);
	}

	public static DispatchRsModel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DispatchRsModel.class, json);
	}

	@Schema
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonIgnore
	public void setAddress(
		UnsafeSupplier<String, Exception> addressUnsafeSupplier) {

		try {
			address = addressUnsafeSupplier.get();
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
	protected String address;

	@Schema
	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	@JsonIgnore
	public void setDeliveryMode(
		UnsafeSupplier<String, Exception> deliveryModeUnsafeSupplier) {

		try {
			deliveryMode = deliveryModeUnsafeSupplier.get();
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
	protected String deliveryMode;

	@Schema
	public String getDispatchedBy() {
		return dispatchedBy;
	}

	public void setDispatchedBy(String dispatchedBy) {
		this.dispatchedBy = dispatchedBy;
	}

	@JsonIgnore
	public void setDispatchedBy(
		UnsafeSupplier<String, Exception> dispatchedByUnsafeSupplier) {

		try {
			dispatchedBy = dispatchedByUnsafeSupplier.get();
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
	protected String dispatchedBy;

	@Schema
	public String getDispatchedOn() {
		return dispatchedOn;
	}

	public void setDispatchedOn(String dispatchedOn) {
		this.dispatchedOn = dispatchedOn;
	}

	@JsonIgnore
	public void setDispatchedOn(
		UnsafeSupplier<String, Exception> dispatchedOnUnsafeSupplier) {

		try {
			dispatchedOn = dispatchedOnUnsafeSupplier.get();
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
	protected String dispatchedOn;

	@Schema
	public String getDispatchedType() {
		return dispatchedType;
	}

	public void setDispatchedType(String dispatchedType) {
		this.dispatchedType = dispatchedType;
	}

	@JsonIgnore
	public void setDispatchedType(
		UnsafeSupplier<String, Exception> dispatchedTypeUnsafeSupplier) {

		try {
			dispatchedType = dispatchedTypeUnsafeSupplier.get();
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
	protected String dispatchedType;

	@Schema
	public Long getDraftId() {
		return draftId;
	}

	public void setDraftId(Long draftId) {
		this.draftId = draftId;
	}

	@JsonIgnore
	public void setDraftId(
		UnsafeSupplier<Long, Exception> draftIdUnsafeSupplier) {

		try {
			draftId = draftIdUnsafeSupplier.get();
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
	protected Long draftId;

	@Schema
	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	@JsonIgnore
	public void setIssueNumber(
		UnsafeSupplier<String, Exception> issueNumberUnsafeSupplier) {

		try {
			issueNumber = issueNumberUnsafeSupplier.get();
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
	protected String issueNumber;

	@Schema
	public Long getReceiptentId() {
		return receiptentId;
	}

	public void setReceiptentId(Long receiptentId) {
		this.receiptentId = receiptentId;
	}

	@JsonIgnore
	public void setReceiptentId(
		UnsafeSupplier<Long, Exception> receiptentIdUnsafeSupplier) {

		try {
			receiptentId = receiptentIdUnsafeSupplier.get();
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
	protected Long receiptentId;

	@Schema
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@JsonIgnore
	public void setSubject(
		UnsafeSupplier<String, Exception> subjectUnsafeSupplier) {

		try {
			subject = subjectUnsafeSupplier.get();
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
	protected String subject;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DispatchRsModel)) {
			return false;
		}

		DispatchRsModel dispatchRsModel = (DispatchRsModel)object;

		return Objects.equals(toString(), dispatchRsModel.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (address != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"address\": ");

			sb.append("\"");

			sb.append(_escape(address));

			sb.append("\"");
		}

		if (deliveryMode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryMode\": ");

			sb.append("\"");

			sb.append(_escape(deliveryMode));

			sb.append("\"");
		}

		if (dispatchedBy != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchedBy\": ");

			sb.append("\"");

			sb.append(_escape(dispatchedBy));

			sb.append("\"");
		}

		if (dispatchedOn != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchedOn\": ");

			sb.append("\"");

			sb.append(_escape(dispatchedOn));

			sb.append("\"");
		}

		if (dispatchedType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispatchedType\": ");

			sb.append("\"");

			sb.append(_escape(dispatchedType));

			sb.append("\"");
		}

		if (draftId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"draftId\": ");

			sb.append(draftId);
		}

		if (issueNumber != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"issueNumber\": ");

			sb.append("\"");

			sb.append(_escape(issueNumber));

			sb.append("\"");
		}

		if (receiptentId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"receiptentId\": ");

			sb.append(receiptentId);
		}

		if (subject != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"subject\": ");

			sb.append("\"");

			sb.append(_escape(subject));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "io.jetprocess.dto.v1_0.DispatchRsModel",
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