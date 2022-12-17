package com.example.test.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}

	@Scheduled(cron ="0 32 13 * * ?", zone = "IST")
	public void myScheduler() {
		System.out.println("Scheduler Started");
	}
	public void birthdayScheduler() {
		String message = "Wish you happy birthday";
	}
}
