package com.desafio.fornecedores.controllers;

import java.util.List;

public class AtualizaFornecedorRequest {
	private String novaRazaoSocial;
    private String novoEndereco;
    private List<Long> idsContatos;

    public String getNovaRazaoSocial() {
        return novaRazaoSocial;
    }

    public void setNovaRazaoSocial(String novaRazaoSocial) {
        this.novaRazaoSocial = novaRazaoSocial;
    }

    public String getNovoEndereco() {
        return novoEndereco;
    }

    public void setNovoEndereco(String novoEndereco) {
        this.novoEndereco = novoEndereco;
    }

    public List<Long> getIdsContatos() {
        return idsContatos;
    }

    public void setIdsContatos(List<Long> idsContatos) {
        this.idsContatos = idsContatos;
    }
}
