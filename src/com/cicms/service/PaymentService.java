package com.cicms.service;

import java.util.List;

import com.cicms.pojo.Payment;
import com.cicms.vo.PrescriptionVo;

public interface PaymentService {

	void addPay(PrescriptionVo prescriptionVo);

	List<Payment> findPay();

	void update(Payment payment);

	Payment findByPayNo(String payno);

}
