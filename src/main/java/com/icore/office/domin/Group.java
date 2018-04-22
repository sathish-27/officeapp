package com.icore.office.domin;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "groups")
public class Group {
	

	public Group() {
		super();
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "group_id", length = 11)
	private Integer groupId;

	@Column(name = "group_name", length = 75, nullable = false)
	private String groupName;
	
	@Column(name = "group_code", length = 75, nullable = false)
	private String groupCode;

	@Column(name = "created_by", length = 11, nullable = true)
	private Integer createdBy;

	@Column(name = "updated_by", length = 11, nullable = true)
	private Integer updatedBy;

	@Column(name = "effective_date", nullable = false)
	private Date effectiveDate;

	@Column(name = "expiry_date", nullable = true)
	private Date expiryDate;
	

	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	
	
	public Group(Integer groupId, String groupName, String groupCode, Integer createdBy, Integer updatedBy,
			Date effectiveDate, Date expiryDate, Date updatedDate, Date createdDate) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupCode = groupCode;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
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



	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
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
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", groupCode=" + groupCode + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", effectiveDate=" + effectiveDate + ", expiryDate="
				+ expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}



}
