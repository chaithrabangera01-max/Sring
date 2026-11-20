package org.demo.controller;

import org.demo.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
	@GetMapping("/getForm1")
	@ResponseBody
	public String getForm() {
		
		return"Banking"+
	"<form action=getAccount method=post>"+
	"<table cellspacing=5 cellpadding=5>"+
	"<tr>"+
	
	"<th>"+"Id"+"</th>"+
	"<td>"+
	"<input type=number name=id>"+
	"</td>"+
	"</tr>"+
	"<tr>"+
	
	"<th>"+"Account Name"+"</th>"+
	"<td>"+
	"<input type=text name=accname>"+
	"</td>"+
	"</tr>"+
	
	"<tr>"+
	"<th>"+"Balance"+"</th>"+
	"<td>"+
	"<input type=number name=balance>"+
	"</td>"+
	"</tr>"+
	
	
	"<tr>"+
	"<th>"+"Deposit Amount"+"</th>"+
	"<td>"+
	"<input type=number name=depositamt>"+
	"</td>"+
	"</tr>"+
	
	"<tr>"+
	"<th>"+"Transaction Id"+"</th>"+
	"<td>"+
	"<input type=number name=tid>"+
	"</td>"+
	"</tr>"+
	
	"<tr>"+
	"<th>"+"Branch"+"</th>"+
	"<td>"+
	"<input type=text name=branch>"+
	"</td>"+
	"</tr>"+
	"<tr>"+
	
	"<th>"+"Account Type"+"</th>"+
	"<td>"+
	"<input type=text name=type>"+
	"</td>"+
	"</tr>"+
	
	"<tr>"+
	"<td>"+"<input type=submit value=submit>"+
	"</td>"+
	"</tr>"+
	"</table>"
	+"</form>";	
		
	}
	@PostMapping("/getAccount")
	@ResponseBody
	public String getAccount(@ModelAttribute Account account) {
		return "<table border=2 cellspacing=10 cellpadding=10>"+
	    "<tr>"+
		"<th>"+"Id"+"</th>"+
		"<th>"+"Account Name"+"</th>"+
		"<th>"+"Balance"+"</th>"+
		"<th>"+"Deposit Amount"+"</th>"+
		"<th>"+"Transaction Id"+"</th>"+
		"<th>"+"Branch"+"</th>"+
		"<th>"+"Account Type"+"</th>"+
		"</tr>"+
		
		"<tr>"+
		"<th>"+account.getId()+"</th>"+
		"<th>"+account.getAccname()+"</th>"+
		"<th>"+account.getBalance()+"</th>"+
		"<th>"+account.getDepositamt()+"</th>"+
		"<th>"+account.getTid()+"</th>"+
		"<th>"+account.getBranch()+"</th>"+
		"<th>"+account.getType()+"</th>"+
		"</tr>"+
		"</table>";
	}
	
	}