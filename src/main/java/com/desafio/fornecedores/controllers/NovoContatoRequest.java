package com.desafio.fornecedores.controllers;

public class NovoContatoRequest {
	
	private String nome;
    private String email;
    
    public NovoContatoRequest() {
    	
    }

	public NovoContatoRequest(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
