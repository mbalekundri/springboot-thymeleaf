package com.thymeleaf.api;

import com.thymeleaf.api.model.Employee;
import com.thymeleaf.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootThymeleafApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(Employee.builder()
				.firstName("Rohit")
				.lastName("Balekundri")
				.age(43)
				.email("abc@g.com")
				.phone("9740911665").build());
	}
}
