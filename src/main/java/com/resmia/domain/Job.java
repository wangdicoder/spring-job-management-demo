package com.resmia.domain;

import javax.persistence.*;

@Entity
@Table(name = "resmia_jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int status;
	private String jobTitle;
	private String category;
	private String location;
	private String workType;
	private String description;
	private String salaryType;
	private String income;
	private String contactInfo;
	private String youtubeLink;

	public Job() {}

	public Job(int status, String jobTitle, String category, String location, String workType, String description, String salaryType, String income, String contactInfo, String youtubeLink) {
		this.status = status;
		this.jobTitle = jobTitle;
		this.category = category;
		this.location = location;
		this.workType = workType;
		this.description = description;
		this.salaryType = salaryType;
		this.income = income;
		this.contactInfo = contactInfo;
		this.youtubeLink = youtubeLink;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


}
