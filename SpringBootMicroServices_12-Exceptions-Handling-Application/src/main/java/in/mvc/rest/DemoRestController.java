package in.mvc.rest;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	private org.slf4j.Logger logger = LoggerFactory.getLogger(DemoRestController.class);
	@GetMapping("/")
	public String cal() {
		String msg = "This is Exception Handling...";
	
		try {
			int a = 10/0;
		}
		catch(Exception e) {
			logger.error("Exceptions Occured::" + e.getMessage());
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}
	
	
}
