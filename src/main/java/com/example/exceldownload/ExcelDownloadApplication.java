package com.example.exceldownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
@EnableScheduling
public class ExcelDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelDownloadApplication.class, args);
	}
}
