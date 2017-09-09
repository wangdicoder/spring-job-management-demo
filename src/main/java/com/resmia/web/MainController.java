package com.resmia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/active-jobs")
	public String activeJobPage() {
		return "active-jobs";
	}
	
	@RequestMapping(value="/draft-jobs")
	public String draftJobPage() {
		return "draft-jobs";
	}
	
	@RequestMapping(value="/expired-jobs")
	public String expiredJobPage() {
		return "expired-jobs";
	}
	
	@RequestMapping(value="/new-job")
	public String newJobPage() {
		return "new-job";
	}
}
