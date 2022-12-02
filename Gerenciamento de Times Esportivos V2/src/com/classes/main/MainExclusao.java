package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador();
		if (marcaBO.excluir(marca))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}