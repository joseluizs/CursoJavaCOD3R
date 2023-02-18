package br.com.luiz.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.exerciciosspringboot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(25, "Luiz", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		 return new Cliente(id, "Luizinho", "987.654.321-00");
	}
}
