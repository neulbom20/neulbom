package com.company.neulbom.Persistence;

import java.util.HashMap;

import com.company.neulbom.Domain.MemberVO;

public interface MemberMapper {

	public MemberVO getMember(int membe_idx);
	public int  insertMember(HashMap<String, Object> map);
	public int  modifyMember(HashMap<String, Object> map);
	public int  deleteMember(HashMap<String, Object> map);
	public MemberVO MemberId(HashMap<String, Object> map);
	public MemberVO MemberLoginCheck(HashMap<String, Object> map);
	public MemberVO MemberPassword(HashMap<String, Object> map);	
	public int MemberCheck(HashMap<String, Object> map);
	
	
	
	
}