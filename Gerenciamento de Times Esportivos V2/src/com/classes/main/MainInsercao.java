package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		
		JogadorBO playerBO = new JogadorBO();
		
		Jogador player = new Jogador("Neymar");
		
		if (playerBO.inserir(player))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		player = new Jogador("Menino ney");
		
		if (playerBO.inserir(player))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		player = new Jogador("XBOX");
		
		if (playerBO.inserir(player))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}