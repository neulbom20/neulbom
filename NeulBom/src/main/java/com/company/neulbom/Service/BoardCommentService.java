package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.BoardCommentVO;

public interface BoardCommentService {

	public ArrayList<BoardCommentVO> getSelect();	
	public int insertBoardComment(BoardCommentVO bcv);
	public int deleteBoardComment(int idx);
	
}