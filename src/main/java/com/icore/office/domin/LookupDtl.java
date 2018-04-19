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
@Table(name = "lookup_dtl")
public class LookupDtl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lookup_dtl_id  ", unique = true, length = 11, nullable = false)
	private Integer lookupDtlId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lookup_group_id")
	private LookupGroup lookupGroup;

	@Column(name = "dtl_cd", length = 30, nullable = false)
	private String detailCode;

	@Column(name = "dtl_desc", length = 50, nullable = false)
	private String detailDescription;

	@Column(name = "dtl_cd1", length = 30, nullable = true)
	private String dtlCode1;

	@Column(name = "dtl_cd2", length = 30, nullable = true)
	private String dtlCode2;

	@Column(name = "parent_id", length = 11, nullable = true)
	private Integer parentId;

	@Column(name = "hierarchy_level", length = 11, nullable = true)
	private Integer hierarchyLevel;

	@Column(name = "sequence_no", length = 11, nullable = true)
	private Integer sequenceNo;

	@Column(name = "effective_date", nullable = false)
	private Date effectiveDate;

	@Column(name = "expiry_date", nullable = true)
	private Date expiryDate;

	@Column(name = "dtl_cd3", length = 30, nullable = true)
	private String dtlCode3;

	@Column(name = "dtl_cd4", length = 30, nullable = true)
	private String dtlCode4;

	@Column(name = "dtl_cd5", length = 30, nullable = true)
	private String dtlCode5;

	public LookupDtl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LookupDtl(Integer lookupDtlId, LookupGroup lookupGroup, String detailCode, String detailDescription,
			String dtlCode1, String dtlCode2, Integer parentId, Integer hierarchyLevel, Integer sequenceNo,
			Date effectiveDate, Date expiryDate, String dtlCode3, String dtlCode4, String dtlCode5) {
		super();
		this.lookupDtlId = lookupDtlId;
		this.lookupGroup = lookupGroup;
		this.detailCode = detailCode;
		this.detailDescription = detailDescription;
		this.dtlCode1 = dtlCode1;
		this.dtlCode2 = dtlCode2;
		this.parentId = parentId;
		this.hierarchyLevel = hierarchyLevel;
		this.sequenceNo = sequenceNo;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.dtlCode3 = dtlCode3;
		this.dtlCode4 = dtlCode4;
		this.dtlCode5 = dtlCode5;
	}

	public Integer getLookupDtlId() {
		return lookupDtlId;
	}

	public void setLookupDtlId(Integer lookupDtlId) {
		this.lookupDtlId = lookupDtlId;
	}

	public LookupGroup getLookupGroup() {
		return lookupGroup;
	}

	public void setLookupGroup(LookupGroup lookupGroup) {
		this.lookupGroup = lookupGroup;
	}

	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public String getDtlCode1() {
		return dtlCode1;
	}

	public void setDtlCode1(String dtlCode1) {
		this.dtlCode1 = dtlCode1;
	}

	public String getDtlCode2() {
		return dtlCode2;
	}

	public void setDtlCode2(String dtlCode2) {
		this.dtlCode2 = dtlCode2;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getHierarchyLevel() {
		return hierarchyLevel;
	}

	public void setHierarchyLevel(Integer hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
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

	public String getDtlCode3() {
		return dtlCode3;
	}

	public void setDtlCode3(String dtlCode3) {
		this.dtlCode3 = dtlCode3;
	}

	public String getDtlCode4() {
		return dtlCode4;
	}

	public void setDtlCode4(String dtlCode4) {
		this.dtlCode4 = dtlCode4;
	}

	public String getDtlCode5() {
		return dtlCode5;
	}

	public void setDtlCode5(String dtlCode5) {
		this.dtlCode5 = dtlCode5;
	}

	@Override
	public String toString() {
		return "LookupDtl [lookupDtlId=" + lookupDtlId + ", lookupGroup=" + lookupGroup + ", detailCode=" + detailCode
				+ ", detailDescription=" + detailDescription + ", dtlCode1=" + dtlCode1 + ", dtlCode2=" + dtlCode2
				+ ", parentId=" + parentId + ", hierarchyLevel=" + hierarchyLevel + ", sequenceNo=" + sequenceNo
				+ ", effectiveDate=" + effectiveDate + ", expiryDate=" + expiryDate + ", dtlCode3=" + dtlCode3
				+ ", dtlCode4=" + dtlCode4 + ", dtlCode5=" + dtlCode5 + "]";
	}

}
