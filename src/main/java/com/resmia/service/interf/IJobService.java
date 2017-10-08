package com.resmia.service.interf;

import java.util.ArrayList;
import java.util.List;
import com.resmia.domain.Job;
import com.resmia.utils.Response;

public interface IJobService {
	List<Job> getAllJobs();
	Response createJob(Job job);
	Job getJob(Long id);
	Response updateJob(Job job, Long id);
	Response deleteJob(Long id);
	ArrayList<Job> getJobByStatusValue(int status);
}
