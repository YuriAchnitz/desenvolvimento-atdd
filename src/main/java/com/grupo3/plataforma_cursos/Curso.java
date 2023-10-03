package com.grupo3.plataforma_cursos;

public class Curso {
	private int preco;
	private double promocao = 0.0;
	
	Curso(int preco){
		this.preco = preco;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void aplicarPromocao(double promo) {
		promocao = promo;
		preco = (int) Math.round(preco * (1.0 - promocao));
	}
	
}
