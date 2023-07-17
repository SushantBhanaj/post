package com.marketingappdaru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {

	@RequestMapping("/nasedaru")
	public String viewLead() {
		return "create_Lead";
	}
	
}
