package com.github.gcsgiva.leilao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteLance {

	@Test
	public void verificaValorLance(){
		Item item = new Item(
				new Usuario("Givanildo", "gcsgivanildo@gmail.com"),
				"Notebook HP",
				"Notebook HP 1223");
		Lance l = new Lance(item, new Usuario("Maria", "maria@gmail.com"), 1000);
		assertEquals(1000, l.valor(), 0.011);
	}

}
