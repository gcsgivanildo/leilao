package com.github.gcsgivanildo.leilao;

public class Lance {

	private Item item;
	private Usuario usuario;
	private double valor;
	
	public Lance(Item item, Usuario usuario, double valor){
		this.item = item;
		this.usuario = usuario;
		this.valor = valor;
	}
	
	public Item item(){
		return item;
	}
	
	public Usuario usuario(){
		return usuario;
	}
	
	public double valor(){
		return valor;
	}
	
}
