package com.desafio.fornecedores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.fornecedores.domain.Contato;
import com.desafio.fornecedores.domain.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
		
	List<Contato> findAllByIdIn(List<Long> ids);
}
