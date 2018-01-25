package ru.alfacapital.ms.autogen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsAutogenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAutogenApplication.class, args);
	}
}
