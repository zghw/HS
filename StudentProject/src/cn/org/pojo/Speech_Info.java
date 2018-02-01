package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：演讲表
 * @author asus
 *
 */
public class Speech_Info {
	private Integer id;				//id
	private Integer userid;			//演讲人id
	private String title;			//标题
	private String introduction;	//介绍
	private Date startDate;			//开始时间
	private Date endDate;			//结束时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
