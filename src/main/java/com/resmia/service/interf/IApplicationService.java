/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.service.interf;

import com.resmia.domain.Application;
import com.resmia.utils.Response;

import java.util.List;

public interface IApplicationService {
    List<Application> getApplications(Long jobId);
    Response createApplication(Application application);
}
