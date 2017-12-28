package com.company.smnb20.Dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.smnb20.domain.SearchCriteria;
import com.company.smnb20.domain.BoardVo;
import com.company.smnb20.domain.Criteria;
import com.company.smnb20.domain.PageMaker;

public interface BoarDao_Father_Mapper {
	
	public BoardVo getSelect(int bidx);	
	public int getDelete(int bidx);
	public int getUpdate(HashMap<String, Object> map);
	public int getMaxBidx();
	public int getInsert(HashMap<String, Object> map);
	public ArrayList<BoardVo> getBoardList_T(SearchCriteria scri);
	public int totalRecordCount(SearchCriteria scri);
	public int getReplyInsert(HashMap<String, Object> map);
	public int getReplyUpdate(HashMap<String, Object> map);
	}
