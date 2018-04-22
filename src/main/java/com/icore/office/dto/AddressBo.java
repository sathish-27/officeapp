package com.icore.office.dto;

import java.util.Date;

//import com.icore.utils.vo.LookupDtlVo;

public class AddressBo {

    private Integer addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private LookupDtlVo state;
    private LookupDtlVo country;
    private String zipcode;
    private Integer updatedBy;
    private Integer createdBy;
    private Date effectiveDate;
    private Date expiryDate;
    private Date updatedDate;
    private Date createdDate;
    private Double latitude;
    private Double longitude;
    private String formattedAddress;

    public AddressBo() {
        super();
    }

    public AddressBo(Integer addressId, String addressLine1, String addressLine2, String city, LookupDtlVo state,
            LookupDtlVo country, String zipcode, Integer updatedBy, Integer createdBy, Date effectiveDate,
            Date expiryDate, Date updatedDate, Date createdDate, Double latitude, Double longitude,
            String formattedAddress) {
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
        this.latitude = latitude;
        this.longitude = longitude;
        this.formattedAddress = formattedAddress;
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

    public LookupDtlVo getState() {
        return state;
    }

    public void setState(LookupDtlVo state) {
        this.state = state;
    }

    public LookupDtlVo getCountry() {
        return country;
    }

    public void setCountry(LookupDtlVo country) {
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    @Override
    public String toString() {
        return "AddressBo [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
                + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode
                + ", updatedBy=" + updatedBy + ", createdBy=" + createdBy + ", effectiveDate=" + effectiveDate
                + ", expiryDate=" + expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate
                + ", latitude=" + latitude + ", longitude=" + longitude + ", formattedAddress=" + formattedAddress
                + "]";
    }

    

}
