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
            String sql = "INSERT INTO " + NOMEDATABELA + " (NOME) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome.getNome());
            System.out.println(ps.toString());
          //  ps.setFloat(1, nome.getValorDeMercado());
          //  ps.setFloat(1, nome.getSalario());
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
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome.getNome());
            ps.setFloat(2, nome.getValorDeMercado());
            ps.setFloat(3, nome.getSalario());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getNome());
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
                obj.setNome(rs.getString(1));
                obj.setValorDeMercado(rs.getInt(2));
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
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, nome.getValorDeMercado());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setNome(rs.getString(1));
                obj.setValorDeMercado(rs.getInt(2));
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
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE Valor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, nome.getValorDeMercado());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
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
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Jogador> montarLista(ResultSet rs) {
        List<Jogador> listObj = new ArrayList<Jogador>();
        try {
            while (rs.next()) {
                Jogador obj = new Jogador();
                obj.setNome(rs.getString(1));
                obj.setValorDeMercado(rs.getInt(2));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    
}