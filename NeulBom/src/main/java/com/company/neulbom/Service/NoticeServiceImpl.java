package com.company.neulbom.Service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.company.neulbom.Domain.NoticeVO;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Persistence.NoticeMapper;

@Service("NoticeServiceImpl")
public class NoticeServiceImpl implements NoticeService{
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;

	@Override
	public ArrayList<NoticeVO> getNoticeList(SearchCriteria scri) {
		
        //System.out.println("getNoticeList의 sqlSession:"+sqlSession);
        
		ArrayList<NoticeVO> list = new ArrayList<NoticeVO>();
		
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);
		//System.out.println("getNoticeList의 nm:"+nm);
		
		list = nm.getNoticeList(scri);
		//System.out.println("getNoticeList의 list:"+list);
		
		return list;
	}

	@Override
	public NoticeVO getNotice(int notice_idx) {
		
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);
		//System.out.println("getNotice의 nm:"+nm);
		
		NoticeVO nv = nm.getNotice(notice_idx);
		//System.out.println("getNotice의 nv:"+nv);
		
		return nv;
	}

	@Override
	public int writeNotice(NoticeVO nv) {
		
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
			
		map.put("notice_title", nv.getNotice_title());
		map.put("notice_content",nv.getNotice_content());
		map.put("notice_writer",nv.getNotice_writer());
		map.put("notice_date",nv.getNotice_date());
		map.put("notice_hits;", nv.getNotice_hits());	
		
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);
		//System.out.println("writeNotice의 nm:"+nm);
		
		int rrd = nm.writeNotice(map); 
		//System.out.println("writeNotice의 rrd:"+rrd);
		
		return rrd;
	}
	
	@Override
	public int modifyNotice(NoticeVO nv) {
		 
		HashMap<String,Object> map = new  HashMap<String,Object>();
		
		map.put("notice_title", nv.getNotice_title());
		map.put("notice_content",nv.getNotice_content());
		map.put("notice_writer",nv.getNotice_writer());
		map.put("notice_date",nv.getNotice_date());	
		
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);
		int rrd = nm.modifyNotice(map);		
		
		return rrd;
	}

	@Override
	public int deleteNotice(int notice_idx) {
 
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);		
		int rrd = nm.deleteNotice(notice_idx);
		
		return rrd;
	}

	@Override
	public int totalRecordCount(SearchCriteria scri) {
		
		NoticeMapper nm = sqlSession.getMapper(com.company.neulbom.Persistence.NoticeMapper.class);
	    //System.out.println("totalRecordCount의 nm:"+nm);
		
		int cnt = nm.totalRecordCount(scri);
		//System.out.println("totalRecordCount의 cnt:"+cnt);
		
		return cnt;	
	}
}