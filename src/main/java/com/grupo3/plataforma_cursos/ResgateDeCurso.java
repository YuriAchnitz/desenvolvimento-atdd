package com.grupo3.plataforma_cursos;

import java.util.ArrayList;

public class ResgateDeCurso {
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	ResgateDeCurso(){
	}
	
	//Retorna um valor booleano para caso de sucesso ou falha no resgate do curso
	//e subtrai o preço do curso do saldo do aluno em caso de sucesso
	public Boolean resgatarCurso(Aluno aluno, Curso curso) {
		int saldo = aluno.getMoedas();
		int preco = curso.getPreco();
		
		if (saldo >= preco) {
			aluno.subMoedas(preco);	//Subtrair preco do curso do saldo do aluno
			System.out.println("O curso foi resgatado com sucesso.");
			return true;
		}
		else {
			System.out.println("Seu saldo é insuficiente!");
			return false;
		}
	}
	
	//Retorna o ArrayList contendo todos os cursos disponíveis
	public ArrayList<Curso> retornaCursos(){
		return this.cursos;
	}
	
	//Retorna uma string mostrando o saldo de moedas do aluno
	public String mostrarSaldoAluno(Aluno aluno) {
		String res;
		
		res = String.format("Seu saldo é de %d moedas", aluno.getMoedas());
		
		return res;
	}
	
	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}
}
