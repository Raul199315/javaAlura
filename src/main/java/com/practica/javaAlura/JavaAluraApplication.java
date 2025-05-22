package com.practica.javaAlura;

import menu.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaAluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
    Menu menu = new Menu();
	menu.menu();
	}
}
