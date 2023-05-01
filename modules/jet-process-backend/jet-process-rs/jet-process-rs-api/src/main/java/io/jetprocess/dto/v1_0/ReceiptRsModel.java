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
@GraphQLName(
	description = "Contains all the data for receipt creation.",
	value = "ReceiptRsModel"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ReceiptRsModel")
public class ReceiptRsModel implements Serializable {

	public static ReceiptRsModel toDTO(String json) {
		return ObjectMapperUtil.readValue(ReceiptRsModel.class, json);
	}

	public static ReceiptRsModel unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ReceiptRsModel.class, json);
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
	public String getAttachStatus() {
		return attachStatus;
	}

	public void setAttachStatus(String attachStatus) {
		this.attachStatus = attachStatus;
	}

	@JsonIgnore
	public void setAttachStatus(
		UnsafeSupplier<String, Exception> attachStatusUnsafeSupplier) {

		try {
			attachStatus = attachStatusUnsafeSupplier.get();
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
	protected String attachStatus;

	@Schema
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@JsonIgnore
	public void setCategoryId(
		UnsafeSupplier<Long, Exception> categoryIdUnsafeSupplier) {

		try {
			categoryId = categoryIdUnsafeSupplier.get();
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
	protected Long categoryId;

	@Schema
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonIgnore
	public void setCity(UnsafeSupplier<String, Exception> cityUnsafeSupplier) {
		try {
			city = cityUnsafeSupplier.get();
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
	protected String city;

	@Schema
	public Long getCurrentState() {
		return currentState;
	}

	public void setCurrentState(Long currentState) {
		this.currentState = currentState;
	}

	@JsonIgnore
	public void setCurrentState(
		UnsafeSupplier<Long, Exception> currentStateUnsafeSupplier) {

		try {
			currentState = currentStateUnsafeSupplier.get();
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
	protected Long currentState;

	@Schema
	public Long getCurrentlyWith() {
		return currentlyWith;
	}

	public void setCurrentlyWith(Long currentlyWith) {
		this.currentlyWith = currentlyWith;
	}

	@JsonIgnore
	public void setCurrentlyWith(
		UnsafeSupplier<Long, Exception> currentlyWithUnsafeSupplier) {

		try {
			currentlyWith = currentlyWithUnsafeSupplier.get();
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
	protected Long currentlyWith;

	@Schema
	public Long getDeliveryModeId() {
		return deliveryModeId;
	}

	public void setDeliveryModeId(Long deliveryModeId) {
		this.deliveryModeId = deliveryModeId;
	}

	@JsonIgnore
	public void setDeliveryModeId(
		UnsafeSupplier<Long, Exception> deliveryModeIdUnsafeSupplier) {

		try {
			deliveryModeId = deliveryModeIdUnsafeSupplier.get();
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
	protected Long deliveryModeId;

	@Schema
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@JsonIgnore
	public void setDesignation(
		UnsafeSupplier<String, Exception> designationUnsafeSupplier) {

		try {
			designation = designationUnsafeSupplier.get();
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
	protected String designation;

	@Schema
	public Long getDocfileId() {
		return docfileId;
	}

	public void setDocfileId(Long docfileId) {
		this.docfileId = docfileId;
	}

	@JsonIgnore
	public void setDocfileId(
		UnsafeSupplier<Long, Exception> docfileIdUnsafeSupplier) {

		try {
			docfileId = docfileIdUnsafeSupplier.get();
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
	protected Long docfileId;

	@Schema
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public void setEmail(
		UnsafeSupplier<String, Exception> emailUnsafeSupplier) {

		try {
			email = emailUnsafeSupplier.get();
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
	protected String email;

	@Schema
	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@JsonIgnore
	public void setGroupId(
		UnsafeSupplier<Long, Exception> groupIdUnsafeSupplier) {

		try {
			groupId = groupIdUnsafeSupplier.get();
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
	protected Long groupId;

	@Schema
	public String getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(String letterDate) {
		this.letterDate = letterDate;
	}

	@JsonIgnore
	public void setLetterDate(
		UnsafeSupplier<String, Exception> letterDateUnsafeSupplier) {

		try {
			letterDate = letterDateUnsafeSupplier.get();
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
	protected String letterDate;

	@Schema
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonIgnore
	public void setMobile(
		UnsafeSupplier<String, Exception> mobileUnsafeSupplier) {

		try {
			mobile = mobileUnsafeSupplier.get();
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
	protected String mobile;

	@Schema
	public String getModeNo() {
		return modeNo;
	}

	public void setModeNo(String modeNo) {
		this.modeNo = modeNo;
	}

	@JsonIgnore
	public void setModeNo(
		UnsafeSupplier<String, Exception> modeNoUnsafeSupplier) {

		try {
			modeNo = modeNoUnsafeSupplier.get();
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
	protected String modeNo;

	@Schema
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
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
	protected String name;

	@Schema
	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	@JsonIgnore
	public void setNature(
		UnsafeSupplier<String, Exception> natureUnsafeSupplier) {

		try {
			nature = natureUnsafeSupplier.get();
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
	protected String nature;

	@Schema
	public Long getOrganization() {
		return organization;
	}

	public void setOrganization(Long organization) {
		this.organization = organization;
	}

	@JsonIgnore
	public void setOrganization(
		UnsafeSupplier<Long, Exception> organizationUnsafeSupplier) {

		try {
			organization = organizationUnsafeSupplier.get();
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
	protected Long organization;

	@Schema
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@JsonIgnore
	public void setPincode(
		UnsafeSupplier<String, Exception> pincodeUnsafeSupplier) {

		try {
			pincode = pincodeUnsafeSupplier.get();
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
	protected String pincode;

	@Schema
	public Long getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}

	@JsonIgnore
	public void setReceiptId(
		UnsafeSupplier<Long, Exception> receiptIdUnsafeSupplier) {

		try {
			receiptId = receiptIdUnsafeSupplier.get();
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
	protected Long receiptId;

	@Schema
	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@JsonIgnore
	public void setReceiptNo(
		UnsafeSupplier<String, Exception> receiptNoUnsafeSupplier) {

		try {
			receiptNo = receiptNoUnsafeSupplier.get();
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
	protected String receiptNo;

	@Schema
	public String getReceivedOn() {
		return receivedOn;
	}

	public void setReceivedOn(String receivedOn) {
		this.receivedOn = receivedOn;
	}

	@JsonIgnore
	public void setReceivedOn(
		UnsafeSupplier<String, Exception> receivedOnUnsafeSupplier) {

		try {
			receivedOn = receivedOnUnsafeSupplier.get();
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
	protected String receivedOn;

	@Schema
	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	@JsonIgnore
	public void setReferenceNo(
		UnsafeSupplier<String, Exception> referenceNoUnsafeSupplier) {

		try {
			referenceNo = referenceNoUnsafeSupplier.get();
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
	protected String referenceNo;

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
	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@JsonIgnore
	public void setStateId(
		UnsafeSupplier<Long, Exception> stateIdUnsafeSupplier) {

		try {
			stateId = stateIdUnsafeSupplier.get();
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
	protected Long stateId;

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

	@Schema
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	@JsonIgnore
	public void setTypeId(
		UnsafeSupplier<Long, Exception> typeIdUnsafeSupplier) {

		try {
			typeId = typeIdUnsafeSupplier.get();
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
	protected Long typeId;

	@Schema
	public Long getUserPostId() {
		return userPostId;
	}

	public void setUserPostId(Long userPostId) {
		this.userPostId = userPostId;
	}

	@JsonIgnore
	public void setUserPostId(
		UnsafeSupplier<Long, Exception> userPostIdUnsafeSupplier) {

		try {
			userPostId = userPostIdUnsafeSupplier.get();
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
	protected Long userPostId;

	@Schema
	public String getViewPdfUrl() {
		return viewPdfUrl;
	}

	public void setViewPdfUrl(String viewPdfUrl) {
		this.viewPdfUrl = viewPdfUrl;
	}

	@JsonIgnore
	public void setViewPdfUrl(
		UnsafeSupplier<String, Exception> viewPdfUrlUnsafeSupplier) {

		try {
			viewPdfUrl = viewPdfUrlUnsafeSupplier.get();
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
	protected String viewPdfUrl;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReceiptRsModel)) {
			return false;
		}

		ReceiptRsModel receiptRsModel = (ReceiptRsModel)object;

		return Objects.equals(toString(), receiptRsModel.toString());
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

		if (attachStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"attachStatus\": ");

			sb.append("\"");

			sb.append(_escape(attachStatus));

			sb.append("\"");
		}

		if (categoryId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"categoryId\": ");

			sb.append(categoryId);
		}

		if (city != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"city\": ");

			sb.append("\"");

			sb.append(_escape(city));

			sb.append("\"");
		}

		if (currentState != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currentState\": ");

			sb.append(currentState);
		}

		if (currentlyWith != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"currentlyWith\": ");

			sb.append(currentlyWith);
		}

		if (deliveryModeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"deliveryModeId\": ");

			sb.append(deliveryModeId);
		}

		if (designation != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"designation\": ");

			sb.append("\"");

			sb.append(_escape(designation));

			sb.append("\"");
		}

		if (docfileId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"docfileId\": ");

			sb.append(docfileId);
		}

		if (email != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"email\": ");

			sb.append("\"");

			sb.append(_escape(email));

			sb.append("\"");
		}

		if (groupId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"groupId\": ");

			sb.append(groupId);
		}

		if (letterDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"letterDate\": ");

			sb.append("\"");

			sb.append(_escape(letterDate));

			sb.append("\"");
		}

		if (mobile != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"mobile\": ");

			sb.append("\"");

			sb.append(_escape(mobile));

			sb.append("\"");
		}

		if (modeNo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modeNo\": ");

			sb.append("\"");

			sb.append(_escape(modeNo));

			sb.append("\"");
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (nature != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nature\": ");

			sb.append("\"");

			sb.append(_escape(nature));

			sb.append("\"");
		}

		if (organization != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"organization\": ");

			sb.append(organization);
		}

		if (pincode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pincode\": ");

			sb.append("\"");

			sb.append(_escape(pincode));

			sb.append("\"");
		}

		if (receiptId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"receiptId\": ");

			sb.append(receiptId);
		}

		if (receiptNo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"receiptNo\": ");

			sb.append("\"");

			sb.append(_escape(receiptNo));

			sb.append("\"");
		}

		if (receivedOn != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"receivedOn\": ");

			sb.append("\"");

			sb.append(_escape(receivedOn));

			sb.append("\"");
		}

		if (referenceNo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"referenceNo\": ");

			sb.append("\"");

			sb.append(_escape(referenceNo));

			sb.append("\"");
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

		if (stateId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stateId\": ");

			sb.append(stateId);
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

		if (typeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"typeId\": ");

			sb.append(typeId);
		}

		if (userPostId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userPostId\": ");

			sb.append(userPostId);
		}

		if (viewPdfUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"viewPdfUrl\": ");

			sb.append("\"");

			sb.append(_escape(viewPdfUrl));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "io.jetprocess.dto.v1_0.ReceiptRsModel",
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