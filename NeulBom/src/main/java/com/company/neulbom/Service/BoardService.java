package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.BoardVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface BoardService {

	public ArrayList<BoardVO> getBoardList(SearchCriteria scri);	
	public BoardVO getBoard(int board_idx);
	public int writeBoard(BoardVO bv);
	public int modifyBoard(BoardVO bv);
	public int deleteBoard(int board_idx);
	public int totalRecordCount(SearchCriteria scri);
	
}