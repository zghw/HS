package cn.org.pojo;

import java.util.Date;

/**
 * 实体类：申请详细信息表
 * @author asus
 *
 */
public class Application_Info {
	private Integer id;  				//id
	private Integer userid;  			//申请用户id
	private Integer function_id;  		//申请功能id
	private String content;  			//申请内容
	private Date createDate;  			//创建时间
	private Integer state;				//提交状态
	private Integer agree;				//是否同意
	private Date examinationDate;		//审批时间
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
	public Integer getFunction_id() {
		return function_id;
	}
	public void setFunction_id(Integer function_id) {
		this.function_id = function_id;
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
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getAgree() {
		return agree;
	}
	public void setAgree(Integer agree) {
		this.agree = agree;
	}
	public Date getExaminationDate() {
		return examinationDate;
	}
	public void setExaminationDate(Date examinationDate) {
		this.examinationDate = examinationDate;
	}
}
