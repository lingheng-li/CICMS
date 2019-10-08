package com.cicms.mapper;

import java.util.List;

import com.cicms.pojo.Medicine;
import com.cicms.pojo.Medicinetype;

public interface MedicineMapper {

	int deleteByPrimaryKey(String medicineno);

	int insert(Medicine record);

	int insertSelective(Medicine record);

	List<Medicine> selectAllMedicine();

	Medicine selectByPrimaryKey(String medicineno);

	int updateByPrimaryKeySelective(Medicine record);

	int updateByPrimaryKey(Medicine record);

	List<String> getMedicineNoList();

}