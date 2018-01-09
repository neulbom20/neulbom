package com.company.neulbom.Service;

import com.company.neulbom.Domain.MemberVO;

public interface MemberService {

	public MemberVO getMember(int idx);
	public int insertMember(MemberVO mv);
	public int modifyMember(MemberVO mv);
	public int deleteMember(int idx);
	public MemberVO checkLogin();
	
}