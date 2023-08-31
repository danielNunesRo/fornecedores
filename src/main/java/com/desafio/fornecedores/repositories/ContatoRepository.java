package com.desafio.fornecedores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.fornecedores.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
