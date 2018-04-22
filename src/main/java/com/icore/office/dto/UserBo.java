package com.icore.office.dto;

import java.util.Date;
import java.util.Set;

import com.icore.office.domin.LookupDtl;

//import com.icore.utils.vo.LookupDtlVo;

public class UserBo {

	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dateOfBirth;
	private Integer createdBy;
	private Integer updatedBy;
	private Date effectiveDate;
	private Date expiryDate;
	private Date updatedDate;
	private Date createdDate;
	private String phoneNumber;
	private String workPhone;
	private String mobileNumber;
	private LookupDtlVo activation;
	private GroupBo group;
	private LookupDtlVo status;
	private LookupDtlVo gender;
	private LookupDtlVo maritalStatus;
	private AddressBo address;
	public UserBo() {
		super();
	}

	public UserBo(Integer otpNumber) {
		super();
		
	}

	public UserBo(Integer userId, String userName, String firstName, String lastName, String email, String password,
			Date dateOfBirth, Integer createdBy, Integer updatedBy, Date effectiveDate, Date expiryDate,
			Date updatedDate, Date createdDate, String phoneNumber, String workPhone, String mobileNumber,
			LookupDtlVo activation, GroupBo group, LookupDtlVo status, LookupDtlVo gender, LookupDtlVo maritalStatus,
			AddressBo address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
		this.phoneNumber = phoneNumber;
		this.workPhone = workPhone;
		this.mobileNumber = mobileNumber;
		this.activation = activation;
		this.group = group;
		this.status = status;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LookupDtlVo getActivation() {
		return activation;
	}

	public void setActivation(LookupDtlVo activation) {
		this.activation = activation;
	}

	public GroupBo getGroup() {
		return group;
	}

	public void setGroup(GroupBo group) {
		this.group = group;
	}

	public LookupDtlVo getStatus() {
		return status;
	}

	public void setStatus(LookupDtlVo status) {
		this.status = status;
	}

	public LookupDtlVo getGender() {
		return gender;
	}

	public void setGender(LookupDtlVo gender) {
		this.gender = gender;
	}

	public LookupDtlVo getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(LookupDtlVo maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public AddressBo getAddress() {
		return address;
	}

	public void setAddress(AddressBo address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserBo [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", effectiveDate=" + effectiveDate
				+ ", expiryDate=" + expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate
				+ ", phoneNumber=" + phoneNumber + ", workPhone=" + workPhone + ", mobileNumber=" + mobileNumber
				+ ", activation=" + activation + ", group=" + group + ", status=" + status + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", address=" + address + "]";
	}
	

}