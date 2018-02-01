package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：早迎详细信息表
 * @author asus
 *
 */
public class Early_Greetinginfo {
	private Integer id;			//ID
	private Integer user_yix;	//早迎人一id
	private Integer user_erx;	//早迎人二id
	private Integer user_sanx;	//早迎人三id
	private Integer user_yiy;	//早迎人一工作状态 1为正常完成早迎 2为迟到  3为缺勤
	private Integer user_ery;	//早迎人二工作状态
	private Integer user_sany;	//早迎人三工作状态
	private Date dateinfo;		//早迎时间
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
	public Integer getUser_sanx() {
		return user_sanx;
	}
	public void setUser_sanx(Integer user_sanx) {
		this.user_sanx = user_sanx;
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
	public Integer getUser_sany() {
		return user_sany;
	}
	public void setUser_sany(Integer user_sany) {
		this.user_sany = user_sany;
	}
	public Date getDateinfo() {
		return dateinfo;
	}
	public void setDateinfo(Date dateinfo) {
		this.dateinfo = dateinfo;
	}
	
}
