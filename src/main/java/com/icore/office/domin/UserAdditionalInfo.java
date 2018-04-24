package com.icore.office.domin;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user_additional_info")
public class UserAdditionalInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_additional_info_id", unique = true, length = 11, nullable = false)
	private Integer userAdditionalInfoId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "gender_id")
	private LookupDtl gender;

	@ManyToOne
	@JoinColumn(name = "marital_status_id")
	private LookupDtl maritalStatus;


	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@Column(name="salary",nullable=true)
	private Integer Salary;

	@Column(name = "otp_number", length = 6, nullable = true)
	private Integer otpNumber;

	@Column(name = "otp_datetime", nullable = true)
	private Date otpDateTime;

	public UserAdditionalInfo() {
		super();
	}

	public UserAdditionalInfo(Integer userAdditionalInfoId, User user, LookupDtl gender, LookupDtl maritalStatus,
			Date updatedDate, Date createdDate, Address address, Integer salary, Integer otpNumber, Date otpDateTime) {
		super();
		this.userAdditionalInfoId = userAdditionalInfoId;
		this.user = user;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
		this.address = address;
		Salary = salary;
		this.otpNumber = otpNumber;
		this.otpDateTime = otpDateTime;
	}

	public Integer getUserAdditionalInfoId() {
		return userAdditionalInfoId;
	}

	public void setUserAdditionalInfoId(Integer userAdditionalInfoId) {
		this.userAdditionalInfoId = userAdditionalInfoId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LookupDtl getGender() {
		return gender;
	}

	public void setGender(LookupDtl gender) {
		this.gender = gender;
	}

	public LookupDtl getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(LookupDtl maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

	public Integer getOtpNumber() {
		return otpNumber;
	}

	public void setOtpNumber(Integer otpNumber) {
		this.otpNumber = otpNumber;
	}

	public Date getOtpDateTime() {
		return otpDateTime;
	}

	public void setOtpDateTime(Date otpDateTime) {
		this.otpDateTime = otpDateTime;
	}

	@Override
	public String toString() {
		return "UserAdditionalInfo [userAdditionalInfoId=" + userAdditionalInfoId + ", user=" + user + ", gender="
				+ gender + ", maritalStatus=" + maritalStatus + ", updatedDate=" + updatedDate + ", createdDate="
				+ createdDate + ", address=" + address + ", Salary=" + Salary + ", otpNumber=" + otpNumber
				+ ", otpDateTime=" + otpDateTime + "]";
	}

	
	
}
