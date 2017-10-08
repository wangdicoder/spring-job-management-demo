package com.resmia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.resmia.service.interf.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resmia.domain.Job;
import com.resmia.repo.IJobRepository;
import com.resmia.utils.Response;

@Service
public class JobServiceImpl implements IJobService {
	
	@Autowired
	private IJobRepository jobRepository;

	@Override
	public List<Job> getAllJobs() {
		return jobRepository.findAll();
	}

	@Override
	public Response createJob(Job job) {
		try {
			jobRepository.save(job);
			return new Response(200, "add data successfully", null);
		}catch (Exception e) {
			return new Response(500, "add data failed", null);
		}
	}

	@Override
	public Job getJob(Long id) {
		return jobRepository.findOne(id);
	}

	@Override
	public Response updateJob(Job job, Long id) {
		try {
			job.setId(id);
			jobRepository.save(job);
			return new Response(200, "update data successfully", null);
		}catch (Exception e) {
			return new Response(500, "update data failed", null);
		}
	}

	@Override
	public Response deleteJob(Long id) {
		try {
			jobRepository.delete(id);
			return new Response(200, "delete data successfully", null);
		}catch (Exception e) {
			return new Response(500, "delete data failed", null);
		}
	}

	@Override
	public ArrayList<Job> getJobByStatusValue(int status) {
		return jobRepository.findByStatusEquals(status);
	}

}
