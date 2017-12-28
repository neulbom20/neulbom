package com.company.smnb20.Service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriComponentsBuilder;

import com.company.smnb20.Dao.BoarDao_Father_Mapper;
import com.company.smnb20.domain.BoardVo;
import com.company.smnb20.domain.Criteria;
import com.company.smnb20.domain.PageMaker;
import com.company.smnb20.domain.SearchCriteria;


@Service("boardDao_Son")
public class BoardDao_Son implements BoardDao_Father{
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public BoardVo getSelect(int bidx) {	
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);		
		BoardVo bv = bfm.getSelect(bidx);
		
		return bv;
	}	

	@Override
	public int getDelete(int bidx) {
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		int rrd = bfm.getDelete(bidx);
		
		return rrd;
	}

	@Override
	public int getUpdate(BoardVo bv) {			
		
		HashMap<String,Object> map = new  HashMap<String,Object>();
		map.put("bidx", bv.getBidx());
		map.put("subject", bv.getSubject());
		map.put("writer", bv.getWriter());
		map.put("content", bv.getContent());
		map.put("modifyday", bv.getModifyday());		
		
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		int rrd = bfm.getUpdate(map);		
		
		return rrd;
	}

	@Override
	public int getMaxBidx() {
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		int maxBidx = bfm.getMaxBidx();
		
		return maxBidx;
	}

	@Override
	public int getInsert(BoardVo bv, int maxBidxPlus) { 
				
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		
		map.put("bidx", maxBidxPlus);		
		map.put("subject", bv.getSubject());
		map.put("content",bv.getContent());
		map.put("writer",bv.getWriter());
		map.put("writeday",bv.getWriteday());
		map.put("idx", bv.getIdx());		
		
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		int rrd = bfm.getInsert(map); 
		
		return rrd;
	}

	@Override
	public ArrayList<BoardVo> getBoardList_T(SearchCriteria scri) {
		
//		System.out.println("Son¿« scri:"+scri);
//		System.out.println("scri.getKeyword():"+scri.getKeyword());
//		System.out.println("scri.getSearchType():"+scri.getSearchType());
//		System.out.println("scri.getPage():"+scri.getPage());
//		System.out.println("scri.getPerPageNum():"+scri.getPerPageNum());
		
		ArrayList<BoardVo> alist = new ArrayList<BoardVo>();
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		alist = bfm.getBoardList_T(scri);
		
		return alist;
		
	}
	@Transactional
	@Override
	public int totalRecordCount(SearchCriteria scri) {
		
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);
		int cnt = bfm.totalRecordCount(scri);
		
		return cnt;		
	}

		public int getReply(BoardVo bv, int maxBidxPlus) {
		
					 
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		
		map.put("bidx", maxBidxPlus);		
		map.put("originidx", bv.getOriginidx());
		map.put("updown", bv.getUpdown());
		map.put("leftright", bv.getLeftright());
		map.put("subject", bv.getSubject());
		map.put("content",bv.getContent());
		map.put("writer",bv.getWriter());
		map.put("writeday",bv.getWriteday());
		map.put("idx", bv.getIdx());		
		
		System.out.println("maxBidxPlus : "+maxBidxPlus);
		System.out.println("bv.getOriginidx() : "+bv.getOriginidx());		
		System.out.println(" bv.getUpdown() : "+ bv.getUpdown());		
		System.out.println("bv.getLeftright() : "+bv.getLeftright());		
		System.out.println("bv.getSubject() : "+bv.getSubject());		
		System.out.println("bv.getContent() : "+bv.getContent());		
		System.out.println("bv.getWriter() : "+bv.getWriter());		
		System.out.println("bv.getWriteday() : "+bv.getWriteday());		
		System.out.println("getIdx()Plus : "+bv.getIdx());		
		
		
		BoarDao_Father_Mapper bfm = sqlSession.getMapper(com.company.smnb20.Dao.BoarDao_Father_Mapper.class);		
		bfm.getReplyUpdate(map);
		int rrd = bfm.getReplyInsert(map);
			
		return rrd;
	}


}
