package com.cicms.mapper;

import java.util.List;

import com.cicms.pojo.Medicinetype;

public interface MedicinetypeMapper {

	int deleteByPrimaryKey(Integer medicinetypeid);

	int insert(Medicinetype record);

	int insertSelective(Medicinetype record);

	Medicinetype selectByPrimaryKey(Integer medicinetypeid);

	int updateByPrimaryKeySelective(Medicinetype record);

	int updateByPrimaryKey(Medicinetype record);

	List<Medicinetype> getMedicineTypeList();
}