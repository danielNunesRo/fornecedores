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
import com.desafio.fornecedores.domain.Fornecedor;
import com.desafio.fornecedores.services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping
    public ResponseEntity<List<Fornecedor>> findAllFornecedores() {
        List<Fornecedor> fornecedores = fornecedorService.findAllFornecedores();
        return ResponseEntity.ok().body(fornecedores);
    }
	
	@PostMapping("/novo")
    public ResponseEntity<Fornecedor> adicionarNovoFornecedorComContatos(@RequestBody NovoFornecedorRequest request) {
        Fornecedor novoFornecedor = fornecedorService.adicionarFornecedorComContatos(
            request.getRazaoSocial(),
            request.getEndereco(),
            request.getIdsContatos()
        );

        return new ResponseEntity<>(novoFornecedor, HttpStatus.CREATED);
    }
	
	
}
