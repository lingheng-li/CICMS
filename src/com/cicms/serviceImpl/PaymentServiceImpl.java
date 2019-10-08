package com.cicms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.PaymentMapper;
import com.cicms.pojo.Payment;
import com.cicms.pojo.Prescription;
import com.cicms.service.PaymentService;
import com.cicms.vo.PrescriptionVo;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentMapper paymentMapper;
	
	@Override
	public void addPay(PrescriptionVo prescriptionVo) {
		Payment payment = new Payment();
		payment.setPayno("D-"+System.currentTimeMillis());
		payment.setPrescriptionno(prescriptionVo.getPrescriptionno());
		payment.setPatientno(prescriptionVo.getPatientno());
		payment.setPaystatus(0);
		Double money=0.0;
		for (Prescription prescription : prescriptionVo.getPrescriptionList()) {
			money+=prescription.getMedicineprice()*prescription.getTakenum();
		}
		payment.setMoney(money);
		paymentMapper.insertSelective(payment);
	}

	@Override
	public List<Payment> findPay() {
		List<Payment> list = paymentMapper.selectByExample(null);
		return list;
	}

	@Override
	public void update(Payment payment) {
		paymentMapper.updateByPrimaryKeySelective(payment);
	}

	@Override
	public Payment findByPayNo(String payno) {
		Payment payment=paymentMapper.selectByPrimaryKey(payno);
		return payment;
	}

}
