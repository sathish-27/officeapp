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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, length = 11, nullable = false)
	private Integer userId;

	@Column(name = "user_name", length = 75, nullable = false)
	private String userName;

	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;


	@Column(name = "email", length = 255, nullable = false)
	private String email;

	@Column(name = "password", length = 75, nullable = true)
	private String password;



	@ManyToOne
	@JoinColumn(name = "activation", nullable = true)
	private LookupDtl activation;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "created_by", length = 11, nullable = true)
	private Integer createdBy;

	@Column(name = "updated_by", length = 11, nullable = true)
	private Integer updatedBy;

	@Column(name = "effective_date", nullable = false)
	private Date effectiveDate;

	@Column(name = "expiry_date", nullable = true)
	private Date expiryDate;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private LookupDtl status;

	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	@Column(name = "phone_number", nullable = true, length = 25)
	private String phoneNumber;

	@Column(name = "work_phone", nullable = true, length = 25)
	private String workPhone;

	@Column(name = "mobile_number", length = 25)
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
	private UserAdditionalInfo userAdditionalInfo;

	public User() {
		super();
	}

	public User(Integer userId, String userName, String firstName, String lastName, String email, String password,
			LookupDtl activation, Date dateOfBirth, Integer createdBy, Integer updatedBy, Date effectiveDate,
			Date expiryDate, LookupDtl status, Date updatedDate, Date createdDate, String phoneNumber, String workPhone,
			String mobileNumber, UserAdditionalInfo userAdditionalInfo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.activation = activation;
		this.dateOfBirth = dateOfBirth;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.status = status;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
		this.phoneNumber = phoneNumber;
		this.workPhone = workPhone;
		this.mobileNumber = mobileNumber;
		this.userAdditionalInfo = userAdditionalInfo;
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

	public LookupDtl getActivation() {
		return activation;
	}

	public void setActivation(LookupDtl activation) {
		this.activation = activation;
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

	public LookupDtl getStatus() {
		return status;
	}

	public void setStatus(LookupDtl status) {
		this.status = status;
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

	public UserAdditionalInfo getUserAdditionalInfo() {
		return userAdditionalInfo;
	}

	public void setUserAdditionalInfo(UserAdditionalInfo userAdditionalInfo) {
		this.userAdditionalInfo = userAdditionalInfo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", activation=" + activation
				+ ", dateOfBirth=" + dateOfBirth + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", effectiveDate=" + effectiveDate + ", expiryDate=" + expiryDate + ", status=" + status
				+ ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + ", phoneNumber=" + phoneNumber
				+ ", workPhone=" + workPhone + ", mobileNumber=" + mobileNumber + ", userAdditionalInfo="
				+ userAdditionalInfo + "]";
	}

	
}
