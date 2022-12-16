package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class AlteracaodoContrato {

	public static void main(String[] args) {
			
		JogadorBO marcaBO = new JogadorBO();
		
		Jogador marca = new Jogador(11);
		
		marcaBO.alterar(marca);
		
		if (marcaBO.alterar(marca)) {
		System.out.println("Certinho chefe");
		
		} else {
			
			System.out.println("Erro");
			
		}
	}
	
	}

