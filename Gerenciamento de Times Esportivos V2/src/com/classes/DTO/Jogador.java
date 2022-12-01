package com.classes.DTO;

public class Jogador {
	private int codigo;
	private String descricao;
	public Jogador() {

	}
	public Jogador(int codigo) {
		setCodigo(codigo);
	}
	public Jogador(String descricao) {
		setDescricao(descricao);
	}
	public Jogador(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
}