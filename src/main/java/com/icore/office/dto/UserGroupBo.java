package com.icore.office.dto;

public class UserGroupBo {

	private Integer userGroupId;
	private GroupBo grpBo;
	
	public UserGroupBo(Integer userGroupId, GroupBo grpBo) {
		super();
		this.userGroupId = userGroupId;
		this.grpBo = grpBo;
	}

	public UserGroupBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}

	public GroupBo getGrpBo() {
		return grpBo;
	}

	public void setGrpBo(GroupBo grpBo) {
		this.grpBo = grpBo;
	}

	@Override
	public String toString() {
		return "UserGroupBo [userGroupId=" + userGroupId + ", grpBo=" + grpBo + "]";
	}
	
	
}
