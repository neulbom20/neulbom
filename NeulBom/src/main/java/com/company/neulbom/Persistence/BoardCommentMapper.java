package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.BoardCommentVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface BoardCommentMapper {
	
	public  ArrayList<BoardCommentVO> getSelect(SearchCriteria scri);	
	public int insertBoardComment(HashMap<String, Object> map);
	public int deleteBoardComment(int idx);
	
}