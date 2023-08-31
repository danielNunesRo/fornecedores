package com.desafio.fornecedores.controllers;

import java.util.List;

public class NovoFornecedorRequest {
	 private String razaoSocial;
	 private String endereco;
	 private List<Long> idsContatos;
	 
	 public NovoFornecedorRequest() {
		 
	 }
	 
	 public NovoFornecedorRequest(String razaoSocial, String endereco, List<NovoContatoRequest> contatos) {
		super();
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.idsContatos = idsContatos;
	}
	
	 public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Long> getContatos() {
		return idsContatos;
	}
	public void setContatos(List<NovoContatoRequest> contatos) {
		this.idsContatos = idsContatos;
	}
	public List<Long> getIdsContatos() {
		// TODO Auto-generated method stub
		return idsContatos;
	}
	 
	 
	 
}
