package com.grupo3.plataforma_cursos;

public class Aluno {
	private int moedas;
	
	Aluno(int moedas){
		this.moedas = moedas;
	}
	
	public void addMoedas(int quantia) {
		this.moedas += quantia;
	}
	
	public void subMoedas(int quantia) {
		this.moedas -= quantia;
	}
	
	public int getMoedas() {
		return this.moedas;
	}
	
}
