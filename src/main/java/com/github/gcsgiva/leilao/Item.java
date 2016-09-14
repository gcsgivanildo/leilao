package com.github.gcsgiva.leilao;

public class Item {
	//Atributos
	private Usuario dono;
	private String nome;
	private String descricao;
	
	public  Item(Usuario dono, String nome, String modelo) {
		this.dono = dono;
		this.nome = nome;
		this.descricao = modelo;
	}
	
	public Usuario dono(){
		return dono;
	}
	
	public String marca(){
		return nome;
	}
	
	public String modelo(){
		return descricao;
	}
}
