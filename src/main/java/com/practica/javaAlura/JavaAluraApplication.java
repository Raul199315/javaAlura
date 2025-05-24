package com.practica.javaAlura;

import menu.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavaAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaAluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
    Menu menu = new Menu();
	menu.menu();


		/*
		// probando lambda con la instefar fincional Lambda
		Lambda lambda = (nombre, edad) -> {
			System.out.printf("Hola desde lambdas " + nombre);
			System.out.printf("Su edad es: " + edad);
		};
		lambda.emitirmensaje("Raul",31);
		*/
		/*

		//Practicando Stream
		List<String> psises = new ArrayList<>();
		psises.add("Colombia");
		psises.add("Venezuela");
		psises.add("Brazil");
		psises.add("Peru");
		psises.add("Argentina");
		psises.add("Usa");
		psises.add("Cananda");
		psises.add("España");
		psises.add("Chile");


		// esta funcion nos filtra los paises que contenga una a y los muestra por consola
		psises.stream()
				.filter(pais -> pais.toLowerCase().contains("a"))
				.forEach(System.out::println);

		 */


	}
}
