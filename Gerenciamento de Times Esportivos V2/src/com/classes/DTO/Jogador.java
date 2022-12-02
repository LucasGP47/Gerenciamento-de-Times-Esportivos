package com.classes.DTO;

public class Jogador {
	
	private String nome;
	private int ValorDeMercado;
	
	public Jogador() {

	}
	
	public Jogador(String Nome) {
		
		setNome(nome);
	}
	public Jogador(int valor) {
		
		setValor(valor);
	}
	public Jogador(String nome, int valor) {
		setNome(nome);
		setValor(valor);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String string) {
		this.nome = string;
	}
	public int getValor() {
		return ValorDeMercado;
	}
	public void setValor(int ValorDeMercado) {
		this.ValorDeMercado = ValorDeMercado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca [nome=");
		builder.append(nome);
		builder.append(", valor=");
		builder.append(ValorDeMercado);
		builder.append("]");
		return builder.toString();
	}
}