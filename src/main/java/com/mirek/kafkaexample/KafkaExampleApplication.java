package com.mirek.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableIntegration
@SpringBootApplication
public class KafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleApplication.class, args);
	}
}
