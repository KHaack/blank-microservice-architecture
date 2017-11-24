package org.dice_research.sask.webclient;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebclientController {
	
	protected Logger logger = Logger.getLogger(WebclientController.class.getName());

	@RequestMapping("/")
	public String index() {
		this.logger.info("webclient index() invoked");
		return "index";
	}
	
	@RequestMapping("/info")
	public String info() {
		this.logger.info("discovery-microservice info() invoked");
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