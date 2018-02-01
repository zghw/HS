package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：新闻评论信息表
 * @author asus
 *
 */
public class News_Comment {
	private Integer comment_id;			//评论id
	private String content;				//评论内容
	private Integer news_id;			//新闻id
	private Date create_date;			//创建时间
	private Integer user_id;			//评论用户id
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getNews_id() {
		return news_id;
	}
	public void setNews_id(Integer news_id) {
		this.news_id = news_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}
