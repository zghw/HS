package cn.org.pojo;

import java.util.Date;

/**
 * 新闻信息表
 * @author asus
 *
 */
public class News_Info {
	private Integer news_id;			//新闻id
	private String news_title;			//新闻标题
	private Integer user_id;			//创建新闻用户id
	private String content;				//内容
	private Date creation_time;			//创建时间
	private Integer department_id;		//创建部门id
	private Integer IS_Picture;			//是否有图片
	public Integer getNews_id() {
		return news_id;
	}
	public void setNews_id(Integer news_id) {
		this.news_id = news_id;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public Integer getIS_Picture() {
		return IS_Picture;
	}
	public void setIS_Picture(Integer iS_Picture) {
		IS_Picture = iS_Picture;
	}
	
}
