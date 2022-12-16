package com.classes.DTO;

public class Compra {

	private int ID;
	private String Nome;
	private int ValorDeMercado;
	private float Salario;
	
	public Compra(int ID) {
		setID(ID);
	}
	
	public Compra(String Nome) {
		setNome(Nome);
	}
	
	
	public Compra(String Nome, int ValorDeMercado, float Salario) {
		setNome(Nome);
		setValorDeMercado(ValorDeMercado);
		setSalario(Salario);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getValorDeMercado() {
		return ValorDeMercado;
	}
	public void setValorDeMercado(int valorDeMercado) {
		ValorDeMercado = valorDeMercado;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	
	
	
	
}
