package com.demo.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Principal {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String digaOi(){
		
		return "oi.xhtml";
	}

}
