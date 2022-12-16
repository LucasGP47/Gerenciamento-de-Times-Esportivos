package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Clube;

import conexao.Conexao;

public class ClubeDAO {
	
	 final String NOMEDATABELA = "clube";

	 public List<Clube> consultaVerba() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Clube> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	 
	 public List<Clube> montarLista(ResultSet rs) {
	        List<Clube> listObj = new ArrayList<Clube>();
	        try {
	            while (rs.next()) {
	                Clube obj = new Clube();
	                obj.setNome(rs.getString(1));
	                obj.setVerba(rs.getInt(2));
	                obj.setAno(rs.getInt(3));
	                listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	           
	            return null;
	        }
	    }
	
	
	
}
