package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：广播安排详细信息表
 * @author asus
 *
 */
public class Broadcast_Arrangement_Info {
	private Integer id;						//id
	private Integer user_yix;				//广播员一
	private Integer user_erx;				//广播员二
	private Integer user_yiy;				//广播员一工作状态
	private Integer user_ery;				//广播员二工作状态
	private Date datetime_info;				//工作时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_yix() {
		return user_yix;
	}
	public void setUser_yix(Integer user_yix) {
		this.user_yix = user_yix;
	}
	public Integer getUser_erx() {
		return user_erx;
	}
	public void setUser_erx(Integer user_erx) {
		this.user_erx = user_erx;
	}
	public Integer getUser_yiy() {
		return user_yiy;
	}
	public void setUser_yiy(Integer user_yiy) {
		this.user_yiy = user_yiy;
	}
	public Integer getUser_ery() {
		return user_ery;
	}
	public void setUser_ery(Integer user_ery) {
		this.user_ery = user_ery;
	}
	public Date getDatetime_info() {
		return datetime_info;
	}
	public void setDatetime_info(Date datetime_info) {
		this.datetime_info = datetime_info;
	}
	
}
