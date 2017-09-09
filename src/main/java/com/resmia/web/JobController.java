/**
 * RESTful api for job table
 */
package com.resmia.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resmia.domain.Job;
import com.resmia.service.JobServiceImpl;
import com.resmia.utils.MyResponse;

@RestController
@RequestMapping(value="/api/jobs")
public class JobController {
	
	@Autowired
	private JobServiceImpl jobService;
	
	@GetMapping
	public List<Job> getAll(){
		return jobService.getAllJobsInfo();
	}
	
	@PostMapping
	public MyResponse saveJobInfo(@RequestBody Job job) {
		return jobService.addJobInfo(job);
	}
	
	@GetMapping(value="/{id}")
	public Job getJobInfo(@PathVariable Long id) {
		return jobService.getJobInfo(id);
	}
	
	@PutMapping(value="/{id}")
	public MyResponse getJobInfo(@RequestBody Job job, @PathVariable Long id) {
		return jobService.updateJobInfo(job, id);
	}
	
	@DeleteMapping(value="/{id}")
	public MyResponse deleteJobInfo(@PathVariable Long id) {
		return jobService.deleteJobInfo(id);
	}

}
