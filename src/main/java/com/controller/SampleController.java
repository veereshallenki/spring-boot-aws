package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "/")
	public String greeting() {

		return "welcome to Spring boot with AWS";
	}

	//http://localhost:9090/say/veeresh
	@GetMapping(value = "say/{name}")
	public String sayHello(@PathVariable("name") String name) {

		return "weclome to Spring boot learning with AWS " + name;
	}
}
