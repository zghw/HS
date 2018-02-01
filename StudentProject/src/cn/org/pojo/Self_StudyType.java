package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：晚自习分配表
 * @author asus
 *
 */
public class Self_StudyType {
	private Integer id;				//id
	private Integer user_id;		//创建人id
	private Date createdate;		//创建时间
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
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}
