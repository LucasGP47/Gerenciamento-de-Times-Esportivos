package com.classes.DTO;

public class Jogador {
	
	private String Nome;
	private float ValorDeMercado;
	private float salario;
	
	public Jogador() {

	}
	
	public Jogador(String Nome , float ValorDeMercado, float salario) {
		setNome(Nome);
		setValorDeMercado(ValorDeMercado);
		setSalario(salario);
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public float getValorDeMercado() {
		return ValorDeMercado;
	}
	
	public void setValorDeMercado(float ValorDeMercado) {
		this.ValorDeMercado = ValorDeMercado;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogador [nome=");
		builder.append(Nome);
		builder.append(", ValorDeMercado=");
		builder.append(ValorDeMercado);
		builder.append("]");
		return builder.toString();
	}
}