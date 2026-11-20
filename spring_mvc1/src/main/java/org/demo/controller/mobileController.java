package org.demo.controller;

import org.demo.entity.Mobile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mobileController {
	@GetMapping("/getForm")
	@ResponseBody
	public String getform() {
		return "Registration form...!"+
	
				"<form action=getMobile method=post>"+
				"<table cellspacing=5 cellspacing=5>"+
				
				"<tr>"+
				"<th>"+"ID"+"</th>"+
				"<td>"+"<input type=number name=id>"+"</td>"+
				"</tr>"+
				
				"<tr>"+
					"<th>"+"Name"+"</th>"+
					"<td>"+"<input type=text name=name>"+"</td>"+
					"</tr>"+
						
				"<tr>"+
				"<th>"+"Price"+"</th>"+
				"<td>"+"<input type=text name=price>"+"</td>"+
				"</tr>"+
				
			"<tr>"+
			"<th>"+"Color"+"</th>"+
			"<td>"+"<input type=text name=color>"+"</td>"+
			"</tr>"+
			
		"<tr>"+
			"<th>"+"Model"+"</th>"+
				"<td>"+"<input type=text name=model>"+"</td>"+
					"</tr>"+
				
					
	
		"<tr>"+
		"<th>"+"Processor"+"</th>"+
		"<td>"+"<input type=text name=processor>"+"</td>"+
		"</tr>"+
					
	"<tr>"+
		"<th>"+"Rom"+"</th>"+
		"<td>"+"<input type=text name=rom>"+"</td>"+
		"</tr>"+
		
		
	"<tr>"+
	"<td>"+"<input type=submit value=submit>"+"<td>"+
	"<tr>"+
	
		
		"</table>"+
		"</form>";
		
		
				
	}
	

	@PostMapping("/getMobile")
	@ResponseBody
	public String getMobile(@ModelAttribute Mobile mobile) {
		return "<table border=2 cellspacing=10 cellpadding=10>"+
				"<th>"+"ID"+"</th>"+
				"<th>"+"Name"+"</th>"+
				"<th>"+"Price"+"</th>"+
				"<th>"+"Color"+"</th>"+
				"<th>"+"Model"+"</th>"+
				"<th>"+"Processor"+"</th>"+
				"<th>"+"Rom"+"</th>"+
				"</tr>"+
		"<tr>"+
		"<th>"+mobile.getId()+"</th>"+
		"<th>"+ mobile.getName()+"</th>"+
		"<th>"+mobile.getPrice()+"</th>"+
		"<th>"+mobile.getColor()+"</th>"+
		"<th>"+mobile.getModel()+"</th>"+
		"<th>"+mobile.getProcessor()+"</th>"+
		"<th>"+mobile.getRom()+"</th>"+
		"<tr>"+
		"</table>";
		
				
		
	}
}