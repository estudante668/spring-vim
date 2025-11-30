package com.fabricio.minhapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Minhapp {

	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Minhapp.class, args);
	}

}
