package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Jogador;

import conexao.Conexao;

public class JogadorDAO {

    final String NOMEDATABELA = "jogador";
    
    public boolean inserir(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (Nome, ValorDeMercado, Salario) VALUES (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome.getNome());
            ps.setDouble(2, nome.getValorDeMercado());
            ps.setDouble(3, nome.getSalario());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
            
        } catch (Exception e) {
        	
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterar(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET Nome = ?, ValorDeMercado = ?, Salario = ? WHERE ID = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(4, nome.getID());
            ps.setString(1, nome.getNome());
            ps.setDouble(2, nome.getValorDeMercado());
            ps.setDouble(3, nome.getSalario());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
            
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean excluir(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE nome = ?;";
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
    public Jogador procurarPorNome(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setNome(rs.getString(2));
                obj.setValorDeMercado(rs.getDouble(3));
                obj.setSalario(rs.getDouble(4));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
    public Jogador procurarPorValor(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ValorDeMercado = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, nome.getValorDeMercado());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setID(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setValorDeMercado(rs.getDouble(3));
                obj.setSalario(rs.getDouble(4));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public boolean existe(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE Nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            
            return false;
        }
        return false;
    }
    public List<Jogador> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Jogador> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            return null;
        }
    }
    public List<Jogador> montarLista(ResultSet rs) {
        List<Jogador> listObj = new ArrayList<Jogador>();
        try {
            while (rs.next()) {
                Jogador obj = new Jogador();
                obj.setID(1);
                obj.setNome(rs.getString(2));
                obj.setValorDeMercado(rs.getDouble(3));
                obj.setSalario(rs.getDouble(4));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
           
            return null;
        }
    }
    
    
}