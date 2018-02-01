package cn.org.pojo;

import java.util.Date;

/**
 * 早迎分配表
 * @author asus
 *
 */
public class Distribution_Early_Greeting {
	private Integer id;						//ID
	private Integer user_id;				//分配人ID
	private Date dateinfo;					//创建时间
	private Date startDate;					//分配开始时间
	private Date endDate;					//分配结束时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Date getDateinfo() {
		return dateinfo;
	}
	public void setDateinfo(Date dateinfo) {
		this.dateinfo = dateinfo;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
