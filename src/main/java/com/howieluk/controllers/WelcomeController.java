package com.howieluk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howieluk.pojo.User;
import com.howieluk.services.EmptyService;

@Controller
public class WelcomeController {
	@Autowired
	EmptyService emptyService;
	
	@RequestMapping(value="/hello")
	public String welcome() {
		System.out.println("welcome");
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
