package com.geekidea.slutheSample.sluthSampleServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/")
public class Sample {
	private final Logger log = LoggerFactory.getLogger(Sample.class);
	
	@Autowired
	private Sample2 sample2;
	
	@GetMapping("hello")
	public String getHelloMessage(){
		log.info("Sample server hello message method");
		return "Hello Sample";
	}
}
