package org.dice_research.sask.webclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiscoveryController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
