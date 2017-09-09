package com.resmia.domain;

import javax.persistence.*;

@Entity
@Table(name="resmia_jobs")
public class Job {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String jobName;
	private String jobType;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
}
