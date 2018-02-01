package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：班委部班级情况报告表
 * @author asus
 *
 */
public class Class_Report {
	private Integer id;			//id
	private Integer class_id;	//班级ID
	private Integer user_id;	//报告人ID
	private String situation;	//报告情况
	private Date createDate;	//报告日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
