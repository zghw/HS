package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：部门公告信息表
 * @author asus
 *
 */
public class Department_Announcement {
	private Integer id;					//ID
	private Date department_date;		//公告发布时间
	private String department_info;		//公告信息
	private Integer department_id;		//部门ID
	private Integer user_id;			//发布人ID
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDepartment_date() {
		return department_date;
	}
	public void setDepartment_date(Date department_date) {
		this.department_date = department_date;
	}
	public String getDepartment_info() {
		return department_info;
	}
	public void setDepartment_info(String department_info) {
		this.department_info = department_info;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}
