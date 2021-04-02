package com.samira1462.authenticationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
/*@EntityScan(basePackageClasses = {
		AuthenticationdemoApplication.class,
		Jsr310JpaConverters.class
})*/
public class AuthenticationdemoApplication {
/*	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationdemoApplication.class, args);
	}

}
