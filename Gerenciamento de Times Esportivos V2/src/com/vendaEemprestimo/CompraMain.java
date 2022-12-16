package com.vendaEemprestimo;

import com.classes.BO.CompraBO;
import com.classes.DTO.Compra;
import com.classes.DTO.Jogador;

public class CompraMain {
	
		public static void main(String[] args) {
			
			CompraBO playerBO = new CompraBO();
			
			//Coloque o ID do jogador que deseja comprar
			
			Jogador marcas = new Jogador(894);
			
			//Coloque o Nome do jogador que deseja comprar
			
			Compra player = new Compra("Luc");
			
			
			if (playerBO.comprar(marcas) && playerBO.diminueValor(player) && playerBO.excluir(marcas))
				
				System.out.println("Jogador Comprado!");
			
			else
				
				System.out.println("Jogador não encontrado");
			
			
			
		}
}
