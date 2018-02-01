package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：广播信息安排表
 * @author asus
 *
 */
public class Broadcast_arrangement {
	private Integer id;				//id
	private Integer user_id;		//安排的用户ID
	private Date create_datetime;	//创建时间
	private Date startDate;			//创建期开始时间
	private Date endDate;			//创建期结束时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Date getCreate_datetime() {
		return create_datetime;
	}
	public void setCreate_datetime(Date create_datetime) {
		this.create_datetime = create_datetime;
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
