package com.icore.office.domin;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lookup_group")
public class LookupGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lookup_group_id", unique = true, length = 11, nullable = false)
	private Integer lookupGroupId;

	@Column(name = "lookup_group_cd", length = 30, nullable = false)
	private String lookupGroupCode;

	@Column(name = "lookup_group_desc", length = 50, nullable = false)
	private String lookupGroupDescription;

	@Column(name = "created_by", length = 11, nullable = true)
	private Integer createdBy;

	@Column(name = "updated_by", length = 11, nullable = true)
	private Integer updatedBy;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	@Column(name = "updated_date", nullable = true)
	private Date updatedDate;

	@OneToMany(orphanRemoval = true, mappedBy = "lookupGroup")
	private Set<LookupDtl> lookupDetails;

	public LookupGroup() {
		super();
	}

	public LookupGroup(Integer lookupGroupId, String lookupGroupCode, String lookupGroupDescription, Integer createdBy,
			Integer updatedBy, Date createdDate, Date updatedDate, Set<LookupDtl> lookupDetails) {
		super();
		this.lookupGroupId = lookupGroupId;
		this.lookupGroupCode = lookupGroupCode;
		this.lookupGroupDescription = lookupGroupDescription;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.lookupDetails = lookupDetails;
	}

	public Set<LookupDtl> getLookupDetails() {
		return lookupDetails;
	}

	public void setLookUpDetails(Set<LookupDtl> lookupDetails) {
		this.lookupDetails = lookupDetails;
	}

	public Integer getLookupGroupId() {
		return lookupGroupId;
	}

	public void setLookupGroupId(Integer lookupGroupId) {
		this.lookupGroupId = lookupGroupId;
	}

	public String getLookupGroupCode() {
		return lookupGroupCode;
	}

	public void setLookupGroupCode(String lookupGroupCode) {
		this.lookupGroupCode = lookupGroupCode;
	}

	public String getLookupGroupDescription() {
		return lookupGroupDescription;
	}

	public void setLookupGroupDescription(String lookupGroupDescription) {
		this.lookupGroupDescription = lookupGroupDescription;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "LookupGroup [lookupGroupId=" + lookupGroupId + ", lookupGroupCode=" + lookupGroupCode
				+ ", lookupGroupDescription=" + lookupGroupDescription + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", lookupDetails="
				+ lookupDetails + "]";
	}



}