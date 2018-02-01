package cn.org.pojo;

/**
 * 实体类：新闻图片表
 * @author asus
 *
 */
public class News_Picture {
	private Integer news_Picture_id;		//新闻图片id
	private Integer news_id;				//新闻id
	private String path;					//图片路径
	public Integer getNews_Picture_id() {
		return news_Picture_id;
	}
	public void setNews_Picture_id(Integer news_Picture_id) {
		this.news_Picture_id = news_Picture_id;
	}
	public Integer getNews_id() {
		return news_id;
	}
	public void setNews_id(Integer news_id) {
		this.news_id = news_id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
