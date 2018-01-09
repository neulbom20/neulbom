package com.company.neulbom.Domain;

public class BoardCommentVO {
	
	private int board_comment_idx;
	private int board_idx;
	private String board_comment_title;
	private String board_comment_content;
	private String board_comment_writer;
	private String board_comment_date;
	private String board_comment_dbdate;
	private String board_comment_delete_yn;
	private int member_idx;
	
	public int getBoard_comment_idx() {
		return board_comment_idx;
	}
	public void setBoard_comment_idx(int board_comment_idx) {
		this.board_comment_idx = board_comment_idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public String getBoard_comment_title() {
		return board_comment_title;
	}
	public void setBoard_comment_title(String board_comment_title) {
		this.board_comment_title = board_comment_title;
	}
	public String getBoard_comment_content() {
		return board_comment_content;
	}
	public void setBoard_comment_content(String board_comment_content) {
		this.board_comment_content = board_comment_content;
	}
	public String getBoard_comment_writer() {
		return board_comment_writer;
	}
	public void setBoard_comment_writer(String board_comment_writer) {
		this.board_comment_writer = board_comment_writer;
	}
	public String getBoard_comment_date() {
		return board_comment_date;
	}
	public void setBoard_comment_date(String board_comment_date) {
		this.board_comment_date = board_comment_date;
	}
	public String getBoard_comment_dbdate() {
		return board_comment_dbdate;
	}
	public void setBoard_comment_dbdate(String board_comment_dbdate) {
		this.board_comment_dbdate = board_comment_dbdate;
	}
	public String getBoard_comment_delete_yn() {
		return board_comment_delete_yn;
	}
	public void setBoard_comment_delete_yn(String board_comment_delete_yn) {
		this.board_comment_delete_yn = board_comment_delete_yn;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}

}