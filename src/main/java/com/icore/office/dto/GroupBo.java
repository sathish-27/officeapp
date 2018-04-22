package com.icore.office.dto;

import java.util.Date;

public class GroupBo {

	private Integer groupId;
	private String groupName;
	private String groupCode;
	private Integer createdBy;
	private Integer updatedBy;
	private Date effectiveDate;
	private Date expiryDate;
	private Date updatedDate;
	private Date createdDate;

	public GroupBo() {
		super();
	}

	public GroupBo(Integer groupId, String groupName, String groupCode) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupCode = groupCode;
	}

	
	
	public GroupBo(Integer groupId, String groupName, String groupCode, Integer createdBy, Integer updatedBy,
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

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
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

	@Override
	public String toString() {
		return "GroupBo [groupId=" + groupId + ", groupName=" + groupName + ", groupCode=" + groupCode + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", effectiveDate=" + effectiveDate + ", expiryDate="
				+ expiryDate + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}

}
