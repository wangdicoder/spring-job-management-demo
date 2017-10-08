/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.service.impl;

import com.resmia.domain.User;
import com.resmia.repo.ITalentRepository;
import com.resmia.service.interf.ITalentService;
import com.resmia.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalentServiceImpl implements ITalentService {

    @Autowired
    private ITalentRepository talentRepository;

    @Override
    public Response login(Object data) {
        return null;
    }

    @Override
    public Response createUser(User user) {
        talentRepository.save(user);
        return new Response(200, "Add talent successfully", null);
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
