package cn.org.pojo;

/**
 * 实体类：权限表
 * @author asus
 *
 */
public class Permissions {
	private Integer permissions_id;			//权限id
	private String permissions_type;		//权限类型描述
	public Integer getPermissions_id() {
		return permissions_id;
	}
	public void setPermissions_id(Integer permissions_id) {
		this.permissions_id = permissions_id;
	}
	public String getPermissions_type() {
		return permissions_type;
	}
	public void setPermissions_type(String permissions_type) {
		this.permissions_type = permissions_type;
	}
	
}
