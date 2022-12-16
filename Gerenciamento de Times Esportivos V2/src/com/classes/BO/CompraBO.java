package com.classes.BO;

import com.classes.DAO.CompraDAO;
import com.classes.DTO.Compra;
import com.classes.DTO.Jogador;

public class CompraBO {
	
	public boolean comprar(Jogador ID) {
    	
        CompraDAO nomeDAO = new CompraDAO();
        
        return nomeDAO.comprajogador(ID);
        								
    }
	
	public boolean excluir(Jogador nome){
		 
        CompraDAO nomeDAO = new CompraDAO();
        return nomeDAO.excluirJogador(nome);
        
    }
	
	public boolean diminueValor(Compra Verba) {
		 
	 	CompraDAO nomeDAO = new CompraDAO();
	 	return nomeDAO.diminueVerba(Verba);

 }



}
