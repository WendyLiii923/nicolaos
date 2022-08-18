package com.java18.nicolaos.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Test")
public class TestController {
	
	@GetMapping("/HelloWorld")
	public String hello(){
		return "helloWorldPage";
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String,String> test(){
		return Collections.singletonMap("status", "success");
	}
}
