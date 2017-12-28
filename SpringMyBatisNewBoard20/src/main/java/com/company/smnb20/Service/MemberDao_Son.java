package com.company.smnb20.Service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.smnb20.Dao.Member_Father_Mapper;
import com.company.smnb20.domain.MemberVo;

@Service("memberDao_Son")
public class MemberDao_Son implements MemberDao_Father{
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public MemberVo MemberLoginCheck(String id, String password) {
		
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		
		map.put("id", id);
		map.put("password", password);

		Member_Father_Mapper mfm = sqlSession.getMapper(com.company.smnb20.Dao.Member_Father_Mapper.class);
		
		MemberVo mv = mfm.MemberLoginCheck(map);
		
		return mv;
				
	}

}
