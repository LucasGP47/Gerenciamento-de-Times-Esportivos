package com.classes.BO;

import com.classes.DTO.Jogador;
import com.classes.DAO.JogadorDAO;
import java.util.List;

public class JogadorBO {

    public boolean inserir(Jogador marca){
    	
        if (existe(marca) != true) {
            JogadorDAO marcasDAO = new JogadorDAO();
            return marcasDAO.inserir(marca);
        }
        								
        return false;
    }
    
    public boolean alterar(Jogador marca){
    	
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.alterar(marca);
        
    }
    
    public boolean excluir(Jogador marca){
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.excluir(marca);
    }
    
    public Jogador procurarPorCodigo(Jogador marca){
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    
    public Jogador procurarPorDescricao(Jogador marca){
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.procurarPorDescricao(marca);
    }
    
    public boolean existe(Jogador marca){
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.existe(marca);
    }
    
    public List<Jogador> pesquisarTodos(){
        JogadorDAO marcasDAO = new JogadorDAO();
        return marcasDAO.pesquisarTodos();
    }
}