package com.resmia.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resmia.service.UserServiceImpl;
import com.resmia.utils.Response;

@RestController
@RequestMapping(value="/api/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping(value="/login")
	public Response login(@RequestBody Object data) {
		return userService.login(data);
	}
}	
