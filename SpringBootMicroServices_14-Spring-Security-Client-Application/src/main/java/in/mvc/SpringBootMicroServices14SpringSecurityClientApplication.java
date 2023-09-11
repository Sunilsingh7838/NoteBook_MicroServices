package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mvc.service.WelcomeService;

@SpringBootApplication
public class SpringBootMicroServices14SpringSecurityClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootMicroServices14SpringSecurityClientApplication.class, args);
		WelcomeService bean = run.getBean(WelcomeService.class);
//		bean.invokeWelcomeApi();
		bean.invokeWelcome();
   }
}
