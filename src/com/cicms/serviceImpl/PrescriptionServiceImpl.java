package com.cicms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.PrescriptionMapper;
import com.cicms.pojo.Prescription;
import com.cicms.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
	@Autowired
	private PrescriptionMapper prescriptionMapper;

	@Override
	public void AddPres(Prescription prescription) {
		prescriptionMapper.insertSelective(prescription);
	}

	@Override
	public List<Prescription> findByPrescriptionno(String prescriptionno) {
		List<Prescription> presList=prescriptionMapper.selectByPrescriptionno(prescriptionno);
		return presList;
	}
}
