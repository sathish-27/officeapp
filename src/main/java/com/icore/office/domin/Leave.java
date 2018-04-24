package com.icore.office.domin;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="leave")
public class Leave {

	@Id
	@Column(name="leave_id",nullable = false, unique = true, length = 11)
	private Integer LeaveId;
	
	@Column(name="month_of_month",nullable=false)
	private Date month;
	
	@Column(name="total_leave",nullable=false,length=3)
	private Integer TotalLeave;
	
	@Column(name="taken_leave",nullable=false,length=3)
	private Integer TakenLeave;
	
	@Column(name="remaining_leave",nullable=false,length=3)
	private Integer RemainingLeave;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leave(Integer leaveId, Date month, Integer totalLeave, Integer takenLeave, Integer remainingLeave,
			User user) {
		super();
		LeaveId = leaveId;
		this.month = month;
		TotalLeave = totalLeave;
		TakenLeave = takenLeave;
		RemainingLeave = remainingLeave;
		this.user = user;
	}

	public Integer getLeaveId() {
		return LeaveId;
	}

	public void setLeaveId(Integer leaveId) {
		LeaveId = leaveId;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getTotalLeave() {
		return TotalLeave;
	}

	public void setTotalLeave(Integer totalLeave) {
		TotalLeave = totalLeave;
	}

	public Integer getTakenLeave() {
		return TakenLeave;
	}

	public void setTakenLeave(Integer takenLeave) {
		TakenLeave = takenLeave;
	}

	public Integer getRemainingLeave() {
		return RemainingLeave;
	}

	public void setRemainingLeave(Integer remainingLeave) {
		RemainingLeave = remainingLeave;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Leave [LeaveId=" + LeaveId + ", month=" + month + ", TotalLeave=" + TotalLeave + ", TakenLeave="
				+ TakenLeave + ", RemainingLeave=" + RemainingLeave + ", user=" + user + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
