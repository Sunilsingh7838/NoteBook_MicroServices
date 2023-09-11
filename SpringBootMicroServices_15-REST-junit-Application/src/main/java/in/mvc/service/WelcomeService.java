
package in.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getMsg() {
		String msg = "Good Afternoon!";
		return msg;
	}
}
