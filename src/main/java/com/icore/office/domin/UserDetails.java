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
@Table(name = "user_groups")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_detail_id", nullable = false, unique = true, length = 11)
	private Integer userDetailId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "group_id")
	private Group group;

	@Column(name = "created_by", length = 11, nullable = true)
	private Integer createdBy;

	@Column(name = "updated_by", length = 11, nullable = true)
	private Integer updatedBy;

	@Column(name = "effective_date", nullable = true)
	private Date effectiveDate;

	@Column(name = "expiry_date", nullable = true)
	private Date expiryDate;
	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public UserDetails() {
		super();
	}

	public UserDetails(Integer userDetailId, User user, Group group, Integer createdBy, Integer updatedBy,
			Date effectiveDate, Date expiryDate, Date updatedDate, Date createdDate) {
		super();
		this.userDetailId = userDetailId;
		this.user = user;
		this.group = group;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}

	public Integer getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(Integer userDetailId) {
		this.userDetailId = userDetailId;
	}

	@Override
	public String toString() {
		return "UserDetails [userDetailId=" + userDetailId + ", user=" + user + ", group=" + group + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", effectiveDate=" + effectiveDate + ", expiryDate="
				+ expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}

}
