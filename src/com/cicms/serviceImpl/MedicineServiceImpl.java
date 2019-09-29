package com.cicms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.MedicineMapper;
import com.cicms.mapper.MedicinemadeinMapper;
import com.cicms.mapper.MedicinetypeMapper;
import com.cicms.pojo.Medicine;
import com.cicms.pojo.Medicinemadein;
import com.cicms.pojo.Medicinetype;
import com.cicms.service.MedicineService;

/*
 * 2019年9月26日 @CH
 */

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineMapper medicineMapper;

	@Autowired
	private MedicinetypeMapper medicinetypeMapper;

	@Autowired
	private MedicinemadeinMapper medicinemadeinMapper;

	@Override
	public List<Medicine> getAllMedicine() {
		return medicineMapper.selectAllMedicine();
	}

	@Override
	public int addMedicine(Medicine medicine) {
		return medicineMapper.insert(medicine);
	}

	@Override
	public List<Medicinetype> getMedicineTypeList() {
		return medicinetypeMapper.getMedicineTypeList();
	}

	@Override
	public List<Medicinemadein> getMedicineMadeInList() {
		return medicinemadeinMapper.getMedicineMadeInList();
	}

	@Override
	public Medicine getMedicineById(String medicineno) {
		return medicineMapper.selectByPrimaryKey(medicineno);
	}

	@Override
	public int updateMedicine(Medicine updateMedicine) {
		return medicineMapper.updateByPrimaryKey(updateMedicine);
	}

}
