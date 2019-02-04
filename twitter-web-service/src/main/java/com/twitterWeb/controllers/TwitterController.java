package com.twitterWeb.controllers;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TwitterController {
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	
	@ResponseBody
	public String getTest() {
		return "";
	}
}
