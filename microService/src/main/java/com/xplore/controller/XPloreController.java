package com.xplore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xplore.bean.XploreResponse;

@RestController
@RequestMapping("/testService")
public class XPloreController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public XploreResponse getResonse(@RequestParam(value = "name") String name) {
		XploreResponse response = new XploreResponse();
		response.setName(name);
		response.setMessage("Welcome "+ name + " !");
		return response;
	}
}
