package in.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/")
	public String m1() {
		System.out.println("............ method 1......................");
		String msg = "This is m1() method...";
		try {
			int i= 10/0;
			
		} catch (Exception e) {
			e.printStackTrace();
			msg = m2();
		}
		return msg;
	}
	
	public String m2() {
		System.out.println("............ method 2......................");
		String msg = "This is m2() method";
		return msg;
	}
}
