package com.company.smnb20.Service;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.smnb20.domain.BoardVo;
import com.company.smnb20.domain.Criteria;
import com.company.smnb20.domain.MemberVo;
import com.company.smnb20.domain.PageMaker;
import com.company.smnb20.domain.SearchCriteria;

public interface MemberDao_Father {
	
	public MemberVo MemberLoginCheck(String id, String password);
		
		
}
