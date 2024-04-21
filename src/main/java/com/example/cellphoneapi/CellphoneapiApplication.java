package com.example.cellphoneapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CellphoneapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CellphoneapiApplication.class, args);
	}

}
