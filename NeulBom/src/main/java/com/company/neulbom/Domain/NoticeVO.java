package com.company.neulbom.Domain;

public class NoticeVO {
	
	private int notice_idx;
	private int category_idx;
	private String notice_title;
	private String notice_content;
	private String notice_writer;
	private String notice_date;
	private String notice_dbdate;
	private int notice_hits;
	private String notice_delete_yn;
	private int member_idx;
	
	public int getNotice_idx() {
		return notice_idx;
	}
	public void setNotice_idx(int notice_idx) {
		this.notice_idx = notice_idx;
	}
	public int getCategory_idx() {
		return category_idx;
	}
	public void setCategory_idx(int category_idx) {
		this.category_idx = category_idx;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_writer() {
		return notice_writer;
	}
	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}
	public String getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}
	public String getNotice_dbdate() {
		return notice_dbdate;
	}
	public void setNotice_dbdate(String notice_dbdate) {
		this.notice_dbdate = notice_dbdate;
	}
	public int getNotice_hits() {
		return notice_hits;
	}
	public void setNotice_hits(int notice_hits) {
		this.notice_hits = notice_hits;
	}
	public String getNotice_delete_yn() {
		return notice_delete_yn;
	}
	public void setNotice_delete_yn(String notice_delete_yn) {
		this.notice_delete_yn = notice_delete_yn;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	
}