package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：公告表（学员）
 * @author asus
 *
 */
public class Announcement {
	private Integer id;  					//主键
	private String announcement_title;  	//公告标题
	private String content;  				//公告内容
	private Date createDate;  				//公告创建日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnnouncement_title() {
		return announcement_title;
	}
	public void setAnnouncement_title(String announcement_title) {
		this.announcement_title = announcement_title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
