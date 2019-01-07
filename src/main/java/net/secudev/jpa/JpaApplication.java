package net.secudev.jpa;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class JpaApplication {

	@Autowired
    private Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);		
	}


	@PostConstruct
	public void init()
	{
		System.out.println(environment.getProperty("spring.datasource.url"));
	}
	
	
}

