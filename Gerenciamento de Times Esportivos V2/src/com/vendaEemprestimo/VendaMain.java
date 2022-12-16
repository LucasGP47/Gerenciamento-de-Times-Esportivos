package com.vendaEemprestimo;


import com.classes.BO.VendaBO;
import com.classes.DTO.Jogador;
import com.classes.DTO.Venda;

public class VendaMain {

	public static void main(String[] args) {
		
		//informe o jogador que deseja vender
		
		
		VendaBO marcaBO = new VendaBO();
		
		//id do jogador
		Jogador marcas = new Jogador(789);
		
		//nome do jogador
		Venda marca = new Venda("Curvello");
		
		if (marcaBO.adicionarValor(marca))
			System.out.println("Tudo certo.");
		else
			System.out.println("Desgraça");
		
		if(marcaBO.vender(marcas))
			System.out.println("Jogador Vendido");
		
		else
			System.out.println("Jogador não encontrado");
		
		
	}
	
	   
			
}

