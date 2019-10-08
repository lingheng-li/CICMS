package com.cicms.controller;

/*
 * 2019年9月26日 @CH
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cicms.pojo.Medicine;
import com.cicms.pojo.Medicinemadein;
import com.cicms.pojo.Medicinetype;
import com.cicms.service.MedicineService;

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

	@RequestMapping("/getMedicineById")
	@ResponseBody
	public Medicine getMedicineById(@RequestBody String medicineno) {
		return medicineService.getMedicineById(medicineno);
	}

	@RequestMapping("/deleteMedicineById")
	@ResponseBody
	public int deleteMedicineById(@RequestBody String medicineno) {
		return medicineService.deleteMedicineById(medicineno);
	}

	@RequestMapping("/batchDel")
	@ResponseBody
	public int batchDel(@RequestBody String medicinenos) {
		String[] ids = medicinenos.split(",");
		int success = medicineService.batchDel(ids);
		return success == ids.length ? 1 : 0;
	}

	@RequestMapping("/updateMedicine")
	@ResponseBody
	public int updateMedicine(@RequestBody Medicine medicine) {
		return medicineService.updateMedicine(medicine);
	}

	@RequestMapping("/addMedicine")
	@ResponseBody
	public int addMedicine(@RequestBody Medicine addMedicine) {
		System.out.println(addMedicine);
		int f = medicineService.addMedicine(addMedicine);
		System.out.println("数据库返回：" + f);
		return f;
	}

	@RequestMapping("/getMedicineTypeList")
	@ResponseBody
	public List<Medicinetype> getMedicineTypeList() {
		return medicineService.getMedicineTypeList();
	}

	@RequestMapping("/getMedicineMadeInList")
	@ResponseBody
	public List<Medicinemadein> getMedicineMadeInList() {
		return medicineService.getMedicineMadeInList();
	}
	
	@RequestMapping("/getMedicineNoList")
	@ResponseBody
	public List<String> getMedicineNoList(){
		return medicineService.getMedicineNoList();
	}

}
