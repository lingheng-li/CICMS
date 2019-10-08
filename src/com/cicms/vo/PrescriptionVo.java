package com.cicms.vo;

import java.util.List;

import com.cicms.pojo.Patient;
import com.cicms.pojo.Prescription;

public class PrescriptionVo {
	private String prescriptionno;
	private String patientno;
	private String patientname;
	private List<Prescription> prescriptionList;
	
	public String getPrescriptionno() {
		return prescriptionno;
	}
	public void setPrescriptionno(String prescriptionno) {
		this.prescriptionno = prescriptionno;
	}
	public List<Prescription> getPrescriptionList() {
		return prescriptionList;
	}
	public void setPrescriptionList(List<Prescription> prescriptionList) {
		this.prescriptionList = prescriptionList;
	}
	public String getPatientno() {
		return patientno;
	}
	public void setPatientno(String patientno) {
		this.patientno = patientno;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
}
