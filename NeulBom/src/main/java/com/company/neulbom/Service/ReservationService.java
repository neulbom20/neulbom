package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.ReservationVO;

public interface ReservationService {

	public ArrayList<ReservationVO> getReservationList();	
	public ReservationVO getReservation(int idx);
	public int insertReservation(ReservationVO rsv);
	public int modifyReservation(ReservationVO rsv);
	public int getCalendar();
	
}