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
    public boolean inserir(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (descricao) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET descricao = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
            ps.setInt(2, marca.getCodigo());
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
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Jogador procurarPorCodigo(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
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
    public Jogador procurarPorDescricao(Jogador marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE descricao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogador obj = new Jogador();
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
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
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE descricao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
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
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
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