package br.com.congregacionalzonasul.IECZSAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class IeczsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IeczsApiApplication.class, args);
	}
}
