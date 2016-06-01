package com.demo.managedbeans;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

import com.demo.model.Estado;
import com.demo.model.Pais;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ManagedBean
public class Principal {
	
	private ObjectMapper mapper = new ObjectMapper();
	private Pais pais = new Pais();
	private Estado estado;
	
	private String nome;
	
	public Principal() throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
		setPais((Pais) getMapper().readValue(new URL("http://localhost:8080/Demo-JSF-Events/json/estados-cidades.json"), Pais.class));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String digaOi(){
		
		return "teste";
	}
	
	public void selecionaCidades(ValueChangeEvent event){
		String sigla = (String) event.getNewValue();
		System.out.println("Cidade: " + sigla);
		
		for(int i = 0; i <  getPais().getEstados().size(); i++) {
			estado = getPais().getEstados().get(i);
			if(estado.getSigla().equals(sigla)){
				break;
			}
			
		}
		
		
		System.out.println("Cidade nome: " + estado.getNome());
		
		
	}

}
