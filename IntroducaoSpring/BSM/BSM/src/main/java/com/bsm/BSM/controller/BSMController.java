package com.bsm.BSM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class BSMController {
	
	@GetMapping("/hello-word")
	public String helloWorld() {
		return "Hello World!";
	}

	public String[] BSMs = {
			"Orientação ao futuro;",
			"Responsabilidade pessoal;",
			"Mentalidade de Crescimento;",
			"Persistencia;",
			"Trabalho em equipe;",
			"Orientação ao detalhe;",
			"Proatividade;",
			"Comunicação."
	};
	
	@GetMapping("/objetivos-semana")
	public String objetivosSemana() {
		return "Objetivos da semana: Orientação ao futuro e persistência";
	}
	
	@GetMapping("/BSMs")
	public String [] bsm() {
		return BSMs;
	}
}
