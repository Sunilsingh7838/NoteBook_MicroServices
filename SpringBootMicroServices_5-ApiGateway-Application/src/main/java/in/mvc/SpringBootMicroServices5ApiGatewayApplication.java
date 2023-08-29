package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroServices5ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServices5ApiGatewayApplication.class, args);
	}

}
