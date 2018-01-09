package com.company.neulbom.Service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.company.neulbom.Domain.BoardVO;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Persistence.BoardMapper;

@Service("BoardServiceImpl")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;

	@Override
	public ArrayList<BoardVO> getBoardList(SearchCriteria scri) {
		
//		System.out.println("BoardServiceImpl의 sqlSession:"+sqlSession);
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);
		list = bm.getBoardList(scri);
		
//		System.out.println("BoardServiceImpl의 alist:"+list);
		
		return list;
	}

	@Override
	public BoardVO getBoard(int board_idx) {

		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);
		//System.out.println("BoardServiceImpl의 bm:"+bm);
		
		BoardVO bv = bm.getBoard(board_idx);
		//System.out.println("BoardServiceImpl의 bv:"+bv);
		
		return bv;
	}

	@Override
	public int writeBoard(BoardVO bv) {

		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		
		map.put("board_title", bv.getBoard_title());
		map.put("board_content",bv.getBoard_content());
		map.put("board_writer",bv.getBoard_writer());
		map.put("board_date",bv.getBoard_date());
		map.put("board_hits;", bv.getBoard_hits());		
		
		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);
		int rrd = bm.writeBoard(map); 
		
		return rrd;
	}

	@Override
	public int modifyBoard(BoardVO bv) {
		
		HashMap<String,Object> map = new  HashMap<String,Object>();
		
		map.put("board_title", bv.getBoard_title());
		map.put("board_content",bv.getBoard_content());
		map.put("board_writer",bv.getBoard_writer());
		map.put("board_date",bv.getBoard_date());		
		
		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);
		int rrd = bm.modifyBoard(map);		
		
		return rrd;
   }

	@Override
	public int deleteBoard(int board_idx) {
		
		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);		
		int rrd = bm.deleteBoard(board_idx);
		
		return rrd;
	}
	
	@Override
	public int totalRecordCount(SearchCriteria scri) {
		
		BoardMapper bm = sqlSession.getMapper(com.company.neulbom.Persistence.BoardMapper.class);
		//System.out.println("BoardServiceImpl의 bm:"+bm);
		
		int cnt = bm.totalRecordCount(scri);
		//System.out.println("BoardServiceImpl의 cnt:"+cnt);
		
		return cnt;	
	}
}