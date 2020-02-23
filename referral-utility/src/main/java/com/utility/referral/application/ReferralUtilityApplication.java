package com.utility.referral.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ReferralUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferralUtilityApplication.class, args);
	}
	  public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/deleteReferral").allowedOrigins("http://localhost:3000");
	            }
	        };
	    }

}
