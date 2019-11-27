package com.googoo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author sunteng
 */
@SpringBootApplication
@ComponentScan("com.googoo")
public class Application  {


	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
