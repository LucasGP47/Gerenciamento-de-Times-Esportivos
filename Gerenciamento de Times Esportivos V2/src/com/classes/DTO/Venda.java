package com.classes.DTO;

public class Venda extends Jogador {
	
	private double VerbaAtualizada;
	private String Nome;
	
	public Venda() {
		
	}
	
	public Venda(String Nome) {
		setNome(Nome);
	}
	
	public Venda(double VerbaAtualizada) {
		
	setVerbaAtualizada(VerbaAtualizada);	
	
	}

	public double getVerbaAtualizada() {
		return VerbaAtualizada;
	}

	public void setVerbaAtualizada(double VerbaAtualizada) {
		this.VerbaAtualizada = VerbaAtualizada;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
}
