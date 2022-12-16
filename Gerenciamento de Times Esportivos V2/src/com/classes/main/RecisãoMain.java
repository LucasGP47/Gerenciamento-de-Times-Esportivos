package com.classes.main;

import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class RecisãoMain {

	public static void main(String[] args) {
		
		JogadorBO marcaBO = new JogadorBO();
		Jogador marca = new Jogador("Curvello");
		if (marcaBO.excluir(marca))
			System.out.println("Contrato rescendido!");
		else
			System.out.println("Erro.");

	}
}