package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainProcurarPorDescricao {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("Android");
		marca = marcaBO.procurarPorDescricao(marca);
		System.out.println(marca);

	}
}