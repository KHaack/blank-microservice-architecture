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
}
