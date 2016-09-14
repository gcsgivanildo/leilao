package com.github.gcsgiva.leilao;

public class Usuario {
	//atributos
	private String nome;
	private String email;
	
	//métodos especiais	
	public Usuario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	public String nome(){
		return this.nome;
	}
	public String email(){
		return this.email;
	}
}
