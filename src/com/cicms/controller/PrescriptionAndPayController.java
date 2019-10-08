package com.cicms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cicms.pojo.Payment;
import com.cicms.pojo.Prescription;
import com.cicms.service.MedicineService;
import com.cicms.service.PaymentService;
import com.cicms.service.PrescriptionService;
import com.cicms.service.TakeMedicineService;
import com.cicms.vo.PrescriptionVo;

@Controller
@RequestMapping("/")
public class PrescriptionAndPayController {
	@Autowired
	private PrescriptionService prescriptionService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private MedicineService medicineService;
	@Autowired
	private TakeMedicineService takeMedicineService;
	
	@RequestMapping("/create")
	public ModelAndView CreatePrescription(){
		ModelAndView mav = new ModelAndView();
		PrescriptionVo prescriptionVo=new PrescriptionVo();
		String prescriptionno= "C-"+System.currentTimeMillis();
		prescriptionVo.setPrescriptionno(prescriptionno);
		prescriptionVo.setPatientno("1231131");
		prescriptionVo.setPatientname("王五");
		mav.addObject("prescriptionVo",prescriptionVo);
		mav.setViewName("page/prescription/prescription.jsp");
		return mav;
	}
	
	@RequestMapping("/savePrescAndPaymen")
	@ResponseBody
	public PrescriptionVo CreatePaymen(@RequestBody PrescriptionVo prescriptionVo){
		paymentService.addPay(prescriptionVo);
		for (Prescription prescription : prescriptionVo.getPrescriptionList()) {
			prescriptionService.AddPres(prescription);
		}
		return prescriptionVo;
	}
	
	@RequestMapping("/payList")
	@ResponseBody
	public List<Payment> payList(){
		List<Payment> payList = paymentService.findPay();
		return payList;
	}
	
	@RequestMapping("/payShow")
	public ModelAndView payShow(String payno){
		ModelAndView mav = new ModelAndView();
		Payment payment = paymentService.findByPayNo(payno);
		List<Prescription> preList=prescriptionService.findByPrescriptionno(payment.getPrescriptionno());
		mav.addObject("payment",payment);
		mav.addObject("preList",preList);
		mav.setViewName("page/pay/payMent.jsp");
		return mav;
	}
	
	@RequestMapping("/updatePaymen")
	@ResponseBody
	public String updatePayment(@RequestBody Payment payment){
		paymentService.update(payment);
		takeMedicineService.createTeakMedicine(payment.getPrescriptionno(),payment.getPayno());
		return "1";
	}
}
