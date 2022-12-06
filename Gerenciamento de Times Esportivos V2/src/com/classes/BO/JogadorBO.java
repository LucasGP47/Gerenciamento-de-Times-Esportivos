package com.classes.BO;

import com.classes.DTO.Jogador;
import com.classes.DAO.JogadorDAO;
import java.util.List;

public class JogadorBO {

    public boolean inserir(Jogador nome){
    	
        JogadorDAO nomeDAO = new JogadorDAO();
        
        return nomeDAO.inserir(nome);
        								
    }
    
    public boolean alterar(Jogador nome){
    	
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.alterar(nome);
        
    }
    
    public boolean excluir(Jogador nome){
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.excluir(nome);
    }
    
    public Jogador procurarPorCodigo(Jogador nome){
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.procurarPorNome(nome);
    }
    
    public Jogador procurarPorDescricao(Jogador nome){
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.procurarPorValor(nome);
    }
    
    public boolean existe(Jogador nome){
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.existe(nome);
    }
    
    public List<Jogador> pesquisarTodos(){
        JogadorDAO nomeDAO = new JogadorDAO();
        return nomeDAO.pesquisarTodos();
    }
}