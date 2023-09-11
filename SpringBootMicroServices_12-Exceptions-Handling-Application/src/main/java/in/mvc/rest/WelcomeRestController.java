package in.mvc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);
	@GetMapping(value="/welcome")
	public String getWelcome() {
		String msg = "This is Welcome controller......";
		try {
			int a = 10/0;
		}
		catch (Exception e) {
			logger.error("Exception occured ::"+ e);
			throw new ArithmeticException(e.getMessage());
			
		}
		return msg;
	}
}
