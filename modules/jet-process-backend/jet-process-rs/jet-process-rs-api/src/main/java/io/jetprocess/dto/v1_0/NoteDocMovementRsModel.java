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
@GraphQLName("NoteDocMovementRsModel")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "NoteDocMovementRsModel")
public class NoteDocMovementRsModel implements Serializable {

	public static NoteDocMovementRsModel toDTO(String json) {
		return ObjectMapperUtil.readValue(NoteDocMovementRsModel.class, json);
	}

	public static NoteDocMovementRsModel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			NoteDocMovementRsModel.class, json);
	}

	@Schema
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
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
	protected Long id;

	@Schema
	public Long getNoteDocumentId() {
		return noteDocumentId;
	}

	public void setNoteDocumentId(Long noteDocumentId) {
		this.noteDocumentId = noteDocumentId;
	}

	@JsonIgnore
	public void setNoteDocumentId(
		UnsafeSupplier<Long, Exception> noteDocumentIdUnsafeSupplier) {

		try {
			noteDocumentId = noteDocumentIdUnsafeSupplier.get();
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
	protected Long noteDocumentId;

	@Schema
	public Long getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}

	@JsonIgnore
	public void setReceiverId(
		UnsafeSupplier<Long, Exception> receiverIdUnsafeSupplier) {

		try {
			receiverId = receiverIdUnsafeSupplier.get();
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
	protected Long receiverId;

	@Schema
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@JsonIgnore
	public void setRemarks(
		UnsafeSupplier<String, Exception> remarksUnsafeSupplier) {

		try {
			remarks = remarksUnsafeSupplier.get();
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
	protected String remarks;

	@Schema
	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	@JsonIgnore
	public void setSenderId(
		UnsafeSupplier<Long, Exception> senderIdUnsafeSupplier) {

		try {
			senderId = senderIdUnsafeSupplier.get();
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
	protected Long senderId;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NoteDocMovementRsModel)) {
			return false;
		}

		NoteDocMovementRsModel noteDocMovementRsModel =
			(NoteDocMovementRsModel)object;

		return Objects.equals(toString(), noteDocMovementRsModel.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (id != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(id);
		}

		if (noteDocumentId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"noteDocumentId\": ");

			sb.append(noteDocumentId);
		}

		if (receiverId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"receiverId\": ");

			sb.append(receiverId);
		}

		if (remarks != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"remarks\": ");

			sb.append("\"");

			sb.append(_escape(remarks));

			sb.append("\"");
		}

		if (senderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"senderId\": ");

			sb.append(senderId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "io.jetprocess.dto.v1_0.NoteDocMovementRsModel",
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