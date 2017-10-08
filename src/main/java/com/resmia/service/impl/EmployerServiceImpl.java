/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.service.impl;

import com.resmia.domain.User;
import com.resmia.service.interf.IEmplyerService;
import com.resmia.utils.Response;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements IEmplyerService {
    @Override
    public Response login(Object data) {
        return null;
    }

    @Override
    public Response createUser(User user) {
        return null;
    }

    @Override
    public Response updateUser(User user, Long id) {
        return null;
    }

    @Override
    public Response deleteUser(Long userId) {
        return null;
    }
}
