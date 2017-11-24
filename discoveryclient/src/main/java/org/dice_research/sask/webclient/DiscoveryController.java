package org.dice_research.sask.webclient;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {
	protected Logger logger = Logger.getLogger(DiscoveryController.class.getName());

	@RequestMapping("/hello")
	public String hello() {
		logger.info("discovery-microservice hello() invoked");
		return "Hello Projectgroup!";
	}
	
	@RequestMapping("/info")
	public String info() {
		logger.info("discovery-microservice info() invoked");
		StringBuilder builder = new StringBuilder();
		
		builder.append("<!DOCTYPE html>");
		builder.append("<html><head>");
		builder.append("<meta charset=\"utf-8\">");
		builder.append("<title>Microservice running</title>");
		builder.append("</head><body>");
		builder.append("<h1>Jep, this REST controller is running.</h1>");
		builder.append("</body></html>");
		
		return builder.toString();
	}
}
