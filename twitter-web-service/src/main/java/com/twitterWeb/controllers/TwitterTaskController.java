package com.twitterWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twitterWeb.jsonMap.TaskConfig;

@Controller
public class TwitterTaskController {
	@RequestMapping(method = RequestMethod.POST, value = "/post")
	
	@ResponseBody
	public String postTask(@RequestBody TaskConfig input) {
		System.out.println(input);
		return ">>Task Queued<<";
	}
	
	
}
