package com.demo.model;

import java.util.List;

public class Estado {
	
	private String sigla;
	private String nome;
	private List<String> cidades;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getCidades() {
		return cidades;
	}
	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}
}
