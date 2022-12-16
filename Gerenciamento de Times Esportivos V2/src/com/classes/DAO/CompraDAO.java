package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.classes.DTO.Compra;
import com.classes.DTO.Jogador;

import conexao.Conexao;

public class CompraDAO {
	
	final String NOMEDATABELA = "jogador";
	final String NOMEDACOMPRA = "comprajogador";
	final String NOMEDOCLUBE = "clube";

	 public boolean comprajogador(Jogador ID) {
		 
		 	
			
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " SELECT * FROM " + NOMEDACOMPRA + " WHERE ID =?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, ID.getID());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            
	        } catch (Exception e) {
	        	
	            e.printStackTrace();
	            return false;
	        }
	    }
	 
	 public boolean excluirJogador(Jogador nome) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDACOMPRA + " WHERE ID = ? ;";
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
	 
	  public boolean diminueVerba(Compra nome) {
	        try {
	            Connection conn = Conexao.conectar();    
	            String sql = " UPDATE " + NOMEDOCLUBE + " SET Verba = Verba - (SELECT SUM(ValorDeMercado) FROM jogador WHERE Nome = ?);";
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
