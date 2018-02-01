package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：请假信息表
 * @author asus
 *
 */
public class Leave {
	private Integer id;				//id
	private Date leave_date_Start;  //请假开始时间
	private Integer user_id;		//请假人
	private String reason;			//理由
	private Integer agree;			//是否同意
	private Integer audit_user;		//审核人
	private Date leave_date_End;	//请假结束时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getLeave_date_Start() {
		return leave_date_Start;
	}
	public void setLeave_date_Start(Date leave_date_Start) {
		this.leave_date_Start = leave_date_Start;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getAgree() {
		return agree;
	}
	public void setAgree(Integer agree) {
		this.agree = agree;
	}
	public Integer getAudit_user() {
		return audit_user;
	}
	public void setAudit_user(Integer audit_user) {
		this.audit_user = audit_user;
	}
	public Date getLeave_date_End() {
		return leave_date_End;
	}
	public void setLeave_date_End(Date leave_date_End) {
		this.leave_date_End = leave_date_End;
	}
	
}
