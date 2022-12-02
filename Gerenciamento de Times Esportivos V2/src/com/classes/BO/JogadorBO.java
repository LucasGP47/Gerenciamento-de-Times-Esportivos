package com.classes.BO;

import com.classes.DTO.Jogador;
import com.classes.DAO.JogadorDAO;
import java.util.List;

public class JogadorBO {

    public boolean inserir(Jogador nome){
    	
        if (existe(nome) != true) {
            JogadorDAO nomesDAO = new JogadorDAO();
            return nomesDAO.inserir(nome);
        }
        								
        return false;
    }
    
    public boolean alterar(Jogador nome){
    	
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.alterar(nome);
        
    }
    
    public boolean excluir(Jogador nome){
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.excluir(nome);
    }
    
    public Jogador procurarPorCodigo(Jogador nome){
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.procurarPorNome(nome);
    }
    
    public Jogador procurarPorDescricao(Jogador nome){
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.procurarPorValor(nome);
    }
    
    public boolean existe(Jogador nome){
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.existe(nome);
    }
    
    public List<Jogador> pesquisarTodos(){
        JogadorDAO nomesDAO = new JogadorDAO();
        return nomesDAO.pesquisarTodos();
    }
}