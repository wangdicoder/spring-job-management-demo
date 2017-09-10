package com.resmia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resmia.domain.User;
import com.resmia.repo.IEmployerRespository;
import com.resmia.utils.Response;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IEmployerRespository employerRespository;

	@Override
	public Response login(Object data) {
		UserRequestModel requestData = (UserRequestModel) data;
		User user = employerRespository.findByUserName(requestData.getAccount());
		if (user.getPassword().equals(requestData.getPassword())) {
			return new Response(200, "login successfully", null);
		} else {
			return new Response(200, "login failed, password is not correct", null);
		}
	}

}

class UserRequestModel {
	private String account;
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}