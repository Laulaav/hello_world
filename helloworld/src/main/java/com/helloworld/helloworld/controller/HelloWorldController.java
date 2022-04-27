package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/lista")
	public String listaBsm() {
		return "Lista de BSM`s:"
				+ "\n1.Proatividade"
				+ "\n2.Orientação ao futuro"
				+ "\n3.Trabalho em equipe"
				+ "\n4.Comunicação"
				+ "\n5.Persistência";
		
	}
	@GetMapping("/aprender")
	public String aprendizagem() {
		return "Lista de aprendizagem da semana"
				+"\n1.MySQL"
				+"\n2.POO"
				+"\n3.UI/UX";
	}
	
}
