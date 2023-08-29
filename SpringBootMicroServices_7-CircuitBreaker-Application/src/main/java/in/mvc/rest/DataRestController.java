package in.mvc.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {
	
	@GetMapping("/")
	@CircuitBreaker(name = "getDataFromRedis", fallbackMethod = "getDataFromDB")
    
	public String getDataFromRedis() {
		System.out.println("**********Getting data redis() method called**********");
		String msg = "*************Getting data from redis cache...***********";
		//logic
		if(new Random().nextInt(10)<=10) {
			throw new RuntimeException("Redis Server down");
		}
		return msg;
	}
	public String getDataFromDB() {
		System.out.println("**********Getting data DB() method called**********");
		String msg = "*************Getting data from redis cache...***********";
		//logic
		return msg;
	}

}
