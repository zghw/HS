package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：晚自习情况表
 * @author asus
 *
 */
public class Self_Study {
	private Integer id;				//id
	private Integer classId;		//班级id
	private Integer should_num;		//应到人数
	private Integer actual_number;	//实际到的人数
	private Integer phone_num;		//手机提交人数
	private Integer user_yiid;		//检查人一
	private Integer user_erid;		//检查人二
	private Integer user_sanid;		//检查人三
	private Integer dress_num;		//未着装情况人数
	private Date dateinfo;			//检查时间
	private Integer sum;			//扣分
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Integer getShould_num() {
		return should_num;
	}
	public void setShould_num(Integer should_num) {
		this.should_num = should_num;
	}
	public Integer getActual_number() {
		return actual_number;
	}
	public void setActual_number(Integer actual_number) {
		this.actual_number = actual_number;
	}
	public Integer getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(Integer phone_num) {
		this.phone_num = phone_num;
	}
	public Integer getUser_yiid() {
		return user_yiid;
	}
	public void setUser_yiid(Integer user_yiid) {
		this.user_yiid = user_yiid;
	}
	public Integer getUser_erid() {
		return user_erid;
	}
	public void setUser_erid(Integer user_erid) {
		this.user_erid = user_erid;
	}
	public Integer getUser_sanid() {
		return user_sanid;
	}
	public void setUser_sanid(Integer user_sanid) {
		this.user_sanid = user_sanid;
	}
	public Integer getDress_num() {
		return dress_num;
	}
	public void setDress_num(Integer dress_num) {
		this.dress_num = dress_num;
	}
	public Date getDateinfo() {
		return dateinfo;
	}
	public void setDateinfo(Date dateinfo) {
		this.dateinfo = dateinfo;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
}
