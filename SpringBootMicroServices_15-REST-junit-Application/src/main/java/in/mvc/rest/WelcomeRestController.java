package in.mvc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.service.WelcomeService;

@RestController
public class WelcomeRestController {

	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String getWelcomeMassage() {
		String msg = service.getMsg();
		return msg;
	}
}
