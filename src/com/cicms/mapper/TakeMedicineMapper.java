package com.cicms.mapper;

import com.cicms.pojo.TakeMedicine;
import com.cicms.pojo.TakeMedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeMedicineMapper {
    int countByExample(TakeMedicineExample example);

    int deleteByExample(TakeMedicineExample example);

    int deleteByPrimaryKey(String takeno);

    int insert(TakeMedicine record);

    int insertSelective(TakeMedicine record);

    List<TakeMedicine> selectByExample(TakeMedicineExample example);

    TakeMedicine selectByPrimaryKey(String takeno);

    int updateByExampleSelective(@Param("record") TakeMedicine record, @Param("example") TakeMedicineExample example);

    int updateByExample(@Param("record") TakeMedicine record, @Param("example") TakeMedicineExample example);

    int updateByPrimaryKeySelective(TakeMedicine record);

    int updateByPrimaryKey(TakeMedicine record);
}