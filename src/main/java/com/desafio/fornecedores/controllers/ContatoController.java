package com.desafio.fornecedores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.fornecedores.domain.Contato;
import com.desafio.fornecedores.services.ContatoService;

@RestController
@RequestMapping(value = "/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	 @GetMapping
	    public ResponseEntity<List<Contato>> findAllContatos() {
	        List<Contato> contatos = service.findAllContatos();
	        return ResponseEntity.ok(contatos);
	    }
	 
	 @PostMapping
	 public ResponseEntity<Contato> adicionarContato(@RequestBody NovoContatoRequest request) {
	        Contato novoContato = service.adicionarContato(request.getNome(), request.getEmail());
	        return new ResponseEntity<>(novoContato, HttpStatus.CREATED);
	    }
	
	
}
