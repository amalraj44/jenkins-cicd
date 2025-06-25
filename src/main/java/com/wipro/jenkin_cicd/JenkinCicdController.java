package com.wipro.jenkin_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cicd")
public class JenkinCicdController {
@GetMapping
	public String JenkinController()
{
	return "Jenkin Called";
}
}
