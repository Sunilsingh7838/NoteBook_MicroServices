package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootMicroServices9ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServices9ConfigServerApplication.class, args);
	}

}
