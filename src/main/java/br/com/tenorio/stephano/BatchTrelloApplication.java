package br.com.tenorio.stephano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSpringConfigured
@EnableScheduling
@EnableAsync
public class BatchTrelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchTrelloApplication.class, args);
	}
}
