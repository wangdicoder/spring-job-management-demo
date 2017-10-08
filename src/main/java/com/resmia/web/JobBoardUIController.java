/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.web;

import com.resmia.service.impl.ApplicationServiceImpl;
import com.resmia.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobBoardUIController {

    @Autowired
    private JobServiceImpl jobService;
    @Autowired
    private ApplicationServiceImpl applicationService;

    @RequestMapping(value = "/login")
    public String login(){
        return "talent-index";
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("joblist", jobService.getJobByStatusValue(1));
        return "job-board";
    }

    @RequestMapping(value = "/{id}")
    public String talentIndex(@PathVariable Long id, Model model) {
        model.addAttribute("joblist", jobService.getJobByStatusValue(1));
        model.addAttribute("applicantId", id);
        return "job-board";
    }

    @RequestMapping(value = "/{id}/applications")
    public String talentApplications(@PathVariable Long id, Model model){
        model.addAttribute("applicantList", applicationService.getApplicationsByApplicantId(id));
        return "my-application";
    }
}
