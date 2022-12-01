package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("LG");
		if (marcaBO.existe(marca))
			System.out.println("Marca Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}