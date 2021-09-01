package com.howieluk.controllers;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howieluk.pojo.User;
import com.howieluk.services.EmptyService;

@Controller
@Slf4j
public class WelcomeController {
	@Autowired
	EmptyService emptyService;
	
//	@RequestMapping("/hello")
//	public String welcome() {
//		log.info("welcome");
//		return "index";
//	}

	@RequestMapping("/login")
	public String login() {
		System.out.println("login Page");
		return "login";
	}

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		log.info("hello world!");
		return "index";
	}

	@RequestMapping(value="/getAll")
	@ResponseBody
	public String getAll() {
		List<User> resList = this.emptyService.getAll();
		String res = "[";
		for(User u: resList) {
			res = res + u.toString() + ",";
		}
		res = res.substring(0, res.length() - 2) + "]";
		return res;
	}
	
}
