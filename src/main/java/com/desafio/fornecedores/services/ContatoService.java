package com.desafio.fornecedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.fornecedores.domain.Contato;
import com.desafio.fornecedores.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repository;
	
	public Contato adicionarContato(String nome, String email) {
        Contato novoContato = new Contato();
        novoContato.setNome(nome);
        novoContato.setEmail(email);
        
        return repository.save(novoContato);
    }
	
	public List<Contato> findAllContatos() {
        return repository.findAll();
    }
	
}
