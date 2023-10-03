package com.grupo3.plataforma_cursos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.sun.tools.javac.util.List;


public class ResgateDeCursoTest {
	
	@Test
	public void resgatarComSaldoSuperior() {
		Aluno aluno = new Aluno(50);
		Curso curso = new Curso(20);
		ResgateDeCurso resgateDeCurso = new ResgateDeCurso();
		
		Boolean resposta = resgateDeCurso.resgatarCurso(aluno, curso);
		
		assertEquals(30, aluno.getMoedas());
		assertEquals(resposta, true);
	}
	
	@Test
	public void resgatarCursoComSaldoInferior() {
		Aluno aluno = new Aluno(10);
		Curso curso = new Curso(15);
		ResgateDeCurso resgateDeCurso = new ResgateDeCurso();
		
		Boolean resposta = resgateDeCurso.resgatarCurso(aluno, curso);
		
		assertEquals(10, aluno.getMoedas());
		assertEquals(resposta, false);
	}
	
	@Test
	public void receberCursosDisponiveis() {
		Curso curso1 = new Curso(20);
		Curso curso2 = new Curso(30);
		
		ArrayList<Curso> esperado = new ArrayList<Curso>();
		esperado.add(curso1);
		esperado.add(curso2);
		
		ResgateDeCurso resgateDeCurso = new ResgateDeCurso();
		resgateDeCurso.addCurso(curso1);
		resgateDeCurso.addCurso(curso2);
		ArrayList<Curso> resposta = resgateDeCurso.retornaCursos();
		
		
		boolean comparacao = esperado.equals(resposta);
		
		
		assertEquals(comparacao, true);
	}
	
	@Test
	public void visualizarSaldo() {
		Aluno aluno = new Aluno(30);
		ResgateDeCurso resgateDeCurso = new ResgateDeCurso();
		String esperado = "Meu saldo é de 30 moedas";
		
		String resposta = resgateDeCurso.mostrarSaldoAluno(aluno);
		
		assertEquals(esperado, resposta);
	}
	
	@Test
	public void resgatarCursoComPromocao() {
		Aluno aluno = new Aluno(40);
		Curso curso = new Curso(50);
		ResgateDeCurso resgateDeCurso = new ResgateDeCurso();
		
		curso.aplicarPromocao(0.5);
		resgateDeCurso.resgatarCurso(aluno, curso);
			
		assertEquals(25, curso.getPreco());
		assertEquals(15, aluno.getMoedas());
	}
}
