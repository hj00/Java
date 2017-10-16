package board.model;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

public class BoardVO {
	private long no;
	private String name;
	private String title;
	private String content;
	private String pwd;
	private Date lagdate;
	private int view_count;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = DigestUtils.sha512Hex(pwd);
	}
	public Date getLagdate() {
		return lagdate;
	}
	public void setLagdate(Date lagdate) {
		this.lagdate = lagdate;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", name=" + name + ", title=" + title + ", content=" + content + ", pwd=" + pwd
				+ ", lagdate=" + lagdate + ", view_count=" + view_count + "]";
	}
	

}
