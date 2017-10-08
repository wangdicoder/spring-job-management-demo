/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.web;

import com.resmia.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TalentUIController {

    @Autowired
    private JobServiceImpl jobService;

    @RequestMapping(value = "/login")
    public String login(){
        return "talent-index";
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("joblist", jobService.getJobByStatusValue(1));
        return "job-home";
    }
}
