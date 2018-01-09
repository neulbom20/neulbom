package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.RoomVO;

public interface RoomService {
	
	public ArrayList<RoomVO> getRoomList();
	public RoomVO getRoom(int idx);
	public int modifyRoom(RoomVO rv);
	
}