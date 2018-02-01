package cn.org.pojo;

/**
 * 实体类：用户拥有权限表
 * @author asus
 *
 */
public class Have_Authority {
	private Integer userid;			//用户id
	private Integer permissions_id;	//权限id
	private Integer department_id;	//部门id
	private Integer give_id;		//赋予权限的id
	private Integer id;				//拥有权限信息id
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getPermissions_id() {
		return permissions_id;
	}
	public void setPermissions_id(Integer permissions_id) {
		this.permissions_id = permissions_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public Integer getGive_id() {
		return give_id;
	}
	public void setGive_id(Integer give_id) {
		this.give_id = give_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
