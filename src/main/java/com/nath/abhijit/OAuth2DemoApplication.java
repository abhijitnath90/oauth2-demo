package com.nath.abhijit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OAuth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2DemoApplication.class, args);
	}

}
