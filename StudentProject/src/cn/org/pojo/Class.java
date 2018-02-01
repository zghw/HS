package cn.org.pojo;
/**
 * 实体类：班级表
 * @author asus
 *
 */
public class Class {
	private Integer class_id;			//班级ID
	private String class_name;			//班级名称
	private Integer class_Fraction;		//班级分数
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getClass_Fraction() {
		return class_Fraction;
	}
	public void setClass_Fraction(Integer class_Fraction) {
		this.class_Fraction = class_Fraction;
	}
}
