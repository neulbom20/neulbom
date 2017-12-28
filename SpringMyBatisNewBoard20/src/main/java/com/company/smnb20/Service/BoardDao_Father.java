package com.company.smnb20.Service;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.smnb20.domain.BoardVo;
import com.company.smnb20.domain.Criteria;
import com.company.smnb20.domain.PageMaker;
import com.company.smnb20.domain.SearchCriteria;

public interface BoardDao_Father {
	
	public BoardVo getSelect(int bidx);	
	public int getDelete(int bidx);
	public int getUpdate(BoardVo bv);
	public int getMaxBidx();
	public int getInsert(BoardVo bv, int maxBidxPlus);
	public ArrayList<BoardVo> getBoardList_T(SearchCriteria scri);
	public int totalRecordCount(SearchCriteria scri);
	public int getReply(BoardVo bv, int maxBidxPlus);
		
}
