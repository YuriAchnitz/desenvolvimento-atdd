package com.grupo3.plataforma_cursos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {
	
	@Test
	public void addMoedas() {
		Aluno aluno = new Aluno(20);
		
		aluno.addMoedas(10);
		
		assertEquals(30, aluno.getMoedas());
	}
	
}
