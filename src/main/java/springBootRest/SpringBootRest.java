package springBootRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = { "springBootRest.services" })
@SpringBootApplication
public class SpringBootRest {

	public static void main(String[] args) {
//		System.getProperties().put("server.port", 8089);
		System.out.println("---------------------------args[0]: "+args[0]);
		SpringApplication.run(SpringBootRest.class, args);
	}
}
