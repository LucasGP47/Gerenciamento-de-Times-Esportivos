package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainExiste {

	public static void main(String[] args) {

		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador();
		if (marcaBO.existe(marca))
			System.out.println("Jogador inscrito no time!");
		else
			System.out.println("Jogador n�o inscrito encontrado.");

	}
}