package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：用户表
 * @author asus
 *
 */
public class User {
	private Integer id;				//id
	private String userpwd;			//用户密码
	private Integer roleid;			//角色id
	private Date dateofaccession;	//加入日期
	private Integer gradeid;		//年级id
	private String username;		//用户名称
	private Integer departmentid;	//部门id
	private Integer userclassid;	//用户班级id
	private Integer isitTeacher;	//是否为老师
	private Integer self_study;		//学生晚自习状态
	private Integer integral;		//用户积分
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public Date getDateofaccession() {
		return dateofaccession;
	}
	public void setDateofaccession(Date dateofaccession) {
		this.dateofaccession = dateofaccession;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer getUserclassid() {
		return userclassid;
	}
	public void setUserclassid(Integer userclassid) {
		this.userclassid = userclassid;
	}
	public Integer getIsitTeacher() {
		return isitTeacher;
	}
	public void setIsitTeacher(Integer isitTeacher) {
		this.isitTeacher = isitTeacher;
	}
	public Integer getSelf_study() {
		return self_study;
	}
	public void setSelf_study(Integer self_study) {
		this.self_study = self_study;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
}
