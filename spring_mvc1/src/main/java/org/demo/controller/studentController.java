package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentController {
//	@RequestMapping(value="/fetch",method=RequestMethod.GET)
	@GetMapping("/students")
	@ResponseBody
	public String getStudent() {
		
		
//		return "Fetching Student details";
		String name="Chaithra";
		String email="chaithra@gmail.com";
		String mobile="9945291421";
		String pass="chaithra@123";
		String addres="beengaluru";
		String gender="F";
		
		return "<table border=2 cellpadding=5,cellspacing=5>"+
				"<tr>"+
				"<th>"+"Name"+"<th>"+
				"<th>"+"Email"+"<th>"+
				"<th>"+"Mobile"+"<th>"+
				"<th>"+"Password"+"<th>"+
				"<th>"+"Address"+"<th>"+
				"<th>"+"Gender"+"<th>"+
				"</tr>"+
				
				"<tr>"+
					"<th>"+name+"<th>"+
					"<th>"+email+"<th>"+
					"<th>"+mobile+"<th>"+
					"<th>"+pass+"<th>"+
					"<th>"+addres+"<th>"+
					"<th>"+gender+"<th>"+
					
				"</tr>"+
					
				
					
					"</table>";			
		
	}
	
	
//	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	@PostMapping("/students")
	@ResponseBody
	public String insertStudent() {
		return "Data inserted successfuly";
	}
	
	
	
//	@RequestMapping(value="/update" , method=RequestMethod.PUT)
	@PutMapping("/students")
	@ResponseBody
	public String updateStudent() {
		return "Student updated successfully";
	}
	
//	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	@DeleteMapping("/students")
	@ResponseBody
	public String deleteStudent()
	{
		return "Student deleted successfully";
	}
	
	
	

}
