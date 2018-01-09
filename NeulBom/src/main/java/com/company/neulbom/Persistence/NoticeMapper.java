package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.NoticeVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface NoticeMapper {

	public ArrayList<NoticeVO> getNoticeList(SearchCriteria scri);	
	public NoticeVO getNotice(int notice_idx);
	public int writeNotice(HashMap<String, Object> map);
	public int modifyNotice(HashMap<String, Object> map);
	public int deleteNotice(int notice_idx);
	public int totalRecordCount(SearchCriteria scri);

}