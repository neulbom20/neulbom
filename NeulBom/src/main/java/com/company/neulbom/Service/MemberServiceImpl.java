package com.company.neulbom.Service;

import java.util.HashMap;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import com.company.neulbom.Domain.MemberVO;
import com.company.neulbom.Persistence.MemberMapper;




@Service("MemberServiceImpl")
public class MemberServiceImpl implements MemberService {

@Resource(name="sqlSession")
private SqlSession sqlSession;
//	@Override
//	public MemberVO getMember() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//회원가입(MemberService에 있는 메소드)
public int insertMember(MemberVO mv) {
	//System.out.println("sqlSession:"+sqlSession);
	
	//System.out.println("getMember_id:"+mv.getMember_id());
	HashMap<String,Object> map = new  HashMap<String,Object>(); 


	map.put("member_id",mv.getMember_id());
	map.put("member_password",mv.getMember_password());
	map.put("member_name",mv.getMember_name());
	map.put("member_birth",mv.getMember_birth());
	map.put("member_addr",mv.getMember_addr());
	map.put("member_phone",mv.getMember_phone());
	map.put("member_date",mv.getMember_date());

	MemberMapper mm =  sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
	//System.out.println("mm:"+mm);
	
	//i nsertMember는 마이바티스에 있는 메소드
	int rrd =mm.insertMember(map);

	
	return rrd;
}







//
//	@Override
//	public int modifyMember() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int deleteMember() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//////로그인
	@Override
	public MemberVO MemberLoginCheck(String member_id, String member_password) {
	
		HashMap<String,Object> map = new  HashMap<String,Object>(); 
		map.put("member_id", member_id);
		map.put("member_password", member_password);

		MemberMapper mm = sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
		System.out.println("mm:"+mm);
		
		MemberVO mv = mm.MemberLoginCheck(map);
		
		
		
		return mv;
		}
////					
////
////	}
//	@Override
//	public MemberVO MemberLoginCheck(String member_idx, String member_password) {
//		// TODO Auto-generated method stub
//		return null;
//	}



//
//
//@Override
//public MemberVO getMember() {
//	// TODO Auto-generated method stub
//	return null;
//}
//
@Override
public int modifyMember(MemberVO mv) {
	//System.out.println("getMember_idx:"+mv.getMember_idx());

	HashMap<String,Object> map = new  HashMap<String,Object>();
	map.put("member_idx",mv.getMember_idx());
	map.put("member_id",mv.getMember_id());
	map.put("member_password",mv.getMember_password());
	map.put("member_name",mv.getMember_name());
	map.put("member_birth",mv.getMember_birth());
	map.put("member_addr",mv.getMember_addr());
	map.put("member_phone",mv.getMember_phone());
	map.put("member_modifydate",mv.getMember_modifydate());
	
	MemberMapper mm =  sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
	System.out.println("mm:"+mm);

//	//i nsertMember는 마이바티스에 있는 메소드
	
	int rrd =mm.modifyMember(map);

	return rrd;
	
	
}
	
	
	


//
@Override
public int deleteMember(MemberVO mv) {
	HashMap<String,Object> map = new  HashMap<String,Object>();
	map.put("member_idx",mv.getMember_idx());
	map.put("member_password",mv.getMember_password());


	
	MemberMapper mm =  sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
	//System.out.println("mm:"+mm);

//	//i nsertMember는 마이바티스에 있는 메소드
	
	int rrd =mm.deleteMember(map);

	return rrd;
}
//
//@Override
//public MemberVO MemberLoginCheck(String member_idx, String member_password) {
//	// TODO Auto-generated method stub
//	return null;
//}
//


//
//
//


//
//
public MemberVO getMember(int Membe_idx) {

	MemberMapper mm =  sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);	
	MemberVO mv = mm.getMember(Membe_idx);

	return mv;
}






//id찾기
@Override
public MemberVO MemberId(String member_name, String member_phone) {

	
	HashMap<String,Object> map = new  HashMap<String,Object>(); 
	map.put("member_name",member_name);
	map.put("member_phone",member_phone);

	MemberMapper mm = sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
	System.out.println("mm:"+mm);
	
	MemberVO mv = mm.MemberId(map);

	
	
	return mv;

}





//비밀번호찾기
public MemberVO MemberPassword(String member_id, String member_name, String member_phone) {
//	
	//System.out.println("member_name:"+member_name);
//	//System.out.println("member_phone:"+member_phone);
//	
	HashMap<String,Object> map = new  HashMap<String,Object>(); 
	map.put("member_id",member_id);
	map.put("member_name",member_name);
	map.put("member_phone",member_phone);

	MemberMapper mm = sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);
	System.out.println("mm:"+mm);
//	
	MemberVO mv = mm.MemberPassword(map);
//
//	
	return mv;
//	
}






//중복체크 
@Override
public int MemberCheck(String member_id) {
	System.out.println("member_id:"+member_id);
	HashMap<String,Object> map = new  HashMap<String,Object>(); 
	map.put("member_id",member_id);
	MemberMapper mm = sqlSession.getMapper(com.company.neulbom.Persistence.MemberMapper.class);

//	
	
	int count= mm.MemberCheck(map);

	return count;
}





}
