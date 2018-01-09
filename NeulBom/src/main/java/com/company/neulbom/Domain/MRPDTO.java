package com.company.neulbom.Domain;

public class MRPDTO {
	
	private int member_idx;
	private String member_id;
	private String member_name;
	private String member_phone;
	
	private int reservation_idx;
	private String reservation_stay_date;
	private String reservation_checkin_date;
	private String reservation_checkout_date;
	private String reservation_dbdate;
	
	private int room_idx;
	private String room_name;
	private String room_pay;
	private String room_people;
	
	private int payment_idx;
	private String payment_total;
	private String payment_state;
	private String payment_deposit;
	private String payment_refund;
	private String payment_apply_date;
	private String payment_finish_date;
	private String payment_dbdate;
	
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
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
	public int getRoom_idx() {
		return room_idx;
	}
	public void setRoom_idx(int room_idx) {
		this.room_idx = room_idx;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getRoom_pay() {
		return room_pay;
	}
	public void setRoom_pay(String room_pay) {
		this.room_pay = room_pay;
	}
	public String getRoom_people() {
		return room_people;
	}
	public void setRoom_people(String room_people) {
		this.room_people = room_people;
	}
	public int getPayment_idx() {
		return payment_idx;
	}
	public void setPayment_idx(int payment_idx) {
		this.payment_idx = payment_idx;
	}
	public String getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(String payment_total) {
		this.payment_total = payment_total;
	}
	public String getPayment_state() {
		return payment_state;
	}
	public void setPayment_state(String payment_state) {
		this.payment_state = payment_state;
	}
	public String getPayment_deposit() {
		return payment_deposit;
	}
	public void setPayment_deposit(String payment_deposit) {
		this.payment_deposit = payment_deposit;
	}
	public String getPayment_refund() {
		return payment_refund;
	}
	public void setPayment_refund(String payment_refund) {
		this.payment_refund = payment_refund;
	}
	public String getPayment_apply_date() {
		return payment_apply_date;
	}
	public void setPayment_apply_date(String payment_apply_date) {
		this.payment_apply_date = payment_apply_date;
	}
	public String getPayment_finish_date() {
		return payment_finish_date;
	}
	public void setPayment_finish_date(String payment_finish_date) {
		this.payment_finish_date = payment_finish_date;
	}
	public String getPayment_dbdate() {
		return payment_dbdate;
	}
	public void setPayment_dbdate(String payment_dbdate) {
		this.payment_dbdate = payment_dbdate;
	}
}