package com.geekidea.slutheSample.slutheSampleClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/api/")
public class Sample {
	private final Logger log = LoggerFactory.getLogger(Sample.class);
	
	@Autowired
	RestTemplate restTemlate;
	
	@GetMapping("hello")
	public String getHelloMessage(){
		log.info("Sample client hello message method");
		return restTemlate.getForObject("http://localhost:9411/rest/api/hello", String.class);
	}
}
