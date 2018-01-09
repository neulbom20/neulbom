package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.NoticeVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface NoticeService {

	public ArrayList<NoticeVO> getNoticeList(SearchCriteria scri);	
	public NoticeVO getNotice(int notice_idx);
	public int writeNotice(NoticeVO nv);
	public int modifyNotice(NoticeVO nv);
	public int deleteNotice(int notice_idx);
	public int totalRecordCount(SearchCriteria scri);
	
}