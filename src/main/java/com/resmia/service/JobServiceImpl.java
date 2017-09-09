package com.resmia.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resmia.domain.Job;
import com.resmia.repo.IJobRepository;
import com.resmia.utils.MyResponse;

@Service
public class JobServiceImpl implements IJobService{
	
	@Autowired
	private IJobRepository jobRepository;

	@Override
	public List<Job> getAllJobsInfo() {
		return jobRepository.findAll();
	}

	@Override
	public MyResponse addJobInfo(Job job) {
		try {
			jobRepository.save(job);
			return new MyResponse(200, "add data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "add data failed", null);
		}
	}

	@Override
	public Job getJobInfo(Long id) {
		return jobRepository.findOne(id);
	}

	@Override
	public MyResponse updateJobInfo(Job job, Long id) {
		try {
			job.setId(id);
			jobRepository.save(job);
			return new MyResponse(200, "update data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "update data failed", null);
		}
	}

	@Override
	public MyResponse deleteJobInfo(Long id) {
		try {
			jobRepository.delete(id);
			return new MyResponse(200, "delete data successfully", null);
		}catch (Exception e) {
			return new MyResponse(500, "delete data failed", null);
		}
	}

}
