package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Employee;
import com.cg.service.IEmployeeService;

@Controller
public class MyController {

	@Autowired
	IEmployeeService employeeservice;

/*
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public  String updateEmployee(){
		return "update";
	}*/

	@RequestMapping(value = "dosearch", method = RequestMethod.GET)
	public ModelAndView searchEmployee(@RequestParam("eid") int id) {
		Employee employee = employeeservice.searchEmployee(id);

		return new ModelAndView("searchone", "temp", employee);

	}
	
	
	
	
	@RequestMapping(value = "doupdate", method = RequestMethod.GET)
	public ModelAndView updateSearch(@RequestParam("eid") int id,
			 @ModelAttribute("mys") Employee emp,Map<String, Object> model) {
		Employee employee= employeeservice.searchEmployee(id);
		if (employee!=null) {
			List<String> myDeg = new ArrayList<>();
			myDeg.add("SoftWare Engg");
			myDeg.add("Sr Consoltant");
			myDeg.add("Manager");
			model.put("deg", myDeg);
			return new ModelAndView("updateemployee","temp",employee);
		} else{
		return new ModelAndView("updateerror", "emp", id);
		}
	}


	//@RequestMapping(value = "updatedata", method = RequestMethod.POST)

	@RequestMapping(value = "updatedata", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@Valid@ModelAttribute("mys") Employee emp,BindingResult result,Map<String, Object> model) {
	boolean res=false;
		if (result.hasErrors()) {
			List<String> myDeg = new ArrayList<>();
			myDeg.add("SoftWare Engg");
			myDeg.add("Sr Consoltant");
			myDeg.add("Manager");
			model.put("deg", myDeg);
			return new ModelAndView("updateemployee");
		} else{
			
			res=employeeservice.updateEmployee(emp);
		}
		if(res==true){
		return new ModelAndView("updatesuccess", "temp", emp);
		}else{
			return new ModelAndView("updateerror", "edata", emp);
		}
	}



	

	// search one employee
@RequestMapping(value = "search", method = RequestMethod.GET)
	public String employeeSearch() {
		return "searchemp";

	}


}
