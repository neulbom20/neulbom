package com.company.neulbom.Domain;

public class PaymentVO {
	
	private int payment_idx;
	private String payment_total;
	private String payment_state;
	private String payment_deposit;
	private String payment_refund;
	private String payment_apply_date;
	private String payment_finish_date;
	private String payment_approve_date;
	private String payment_dbdate;
	private int member_idx;
	private int reservation_idx;
	
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
	public String getPayment_approve_date() {
		return payment_approve_date;
	}
	public void setPayment_approve_date(String payment_approve_date) {
		this.payment_approve_date = payment_approve_date;
	}
	public String getPayment_dbdate() {
		return payment_dbdate;
	}
	public void setPayment_dbdate(String payment_dbdate) {
		this.payment_dbdate = payment_dbdate;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public int getReservation_idx() {
		return reservation_idx;
	}
	public void setReservation_idx(int reservation_idx) {
		this.reservation_idx = reservation_idx;
	}
	
}