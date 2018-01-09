package com.company.neulbom.Domain;

public class PhotoAlbumVO {
	
	private int photoalbum_idx;
	private int category_idx;
	private String photoalbum_title;
	private String photoalbum_content;
	private String photoalbum_writer;
	private String photoalbum_date;
	private String photoalbum_dbdate;
	private int photoalbum_hits;
	private String photoalbum_delete_yn;
	private int member_idx;
	
	public int getPhotoalbum_idx() {
		return photoalbum_idx;
	}
	public void setPhotoalbum_idx(int photoalbum_idx) {
		this.photoalbum_idx = photoalbum_idx;
	}
	public int getCategory_idx() {
		return category_idx;
	}
	public void setCategory_idx(int category_idx) {
		this.category_idx = category_idx;
	}
	public String getPhotoalbum_title() {
		return photoalbum_title;
	}
	public void setPhotoalbum_title(String photoalbum_title) {
		this.photoalbum_title = photoalbum_title;
	}
	public String getPhotoalbum_content() {
		return photoalbum_content;
	}
	public void setPhotoalbum_content(String photoalbum_content) {
		this.photoalbum_content = photoalbum_content;
	}
	public String getPhotoalbum_writer() {
		return photoalbum_writer;
	}
	public void setPhotoalbum_writer(String photoalbum_writer) {
		this.photoalbum_writer = photoalbum_writer;
	}
	public String getPhotoalbum_date() {
		return photoalbum_date;
	}
	public void setPhotoalbum_date(String photoalbum_date) {
		this.photoalbum_date = photoalbum_date;
	}
	public String getPhotoalbum_dbdate() {
		return photoalbum_dbdate;
	}
	public void setPhotoalbum_dbdate(String photoalbum_dbdate) {
		this.photoalbum_dbdate = photoalbum_dbdate;
	}
	public int getPhotoalbum_hits() {
		return photoalbum_hits;
	}
	public void setPhotoalbum_hits(int photoalbum_hits) {
		this.photoalbum_hits = photoalbum_hits;
	}
	public String getPhotoalbum_delete_yn() {
		return photoalbum_delete_yn;
	}
	public void setPhotoalbum_delete_yn(String photoalbum_delete_yn) {
		this.photoalbum_delete_yn = photoalbum_delete_yn;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	
}