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
import com.resmia.service.impl.JobServiceImpl;
import com.resmia.utils.Response;

@RestController
@RequestMapping(value="/api/jobs")
public class JobController {
	
	@Autowired
	private JobServiceImpl jobService;
	
	@GetMapping
	public List<Job> getAll(){
		return jobService.getAllJobs();
	}
	
	@PostMapping
	public Response saveJobInfo(@RequestBody Job job) {
		return jobService.createJob(job);
	}
	
	@GetMapping(value="/{id}")
	public Job getJobInfo(@PathVariable Long id) {
		return jobService.getJob(id);
	}
	
	@PutMapping(value="/{id}")
	public Response updateJobInfo(@RequestBody Job job, @PathVariable Long id) {
		return jobService.updateJob(job, id);
	}
	
	@DeleteMapping(value="/{id}")
	public Response deleteJobInfo(@PathVariable Long id) {
		return jobService.deleteJob(id);
	}

}
