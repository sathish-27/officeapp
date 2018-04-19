package com.icore.office.domin;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id", nullable = false, unique = true, length = 11)
	private Integer addressId;

	@Column(name = "address_line1", length = 75, nullable = false)
	private String addressLine1;

	@Column(name = "address_line2", length = 75, nullable = true)
	private String addressLine2;

	@Column(name = "address_city", length = 25, nullable = false)
	private String city;

	@ManyToOne
	@JoinColumn(name = "address_state")
	private LookupDtl state;

	@ManyToOne
	@JoinColumn(name = "country")
	private LookupDtl country;

	@Column(name = "address_zipcode", length = 20, nullable = false)
	private String zipcode;

	@Column(name = "updated_by", length = 11, nullable = true)
	private Integer updatedBy;

	@Column(name = "created_by", length = 11, nullable = true)
	private Integer createdBy;

	@Column(name = "effective_date", nullable = false)
	private Date effectiveDate;

	@Column(name = "expiry_date", nullable = true)
	private Date expiryDate;

	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	public Address() {
		super();
	}

	public Address(Integer addressId, String addressLine1, String addressLine2, String city, LookupDtl state,
			LookupDtl country, String zipcode, Integer updatedBy, Integer createdBy, Date effectiveDate,
			Date expiryDate, Date updatedDate, Date createdDate) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LookupDtl getState() {
		return state;
	}

	public void setState(LookupDtl state) {
		this.state = state;
	}

	public LookupDtl getCountry() {
		return country;
	}

	public void setCountry(LookupDtl country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
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

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode
				+ ", updatedBy=" + updatedBy + ", createdBy=" + createdBy + ", effectiveDate=" + effectiveDate
				+ ", expiryDate=" + expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}

}
