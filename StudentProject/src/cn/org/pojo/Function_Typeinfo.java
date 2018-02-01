package cn.org.pojo;

/**
 * 实体类：申请功能类型表
 * @author asus
 *
 */
public class Function_Typeinfo {
	private Integer id;				//id
	private String function_type;	//申请功能描述
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFunction_type() {
		return function_type;
	}
	public void setFunction_type(String function_type) {
		this.function_type = function_type;
	}
	
}
