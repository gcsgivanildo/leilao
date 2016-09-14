package com.github.gcsgivanildo.leilao;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.gcsgivanildo.leilao.Item;
import com.github.gcsgivanildo.leilao.Usuario;


public class TesteItem {

	@Test
	public void deveTestarUmdono(){
		Item i = new Item(
				new Usuario("Givanildo", "gcsgivanildo@gmail.com"), 
				"Notebook HP", 
				"Notebook HP 1234");
		assertEquals("Givanildo", i.dono().nome());
	}
}
