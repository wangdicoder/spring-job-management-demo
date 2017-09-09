package com.resmia.service;

import java.util.List;
import com.resmia.domain.Job;
import com.resmia.utils.MyResponse;

public interface IJobService {
	List<Job> getAllJobsInfo();
	MyResponse addJobInfo(Job job);
	Job getJobInfo(Long id);
	MyResponse updateJobInfo(Job job, Long id);
	MyResponse deleteJobInfo(Long id);
}
