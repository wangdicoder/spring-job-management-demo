package com.resmia.service;

import com.resmia.utils.Response;
import com.resmia.domain.User;

public interface IUserService {
	Response login(Object data);
	Response createUser(User user);
	Response updateUser(User user, Long id);
	Response deleteUser(Long userId);
}
