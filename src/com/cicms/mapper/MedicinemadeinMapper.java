package com.cicms.mapper;

import java.util.List;

import com.cicms.pojo.Medicinemadein;

public interface MedicinemadeinMapper {

	int deleteByPrimaryKey(Integer medicinemadeinid);

	int insert(Medicinemadein record);

	int insertSelective(Medicinemadein record);

	Medicinemadein selectByPrimaryKey(Integer medicinemadeinid);

	int updateByPrimaryKeySelective(Medicinemadein record);

	int updateByPrimaryKey(Medicinemadein record);

	List<Medicinemadein> getMedicineMadeInList();
}