package com.classes.BO;

import com.classes.DAO.VendaDAO;
import com.classes.DTO.Venda;
import com.classes.DTO.Jogador;

public class VendaBO {
	
	 public boolean vender(Jogador nome){
		 
	        VendaDAO nomeDAO = new VendaDAO();
	        return nomeDAO.venderJogador(nome);
	        
	    }
	 
	 public boolean adicionarValor(Venda Verba) {
		 
		 	VendaDAO nomeDAO = new VendaDAO();
		 	return nomeDAO.alterarVerba(Verba);
	
	 }
	 
}
