package com.cicms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.TakeMedicineMapper;
import com.cicms.pojo.TakeMedicine;
import com.cicms.service.TakeMedicineService;

@Service
public class TakeMedicineServiceImpl implements TakeMedicineService{
	@Autowired
	private TakeMedicineMapper takeMedicineMapper;

	@Override
	public void createTeakMedicine(String prescriptionno, String payno) {
		TakeMedicine takeMedicine = new TakeMedicine();
		takeMedicine.setPayno(payno);
		takeMedicine.setPrescriptionno(prescriptionno);
		takeMedicine.setTakeno("T-"+System.currentTimeMillis());
		takeMedicine.setTaketype(0);
		takeMedicineMapper.insert(takeMedicine);
	}
}
