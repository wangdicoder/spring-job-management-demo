package com.resmia.service.interf;

import com.resmia.utils.Response;

public interface IUserService {
	Response login(Object data);
	Response deleteUser(Long userId);
}
