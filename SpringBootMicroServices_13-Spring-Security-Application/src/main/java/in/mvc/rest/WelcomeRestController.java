package in.mvc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String welcomeMsg() {
		String msg = "This is Spring Security Application..";
		return msg;
	}
}
