package www.SiteSenai.com.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlersitesenai {
	
	@GetMapping("/")
	public String home () {
		return "index";
	}
	
	
}
