package in.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to First SpringBoot MicroServices Application";
	}

}
