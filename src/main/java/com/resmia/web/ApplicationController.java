/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.web;

import com.resmia.domain.Application;
import com.resmia.service.impl.ApplicationServiceImpl;
import com.resmia.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ApplicationController {

    @Autowired
    private ApplicationServiceImpl applicationService;

    @GetMapping(value = "/applications")
    public List<Application> getApplications(@RequestBody Long jobId){
        return applicationService.getApplications(jobId);
    }

    @PostMapping(value = "/applications")
    public synchronized Response saveApplication (@RequestBody Application application){
        return applicationService.createApplication(application);
    }

    @PostMapping(value = "/application")
    public Response getApplication (@RequestBody Application application){
        return applicationService.getApplication(application.getJobId(), application.getApplicantId());
    }

    @PostMapping(value = "/applications/{id}")
    public List<Application> getApplicationsByApplicantId(@PathVariable Long id){
        return applicationService.getApplicationsByApplicantId(id);
    }
}

