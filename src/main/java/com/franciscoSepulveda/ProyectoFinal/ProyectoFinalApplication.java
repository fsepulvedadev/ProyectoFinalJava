package com.franciscoSepulveda.ProyectoFinal;

import java.lang.System;
import com.franciscoSepulveda.ProyectoFinal.entidad.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinalApplication {

	public static void main(String[] args) {


		SpringApplication.run(ProyectoFinalApplication.class, args);

		Cliente client1 = new Cliente(10,"Carlos", "Gomez","14587621");

		System.out.println("El cliente se llama: " + client1.getName());
		System.out.println("El cliente se apellida: " + client1.getLastname());
		System.out.println("Su dni es: " + client1.getDocnumber());
		System.out.println("Su ID es: " + client1.getId());



	}



}
