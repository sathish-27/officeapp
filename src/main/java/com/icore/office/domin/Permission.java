package com.icore.office.domin;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission {

	@Id
	@Column(name="permission_id",nullable=false,unique=true,length=11)
	private Integer PermissionId;
	
	
	@Column(name="date_time_from",nullable=false)
	private Date DateFrom;
	
	@Column(name="date_time_to",nullable=false)
	private Date DateTo;
	
	@Column(name="total_hours",nullable=true)
	private Integer TotalHours;
	
	@Column(name="reason",nullable=false)
	private String LeaveReason;
	
	@Column(name="remark",nullable=false)
	private String AdminReason;
	
	@ManyToOne
	@JoinColumn(name = "permission_status")
	private LookupDtl LeaveStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public Permission(Integer permissionId, Date dateFrom, Date dateTo, Integer totalHours, String leaveReason,
			String adminReason, LookupDtl leaveStatus, User user) {
		super();
		PermissionId = permissionId;
		DateFrom = dateFrom;
		DateTo = dateTo;
		TotalHours = totalHours;
		LeaveReason = leaveReason;
		AdminReason = adminReason;
		LeaveStatus = leaveStatus;
		this.user = user;
	}

	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPermissionId() {
		return PermissionId;
	}

	public void setPermissionId(Integer permissionId) {
		PermissionId = permissionId;
	}

	public Date getDateFrom() {
		return DateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		DateFrom = dateFrom;
	}

	public Date getDateTo() {
		return DateTo;
	}

	public void setDateTo(Date dateTo) {
		DateTo = dateTo;
	}

	public Integer getTotalHours() {
		return TotalHours;
	}

	public void setTotalHours(Integer totalHours) {
		TotalHours = totalHours;
	}

	public String getLeaveReason() {
		return LeaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		LeaveReason = leaveReason;
	}

	public String getAdminReason() {
		return AdminReason;
	}

	public void setAdminReason(String adminReason) {
		AdminReason = adminReason;
	}

	public LookupDtl getLeaveStatus() {
		return LeaveStatus;
	}

	public void setLeaveStatus(LookupDtl leaveStatus) {
		LeaveStatus = leaveStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Permission [PermissionId=" + PermissionId + ", DateFrom=" + DateFrom + ", DateTo=" + DateTo
				+ ", TotalHours=" + TotalHours + ", LeaveReason=" + LeaveReason + ", AdminReason=" + AdminReason
				+ ", LeaveStatus=" + LeaveStatus + ", user=" + user + "]";
	}
	
	
	
}
