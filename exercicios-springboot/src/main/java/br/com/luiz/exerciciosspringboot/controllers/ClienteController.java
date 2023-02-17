package br.com.luiz.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.exerciciosspringboot.models.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public Cliente obterCliente() {
		 return new Cliente(25, "Luiz", "123.456.789-00");
	}

}
