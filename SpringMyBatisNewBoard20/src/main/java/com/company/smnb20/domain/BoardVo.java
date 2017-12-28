package com.company.smnb20.domain;

import org.springframework.stereotype.Repository;

@Repository
public class BoardVo {
	private String subject;
	private String writer;
	private String writeday;
	private String content;
	private String modifyday;
	private int bidx;
	private int idx;
	private int originidx;
	private int updown;
	private int leftright;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getModifyday() {
		return modifyday;
	}
	public void setModifyday(String modifyday) {
		this.modifyday = modifyday;
	}
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getOriginidx() {
		return originidx;
	}
	public void setOriginidx(int originidx) {
		this.originidx = originidx;
	}
	public int getUpdown() {
		return updown;
	}
	public void setUpdown(int updown) {
		this.updown = updown;
	}
	public int getLeftright() {
		return leftright;
	}
	public void setLeftright(int leftright) {
		this.leftright = leftright;
	}
	
	
	
}
