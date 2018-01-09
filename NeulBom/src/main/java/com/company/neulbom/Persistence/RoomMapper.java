package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.RoomVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface RoomMapper {

	public ArrayList<RoomVO> getRoomList(SearchCriteria scri);
	public RoomVO getRoom(int idx);
	public int modifyRoom(HashMap<String, Object> map);
	
}