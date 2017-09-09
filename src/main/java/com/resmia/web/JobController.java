package com.resmia.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resmia.domain.IJobRepository;
import com.resmia.domain.Job;
import com.resmia.utils.MyResponse;

@RestController
@RequestMapping(value="/api/jobs")
public class JobController {
	
	@Autowired
	private IJobRepository jobRepository;
	
	@GetMapping
	public List<Job> getAll(){
		return jobRepository.findAll();
	}
	
	@PostMapping
	public MyResponse saveJobInfo(@RequestBody Job job) {
		try {
			jobRepository.save(job);
			return new MyResponse(200, "add data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "add data failed", null);
		}
	}

}
