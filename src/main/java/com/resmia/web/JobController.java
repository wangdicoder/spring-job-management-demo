package com.resmia.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resmia.domain.IJobRepository;
import com.resmia.domain.Job;

@RestController
@RequestMapping(value="/api/jobs")
public class JobController {
	
	@Autowired
	private IJobRepository jobRepository;
	
	@GetMapping
	public List<Job> getAll(){
		return jobRepository.findAll();
	}

}
