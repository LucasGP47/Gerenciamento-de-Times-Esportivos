package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainInsercao {
	
	public static void main(String[] args) {
		
		JogadorBO playerBO = new JogadorBO();
		
		Jogador player = new Jogador("Neymar", 200000000, 2000);
				
		
		if (playerBO.inserir(player))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
}
}