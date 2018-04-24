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
import javax.persistence.Table;

@Entity
@Table(name = "user_device_detail")
public class UserDeviceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_device_detail_id", nullable = false, unique = true, length = 11)
    private Integer userDeviceDetailId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "device_id")
    private Integer deviceId;

    @Column(name = "device_token_key")
    private String deviceTokenKey;

    @Column(name = "token_created_date")
    private Date tokenCreatedDate;

    @Column(name = "platform")
    private String platform;

    @Column(name = "availability")
    private Boolean availability;

    @Column(name = "app_name")
    private String appName;

    public UserDeviceDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserDeviceDetail(Integer userDeviceDetailId, User user, Integer deviceId, String deviceTokenKey,
            Date tokenCreatedDate, String platform, Boolean availability, String appName) {
        super();
        this.userDeviceDetailId = userDeviceDetailId;
        this.user = user;
        this.deviceId = deviceId;
        this.deviceTokenKey = deviceTokenKey;
        this.tokenCreatedDate = tokenCreatedDate;
        this.platform = platform;
        this.availability = availability;
        this.appName = appName;
    }

    public Integer getUserDeviceDetailId() {
        return userDeviceDetailId;
    }

    public void setUserDeviceDetailId(Integer userDeviceDetailId) {
        this.userDeviceDetailId = userDeviceDetailId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTokenKey() {
        return deviceTokenKey;
    }

    public void setDeviceTokenKey(String deviceTokenKey) {
        this.deviceTokenKey = deviceTokenKey;
    }

    public Date getTokenCreatedDate() {
        return tokenCreatedDate;
    }

    public void setTokenCreatedDate(Date tokenCreatedDate) {
        this.tokenCreatedDate = tokenCreatedDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

}
