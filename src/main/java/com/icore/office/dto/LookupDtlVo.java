package com.icore.office.dto;

import java.util.Date;

public class LookupDtlVo {

	
	private Integer lookupDetailId;

	private String detailCode;
	private String detailDescription;
	private String dtlCode1;
	private String dtlCode2;
	private Integer parentId;
	private Integer hierarchyLevel;
	private Integer sequenceNo;
	private Date effectiveDate;
	private Date expiryDate;
	private Integer lookupGroupId;
	private String lookupGroupCode;
	private String lookupGroupDescription;
	private String parentName;
	private String dtlCode3;
	private String dtlCode4;
	private String dtlCode5;
	public LookupDtlVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LookupDtlVo(Integer lookupDetailId, String detailCode, String detailDescription, String dtlCode1,
			String dtlCode2, Integer parentId, Integer hierarchyLevel, Integer sequenceNo, Date effectiveDate,
			Date expiryDate, Integer lookupGroupId, String lookupGroupCode, String lookupGroupDescription,
			String parentName, String dtlCode3, String dtlCode4, String dtlCode5) {
		super();
		this.lookupDetailId = lookupDetailId;
		this.detailCode = detailCode;
		this.detailDescription = detailDescription;
		this.dtlCode1 = dtlCode1;
		this.dtlCode2 = dtlCode2;
		this.parentId = parentId;
		this.hierarchyLevel = hierarchyLevel;
		this.sequenceNo = sequenceNo;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.lookupGroupId = lookupGroupId;
		this.lookupGroupCode = lookupGroupCode;
		this.lookupGroupDescription = lookupGroupDescription;
		this.parentName = parentName;
		this.dtlCode3 = dtlCode3;
		this.dtlCode4 = dtlCode4;
		this.dtlCode5 = dtlCode5;
	}
	public Integer getLookupDetailId() {
		return lookupDetailId;
	}
	public void setLookupDetailId(Integer lookupDetailId) {
		this.lookupDetailId = lookupDetailId;
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
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
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
		return "LookupDtlVo [lookupDetailId=" + lookupDetailId + ", detailCode=" + detailCode + ", detailDescription="
				+ detailDescription + ", dtlCode1=" + dtlCode1 + ", dtlCode2=" + dtlCode2 + ", parentId=" + parentId
				+ ", hierarchyLevel=" + hierarchyLevel + ", sequenceNo=" + sequenceNo + ", effectiveDate="
				+ effectiveDate + ", expiryDate=" + expiryDate + ", lookupGroupId=" + lookupGroupId
				+ ", lookupGroupCode=" + lookupGroupCode + ", lookupGroupDescription=" + lookupGroupDescription
				+ ", parentName=" + parentName + ", dtlCode3=" + dtlCode3 + ", dtlCode4=" + dtlCode4 + ", dtlCode5="
				+ dtlCode5 + "]";
	}
	
	
	
	
}
