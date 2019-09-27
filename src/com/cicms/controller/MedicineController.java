package com.cicms.controller;

/*
 * 2019年9月26日 @CH
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cicms.pojo.Medicine;
import com.cicms.service.MedicineService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@RequestMapping("/medicineList")
	@ResponseBody
	public List<Medicine> medicineList() {
		List<Medicine> list = medicineService.getAllMedicine();
		return list;
	}

}
