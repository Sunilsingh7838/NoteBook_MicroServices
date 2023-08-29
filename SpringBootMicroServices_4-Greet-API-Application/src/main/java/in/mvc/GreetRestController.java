package in.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	public WelcomeApiClient welcomeClient;
	
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		
		String msg = "Good Morning";
		
		String welcomeMsg = welcomeClient.invokeWelcomeApi();
		return msg + welcomeMsg;
//		return "Good Morning! "+ welcomeClient.invokeWelcomeApi();
	}
}
