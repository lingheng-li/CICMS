package com.cicms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cicms.pojo.Medicine;
import com.cicms.pojo.MedicineExample;

public interface MedicineMapper {
    int countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int deleteByPrimaryKey(String medicineno);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExample(MedicineExample example);

    Medicine selectByPrimaryKey(String medicineno);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}