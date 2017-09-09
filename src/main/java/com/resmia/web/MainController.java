/**
 * page controller
 */
package com.resmia.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resmia.domain.IJobRepository;
import com.resmia.domain.Job;

@Controller
public class MainController {
	
	@Autowired
	private IJobRepository jobRepository;
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/active-jobs")
	public String activeJobPage(Model model) {
		model.addAttribute("joblist", jobRepository.findByStatusEquals(1));
		return "active-jobs";
	}
	
	@RequestMapping(value="/draft-jobs")
	public String draftJobPage(Model model) {
		model.addAttribute("joblist", jobRepository.findByStatusEquals(0));
		return "draft-jobs";
	}
	
	@RequestMapping(value="/expired-jobs")
	public String expiredJobPage(Model model) {
		model.addAttribute("joblist", jobRepository.findByStatusEquals(-1));
		return "expired-jobs";
	}
	
	@RequestMapping(value="/new-job")
	public String newJobPage(Model model) {
		model.addAttribute("jobInfo", new Job());
		return "new-job";
	}
	
	@RequestMapping(value="/update-job/{id}")
	public String updateInfo(@PathVariable Long id, Model model) {
		model.addAttribute("jobInfo", jobRepository.findOne(id));
		return "new-job";
	}
}
