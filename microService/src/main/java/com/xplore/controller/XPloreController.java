package com.xplore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xplore.bean.XploreResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/testService")
@Api(value = "test Servcie", description = "Operations pertaining to products in Online Store")
public class XPloreController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ApiOperation(value = "View a list of available employees", response = XploreResponse.class)
	public XploreResponse getResonse(
			@ApiParam(value = "Employee Id to update employee object", required = true) @RequestParam(value = "name") String name) {
		XploreResponse response = new XploreResponse();
		response.setName(name);
		response.setMessage("Welcome " + name + " !");
		return response;
	}
}
