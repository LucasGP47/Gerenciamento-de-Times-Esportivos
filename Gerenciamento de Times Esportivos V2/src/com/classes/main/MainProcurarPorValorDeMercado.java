package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainProcurarPorValorDeMercado {

	public static void main(String[] args) {

		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("Neymar", 200000000, 2000);
		marca = marcaBO.procurarPorDescricao(marca);
		System.out.println(marca);

	}
}