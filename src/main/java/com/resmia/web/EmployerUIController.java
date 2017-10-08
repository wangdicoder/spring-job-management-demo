/**
 * page controller
 */
package com.resmia.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resmia.domain.Job;
import com.resmia.service.impl.JobServiceImpl;

@Controller
public class EmployerUIController {
	
	@Autowired
	private JobServiceImpl jobService;

	@RequestMapping(value="/employer/login")
	public String index() {
		return "employer-index";
	}
	
	@RequestMapping(value="/employer/active-jobs")
	public String activeJobPage(Model model) {
		model.addAttribute("joblist", jobService.getJobByStatusValue(1));
		return "active-jobs";
	}
	
	@RequestMapping(value="/employer/draft-jobs")
	public String draftJobPage(Model model) {
		model.addAttribute("joblist", jobService.getJobByStatusValue(0));
		return "draft-jobs";
	}
	
	@RequestMapping(value="/employer/expired-jobs")
	public String expiredJobPage(Model model) {
		model.addAttribute("joblist", jobService.getJobByStatusValue(-1));
		return "expired-jobs";
	}
	
	@RequestMapping(value="/employer/new-job")
	public String newJobPage(Model model) {
		model.addAttribute("jobInfo", new Job());
		return "new-job";
	}
	
	@RequestMapping(value="/employer/view-job/{id}")
	public String viewJobPage(@PathVariable Long id, Model model) {
		model.addAttribute("jobInfo", jobService.getJob(id));
		return "view-job";
	}
	
	@RequestMapping(value="/employer/update-job/{id}")
	public String updateJonPage(@PathVariable Long id, Model model) {
		model.addAttribute("jobInfo", jobService.getJob(id));
		return "new-job";
	}
}
