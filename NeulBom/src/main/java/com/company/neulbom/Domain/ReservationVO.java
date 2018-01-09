package com.company.neulbom.Domain;

public class ReservationVO {
	
	private int reservation_idx;
	private String reservation_stay_date;
	private String reservation_checkin_date;
	private String reservation_checkout_date;
	private String reservation_dbdate;
	private int member_idx;
	private int room_idx;
	
	public int getReservation_idx() {
		return reservation_idx;
	}
	public void setReservation_idx(int reservation_idx) {
		this.reservation_idx = reservation_idx;
	}
	public String getReservation_stay_date() {
		return reservation_stay_date;
	}
	public void setReservation_stay_date(String reservation_stay_date) {
		this.reservation_stay_date = reservation_stay_date;
	}
	public String getReservation_checkin_date() {
		return reservation_checkin_date;
	}
	public void setReservation_checkin_date(String reservation_checkin_date) {
		this.reservation_checkin_date = reservation_checkin_date;
	}
	public String getReservation_checkout_date() {
		return reservation_checkout_date;
	}
	public void setReservation_checkout_date(String reservation_checkout_date) {
		this.reservation_checkout_date = reservation_checkout_date;
	}
	public String getReservation_dbdate() {
		return reservation_dbdate;
	}
	public void setReservation_dbdate(String reservation_dbdate) {
		this.reservation_dbdate = reservation_dbdate;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
	}
	
}