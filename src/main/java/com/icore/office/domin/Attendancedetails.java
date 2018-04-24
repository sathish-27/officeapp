package com.icore.office.domin;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="attendancedetails")
public class Attendancedetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Attendance_Details_Id", nullable = false, unique = true, length = 11)
	private Integer AttendanceDetailsId;

	@Column(name = "Date_of_Day", nullable = false)
	private Date Date_of_Day;
	
	@Column(name = "PresentAbsent", nullable = false)
	private Boolean PresentAbsent;
	
	@Column(name = "entry_time", nullable = false)
	private Date EntryTime;
	
	@Column(name = "exit_time", nullable = false)
	private Date ExitTime;
	
	@Column(name = "over_time", nullable = false)
	private Date OverTime;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public Attendancedetails(Integer attendanceDetailsId, Date date_of_Day, Boolean presentAbsent, Date entryTime,
			Date exitTime, Date overTime, User user) {
		super();
		AttendanceDetailsId = attendanceDetailsId;
		Date_of_Day = date_of_Day;
		PresentAbsent = presentAbsent;
		EntryTime = entryTime;
		ExitTime = exitTime;
		OverTime = overTime;
		this.user = user;
	}

	public Attendancedetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAttendanceDetailsId() {
		return AttendanceDetailsId;
	}

	public void setAttendanceDetailsId(Integer attendanceDetailsId) {
		AttendanceDetailsId = attendanceDetailsId;
	}

	public Date getDate_of_Day() {
		return Date_of_Day;
	}

	public void setDate_of_Day(Date date_of_Day) {
		Date_of_Day = date_of_Day;
	}

	public Boolean getPresentAbsent() {
		return PresentAbsent;
	}

	public void setPresentAbsent(Boolean presentAbsent) {
		PresentAbsent = presentAbsent;
	}

	public Date getEntryTime() {
		return EntryTime;
	}

	public void setEntryTime(Date entryTime) {
		EntryTime = entryTime;
	}

	public Date getExitTime() {
		return ExitTime;
	}

	public void setExitTime(Date exitTime) {
		ExitTime = exitTime;
	}

	public Date getOverTime() {
		return OverTime;
	}

	public void setOverTime(Date overTime) {
		OverTime = overTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Attendancedetails [AttendanceDetailsId=" + AttendanceDetailsId + ", Date_of_Day=" + Date_of_Day
				+ ", PresentAbsent=" + PresentAbsent + ", EntryTime=" + EntryTime + ", ExitTime=" + ExitTime
				+ ", OverTime=" + OverTime + ", user=" + user + "]";
	}

	
	
}
