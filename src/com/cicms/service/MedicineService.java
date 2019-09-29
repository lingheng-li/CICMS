package com.cicms.service;
/*
 * 2019年9月26日 @CH
 */

import java.util.List;

import com.cicms.pojo.Medicine;
import com.cicms.pojo.Medicinemadein;
import com.cicms.pojo.Medicinetype;

public interface MedicineService {
	List<Medicine> getAllMedicine();

	int addMedicine(Medicine medicine);

	List<Medicinetype> getMedicineTypeList();

	List<Medicinemadein> getMedicineMadeInList();

	Medicine getMedicineById(String medicineno);

	int updateMedicine(Medicine updateMedicine);
}
