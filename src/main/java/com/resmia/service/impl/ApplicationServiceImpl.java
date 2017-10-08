/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.service.impl;

import com.resmia.domain.Application;
import com.resmia.repo.IApplicationRepository;
import com.resmia.service.interf.IApplicationService;
import com.resmia.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements IApplicationService {

    @Autowired
    private IApplicationRepository applicationRepository;

    @Override
    public List<Application> getApplications(Long jobId) {
        return applicationRepository.findApplicationsByJobId(jobId);
    }

    @Override
    public Response createApplication(Application application) {
        try {
            applicationRepository.save(application);
            return new Response(200, "add data successfully", null);
        } catch (Exception e) {
            return new Response(200, "add data failed", null);
        }
    }

    @Override
    public Response deleteApplication(Long applicationId) {
        return null;
    }

    @Override
    public Response getApplication(Long jobId, Long applicantId) {
        try {
            Application application = applicationRepository.findApplicationsByJobIdAndAndApplicantId(jobId, applicantId);
            return new Response(200, "get data successfully", application);
        } catch (Exception e) {
            return new Response(501, "get data failed", null);
        }
    }

    @Override
    public List<Application> getApplicationsByApplicantId(Long applicantId) {
        return applicationRepository.findApplicationsByApplicantId(applicantId);
    }
}
