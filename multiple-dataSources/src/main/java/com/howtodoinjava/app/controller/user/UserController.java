package com.howtodoinjava.app.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.app.services.user.UserService;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;

	@GetMapping(path = "/count")
	public int getUserCount() {
		return userService.getUserCount();
	}

}
