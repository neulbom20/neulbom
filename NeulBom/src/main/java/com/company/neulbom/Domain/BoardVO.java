package com.company.neulbom.Domain;

public class BoardVO {
	
	private int board_idx;
	private int category_idx;
	private String board_title;
	private String board_content;
	private String board_writer;
	private String board_date;
	private String board_dbdate;
	private int board_hits;
	private String board_delete_yn;
	private int member_idx;
	
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public int getCategory_idx() {
		return category_idx;
	}
	public void setCategory_idx(int category_idx) {
		this.category_idx = category_idx;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getBoard_dbdate() {
		return board_dbdate;
	}
	public void setBoard_dbdate(String board_dbdate) {
		this.board_dbdate = board_dbdate;
	}
	public int getBoard_hits() {
		return board_hits;
	}
	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}
	public String getBoard_delete_yn() {
		return board_delete_yn;
	}
	public void setBoard_delete_yn(String board_delete_yn) {
		this.board_delete_yn = board_delete_yn;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	
}