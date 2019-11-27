package com.googoo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;


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
