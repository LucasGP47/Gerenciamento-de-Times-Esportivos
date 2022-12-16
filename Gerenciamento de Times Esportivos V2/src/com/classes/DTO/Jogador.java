package com.classes.DTO;

public class Jogador extends Clube{
	
	private int ID;
	private String Nome;
	private double ValorDeMercado;
	private double salario;
	
	public Jogador() {

	}
	
	public Jogador(double ValorDeMercado) {
		
		setValorDeMercado(ValorDeMercado);
		
	}
	
	public Jogador(int ID, String Nome) {
		setID(ID);
		setNome(Nome);
	}
	
	public Jogador(String Nome , double ValorDeMercado, double salario) {
		
		setNome(Nome);
		setValorDeMercado(ValorDeMercado);
		setSalario(salario);
	}
	
	public Jogador(int ID, String Nome , double ValorDeMercado, double salario) {
		
	    setID(ID);
		setNome(Nome);
		setValorDeMercado(ValorDeMercado);
		setSalario(salario);
	}
	
	public Jogador(int ID) {
		setID(ID);
	}
	
	public Jogador(String Nome) {
		setNome(Nome);
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public double getValorDeMercado() {
		return ValorDeMercado;
	}
	
	public void setValorDeMercado(double ValorDeMercado) {
		this.ValorDeMercado = ValorDeMercado;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getValor() {
		
		return ValorDeMercado;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogador " + Nome + " [Valor de mercado = " + ValorDeMercado + ", Salário= " + salario + "]");
		return builder.toString();
	}
}