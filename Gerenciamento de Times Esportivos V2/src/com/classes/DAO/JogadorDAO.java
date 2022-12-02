package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Jogador;

import conexao.Conexao;

public class JogadorDAO {

    final String NOMEDATABELA = "marca";
    public boolean inserir(Jogador nome) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (Valor) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nome.getValor());
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
            String sql = "UPDATE " + NOMEDATABELA + " SET Valor = ? WHERE Nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nome.getValor());
            ps.setString(2, nome.getNome());
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
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE Nome = ?;";
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
    public Jogador procurarPorNome(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setNome(rs.getString(1));
                obj.setValor(rs.getInt(2));
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
    public Jogador procurarPorValor(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE Valor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getValor());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setNome(rs.getString(1));
                obj.setValor(rs.getInt(2));
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
    public boolean existe(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE Valor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getValor());
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
                obj.setValor(rs.getInt(2));
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