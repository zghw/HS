package cn.org.pojo;

/**
 * 实体类：部门表
 * @author asus
 *
 */
public class Department {
	private Integer department_id;		//部门ID
	private String department_name;		//部门名称
	private String brief_introduction;	//部门简介
	private String Declaration;			//部门宣言
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getBrief_introduction() {
		return brief_introduction;
	}
	public void setBrief_introduction(String brief_introduction) {
		this.brief_introduction = brief_introduction;
	}
	public String getDeclaration() {
		return Declaration;
	}
	public void setDeclaration(String declaration) {
		Declaration = declaration;
	}
	
}
