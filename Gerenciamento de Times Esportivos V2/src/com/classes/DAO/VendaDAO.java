package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.classes.DTO.Jogador;
import com.classes.DTO.Venda;

import conexao.Conexao;

public class VendaDAO {

	 final String NOMEDATABELA = "jogador";
	 final String NOMEDOCLUBE = "clube";   
	  
	 
	 
	    public boolean venderJogador(Jogador nome) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID = ? ;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, nome.getID());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	
	    public boolean alterarVerba(Venda nome) {
	        try {
	            Connection conn = Conexao.conectar();    
	            String sql = " UPDATE " + NOMEDOCLUBE + " SET Verba = Verba + (SELECT SUM(ValorDeMercado) FROM jogador WHERE Nome = ?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, nome.getNome());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
}
