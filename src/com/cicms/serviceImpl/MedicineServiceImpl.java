package com.cicms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.MedicineMapper;
import com.cicms.pojo.Medicine;
import com.cicms.service.MedicineService;

/*
 * 2019年9月26日 @CH
 */

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineMapper medicineMapper;

	@Override
	public List<Medicine> getAllMedicine() {
		return medicineMapper.selectAllMedicine();
	}

}
