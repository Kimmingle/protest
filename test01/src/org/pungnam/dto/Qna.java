package org.pungnam.dto;

public class Qna {
	private int no;
	private String plevel;
	private String pno;
	private String title;
	private String content;
	private String resdate;
	private String visited;
	private String aid;
	
	
	@Override
	public String toString() {
		return "Qna [no=" + no + ", plevel=" + plevel + ", pno=" + pno + ", title=" + title + ", content=" + content
				+ ", resdate=" + resdate + ", visited=" + visited + ", aid=" + aid + "]";
	}
	public Qna(int no, String plevel, String pno, String title, String content, String resdate, String visited,
			String aid) {
		super();
		this.no = no;
		this.plevel = plevel;
		this.pno = pno;
		this.title = title;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
		this.aid = aid;
	}
	public Qna() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPlevel() {
		return plevel;
	}
	public void setPlevel(String plevel) {
		this.plevel = plevel;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
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
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public String getVisited() {
		return visited;
	}
	public void setVisited(String visited) {
		this.visited = visited;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	
	
}
