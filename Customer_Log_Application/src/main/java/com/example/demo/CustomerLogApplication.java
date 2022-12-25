package com.example.demo;
//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerLogApplication implements CommandLineRunner {
	@Autowired repository ob;

	public static void main(String[] args) {
		SpringApplication.run(CustomerLogApplication.class, args);
	}
	@Override 
	public void run(String... args) throws Exception
	{
		
	}
	

}

