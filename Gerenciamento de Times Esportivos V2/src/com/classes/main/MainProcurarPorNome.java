package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainProcurarPorNome {

	public static void main(String[] args) {
			
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador();
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}