package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.BoardVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface BoardMapper {

	public ArrayList<BoardVO> getBoardList(SearchCriteria scri);	
	public BoardVO getBoard(int board_idx);
	public int writeBoard(HashMap<String, Object> map);
	public int modifyBoard(HashMap<String, Object> map);
	public int deleteBoard(int board_idx);
	public int totalRecordCount(SearchCriteria scri);
	
}