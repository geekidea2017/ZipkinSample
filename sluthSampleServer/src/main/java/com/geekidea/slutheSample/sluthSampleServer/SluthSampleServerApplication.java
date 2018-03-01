package com.geekidea.slutheSample.sluthSampleServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
@Configuration
public class SluthSampleServerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SluthSampleServerApplication.class, args);

	}
	
	@Bean 
	public AlwaysSampler defaultSampler() { 
	  return new AlwaysSampler(); 
	}
	
	@Bean
	public Sample2 sample2(){
		return new Sample2();
	}
}
