package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.JogadorBO;
import com.classes.DTO.Jogador;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		JogadorBO marcaBO = new JogadorBO();
		List<Jogador> lista = new ArrayList<Jogador>();
		lista = marcaBO.pesquisarTodos();	
		for (Jogador marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}