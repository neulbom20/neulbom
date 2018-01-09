package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.ReservationVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface ReservationMapper {

	public ArrayList<ReservationVO> getReservationList(SearchCriteria scri);	
	public ReservationVO getReservation(int idx);
	public int insertReservation(HashMap<String, Object> map);
	public int modifyReservation(HashMap<String, Object> map);
	public int getCalendar();
	
}