package com.company.neulbom.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.company.neulbom.Domain.PaymentVO;
import com.company.neulbom.Domain.SearchCriteria;

public interface PaymentMapper {

	public ArrayList<PaymentVO> getPaymentList(SearchCriteria scri);	
	public PaymentVO getPayment(int idx);
	public int insertpayment(HashMap<String, Object> map);
	public int modifypayment(HashMap<String, Object> map);

}