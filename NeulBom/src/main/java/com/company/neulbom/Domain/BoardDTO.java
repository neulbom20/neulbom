package com.company.neulbom.Domain;

public class BoardDTO {
	
	private String board_title;
	private String board_content;
	private String board_date;
	private String board_writer;
	private String board_delete_yn;
	private String board_comment_title;
	private String board_comment_content;
	private String board_comment_writer;
	private String board_comment_date;
	private String board_comment_delete_yn;
	private int member_idx;
	private int board_idx;
	private int board_hits;
	private int board_comment_idx;

	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
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
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_delete_yn() {
		return board_delete_yn;
	}
	public void setBoard_delete_yn(String board_delete_yn) {
		this.board_delete_yn = board_delete_yn;
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
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public int getBoard_hits() {
		return board_hits;
	}
	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}
	public int getBoard_comment_idx() {
		return board_comment_idx;
	}
	public void setBoard_comment_idx(int board_comment_idx) {
		this.board_comment_idx = board_comment_idx;
	}
}