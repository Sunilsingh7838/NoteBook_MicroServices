package in.mvc.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class WelcomeService {

	public void invokeWelcomeApi() {
		String url = "http://localhost:8080";
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("sunil","123");
		
		HttpEntity<String> reqEntity = new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity = rt.exchange(url, HttpMethod.GET,reqEntity,String.class);
		
//		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		String body = responseEntity.getBody();
		System.out.println(body);
		
		
	}
	public void invokeWelcome() {
		String url = "http://localhost:8080";
		
		WebClient webClient = WebClient.create();
		
		String block= webClient.get()
		                       .uri(url)
		                       .headers(headers-> headers.setBasicAuth("sunil","123"))
		                       .retrieve()
		                       .bodyToMono(String.class)
		                       .block();
		
		System.out.println(block);
		                                
		                    
		                      
	}
}
