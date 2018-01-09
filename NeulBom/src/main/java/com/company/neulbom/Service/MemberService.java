package com.company.neulbom.Service;

import com.company.neulbom.Domain.MemberVO;

public interface MemberService {
//
	public MemberVO getMember(int Membe_idx);

	public int  modifyMember(MemberVO mv);
	public int  deleteMember(MemberVO mv);
	public int insertMember(MemberVO mv);	
	public MemberVO MemberLoginCheck(String member_id, String member_password);

	public int MemberCheck(String member_id);
	public MemberVO MemberId(String member_name, String member_phone);
	public MemberVO MemberPassword(String member_id, String member_name, String member_phone);

	

	
	
	

}