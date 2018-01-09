package com.company.neulbom.Persistence;

import java.util.HashMap;

import com.company.neulbom.Domain.MemberVO;

public interface MemberMapper {

	public MemberVO getMember(int idx);
	public int insertMember(HashMap<String, Object> map);
	public int modifyMember(HashMap<String, Object> map);
	public int deleteMember(int idx);
	public MemberVO checkLogin();
	
}