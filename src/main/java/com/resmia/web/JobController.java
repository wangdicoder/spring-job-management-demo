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
	
	@GetMapping(value="/{id}")
	public Job getJobInfo(@PathVariable Long id) {
		return jobRepository.findOne(id);
	}
	
	@PutMapping(value="/{id}")
	public MyResponse getJobInfo(@RequestBody Job job, @PathVariable Long id) {
		try {
			job.setId(id);
			jobRepository.save(job);
			return new MyResponse(200, "update data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "update data failed", null);
		}
	}
	
	@DeleteMapping(value="/{id}")
	public MyResponse deleteJobInfo(@PathVariable Long id) {
		try {
			jobRepository.delete(id);
			return new MyResponse(200, "delete data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "delete data failed", null);
		}
	}

}
