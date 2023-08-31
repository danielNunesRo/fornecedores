package com.desafio.fornecedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.fornecedores.controllers.NovoFornecedorRequest;
import com.desafio.fornecedores.domain.Contato;
import com.desafio.fornecedores.domain.Fornecedor;
import com.desafio.fornecedores.repositories.ContatoRepository;
import com.desafio.fornecedores.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	 public List<Fornecedor> findAllFornecedores() {
	        return fornecedorRepository.findAll();
	    }
	 
	 public Fornecedor adicionarFornecedorComContatos(String razaoSocial, String endereco, List<Long> idsContatos) {
	        List<Contato> contatosExistentes = contatoRepository.findAllById(idsContatos);
	        
	        if (contatosExistentes.isEmpty()) {
	            throw new IllegalArgumentException("Pelo menos um contato deve ser fornecido para criar um fornecedor.");
	        }

	        Fornecedor novoFornecedor = new Fornecedor();
	        novoFornecedor.setRazaoSocial(razaoSocial);
	        novoFornecedor.setEndereco(endereco);
	        novoFornecedor.setContatos(contatosExistentes);

	        return fornecedorRepository.save(novoFornecedor);
	    }
	 
	 public void excluirFornecedorPorId(Long fornecedorId) {
	        fornecedorRepository.deleteById(fornecedorId);
	    }

	

	
	
	
}
