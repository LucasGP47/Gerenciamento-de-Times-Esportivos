package com.classes.DTO;

public class Clube {
	
	private String Nome;
	private int Verba;
	private int Ano;
	
	public Clube() {
		
	}
	
	public Clube(String Nome) {
		setNome(Nome);
	}
	
	public Clube(int Verba, int Ano) {
		setVerba(Verba);
		setAno(Ano);
	}
	
	public double getVerba() {
		return Verba;
	}
	public void setVerba(int Verba) {
		this.Verba = Verba;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	
	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("Clube Verba Atual = ");
		builder.append(Verba);
		builder.append(", Ano atual = ");
		builder.append(Ano);
		builder.append("");
		return builder.toString();
	}

	

}
