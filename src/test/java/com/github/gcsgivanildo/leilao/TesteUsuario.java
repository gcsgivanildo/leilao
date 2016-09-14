package com.github.gcsgivanildo.leilao;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.gcsgivanildo.leilao.Usuario;


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
