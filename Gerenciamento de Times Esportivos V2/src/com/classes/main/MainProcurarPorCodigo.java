package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("",1);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}