package com.incrediblepath.AppController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes =
		{MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE},
		produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Response UserAuth(@RequestBody User user) {
		Response res = new Response();
		if((user.getUserName().equals("hari"))&& (user.getPassword().equals("password"))) {
			res.setStatus("INC000");
			res.setStatusDescription("Successfully login");

		}else {
			res.setStatus("INC001");
			res.setStatusDescription("Login UnSuccess");

		}
		return res;
	}


}
