package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {
		System.out.println(">>>> Starting Expense Tracker ... <<<<");
		SpringApplication.run(WebServiceApplication.class, args);
	}

}
