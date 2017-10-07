/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.web;

import com.resmia.domain.Application;
import com.resmia.service.ApplicationServiceImpl;
import com.resmia.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationServiceImpl applicationService;

    @GetMapping
    public List<Application> getApplications(@RequestBody Long jobId){
        return applicationService.getApplications(jobId);
    }

    @PostMapping
    public Response createApplication (@RequestBody Application application){
        return applicationService.createApplication(application);
    }
}
