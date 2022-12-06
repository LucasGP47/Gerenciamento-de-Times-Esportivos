package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainAlteracao {

	public static void main(String[] args) {
			
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador();
		marcaBO.alterar(marca);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}
