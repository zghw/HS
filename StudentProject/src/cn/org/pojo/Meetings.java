package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：会议记录表
 * @author asus
 *
 */
public class Meetings {
	private Integer id;				//id
	private Date meetingsDate;		//会议时间
	private String purpose;			//目的
	private String process;			//过程
	private String plan;			//计划
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMeetingsDate() {
		return meetingsDate;
	}
	public void setMeetingsDate(Date meetingsDate) {
		this.meetingsDate = meetingsDate;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
}
