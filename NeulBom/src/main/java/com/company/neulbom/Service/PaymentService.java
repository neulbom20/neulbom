package com.company.neulbom.Service;

import java.util.ArrayList;

import com.company.neulbom.Domain.PaymentVO;

public interface PaymentService {

	public ArrayList<PaymentVO> getPaymentList();	
	public PaymentVO getPayment(int idx);
	public int insertpayment(PaymentVO pv);
	public int modifypayment(PaymentVO pv);
	
}