package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("Roberto Carlos");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		marca = new Jogador("Playstation 47");
		
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		marca = new Jogador("XBOX");
		
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}