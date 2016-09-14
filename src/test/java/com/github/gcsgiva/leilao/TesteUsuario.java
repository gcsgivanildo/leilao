package com.github.gcsgiva.leilao;



import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TesteUsuario {

	@Test
	public void deveTestarNomeUsuario(){
		Usuario u = new Usuario("Givanildo", "gcsgivanildo@gmail.com");
		assertEquals("Givanildo",u.nome());
	}
	
	@Test
	public void deveTestarEmailUsuario(){
		Usuario u = new Usuario("Givanildo", "gcsgivanildo@gmail.com");
		assertEquals("gcsgivanildo@gmail.com", u.email());
	}
}
