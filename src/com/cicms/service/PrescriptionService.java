package com.cicms.service;

import java.util.List;

import com.cicms.pojo.Prescription;

public interface PrescriptionService {

	void AddPres(Prescription prescription);

	List<Prescription> findByPrescriptionno(String prescriptionno);

}
