/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.domain;

import javax.persistence.*;

@Entity
@Table(name = "resmia_applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long jobId;
    private Long applicantId;
    private String applicantName;
    private String applicantIntro;
    private String applicantEducation;
    private String applicantExperience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }


    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantIntro() {
        return applicantIntro;
    }

    public void setApplicantIntro(String applicantIntro) {
        this.applicantIntro = applicantIntro;
    }

    public String getApplicantEducation() {
        return applicantEducation;
    }

    public void setApplicantEducation(String applicantEducation) {
        this.applicantEducation = applicantEducation;
    }

    public String getApplicantExperience() {
        return applicantExperience;
    }

    public void setApplicantExperience(String applicantExperience) {
        this.applicantExperience = applicantExperience;
    }
}
