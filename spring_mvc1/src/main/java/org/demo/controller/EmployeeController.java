package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
//	String empName="Rahul";
	
	
	//@RequestParams
	//http://localhost:8080/spring_mvc1/fetch?name=rahul
	@GetMapping("/fetch")
	@ResponseBody
	public String getEmployee(
			@RequestParam(value="name",required=false)String empName,
			@RequestParam(value="age",required=false) int empage,
			@RequestParam(value="mobile",required=false)String empMobile) {
		if(empName==null && empage==0 && empMobile==null) {
			return "is not required";
			
		}
		return "Name is: "+empName + "Age: "+empage+"Mobile: "+empMobile;
	}
	
	//Pathvariable
	
	//http://localhost:8080/spring_mvc1/empdetails/Rahul/26/9876543210
	@GetMapping("/empdetails/{name}/{age}/{mobile}")
	@ResponseBody
	public String getEmployeePath(@PathVariable("name") String empName,
							   @PathVariable("age") int empage,
							   @PathVariable("mobile") String empMobile) {
		
		return "Name is: "+empName + "Age: "+empage+"Mobile: "+empMobile;
		
			
		
	}
}
	

//it is the parameterized level annotations which will fetch the data from the query parameter\

