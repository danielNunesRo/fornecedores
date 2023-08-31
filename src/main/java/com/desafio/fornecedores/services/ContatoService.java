package com.desafio.fornecedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.fornecedores.domain.Contato;
import com.desafio.fornecedores.repositories.ContatoRepository;

import handlerexceptions.ContatoNotFoundException;

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
	
	public void excluirContato(Long contatoId) {
        repository.deleteById(contatoId);
    }
	
	public Contato atualizarContato(Long contatoId, String novoNome, String novoEmail) throws ContatoNotFoundException {
        Contato contatoExistente = repository.findById(contatoId)
                .orElseThrow(() -> new ContatoNotFoundException("Contato não encontrado com o ID: " + contatoId));

        contatoExistente.setNome(novoNome);
        contatoExistente.setEmail(novoEmail);

        return repository.save(contatoExistente);
    }
}
