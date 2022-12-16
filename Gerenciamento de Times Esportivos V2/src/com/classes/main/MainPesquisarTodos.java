package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		JogadorBO playerBO = new JogadorBO();
		
		List<Jogador> lista = new ArrayList<Jogador>();
		
		lista = playerBO.pesquisarTodos();	
		
		for (Jogador marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}